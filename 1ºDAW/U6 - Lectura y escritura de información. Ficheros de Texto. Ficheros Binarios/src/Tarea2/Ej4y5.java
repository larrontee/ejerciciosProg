package Tarea2;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

//Actividad 4. Pedir un entero n por consola. A continuación, pedir n números double, que iremos guardando en una tabla.
// Guardar la tabla en un archivo binario.
public class Ej4y5 {
    public static void main(String[] args) {
        System.out.println("longitud del array");
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();

        double[] tabla =new double[n];
        double[] tabla2 ;

        for (int i = 0; i < tabla.length; i++) {
            tabla[i]=sc.nextDouble();
        }


        try {
            ObjectOutputStream escribir = new ObjectOutputStream(new FileOutputStream("Ficherobinario1.dat"));
            escribir.writeObject(tabla);
            escribir.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        try {
            ObjectInputStream leer= new ObjectInputStream(new FileInputStream("Ficherobinario1.dat"));
           tabla2= (double[])leer.readObject();
            leer.close();
            System.out.println(Arrays.toString(tabla2));
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

}
