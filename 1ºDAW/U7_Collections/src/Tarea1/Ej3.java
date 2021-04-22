package Tarea1;

import java.util.ArrayList;
import java.util.List;

//Crear una colección de 20 números enteros aleatorios menores que 10, guardarlos por orden
//decreciente a medida que se vayan generando y mostrar la colección por pantalla.
public class Ej3 {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            list.sort((o1, o2) -> o2-o1);
            list.add((int)(Math.random()*11));
        }
        System.out.println(list);
    }
}
