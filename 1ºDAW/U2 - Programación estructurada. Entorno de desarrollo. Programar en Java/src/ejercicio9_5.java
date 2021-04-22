import java.util.Scanner;

public class ejercicio9_5 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String frase;

        do {
            System.out.println("Introduce la frase que deseas traducir del javaliense");
            frase = sc.nextLine();
        } while (!frase.contains("Javalín, javalón   ") && !frase.contains("   javalén, len, len"));

        System.out.println("Traduciendo...");

        if(frase.contains("Javalín, javalón   ") && frase.contains("   javalén, len, len") ) {
            System.out.println(frase.substring(19, frase.length()-20));
        }else if(frase.contains("Javalín, javalón ")){
            System.out.println(frase.substring(19));
        } else{
            System.out.println(frase.substring(0, frase.length()-20));
        }


    }
}
