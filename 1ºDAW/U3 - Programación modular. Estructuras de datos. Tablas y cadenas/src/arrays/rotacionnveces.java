package arrays;

import javax.management.StandardMBean;
import java.util.Arrays;
import java.util.Scanner;
import java.util.SimpleTimeZone;

public class rotacionnveces {
    public static void main(String[] args) {
        int tam;
        int [] numeros;
        int [] destino;
        Scanner sc= new Scanner(System.in);
        System.out.println("introduce el tamaño");
        tam= sc.nextInt();
        destino=new int [tam];
        numeros=new int [tam];

        for (int i = 0; i <numeros.length; i++) {
            numeros[i]=(int)(Math.random()*11);
        }
        System.out.println("desplazamiento");
        int rotacion= sc.nextInt();


        for (int i = 0; i < numeros.length ; i++) {
            destino[(i+rotacion)% numeros.length]=numeros[i];
            System.out.println((i+rotacion)% numeros.length);
        }
        System.out.println(Arrays.toString(numeros));
        System.out.println(Arrays.toString(destino));



    }
}
