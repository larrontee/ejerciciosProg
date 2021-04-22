package Zoo;

import java.util.Comparator;

public class Leon extends Animal {
    private String color;
    private boolean machoAlfa;

    public Leon(String nombre, int peso, String color, boolean machoAlfa) {
        super(nombre, peso);
        this.color = color;
        this.machoAlfa = machoAlfa;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isMachoAlfa() {
        return machoAlfa;
    }

    public void setMachoAlfa(boolean machoAlfa) {
        this.machoAlfa = machoAlfa;
    }

    @Override
    public String toString() {
        return "Leon{" +
                "nombre='" + nombre + '\'' +
                ", peso=" + peso +
                ", color='" + color + '\'' +
                ", machoAlfa=" + machoAlfa +
                '}';
    }
    public static class comparacolor implements Comparator<Leon> {
        @Override
        public int compare(Leon o1, Leon o2) {
            return o1.color.compareTo(o2.color);
        }
    }
}
