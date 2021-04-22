import java.util.Scanner;

public class ejercicio9_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String frase;
        do {
            System.out.println("Introduce la frase, recuerda que la frase debe ser impar");
            frase=sc.nextLine();
        } while (frase.length()%2==0);

        System.out.println(frase.charAt(frase.length()/2));
        if (frase.charAt(frase.length()/2)==' '){
            System.out.println("es espacio");
        }else {
            System.out.println("no es espacio");
        }

    }
}
