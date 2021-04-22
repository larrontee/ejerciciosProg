import java.util.Arrays;
import java.util.Scanner;

/*
Realiza un programa que rellene un array con 10 números aleatorios
comprendidos entre 2 y 100 (ambos incluidos) y que los muestre por
pantalla. A continuación, el programa indicará para cada uno de ellos
si es un número primo y/o un capicúa de la forma que muestra el
ejemplo.
Ejemplos:
Array generado:
19 22 57 11 3 52 32 46 2 14
El 19 es primo y no es capicúa.
El 22 no es primo y es capicúa.
El 57 no es primo y no es capicúa.
El 11 es primo y es capicúa.
El 3 es primo y es capicúa.
El 52 no es primo y no es capicúa.
El 32 no es primo y no es capicúa.
El 46 no es primo y no es capicúa.
El 2 es primo y es capicúa.
14 no es primo y no es capicúa.
 */



public class ej18mal{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        boolean primo, capicua=false;
        int[] vector=new int[10];
        for (int i = 0; i < vector.length; i++) {
            vector[i]=(int)(Math.random()*(101-2)+2);
        }
        System.out.println(Arrays.toString(vector));
        String[] cadena=new String[0];
        String inverso;

        for (int i = 0; i < vector.length; i++) {
            capicua=false;
            cadena=Arrays.copyOf(cadena,cadena.length+1);
            cadena[i]=Integer.toString(vector[i]);
            for (int j = cadena[i].length()-1; j>=0 ; j--) {
                inverso=Integer.toString(cadena[i].charAt(j));
                if (inverso.equals(cadena[i])){
                    capicua=true;
                }
            }
        }


        for (int i = 0; i < vector.length; i++) {
            primo=true;
            for (int j = 2; j <vector[i] ; j++) {
                if (vector[i]%j==0){
                    primo=false;
                    break;
                }
            }
            if (primo && capicua){
                System.out.println(vector[i]+" es primo y capicua");
            }   else if(capicua){
                System.out.println(vector[i]+" no es primo y capicua");
            }else if (primo){
                System.out.println(vector[i]+" es primo y no capicua");
            }   else    {
                System.out.println(vector[i]+" no es primo y no capicua");
            }
        }
    }
}
