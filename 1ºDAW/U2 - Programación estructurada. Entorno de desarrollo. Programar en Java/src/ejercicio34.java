import java.util.Scanner;

public class ejercicio34 {
    public static void main(String[] args) {
        //de mega a kilo 1mb es 1000kb
        Scanner sc= new Scanner(System.in);
        double cantidad;
        System.out.println("Introduce la cantidad de Megabytes");
        cantidad = sc.nextDouble();

        System.out.println("La cantidad de kb es " + cantidad*1000+"kb");



    }
}
