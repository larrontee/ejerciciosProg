package arrays;

import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce la cantidad de numeros que deseas escribir");
        int longitud= sc.nextInt();
        int [] array=new int[longitud];

        System.out.println("introduce los numeros");
        for (int i = 0; i <array.length; i++) {
            array[i]=sc.nextInt();
        }
        System.out.println("los numeros en posicion contraria");
        for (int i =array.length-1 ; i>=0 ; i--) {
            System.out.println(array[i]);
        }


    }
}
