package Zoo;

public class Lobo extends Animal {
    private boolean orejasPico;
    private boolean ojosAzules;

    public Lobo(String nombre, int peso, boolean orejasPico, boolean ojosAzules) {
        super(nombre, peso);
        this.orejasPico = orejasPico;
        this.ojosAzules = ojosAzules;
    }

    public boolean isOrejasPico() {
        return orejasPico;
    }

    public void setOrejasPico(boolean orejasPico) {
        this.orejasPico = orejasPico;
    }

    public boolean isOjosAzules() {
        return ojosAzules;
    }

    public void setOjosAzules(boolean ojosAzules) {
        this.ojosAzules = ojosAzules;
    }

    @Override
    public String toString() {
        return "Lobo{" +
                "nombre='" + nombre + '\'' +
                ", peso=" + peso +
                ", orejasPico=" + orejasPico +
                ", ojosAzules=" + ojosAzules +
                '}';
    }

}
