package ExamenCollection2t;

import java.io.SequenceInputStream;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int marcador =sc.nextInt();
        do {
            System.out.println("" +
                    "1. Cargar Atletas \n" +
                    "2. Guardar Atletas\n" +
                    "3. Incribir Atleta\n" +
                    "4. Guardar Tiempo \n" +
                    "5. Borrar Atleta \n" +
                    "6. MostrarListaFinishers()\n" +
                    "7. MostrarListaCategoria()\n" +
                    "8. ParticipantesPorPaís() \n" +
                    "9. Salir");


        }while (marcador!=9);
    }
}
