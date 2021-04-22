package arrays;

import java.util.Arrays;

//1) Crear una matriz de 3×3 con los números del 1 al 9. Mostrar por pantalla, tal como aparece en la matriz.
public class ej1 {
    public static void main(String[] args) {
  int[][] vector=new int [3][3];
  int numero=1;
        for (int i = 0; i < vector.length; i++) {
            for (int j = 0; j < vector[0].length; j++) {
                vector[i][j]=numero;
                numero++;
            }
            System.out.println(Arrays.toString(vector[i]));
        }
    }
}
