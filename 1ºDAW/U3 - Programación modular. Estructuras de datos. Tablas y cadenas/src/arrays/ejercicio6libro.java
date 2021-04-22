package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ejercicio6libro {
    public static void main(String[] args) {
        int numerosiguiente = 0;
        int numeroanterior = 0;
        Scanner sc= new Scanner(System.in);
        int [] vector =  new int[15];


        for (int i = 0; i < vector.length ; i++) {
             vector[i]= sc.nextInt();
        }
        for (int i = 0; i < vector.length ; i++) {

            if (i==0){
                numerosiguiente=vector[i];
                vector[i]=vector[vector.length-1];
            }
            else if (i< vector.length-1){
                numeroanterior=vector[i];
                vector[i]=numerosiguiente;
                numerosiguiente=numeroanterior;
            }
            else {
                vector[i]=numerosiguiente;
            }
        }
        System.out.println(Arrays.toString(vector));


    }
}
