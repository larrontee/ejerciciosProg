package Zoo;

import java.util.Comparator;

public class Koala extends Animal{
    private int tiempoDormido;
    private int tam;

    public Koala(String nombre, int peso, int tiempoDormido, int tam) {
        super(nombre, peso);
        this.tiempoDormido = tiempoDormido;
        this.tam = tam;
    }

    public int getTiempoDormido() {
        return tiempoDormido;
    }

    public void setTiempoDormido(int tiempoDormido) {
        this.tiempoDormido = tiempoDormido;
    }

    public int getTam() {
        return tam;
    }

    public void setTam(int tam) {
        this.tam = tam;
    }

    @Override
    public String toString() {
        return "Koala{" +
                "nombre='" + nombre + '\'' +
                ", peso=" + peso +
                ", tiempoDormido=" + tiempoDormido +
                ", tam=" + tam +
                '}';
    }

    public static class comparatiempo implements Comparator<Koala>{

        @Override
        public int compare(Koala o1, Koala o2) {
            return o1.tiempoDormido-o2.tiempoDormido;
        }
    }
}
