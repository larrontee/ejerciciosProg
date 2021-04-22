package Tarea1;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Scanner;

//Introducir por teclado, hasta que se introduzca "fin", una serie de nombres que se insertarán en una colección, de forma que se conserve
// el orden de inserción y que no puedan repetirse. Mostrar la estructura por pantalla.
public class Ej6 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String palabra=sc.nextLine();
        String frase="";
        Collection<String> set = new LinkedHashSet<>();
        while (!palabra.contains("fin")){
            set.add(palabra);
            palabra=sc.nextLine();
        }
        System.out.println(set);
    }
}
