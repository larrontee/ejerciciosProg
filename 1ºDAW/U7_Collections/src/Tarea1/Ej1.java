package Tarea1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Crear una colección de 20 números enteros aleatorios menores que 100, y guardarlos en el orden en que se vayan generando;
//mostrar por pantalla dicha lista una vez creada. Ordenarla en sentido creciente y volverla a mostrar por pantalla.
public class Ej1 {
    public static void main(String[] args) {

    List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            list.add((int)(Math.random()*101));
        }

        System.out.println(list);
        list.sort((o1, o2) -> o1-o2);
        System.out.println(list);


    }


}
