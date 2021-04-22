package Tarea1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
//Crear una colección de 20 números enteros aleatorios distintos menores que 100, guardarlos por orden decreciente a medida
//que se vayan generando, y mostrar la colección por pantalla.
public class Ej5 {
    public static void main(String[] args) {

         Set<Integer> set = new TreeSet<>();
         List<Integer> list= new ArrayList<>();
         while (set.size()<=20){
             set.add((int)(Math.random()*100));
         }
        System.out.println(set);

         list.addAll(set);

         list.sort((o1, o2) ->o2-o1 );
        System.out.println(list);

    }
}
