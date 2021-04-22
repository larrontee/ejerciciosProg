import java.util.Arrays;
import java.util.Scanner;

/*
Crea la función de manejo de arrays que tenga la siguiente cabecera y
que haga lo que se especifica en los comentarios (puedes incluirla en
tu propia biblioteca de rutinas):
public int[] filtraCapicuas(int x[])
// Devuelve un array con todos los números capicúa que se encuentren
// en otro array que se pasa como parámetro. Obviamente el tamaño del
// array que se devuelve será menor o igual al que se pasa como
//parámetro.
Utiliza esta función en un programa para comprobar que funcionan bien.
Para que el ejercicio resulte más fácil, las repeticiones de números
capicúa se conservan; es decir, si en el array x el número 505 se
repite 3 veces, en el array devuelto también estará repetido 3 veces.
Si no existe ningún número capicúa en x, se devuelve un array con el
número -1 como único elemento.


 */
public class ej15 {
    public static void main(String[] args) {
        System.out.println("introduce una longitud");
        Scanner sc=new Scanner(System.in);
        int longitud= sc.nextInt();

        int[] vector=new int[longitud];
        for (int i = 0; i < vector.length; i++) {
            vector[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(filtraCapicuas(vector)));
    }

    public static int[] filtraCapicuas(int x[]) {
        int[] capicuas = new int[0];

        for (int i = 0; i < x.length; i++) {
            if (ej11.esCapicua(x[i])) {
                capicuas = Arrays.copyOf(capicuas, capicuas.length + 1);
                capicuas[i]=x[i];
            }
        }
        return capicuas;
    }
}