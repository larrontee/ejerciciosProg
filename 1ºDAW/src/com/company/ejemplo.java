package com.company;

import java.util.Scanner;

public class ejemplo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("introduzca un numero");
        int num=sc.nextInt();

        char caracter=(char)num;
        System.out.println(num + "="+ caracter);
    }
}