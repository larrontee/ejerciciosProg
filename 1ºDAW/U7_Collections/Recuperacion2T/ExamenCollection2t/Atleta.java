package ExamenCollection2t;

import java.io.Serializable;

public class Atleta implements Serializable, Comparable<Atleta>{
    private int dorsal;
    private String nombre;
    private String pais;
    private int marca;
    private Categoria categoria;
    private Boolean finisher;
    public static int contador=1;

    public Atleta(String nombre, String pais, Categoria categoria) {
        this.dorsal = contador;
        this.nombre = nombre;
        this.pais = pais;
        this.marca = marca;
        this.categoria = categoria;
        this.finisher = finisher;
        contador ++;

    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getMarca() {
        return marca;
    }

    public void setMarca(int marca) {
        this.marca = marca;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Boolean getFinisher() {
        return finisher;
    }

    public void setFinisher(Boolean finisher) {
        this.finisher = finisher;
    }

    @Override
    public int compareTo(Atleta o) {
        return this.getMarca()-o.getMarca();
    }
}
