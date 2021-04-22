package arrays;
/*Realiza un programa que sea capaz de rotar todos los elementos de una matriz
cuadrada una posición en el sentido de las agujas del reloj. La matriz debe tener
12 filas por 12 columnas y debe contener números generados al azar entre 0 y
100. Se debe mostrar tanto la matriz original como la matriz resultado, ambas
con los números convenientemente alineados.
*/


import java.util.Arrays;
import java.util.Scanner;

public class ejercicio9libro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nº filas");
        int fila= sc.nextInt();
        System.out.println("Nº columnas");
        int columna= sc.nextInt();

        int [][] vector= new int [fila][columna];



        for (int i = 0; i < vector.length; i++){
            for (int j = 0; j < vector[0].length; j++) {
                vector[i][j]=sc.nextInt();
            }
        }
        for (int i = 0; i < vector.length; i++){
            System.out.println(Arrays.toString(vector[i]));
        }
        rotacion(vector);
        for (int i = 0; i < vector.length; i++){
            System.out.println(Arrays.toString(vector[i]));
        }








        }


        public static void rotacion (int [][] qwe){
            int [] asd =new int[0];
            int numant=0;
            int numsig=0;
            int contador=0;

            for (int i = 0; i < qwe.length ; i++) {
                for (int j = 0; j < qwe[0].length ; j++) {
                    asd=Arrays.copyOf(asd,asd.length+1);
                    asd[asd.length-1]=qwe[i][j];
                }
            }

            for (int i = 0; i < asd.length; i++) {

                if (i==0){
                    numant=asd[0];
                    asd[0]=asd[asd.length-1];
                } else{
                    numsig=asd[i];
                    asd[i]=numant;
                    numant=numsig;
                }
            }

            for (int i = 0; i < qwe.length ; i++) {
                for (int j = 0; j < qwe[0].length ; j++) {
                    qwe [i][j]=asd[contador];
                    contador++;
                }

            }

        }
}
