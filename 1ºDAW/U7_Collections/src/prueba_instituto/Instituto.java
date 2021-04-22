package prueba_instituto;

import org.w3c.dom.ls.LSOutput;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.*;

public class Instituto {
    Map<String, ArrayList<Alumno>> lista_clases;
    String nombreIes;

    public Instituto(Map<String, ArrayList<Alumno>> lista_clases, String nombreIes) {
        this.lista_clases = lista_clases;
        this.nombreIes = nombreIes;
    }

    public Map<String, ArrayList<Alumno>> getLista_clases() {
        return lista_clases;
    }

    public void setLista_clases(Map<String, ArrayList<Alumno>> lista_clases) {
        this.lista_clases = lista_clases;
    }

    public String getNombreIes() {
        return nombreIes;
    }

    public void setNombreIes(String nombreIes) {
        this.nombreIes = nombreIes;
    }

    public void addAlumnoUnidad(Alumno a, String unidad){
        if (a.getUnidad().equals(unidad)){
            if(!lista_clases.containsKey(unidad)){
                lista_clases.put(unidad, new ArrayList<>());
            }
            lista_clases.get(unidad).add(a);
        }
    }

    public String obtenerUnidadAlumno(String id){
        Collection<ArrayList<Alumno>> alumn = lista_clases.values();
        Iterator iterator=alumn.iterator();
        while (iterator.hasNext()){
            ArrayList<Alumno> al= (ArrayList<Alumno>) iterator.next();
            for (Alumno a:
                 al) {
                if (a.getUnidad().equals(id)){
                    return a.getUnidad();
                }
            }
        } return "no se ha encontrado a ese alumno";
    }
    public void mostrarAlumnosUnidad(String unidad){
        for (int i = 0; i < lista_clases.size(); i++) {
            if (lista_clases.containsKey(unidad)){
                Collections.sort(lista_clases.get(unidad), new Comparator<Alumno>() {
                    @Override
                    public int compare(Alumno o1, Alumno o2) {
                        return o1.getDni().compareTo(o2.getDni());
                    }
                });
            }
        }
    }

    public void mostrarTodosAlumnos(){
        Collection<ArrayList<Alumno>> alumn = lista_clases.values();
        ArrayList<Alumno> aux = new ArrayList<>();
        Iterator iterator=alumn.iterator();
        while (iterator.hasNext()) {
            ArrayList<Alumno> al = (ArrayList<Alumno>) iterator.next();
            aux.addAll(al);
        }
        Collections.sort(aux, new Comparator<Alumno>() {
            @Override
            public int compare(Alumno o1, Alumno o2) {
                return o1.getApellido().compareTo(o2.getApellido());
            }
        });
        System.out.println(aux);
    }

    public void cargarAlumnos(){
        try {
            ObjectInputStream leer=new ObjectInputStream(new FileInputStream("Ficherobinario1.dat"));

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "Instituto{" +
                "lista_clases=" + lista_clases +
                ", nombreIes='" + nombreIes + '\'' +
                '}';
    }
}