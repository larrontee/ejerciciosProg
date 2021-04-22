package arrays;

import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("que cantidad de digitos quiere que tenga la contraseña");
        int n= sc.nextInt();
        int[] clave = new int[n];
        int[] clave2 = new int[n];

        for (int i = 0; i < clave.length ; i++) {
            clave[i]= (int)(Math.random()*6);
        }
        System.out.println(clave);
        System.out.println(clave2);
        do {

            System.out.println("prueba suerte");
            for (int i = 0; i < clave2.length; i++) {
                clave2[i]=sc.nextInt();

                if(clave[i]<clave2[i]) {
                    System.out.println("Es mayor");
                }else if(clave[i]>clave2[i]) {
                    System.out.println("Es menor");
                }
                else {
                    System.out.println("es igual");
                }
            }
        }while (!funcion(clave,clave2));


    }
    public static boolean funcion(int[] clave1,int[] clave2){
        boolean comparacion = false;
        for (int i = 0; i < clave2.length; i++) {
            if (clave1[i]==clave2[i]){
                comparacion=true;
            } else{
                comparacion=false;
                break;
            }

        } return comparacion;
    }
}
