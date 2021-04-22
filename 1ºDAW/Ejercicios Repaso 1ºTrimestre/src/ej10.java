import java.util.Scanner;

/*
Realiza un programa que pinte por pantalla una pecera con un pececito
dentro.
Se debe pedir al usuario el ancho y el alto de la pecera, que como
mínimo serán de 4 unidades. No hay que comprobar que los datos se
introducen correctamente; podemos suponer que el usuario los introduce
bien. Dentro de la pecera hay que colocar de forma aleatoria un
pececito, que puede estar situado en cualquiera de las posiciones que
quedan en el hueco que forma el rectángulo.
Ejemplo:
Por favor, introduzca la altura de la pecera (como mínimo 4): 4
Ahora introduzca la anchura (como mínimo 4): 7
* * * * * * *
*           *
*         & *
* * * * * * *
 */
public class ej10 {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        int altura,anchura;

        System.out.println("Introduzca la altura (como mínimo 4) ");
        altura= sc.nextInt();

        System.out.println("Introduzca la anchura (como mínimo 4)");
        anchura= sc.nextInt();

        int posj= (int)(Math.random()*(anchura-2)+2);
        int posi= (int)(Math.random()*(altura-2)+2);



        for (int i = 1; i <= altura ; i++) {
            for (int j = 1; j <= anchura; j++) {
                if (i==1| j==1|i==altura|j==anchura){
                    System.out.print("*  ");
                }else{
                    if (posi==i && posj==j){
                        System.out.print("&  ");
                    } else {

                        System.out.print("   ");
                    }
                }

            }
            System.out.println();
        }

    }
}
