/*
Crea las funciones cuyas cabeceras se muestran a continuación, observa
que tienen el mismo nombre:
public static int ocurrencias(int digito, int n)
public static int ocurrencias(int digito, int[] a)
La función ocurrencias devuelve el número de veces que aparece un
dígito dentro de un número (primera función) o bien el número de veces
que aparece un dígito en una serie de números contenidos en un array
(segunda función).
Ejemplos:
ocurrencias(8, 4672) devuelve 0
ocurrencias(5, 25153) devuelve 2
ocurrencias(2, 123456) devuelve 1
Si a = {714, 81, 9, 11}, ocurrencias(1, a) devuelve 4
Si a = {42, 13, 12345, 4}, ocurrencias(4, a) devuelve 3
Si a = {6, 66, 666}, ocurrencias(6, a) devuelve 6
Utiliza estas funciones en un programa para comprobar que funcionan
bien.
 */

import java.util.Arrays;
import java.util.Scanner;

public class ej20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("introduce digito a indentificar");
        int digito= sc.nextInt();

       // System.out.println("introduce el numero");
       // int num= sc.nextInt();

        System.out.println("introduce un vector de longitud 3");
        int[] vector=new int[3];
        for (int i = 0; i < vector.length; i++) {
            vector[i]= sc.nextInt();
        }
     //   System.out.println("Ocurrencias ("+digito+","+num+") devuelve "+ocurrencias(digito,num));
        System.out.println("Si a = "+ Arrays.toString(vector)+", ocurrencias("+digito+", a) devuelve "+ocurrencias(digito,vector));
    }
    public static int ocurrencias(int digito, int n){
        String cadena=Integer.toString(n);
        int contador=0;

        for (int i = 0; i < cadena.length(); i++) {
            if (digito==Integer.parseInt(Character.toString(cadena.charAt(i))));{
                contador++;
            }
        }
        return contador;
    }
    public static int ocurrencias(int digito, int[] a){
        int cuentador=0;
        for (int i = 0; i < a.length; i++) {
             cuentador+=ocurrencias(digito,a[i]);
        }
        return cuentador;
    }

}


