import java.util.Scanner;

public class dowhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        do {
            System.out.println("pide num");
            num = sc.nextInt();
            System.out.println(num);
        } while (num%2==0);

    }
}
