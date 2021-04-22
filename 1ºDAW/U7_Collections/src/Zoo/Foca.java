package Zoo;

public class Foca extends Animal{
    private int tamColmillo;
    private int longitudBigote;


    public Foca(String nombre, int peso, int tamColmillo, int longitudBigote) {
        super(nombre, peso);
        this.tamColmillo = tamColmillo;
        this.longitudBigote = longitudBigote;
    }

    public int getTamColmillo() {
        return tamColmillo;
    }

    public void setTamColmillo(int tamColmillo) {
        this.tamColmillo = tamColmillo;
    }

    public int getLongitudBigote() {
        return longitudBigote;
    }

    public void setLongitudBigote(int longitudBigote) {
        this.longitudBigote = longitudBigote;
    }

    @Override
    public String toString() {
        return "Foca{" +
                "nombre='" + nombre + '\'' +
                ", peso=" + peso +
                ", tamColmillo=" + tamColmillo +
                ", longitudBigote=" + longitudBigote +
                '}';
    }
}
