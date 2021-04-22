import java.util.Scanner;

/*
Amplía el ejercicio anterior con las siguientes funciones:
8. posicionDeDigito: Da la posición de la primera ocurrencia de
un dígito dentro de un número entero. Si no se encuentra,
devuelve -1.
9. quitaPorDetras: Le quita a un número n dígitos por detrás (por
la derecha).
10.quitaPorDelante: Le quita a un número n dígitos por delante
(por la izquierda).
11.pegaPorDetras: Añade un dígito a un número por detrás.
12.pegaPorDelante: Añade un dígito a un número por delante.
13.trozoDeNumero: Toma como parámetros las posiciones inicial y
    final dentro de un número y devuelve el trozo correspondiente.
14.juntaNumeros: Pega dos números para formar uno.
 */
public class ej12 {
    public static void main(String[] args) {
        int num=897456321;
        int n=2;

        System.out.println(trozoDeNumero(num));
    }

    public static long posicionDeDigito(long num, int digito){

        String cadena=Long.toString(num);

        if (digito>=0 && digito<10){

            for (int i = 0; i <cadena.length() ; i++) {
                if (Integer.parseInt(Character.toString(cadena.charAt(i)))==digito){
                    return i;
                }
            }
            return -1;
        } else {
            return -1;
        }
    }
    public static int quitaPorDetras(int num, int n){
        for (int i = 0; i < n; i++) {
            num=num/10;
        }
        return num;
    }

    public static String quitaPorDelante(int num, int n){
        String cadena=Integer.toString(num);

        return cadena.substring(n,cadena.length());
    }
    public static int pegaPorDetras(int num, int n){
        String cadena1=Integer.toString(num)+n;
        return Integer.parseInt(cadena1);
    }
    public static int pegaPorDelante(int num, int n){
        String cadena1=n+Integer.toString(num);
        return Integer.parseInt(cadena1);

    }
    public static int trozoDeNumero(int num){
        String cadena=Integer.toString(num);
        String cadena1=cadena.substring(1,cadena.length()-1);
        return Integer.parseInt(cadena1);
    }

}



