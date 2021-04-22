package Zoo;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.*;

/*

Un zoo quiere abrir sus puertas, necesita guardar en el sistema un estructura de datos que almacene cinco tipo de
animales, cada tipo de animal contendra una lista con cada uno de los animales de ese tipo. Los datos que tendrán en
comun sera su peso, y el nombre propio. Cada animal tendrá almenos dos atributos que lo defina.
Los animales se podrán comparar por defecto por su peso e individualmente por un atributo de su clase, deberemos hacer
entonces una serie de métodos en los que podamos añadir, sacar, mostrar, buscar, guardar en archivo y obtener de archivo.

*/
public class Zoo {
    Map<String, ArrayList<Animal>> listaAnimales;

    public Zoo() {
        this.listaAnimales = new HashMap<>();
    }

    public Map<String, ArrayList<Animal>> getListaAnimales() {
        return listaAnimales;
    }

    public void setListaAnimales(Map<String, ArrayList<Animal>> listaAnimales) {
        this.listaAnimales = listaAnimales;
    }

    @Override
    public String toString() {
        return "Zoo{" +
                "listMap=" + listaAnimales +
                '}';
    }

    public void addAnimal(Animal a){
        if (!listaAnimales.containsKey(a.getClass().getSimpleName())){
            listaAnimales.put(a.getClass().getSimpleName(),new ArrayList<Animal>());
        }
        listaAnimales.get(a.getClass().getSimpleName()).add(a);
    }


    public void sacaranimal(Animal a){
        if (!listaAnimales.containsKey(a.getClass().getSimpleName())){
            System.out.println("no tenemos a ese animal");
        } else {
            ArrayList<Animal> aux=listaAnimales.get(a.getClass().getSimpleName());
            if (aux.contains(a)){
                aux.remove(a);
            }
        }
    }


    public void buscarAnimal(Animal a){
        if (!listaAnimales.containsKey(a.getClass().getSimpleName())){
            System.out.println("no tenemos a ese animal");
        } else {
            ArrayList<Animal> aux=listaAnimales.get(a.getClass().getSimpleName());
            if (aux.contains(a)){
                System.out.println(a);
            }
        }
    }

    public void mostrarAnimalTipo(Animal a){
        if (listaAnimales.containsKey(a.getClass().getSimpleName())){
            ArrayList<Animal> aux=listaAnimales.get(a.getClass().getSimpleName());
            for (Animal animal: aux) {
                System.out.println(animal);
            }
        }
    }

    public void mostrarTodos(){
        Collection<ArrayList<Animal>> aux=listaAnimales.values();

        Iterator it= aux.iterator();
        while (it.hasNext()){
            ArrayList<Animal> animals=(ArrayList<Animal>) it.next();
            for (Animal a:animals) {
                System.out.println(a);
            }
        }

    }



    public void guardardatos(){
        try {
            ObjectOutputStream escribir= new ObjectOutputStream(new FileOutputStream("zoo.dat"));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

}
