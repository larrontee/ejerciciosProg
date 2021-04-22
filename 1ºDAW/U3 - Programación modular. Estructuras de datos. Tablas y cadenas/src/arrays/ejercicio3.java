package arrays;

import java.util.Arrays;
import java.util.Scanner;

//Introducir por teclado un número n; a continuación solicitar al usuario que teclee n números. Realizar la media
//de los números positivos, la media de los negativos, y contar el número de ceros introducidos.
public class ejercicio3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("introcuce la longitud de la cadena");
        int longitud = sc.nextInt();

        int [] vector= new int[longitud];
        int cantpos=0;
        int cantneg=0;
        int sumapositivo=0;
        int sumanegativo=0;
        int ceros=0;

        System.out.println("introduce los valores del vector");
        for (int i = 0; i < vector.length ; i++) {
            vector[i]= sc.nextInt();

            if (vector[i]>0){
                sumapositivo += vector[i];
                cantpos++;
            } else if (vector[i]<0){
                sumanegativo += vector[i];
                cantneg++;
            } else {
                ceros++;
            }
        }
        System.out.println("el vector es: "+ Arrays.toString(vector));
        System.out.println("cantpos: "+cantpos);
        System.out.println("cantneg: "+cantneg);
        System.out.println("ceros: "+ceros);
        if (cantpos>0) {
            System.out.println("media de positivos :" + (sumapositivo / cantpos));
        } else{
            System.out.println("media de positivos :0");
        }
        if (cantneg>0) {
            System.out.println("media de negativos :" + (sumanegativo/ cantneg));
        } else{
            System.out.println("media de negativos :0");
        }
    }
}
