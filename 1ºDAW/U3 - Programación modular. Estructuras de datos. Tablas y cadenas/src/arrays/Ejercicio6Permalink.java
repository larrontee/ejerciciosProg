package arrays;
/* Ejercicio 6Permalink
Crea un programa que pida un número al usuario un número de mes (por ejemplo, el 4) y diga cuántos días tiene (por ejemplo, 30) y el nombre del mes.
 Debes usar un vector. Para simplificarlo vamos a suponer que febrero tiene 28 días.

*/

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio6Permalink {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String[][] meses= {{"31", "28", "31", "30", "31", "30", "31", "31", "30", "31", "30", "31"},
                            {"enero", "febrero", "marzo", " abril", " mayo", " junio", " julio", " agosto", "septiembre", " octubre", " noviembre", " diciembre"}};
        int num=0;
        String mes;


        do {
            System.out.println(" mes");
            mes=sc.nextLine();
        }
        while (!mees(mes));


            for (int j = 0; j <meses[0].length ; j++) {
               if (meses[1][j].equals(mes)){
                   System.out.println(meses[1][j]);
                   System.out.println(meses[0][j]);

               }

            }



    }

    public static boolean mees(String mes){

        String[] nombresmes={"enero", "febrero", "marzo", " abril", " mayo", " junio", " julio", " agosto", "septiembre", " octubre", " noviembre", " diciembre"};
        for (int i = 0; i < nombresmes.length; i++) {

            if (nombresmes[i].equals(mes)) {
                return true;
            }
        }
        return false;
    }
}
