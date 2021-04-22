import java.security.PublicKey;
import java.util.Scanner;

/*
Crea una biblioteca de funciones matemáticas que contenga las
siguientes funciones. Recuerda que puedes usar unas dentro de otras si
es necesario. Observa bien lo que hace cada función ya que, si las
implementas en el orden adecuado, te puedes ahorrar mucho trabajo. Por
ejemplo, la función esCapicua resulta trivial teniendo voltea y la
función siguientePrimo también es muy fácil de implementar teniendo
esPrimo.
1. esCapicua: Devuelve verdadero si el número que se pasa como
parámetro es capicúa y falso en caso contrario.
2. esPrimo: Devuelve verdadero si el número que se pasa como
parámetro es primo y falso en caso contrario.
3. siguientePrimo: Devuelve el menor primo que es mayor al número
que se pasa como parámetro.
4. potencia: Dada una base y un exponente devuelve la potencia.
5. digitos: Cuenta el número de dígitos de un número entero.
6. voltea: Le da la vuelta a un número.
7. digitoN: Devuelve el dígito que está en la posición n de un
número entero. Se empieza contando por el 0 y de izquierda a
derecha.
 */

public class ej11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce un numero");
        int num = sc.nextInt();
        System.out.println("introduce un expònente");
        int expo = sc.nextInt();
        System.out.println("introduce la posicion que quieres ver");
        int posicion = sc.nextInt();


        System.out.println(esCapicua(num));
        System.out.println(esPrimo(num));
        System.out.println(siguientePrimo(num));
        System.out.println(potencia(num, expo));
        System.out.println(digito(num));
        System.out.println(voltea(num));
        System.out.println(digitoN(num, posicion));


    }
    public static boolean esCapicua(int num) {

        String cadena = String.valueOf(num);
        String inverso = "";

        for (int i = cadena.length() - 1; i >= 0; i--) {
            inverso += Character.toString(cadena.charAt(i));
        }
        if (inverso.equals(cadena)) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean esPrimo(int num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int siguientePrimo(int num) {
        while (true){
            num++;
            if (esPrimo(num)){
                return num;
            }
        }
    }
    public static double potencia (double num, double expo){
        double pov;
        pov=Math.pow(num, expo);
        return pov;
    }
    public static int digito(int num){
        String cadena =Integer.toString(num);
        int ndigitos=cadena.length();
        return ndigitos;
    }
    public static int voltea (int num){
        String cadena=Integer.toString(num);
        String inverso="";

        for (int i =cadena.length()-1; i >=0 ; i--) {
            inverso+=Character.toString(cadena.charAt(i));
        }
        int inverso2=Integer.parseInt(inverso);;
        return inverso2;
    }

    public static int  digitoN (int num, int n){
     String cadena=Integer.toString(num);
        if (n>0 || n<cadena.length()-1){
            int digito=Integer.parseInt(Character.toString(cadena.charAt(n)));
            return digito;
        } else {
            return -1;
        }
    }
}







