package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String nombre,apellidos,direccion;
        System.out.println("Introduce el nombre");
        nombre=sc.nextLine();
        System.out.println("Introduce el apellido");
        apellidos = sc.nextLine();
        System.out.println("Introduce la dirección");
        direccion=sc.nextLine();
        System.out.println(nombre+" "+apellidos+" "+direccion);
        System.out.println();
    }
}
