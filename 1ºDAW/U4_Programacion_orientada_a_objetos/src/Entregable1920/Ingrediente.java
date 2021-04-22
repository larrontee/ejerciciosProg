package Entregable1920;

public class Ingrediente {
    private String nombre;
    private int Calorias100g;

    public Ingrediente(String nombre, int calorias100g) {
        this.nombre = nombre;
        Calorias100g = calorias100g;
    }

    public Ingrediente() {
        this.nombre ="Queso";
        Calorias100g = 250;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCalorias100g() {
        return Calorias100g;
    }

    public void setCalorias100g(int calorias100g) {
        Calorias100g = calorias100g;
    }

    @Override
    public String toString() {
        return "Ingrediente{" +
                "nombre='" + nombre + '\'' +
                ", Calorias100g=" + Calorias100g +
                '}';
    }




}

