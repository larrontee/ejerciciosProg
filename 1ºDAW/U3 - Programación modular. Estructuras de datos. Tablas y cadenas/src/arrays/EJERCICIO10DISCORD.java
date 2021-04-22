package arrays;

import java.util.Arrays;

//10) Crea dos arrays multidimensionales de 2×3 y rellenalos como quieras (números aleatorios, por teclado o definido al crear el array).
//
//Haz un método que sume los arrays multidimensionales, es decir, la posición 0, 0 del array1 con la posición del array2 y así sucesivamente,
// este metodo no debe devolver nada, haciendo que deba pasarse el array multidimensional de suma como parámetro. Muestra el contenido de
// cada array multidimensional.
public class EJERCICIO10DISCORD {
    public static void main(String[] args) {
        int[][] v2=new int[2][3];
        int[][] v1=new int[2][3];
        int[][] sumaa=new int[2][3];


        System.out.println("vector 1");
        for (int i = 0; i <v1.length; i++) {
            for (int j = 0; j < v1[0].length; j++) {
                v1[i][j]=(int)(Math.random()*100);
            }
            System.out.println(Arrays.toString(v1[i]));
        }
        System.out.println("vector 2");
        for (int i = 0; i <v1.length; i++) {
            for (int j = 0; j < v1[0].length; j++) {
                v2[i][j]=(int)(Math.random()*101);
            }
            System.out.println(Arrays.toString(v2[i]));
        }

        qwe(v1, v2, sumaa);
        System.out.println("suma");
        for (int i = 0; i < v1.length; i++) {
            System.out.println(Arrays.toString(sumaa[i]));

        }
    }

    public static void qwe (int[][] vector1, int[][] vector2,int[][] suma ){

        for (int i = 0; i < vector1.length; i++) {
            for (int j = 0; j < vector1[0].length; j++) {
                suma[i][j]=vector1[i][j]+vector2[i][j];
            }
        }
    }

}
