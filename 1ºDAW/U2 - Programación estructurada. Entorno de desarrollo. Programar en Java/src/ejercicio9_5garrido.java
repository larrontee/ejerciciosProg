import java.util.Scanner;
public class ejercicio9_5garrido {


        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String frase;

            System.out.println("Introduce la frase que deseas traducir del javaliense");
            frase = sc.nextLine();





            if (frase.contains("Javalin, javalon   ")){
                System.out.println("Traduciendo...");

                if(frase.contains("   javalen, len, len")){
                    System.out.println(frase.substring(19,frase.length()-20));
                }
                else
                    System.out.println(frase.substring(19));
            }

            if(frase.contains("   javalen, len, len"))
                System.out.println(frase.substring(0,frase.length()-20));

        }
    }

