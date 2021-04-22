package Minecraft;

import java.util.Comparator;

public abstract class Materiales implements Comparable<Materiales> {
    protected String nombre;
    protected int masa ;//(entre 0 y 1000)
    protected int combustion;// (entre 0 y 100)
    protected int solubilidad; // (entre 0 y 100).
    protected boolean moviles;

    public Materiales(String nombre, int masa, int combustion, int solubilidad, boolean moviles) {
        this.nombre = nombre;
        this.masa = masa;
        this.combustion = combustion;
        this.solubilidad = solubilidad;
        this.moviles = moviles;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getMasa() {
        return masa;
    }

    public void setMasa(int masa) {
        this.masa = masa;
    }

    public int getCombustion() {
        return combustion;
    }

    public void setCombustion(int combustion) {
        this.combustion = combustion;
    }

    public int getSolubilidad() {
        return solubilidad;
    }

    public void setSolubilidad(int solubilidad) {
        this.solubilidad = solubilidad;
    }

    public boolean isMoviles() {
        return moviles;
    }

    public void setMoviles(boolean moviles) {
        this.moviles = moviles;
    }

    @Override
    public String toString() {
        return "Materiales{" +
                "nombre='" + nombre + '\n' +
                ", masa=" + masa +
                ", combustion=" + combustion +
                ", solubilidad=" + solubilidad +
                ", moviles=" + moviles +
                '}';
    }

    @Override
    public int compareTo(Materiales o) {
        return o.masa-this.masa;
    }

    public static class combustion implements Comparator<Materiales>{

        @Override
        public int compare(Materiales o1, Materiales o2) {
            return o2.combustion-o1.combustion;
        }

    }
    public static class solubilidad implements Comparator<Materiales>{

        @Override
        public int compare(Materiales o1, Materiales o2) {
            return o2.solubilidad-o1.solubilidad;
        }
    }



}
