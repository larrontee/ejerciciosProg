package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int [] vector= new int[6];
        int [] vector2= new int[6];
        int [] vector3= new int[vector.length+ vector2.length];

        System.out.println("introcuce la cadena");
        for (int i = 0; i < vector.length; i++) {
            vector[i]= sc.nextInt();
        }
        Arrays.sort(vector);
        System.out.println(Arrays.toString(vector));


        System.out.println("introcuce la cadena");
        for (int i = 0; i < vector.length; i++) {
            vector2[i]= sc.nextInt();
        }

        Arrays.sort(vector2);
        System.out.println(Arrays.toString(vector2));

        for (int i = 0; i < vector.length ; i++) {
            vector3[i]=vector[i];
            vector3[vector.length+i]=vector2[i];
        }
        System.out.println(Arrays.toString(vector3));
        Arrays.sort(vector3);
        System.out.println(Arrays.toString(vector3));





    }
}
