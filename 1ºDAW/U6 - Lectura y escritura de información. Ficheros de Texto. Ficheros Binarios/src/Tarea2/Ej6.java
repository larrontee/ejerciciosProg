package Tarea2;

import java.io.*;
import java.util.Scanner;

//En un fichero binario, sabemos que se ha guardado una serie de números double, pero no sabemos cuántos.
// Implementar un programa que los lea todos y los muestre por pantalla.
public class Ej6 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n;
//"Ficherobinario1.dat"

    }

    public void guardarfichero (){
        try {
            ObjectOutputStream escribir=new ObjectOutputStream(new FileOutputStream("Ficherobinario1.dat"));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
