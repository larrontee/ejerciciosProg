import java.util.Scanner;

public class ejercicio25 {
    public static void main(String[] args) {
        double altura, ancho, pescudo=2.5, envio=3.5;
        String escudo;

        Scanner sc= new Scanner(System.in);
        System.out.println("Introduzca la anchura de la bandera");
        ancho = sc.nextDouble();
        System.out.println("Introduzca la altura de la bandera");
        altura =sc.nextDouble();
        System.out.println("¿Quieres el escudo bordado?(Si/No)");
        sc.nextLine();
        escudo=sc.nextLine();
        switch (escudo) {
            case "no":
                pescudo=0;
                break;
        }
        System.out.println("Gracias. Aquí tiene el desglose de su compra."+"\n" +
                "Bandera de " + altura*ancho+"cm^2: "+ ((altura*ancho)*0.01)+"€"+"\n" +
                "Escudo bordado: "+ pescudo+"€"+"\n" +
                "Gastos de envio: "+envio+"€"+"\n" +
                "Total: "+(((altura*ancho)*0.01)+(pescudo)+(envio))+"€");
    }
}
