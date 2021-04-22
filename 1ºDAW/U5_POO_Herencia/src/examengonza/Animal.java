package examengonza;

import java.util.Comparator;

public abstract class Animal implements Comparable <Animal> {
    protected int peso;

    public Animal(int peso) {
        this.peso = peso;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }


    @Override
    public int compareTo(Animal o) {
        return o.peso-this.peso;
    }



    @Override
    public String toString() {
        return "Animal{" +
                "peso=" + peso +
                '}';
    }
}
