/*
Define la función convierteArrayEnString con la siguiente cabecera:
public static String convierteArrayEnString(int[] a)
Esta función toma como parámetro un array que contiene números y
devuelve una cadena de caracteres con esos números. Por ejemplo, si a
= { }, convierteArrayEnString(a) devuelve “”; si a = { 8 },
convierteArrayEnString(a) devuelve “8”; si a = { 6, 2, 5, 0, 1 },
convierteArrayEnString(a) devuelve “62501”.
 */
public class ej17 {
    public static void main(String[] args) {
        int[] entero={1,2,3};

        System.out.println(convierteArrayEnString(entero));
    }
    public static String convierteArrayEnString(int[] a){
        String cadena="";

        for (int i = 0; i < a.length; i++) {
            cadena+=Integer.toString(a[i]);
        }
        return cadena;
    }
}
