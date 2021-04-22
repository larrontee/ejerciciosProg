package Tarea2;

import java.io.*;
import java.util.Scanner;

//Actividad 7. Escribir por teclado una frase y guardarla en un archivo binario. A continuación, recuperarla del archivo y mostrarla por pantalla.
public class Ej7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String frase= sc.nextLine();

        try {
            ObjectOutputStream escribir = new ObjectOutputStream(new FileOutputStream("Ficherobinario1.dat"));
            escribir.writeUTF(frase);
            escribir.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            ObjectInputStream leer = new ObjectInputStream(new FileInputStream("Ficherobinario1.dat"));
            System.out.println(leer.readUTF());
        }  catch (IOException e) {
            e.printStackTrace();
        }

    }
}