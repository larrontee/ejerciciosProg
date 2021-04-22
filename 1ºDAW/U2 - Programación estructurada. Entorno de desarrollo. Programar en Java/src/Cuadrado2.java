import java.util.Scanner;

public class Cuadrado2 {
    public static void main(String[] args) {
        cuadradoGenerator();
    }

	public static void cuadradoGenerator() {
		Scanner sc = new Scanner(System.in);
        int num;
        num = sc.nextInt();
        
        int num2 = num;
        
		if(num2%2==0 || num2<5){
            System.out.println("minimo 5 o impar");
            } else {
            for (int i = 1; i <=num2 ; i++) {
                for (int j = 1; j <=num2 ; j++) {
                    if(i==1 || i==num2 || j==num2 || j==1 || i==j || i+j==num2+1){
                        System.out.print("* ");
                    }else{
                        System.out.print("  ");
                    }

                }System.out.println();

            }

        }
	}
}
