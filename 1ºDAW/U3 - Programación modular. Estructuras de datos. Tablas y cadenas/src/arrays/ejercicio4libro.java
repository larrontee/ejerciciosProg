package arrays;

import java.util.Arrays;

public class ejercicio4libro {
    public static void main(String[] args) {
        int [] numero = new int[20];
        int [] cuadrado = new int[20];
        int [] cubo = new int[20];

        for (int i = 0; i< numero.length; i++) {
            numero[i]=(int)(Math.random()*101);
            cuadrado[i]=(int)Math.pow(numero[i],2);
            cubo[i]=(int)Math.pow(numero[i],3);
        }

        System.out.println(Arrays.toString(numero));
        System.out.println(Arrays.toString(cuadrado));
        System.out.println(Arrays.toString(cubo));
    }
}
