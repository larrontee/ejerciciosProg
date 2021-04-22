package Minecraft;

public class Cristal extends Materiales {
    Tipos tipo;

    public Cristal(String nombre, int masa, int combustion, int solubilidad, boolean moviles, Tipos tipo) {
        super(nombre, masa, combustion, solubilidad, moviles);
        this.tipo = tipo;
    }
}
