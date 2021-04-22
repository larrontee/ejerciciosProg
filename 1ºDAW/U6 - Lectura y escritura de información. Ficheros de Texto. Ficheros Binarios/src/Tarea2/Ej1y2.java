package Tarea2;

import java.io.*;
import java.util.Scanner;

//Actividad 1. Pedir un double por consola y guardarlo en un archivo binario.
//Actividad 2. Abrir el archivo del ejercicio anterior, leer el double y mostrarlo por pantalla
public class Ej1y2 {
    public static void main(String[] args) throws IOException {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Introduce un double");
        double n=scanner.nextDouble();



        try {
            ObjectOutputStream escritotbinario= new ObjectOutputStream(new FileOutputStream("Ficherobinario1.dat"));
            escritotbinario.writeDouble(n);
            escritotbinario.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


        try {
            ObjectInputStream leer = new ObjectInputStream(new FileInputStream("Ficherobinario1.dat"));
            System.out.println(leer.readDouble());
            leer.close();
        } catch (Exception e){
            e.printStackTrace();
        }




    }
}
