package arrays;
import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        double [] pepe= new double[5];
        Scanner sc =new Scanner(System.in);
        System.out.println("introduce 5 numeros con decimales");
        for (int i = 0; i < pepe.length ; i++) {
            pepe[i]=sc.nextDouble();
        }
        System.out.println(pepe.toString());
    }
}
