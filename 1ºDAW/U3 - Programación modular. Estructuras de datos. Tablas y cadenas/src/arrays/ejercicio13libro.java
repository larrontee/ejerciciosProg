package arrays;



import java.util.Arrays;

/*
Realiza un programa que calcule la estatura media, mínima y máxima en
centímetros de personas de diferentes países. El array que contiene los
nombres de los paises es el siguiente: pais = {“España”, “Rusia”, “Japón”,
“Australia”}. Los datos sobre las estaturas se deben simular mediante un
array de 4 filas por 10 columnas con números aleatorios generados al azar entre
140 y 210. Los decimales de la media se pueden despreciar. Los nombres de
los países se deben mostrar utilizando el array de países (no se pueden escribir
directamente).
 */

public class ejercicio13libro {
    public static void main(String[] args) {
        int maxima = 0;
        int minima = 0;
        int media = 0;
        int valor = 0;

        int[][] altura = new int[4][10];
        String[] pais = {"España", "Rusia", "Japón", "Australia"};

        System.out.printf("%62s%3s %3s %3s", "", "MED", "MIN", "MAX");
        System.out.println();

        for (int i = 0; i < altura.length; i++) {
            valor = 0;

            for (int j = 0; j < altura[0].length; j++) {
                altura[i][j] = (int) ((Math.random() * 71) + 140);
                valor += altura[i][j];
                media = ((valor) / altura[0].length);

                if (j == 0) {
                    minima = altura[i][j];
                    maxima = altura[i][j];
                } else {
                    if (minima > altura[i][j]) {
                        minima = altura[i][j];
                    }
                    if (maxima < altura[i][j]) {
                        maxima = altura[i][j];
                    }
                }
            }
            System.out.printf("%9s:" + Arrays.toString(altura[i]) + "| %3d %3d %3d", pais[i], media, minima, maxima);
            System.out.println("");

        }
        System.out.println();
    }
}

    /* public static void main(String[] args) {
        int maxima= 0;
        int minima= 0;
        int media = 0;
        int valor = 0;

        int [][] altura= new int[4][10];
        String [] pais = {"España", "Rusia", "Japón", "Australia"};

        System.out.printf("%62s%3s %3s %3s","","MED","MIN","MAX");
        System.out.println();

        for (int i = 0; i < altura.length; i++) {
            valor=0;

           for (int j = 0; j <altura[0].length ; j++) {
                altura[i][j]=(int)((Math.random()*71)+140);
                valor+=altura[i][j];
                media=((valor)/ altura[0].length);

                if (j==0){
                    minima=altura[i][j];
                    maxima=altura[i][j];
                } else {
                    if (minima>altura[i][j]){
                        minima=altura[i][j];
                    }
                    if (maxima<altura[i][j]){
                        maxima=altura[i][j];
                    }
                }
            }
            System.out.printf("%9s:"+ Arrays.toString(altura[i]) + "| %3d %3d %3d", pais[i], media, minima, maxima);
            System.out.println("");

        }
        System.out.println();
    }
}


     */