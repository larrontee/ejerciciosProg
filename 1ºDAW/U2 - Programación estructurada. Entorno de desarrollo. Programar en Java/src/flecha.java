import java.util.Scanner;

public class flecha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, espacios=0;
        do{
            System.out.printf("Introduce la altura mayor o igual que 3: ");
            num = sc.nextInt();
            System.out.println(num);
        }while(num<3 || num%2==0);
        System.out.println("has salido");
        for (int i=1 ; i<=num ; i++) {
            for ( int j=1 ; j<= ((num+1)/2)+5 ; j++) {
                if ( i+j >= ((num+1)/2)+1 && i-j <= num/2 && j<= (num+1)/2 ) {
                    System.out.print(" *");
                }else if (i == (num+1)/2 ) {
                    System.out.print(" *");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
    }
}
