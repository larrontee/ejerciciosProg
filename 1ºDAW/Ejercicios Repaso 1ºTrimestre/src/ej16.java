/*
Realiza un programa que pinte un triángulo hueco tal como se muestra
en los ejemplos. El usuario debe introducir la altura de la figura.
Utiliza funciones para pintar las líneas.
Ejemplo 1:
Introduzca la altura de la figura: 8
********
*     *
*    *
*   *
*  *
* *
**
*
Ejemplo 2:
Introduzca la altura de la figura: 5
*****
*  *
* *
**
*
 */
public class ej16 {
    public static void main(String[] args) {
        int longitud=8;

        for (int i = 0; i < longitud; i++) {
            for (int j = 0; j < longitud; j++) {
                if (i==0 ||i+j==longitud-1 || j==0){
                    System.out.print("*");
                } else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
