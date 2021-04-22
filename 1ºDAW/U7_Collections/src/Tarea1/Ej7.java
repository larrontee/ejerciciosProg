package Tarea1;

import java.util.*;

//Introducir por teclado, hasta que se introduzca "fin", una serie de nombres que se insertarán por orden
//alfabético en una colección que no permita repeticiones. Mostrar luego la lista de nombres por pantalla.
public class Ej7 {
    public static void main(String[] args) {
        Set<String> set = new TreeSet<>();

        Scanner sc= new Scanner(System.in);
        String palabra=sc.nextLine();

        while (!palabra.contains("fin")){
            set.add(palabra);
            palabra=sc.nextLine();
        }
        System.out.println(set);
    }
}
