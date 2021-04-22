import java.util.Arrays;
/*
Escribe un programa que genere un array
con 100 números aleatorios de 18 a 100 y que los muestre por pantalla separados por espacios.
A continuación deberá mostrar de nuevo dicho array
con los números primos generados con dos asteriscos delante y dos astericos detrás.
Para determinar si un número es primo deberemos crear una función.
 */
public class EJ4 {
    public static void main(String[] args) {
        int[] vector = new int[100];

        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random() * (101 - 18) + 18);
        }
        System.out.println(Arrays.toString(vector));

        for (int j : vector) {
            if (senalaprimo(j)) {
                System.out.print("**" + j + "** ");
            } else {
                System.out.print(" " + j + " ");
            }
        }
    }
    public static boolean senalaprimo(int num){
        boolean primo=true;

        for (int j = 2; j < num; j++) {
            if (num%j==0){
                return primo=false;
            }
        }

        return primo;
    }
}
