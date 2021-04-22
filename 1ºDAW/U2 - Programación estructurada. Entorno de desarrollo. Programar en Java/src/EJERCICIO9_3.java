import java.util.Scanner;

public class EJERCICIO9_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pass1, pass2, caracter, caracter2;

        System.out.printf("JUGADOR 1: Introduce la contraseña: ");
        pass1 = sc.nextLine();

        System.out.println("PISTAS: ");
        System.out.println("Longitud: "+pass1.length());
        System.out.println("Primer caracter: "+pass1.charAt(0));
        System.out.println("Último caracter: "+pass1.charAt(pass1.length()-1));
        do{
            System.out.printf("JUGADOR 2: Introduce la contraseña: ");
            pass2 = sc.nextLine();
            System.out.println("PISTAS: ");
            System.out.println("Longitud: "+pass1.length());
            System.out.println("Primer caracter: "+pass1.charAt(0));
            System.out.println("Último caracter: "+pass1.charAt(pass1.length()-1));
            if(pass1.length() == pass2.length()){
                for (int i = 0; i < pass2.length(); i++) {
                    caracter= ""+pass1.charAt(i);
                    caracter2=""+pass2.charAt(i);
                    if(caracter.compareTo(caracter2)>0){
                        System.out.println("El caracter "+i+" es menor"+" POSICIONES: "+caracter.compareTo(caracter2));
                    }else if(caracter.compareTo(caracter2)<0){
                        System.out.println("El caracter "+i+" es mayor"+" POSICIONES: "+caracter.compareTo(caracter2));
                    }else{
                        System.out.println("El caracter "+i+" Es igual");
                    }
                }
            }else{
                System.out.println("INTRODUCE LA LONGITUD CORRECTA");
            }

        }while(!pass1.equals(pass2));
        System.out.println("Acertaste");
    }
}
