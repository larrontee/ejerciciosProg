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
public class ej18 {
    public static void main(String[] args) {
        int[] vector=new int[10];
        for (int i = 0; i < vector.length; i++) {
            vector[i]=(int)(Math.random()*101-2)+2;
            if (elprimo(vector[i]) && elcapicua(vector[i])){
                System.out.println(vector[i]+" es primo y capicua");
            }   else if (elprimo(vector[i])){
                System.out.println(vector[i]+" es primo y no capicua");
            }   else if (elcapicua(vector[i])){
                System.out.println(vector[i]+" no es primo y capicua");
            }   else {
                System.out.println(vector[i]+" no es primo y no capicua");
            }
        }


    }
    public static boolean elprimo(int num) {
        boolean primo;

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean elcapicua (int num) {
        String cadena=Integer.toString(num);
        String inverso="";
        for (int i = cadena.length()-1; i >=0 ; i--) {
            inverso+=cadena.charAt(i);
            if(inverso.equals(cadena)){
                return true;
            }
        }
        return false;
    }
}
