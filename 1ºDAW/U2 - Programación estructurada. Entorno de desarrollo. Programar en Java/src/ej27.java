
import java.util.Scanner;

public class ej27 {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        String pastel;
        String nata;
        String perso;
        double preciotarta=0;
        double preciochoco=0;
        double precionata=0;
        double preciotuneo=0;


        System.out.println("Que pastel desea: manzana, fresa o chocolate ");
        pastel=sc.nextLine();
        switch (pastel){
            case "manzana":
                preciotarta=18;
                break;
            case "fresa":
                preciotarta=16;
                break;
            case "chocolate":
                System.out.println("Chocolate negro o blanco");
                pastel= sc.nextLine();
                switch (pastel){
                    case "negro":
                        preciotarta=14;
                        break;
                    case "blanco":
                        preciotarta=15;
                        break;
                }
        }
        System.out.println("quiere nata o q");
        nata= sc.nextLine();
        switch (nata){
            case "no":
                precionata=0;
                break;
            case "si":
                precionata=2.5;
                break;
        }
        System.out.println("te lo tuneo?");
        perso= sc.nextLine();
        switch (perso){
            case "no":
                preciotuneo=0;
                break;
            case "si":
                preciotuneo=2.75;
                break;

        }
        System.out.println("precio tarta= " + preciotarta + "\n"
                            +"precio nata= "+ precionata +"\n" +
                "personalizado= "+ preciotuneo + "\n" +
                "total= " + (precionata+preciotarta+preciotuneo));
    }
}
