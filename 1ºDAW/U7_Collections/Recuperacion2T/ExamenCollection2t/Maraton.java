package ExamenCollection2t;

import java.io.*;
import java.util.*;

public class Maraton {
    Set<Atleta> listaAtletas;

    public Maraton(Set<Atleta> listaAtletas) {
        this.listaAtletas = new LinkedHashSet<>();
    }

    public void cargarAtletas(){
        try {
            ObjectInputStream reader=new ObjectInputStream(new FileInputStream("maraton.dat"));
            while (true){
                reader.readObject();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void guardarAtletas(){
        try {
            ObjectOutputStream escribir=new ObjectOutputStream(new FileOutputStream("maraton.dat"));
            Collection<Atleta> atletas=listaAtletas;
            for (Atleta aux : atletas) {
                escribir.writeObject(aux);
            }
            escribir.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void inscribirAtleta(){
        Scanner sc= new Scanner(System.in);
        System.out.println("nombre");
        String n=sc.nextLine();
        System.out.println("pais");
        String p=sc.nextLine();
        System.out.println("categoria");
        String c=sc.nextLine();
        Categoria cat;
        if (c.equals("SENIOR")){
            cat=Categoria.SENIOR;
        } else if (c.equals("JUNIOR")){
            cat=Categoria.JUNIOR;
        }else {
            cat=Categoria.VETERANO;
        }
        Atleta at = new Atleta(n,p,cat);
        listaAtletas.add(at);
    }

    public void guardarTiempo(int dor,int temp){
        List<Atleta> atletas=new ArrayList<>(listaAtletas);
        for (Atleta a:atletas) {
            if (atletas.contains(a.getDorsal())){
                a.setMarca(temp);
                a.setFinisher(true);
            }
        }
    }

    public void mostrarListaFinisher(){
        List<Atleta>atletas=new ArrayList<>(listaAtletas);
        Collections.sort(atletas);
        System.out.println(atletas);
    }

    public void mostrarListaCategoria(Categoria cat){
        List<Atleta>atletas=new ArrayList<>(listaAtletas);
        Collections.sort(atletas, new Comparator<Atleta>() {
            @Override
            public int compare(Atleta o1, Atleta o2) {
                return o1.getCategoria().compareTo(o2.getCategoria());
            }
        });
        System.out.println(atletas);
    }
     public void mostrarListaPais(String p){
        List<Atleta>atletas=new ArrayList<>(listaAtletas);
        int contador=0;
         for (Atleta a:atletas) {
             if (a.getPais().equals(p)){
                 contador++;
             }
         }
        System.out.println("hay "+contador+"Atletas");
     }


    public Set<Atleta> getListaAtletas() {
        return listaAtletas;
    }

    public void setListaAtletas(Set<Atleta> listaAtletas) {
        this.listaAtletas = listaAtletas;
    }
}
