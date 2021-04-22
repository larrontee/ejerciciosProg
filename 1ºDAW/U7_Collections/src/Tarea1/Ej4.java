        package Tarea1;
        import java.util.*;
        /*
        Introducir por consola una frase que conste exclusivamente de palabras separadas por espacios. Almacenar en una lista las
        palabras de la frase, una en cada nodo y mostrar por pantalla las palabras que estén repetidas. A continuación, mostrar las que no lo estén.
        */
public class Ej4 {
    public static void main(String[] args) {
        Scanner sc =new Scanner (System.in);
        String frase = sc.nextLine();
        String[] cadena=frase.split(" ");
        List<String> norepetido= new ArrayList<>();
        List<String> repetido= new ArrayList<>();

        for (int i = 0; i < cadena.length; i++) {
            if (frase.indexOf(cadena[i])!=frase.lastIndexOf(cadena[i])){
                if (!repetido.contains(cadena[i])){
                    repetido.add(cadena[i]);
                }
            }else{
                norepetido.add(cadena[i]);
            }
        }
        System.out.println(repetido);
        System.out.println(norepetido);
    }
}