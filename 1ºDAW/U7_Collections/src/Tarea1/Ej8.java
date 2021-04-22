package Tarea1;

import java.util.*;

//Implementar una función a la que se le pase una lista de nombres y devuelva una copia sin elementos repetidos (sin modificar la original)
//con el prototipo: List eliminaRepetidos (List c)
public class Ej8 {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        Scanner sc= new Scanner(System.in);
        String palabra=sc.nextLine();

        while (!palabra.contains("fin")){
            list.add(palabra);
            palabra=sc.nextLine();
        }
        System.out.println(eliminaRepetidos(list));
    }
    public static Set eliminaRepetidos(List lista){
        Set<Integer> set= new LinkedHashSet<>();
        set.addAll(lista);
        return set;
    }
}
