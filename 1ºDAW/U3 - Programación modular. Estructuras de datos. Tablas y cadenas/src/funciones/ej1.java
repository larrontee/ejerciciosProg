package funciones;

import java.util.Arrays;
/*
Ejercicios 20-28
Crea una biblioteca de funciones para arrays (de una dimensión) de números
enteros que contenga las siguientes funciones:
*/
public class ej1 {
    public static void main(String[] args) {
        int[] qwe = {2, 3, 5, 6};
        volteaArrayInt(qwe);
        System.out.println(Arrays.toString(qwe));
    }

    /*1. generaArrayInt: Genera un array de tamaño n con números aleatorios
        cuyo intervalo (mínimo y máximo) se indica como parámetro.*/
    public static int[] generaArrayInt(int n) {
        int[] vector = new int[n];
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random() * 101);
        }

        return vector;
    }

    //2. minimoArrayInt: Devuelve el mínimo del array que se pasa como parámetro.
    public static int minimoArrayInt(int[] vector) {
        int minimo = 0;
        for (int i = 0; i < vector.length; i++) {
            if (i == 0) {
                minimo = vector[i];
            } else {
                if (minimo > vector[i]) {
                    minimo = vector[i];
                }
            }
        }
        return minimo;
    }

    //3. maximoArrayInt: Devuelve el máximo del array que se pasa como parámetro.
    public static int maximoArrayInt(int[] vector) {
        int max = 0;
        for (int i = 0; i < vector.length; i++) {
            if (i == 0) {
                max = vector[i];
            } else {
                if (max < vector[i]) {
                    max = vector[i];
                }
            }
        }
        return max;
    }

    //4. mediaArrayInt: Devuelve la media del array que se pasa como parámetro.
    public static int mediaArrayInt(int[] vector) {
        int valores = 0;
        int media = 0;

        for (int i = 0; i < vector.length; i++) {
            valores += vector[i];
            media = (valores / vector.length);
        }
        return media;
    }

    //5. estaEnArrayInt: Dice si un número está o no dentro de un array.
    public static boolean estaEnArrayInt(int[] vector, int num) {
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] == num) {
                return true;
            }
        }
        return false;
    }

    //6. posicionEnArray: Busca un número en un array y devuelve la posición
// (el índice) en la que se encuentra.
    public static int posicionEnArray(int[] vector, int num) {
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] == num) {
                return i;
            }
        }
        return -1;
    }

    //7. volteaArrayInt: Le da la vuelta a un array.
    public static void volteaArrayInt(int[] vector) {
        int[] vector2 = new int[0];
        for (int i = vector.length - 1; i >= 0; i--) {
            vector2 = Arrays.copyOf(vector2, vector2.length + 1);/* decimos el vector que quermos copiar y le damos una nueva longitud asignandoselo al
                                                                          vector original*/
            vector2[vector2.length - 1] = vector[i];
        }

        for (int i = 0; i < vector.length; i++) {
            vector[i] = vector2[i];
        }
    }

//8. rotaDerechaArrayInt: Rota n posiciones a la derecha los números de un array.
    public static void rotaDerechaArrayInt(int[] vector, int num) {
        int numsig;
        int numant;

        for (int i = 0; i < num; i++) {
            if (i == 0) {
                numsig = vector[i];
                numant = vector[vector.length - num];
                numant = numsig;
            } else {

            }
        }
    }
//9. rotaIzquierdaArrayInt: Rota n posiciones a la izquierda los números de un array.


}
