package Tarea2;

import java.io.*;
import java.util.Scanner;

//Actividad 3. Pedir números enteros positivos por consola y guardarlos en un fichero binario hasta que se introduzca un número negativo.
// Leer del fichero todos los enteros guardados y mostrarlos por pantalla.
public class Ej3 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n;
            try {
                ObjectOutputStream meterenteros= new ObjectOutputStream(new FileOutputStream("Ficherobinario1.dat"));
                do {

                    System.out.println("introduce enteros hasta que sea negativo");
                    n= sc.nextInt();
                    if (n>=0)meterenteros.writeInt(n);
                } while (n>=0);
            meterenteros.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }

            try {
                ObjectInputStream leer=new ObjectInputStream(new FileInputStream("Ficherobinario1.dat"));
                do {
                    System.out.println(leer.readInt());
                }while (true);
            } catch (IOException e) {
                System.out.println("final de fichero");
            }



    }
}
