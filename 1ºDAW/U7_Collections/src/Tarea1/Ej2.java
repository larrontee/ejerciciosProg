package Tarea1;

import java.util.ArrayList;
import java.util.List;

//Repetir el ejercicio anterior, pero ordenar la lista en sentido decreciente
public class Ej2 {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            list.add((int)(Math.random()*101));
        }

        System.out.println(list);
        list.sort((o1, o2) -> o2-o1);
        System.out.println(list);


    }
}
