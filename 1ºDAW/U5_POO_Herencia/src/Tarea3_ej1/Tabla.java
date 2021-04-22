package Tarea3_ej1;

import java.util.Arrays;
import java.util.Comparator;

public class Tabla {
    public static void main(String[] args) {
        Integer[] tab=new Integer[20];
        Tabla.rellenatabla(tab);

        System.out.println(Arrays.toString(tab));

        Arrays.sort(tab);
        System.out.println(Arrays.toString(tab));

        Arrays.sort(tab,new tabladecreciente());
        System.out.println(Arrays.toString(tab));
    }


    public static void rellenatabla (Integer[] tabla){
        for (int i = 0; i < tabla.length; i++) {
            tabla[i]=(int)(Math.random()*(100)+1);
        }
    }


    public  static class tabladecreciente implements Comparator<Integer> {
        @Override
        public int compare(Integer n1, Integer n2){
            return n2-n1;
        }
    }




}
