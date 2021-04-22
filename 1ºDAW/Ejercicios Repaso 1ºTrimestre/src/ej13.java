import java.util.Arrays;
import java.util.Scanner;

/*
Crea la función de manejo de arrays que tenga la siguiente cabecera y
que haga lo que se especifica en los comentarios (puedes incluirla en
tu propia biblioteca de rutinas):
public static int[] filtraPrimos(int x[])
Devuelve un array con todos los números primos que se encuentren
en otro array que se pasa como parámetro. Obviamente el tamaño
del array que se devuelve será menor o igual al que se pasa como
parámetro.
Utiliza esta función en un programa para comprobar que funcionan bien.
Para que el ejercicio resulte más fácil, las repeticiones de primos se
conservan; es decir, si en el array x el número 13 se repite 3 veces,
en el array devuelto también estará repetido 3 veces. Si no existe
ningún número primo en x, se devuelve un array con el número -1 como
único elemento.

 */
public class ej13 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("longitud");
        int longitud= sc.nextInt();
        int [] vector= new int[longitud];
        for (int i = 0; i < vector.length; i++) {
            vector[i]=sc.nextInt();
        }

        System.out.println(Arrays.toString(filtraPrimos(vector)));
    }



    public static int[] filtraPrimos(int x[]){
        int[] primos=new int[0];
        boolean primo=true;

        for (int i = 0; i < x.length; i++) {
            primo=true;
            for (int j = 2 ; j <x[i]; j++) {
                if (x[i]%j==0){
                    primo=false;
                    }
            }
            if (primo){
                    primos= Arrays.copyOf(primos, primos.length+1) ;
                    primos[primos.length-1]+=x[i];
                }
        }
        return primos;
    }
}


