package Zoo;

public class Oso extends Animal{
    private boolean albino;
    private boolean iberna;

    public Oso(String nombre, int peso, boolean albino, boolean iberna) {
        super(nombre, peso);
        this.albino = albino;
        this.iberna = iberna;
    }

    public boolean isAlbino() {
        return albino;
    }

    public void setAlbino(boolean albino) {
        this.albino = albino;
    }

    public boolean isIberna() {
        return iberna;
    }

    public void setIberna(boolean iberna) {
        this.iberna = iberna;
    }

    @Override
    public String toString() {
        return "Oso{" +
                "nombre='" + nombre + '\'' +
                ", peso=" + peso +
                ", albino=" + albino +
                ", iberna=" + iberna +
                '}';
    }
}
