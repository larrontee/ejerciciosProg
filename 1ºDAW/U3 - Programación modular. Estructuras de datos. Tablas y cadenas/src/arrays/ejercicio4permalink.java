package arrays;

import java.util.Arrays;
import java.util.Scanner;

//Ejercicio 4Permalink
//Programa que declare un vector de diez elementos enteros y pida números para rellenarlo hasta que
// se llene el vector o se introduzca un número negativo. Entonces se debe imprimir el vector (sólo los elementos introducidos).
public class ejercicio4permalink {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int [] vector = new int[0];
        int num = 0;

        do {
            vector=Arrays.copyOf(vector, vector.length+1);
            num= sc.nextInt();
            if (num>=0){
            vector[vector.length-1]=num;
            System.out.println(Arrays.toString(vector));}
        } while (num>=0 && vector.length<10);
    }
}
