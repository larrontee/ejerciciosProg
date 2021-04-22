package arrays;

import java.util.Arrays;

/*Ejercicio 12Permalink
Diseñar el algoritmo correspondiente a un programa, que:

Crea una tabla bidimensional de longitud 5x15 y nombre ‘marco’.
Carga la tabla con dos únicos valores 0 y 1, donde el valor uno ocupará las posiciones o elementos que delimitan la tabla, es decir, las más externas,
mientras que el resto de los elementos contendrán el valor 0.

  111111111111111
  100000000000001
  100000000000001
  100000000000001
  111111111111111
Visualiza el contenido de la matriz en pantalla.
*/
public class Ejercicio12permalink {
    public static void main(String[] args) {
        int[][] marco = new int[5][15];

        for (int i = 0; i < marco.length; i++) {
            for (int j = 0; j < marco[0].length; j++) {
                if (i==0 || i== marco.length-1 || j==0 || j==marco[0].length-1) {
                    marco[i][j] = 1;
                } else{
                    marco[i][j] = 0;
                }
            }
            System.out.println(Arrays.toString(marco[i]));
        }
    }
}
