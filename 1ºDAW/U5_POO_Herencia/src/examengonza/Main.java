package examengonza;

public class Main {
    public static void main(String[] args) {
        Zorro zorro = new Zorro(16, 1);
        Lobo lobo = new Lobo(20, 10);

        Gato gato= new Gato(3,0);
        Perro perro= new Perro(9,7);

        Cerdo cerdo= new Cerdo(1000,"123",Calidad.EXTREMA);
        Pollo pollo = new Pollo(1,"456",Calidad.OSCAR);

        Ganadero ganadero= new Ganadero("pepe", "xxxxxx", 45,"777");
        Cliente cliente= new Cliente("pepe", "xxxxxx", 45,"888");



    }
}
