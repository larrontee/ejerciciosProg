package arrays;
// Se quiere realizar un programa que lea por teclado las 5
// notas obtenidas por un alumno (comprendidas entre 0 y 10). A continuación debe mostrar todas las
// notas, la nota media, la nota más alta que ha sacado y la menor.

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio3Permalink {
    public static void main(String[] args) {
        int[] notas = new int[5];
        int media = 0;
        int min = 0;
        int max = 0;
        int valor = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce las notas");
        for (int i = 0; i < notas.length; i++) {
            notas[i] = sc.nextInt();
            valor += notas[i];
            media = (valor / notas.length);

            if (i == 0) {
                min = notas[i];
                max = notas[i];

            } else {
                if (min > notas[i]) {
                    min = notas[i];
                }
                if (max < notas[i]) {
                    max = notas[i];
                }
            }
        }
        System.out.println(Arrays.toString(notas));
        System.out.println("Media: " + media);
        System.out.println("Max nota: " + max);
        System.out.println("Min nota: " + min);
    }
}
