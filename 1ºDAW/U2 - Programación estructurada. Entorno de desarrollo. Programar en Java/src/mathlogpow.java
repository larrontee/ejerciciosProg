import java.util.Scanner;

public class mathlogpow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num;

        System.out.println("Introduzca un número entero positivo");
        num = sc.nextLong();

        int cant_num = (int)(Math.log10(num));
        int cifra = (int)(num/Math.pow(10,cant_num));



    }
}
