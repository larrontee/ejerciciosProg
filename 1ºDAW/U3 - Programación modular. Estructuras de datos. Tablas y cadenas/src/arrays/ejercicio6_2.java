package arrays;

public class ejercicio6_2 {
    public static void main(String[] args) {
        int [][] vector = new int[6][8];

        for (int i = 0; i < vector.length; i++) {
            for (int j = 0; j < vector[0].length; j++) {
                vector[i][j]=(int)(Math.random()*1001);
            }
        }
        
    }
}
