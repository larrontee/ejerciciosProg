package prueba_progT3;

import java.util.Arrays;

public class ej3 {

    public static void main(String[] args) {
        String[] pais = {"España", "Rusia", "Japón", "Australia"};
        int[][] altura=new int[4][10];
        int media=0;
        int valor=0;
        int min=0;
        int max=0;

        for (int i = 0; i < altura.length; i++) {
            valor=0;
            for (int j = 0; j < altura[0].length; j++) {
                altura[i][j]=(int)(Math.random()*211);

                valor=(valor+=altura[i][j]);
                media=valor/altura[0].length;

                if (max<altura[i][j]){
                    max=altura[i][j];
                    max=max;
                }
                if (min>altura[i][j]){
                    min=altura[i][j];
                    min=min;
                }



            }
            System.out.println(pais[i]+ Arrays.toString(altura[i])+" media:"+media+" min:"+min+" max:"+max);
        }
    }
}
