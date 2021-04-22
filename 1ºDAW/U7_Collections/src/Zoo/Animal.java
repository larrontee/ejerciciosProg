package Zoo;

import java.io.Serializable;

/*

Un zoo quiere abrir sus puertas, necesita guardar en el sistema un estructura de datos que almacene cinco tipo de
animales, cada tipo de animal contendra una lista con cada uno de los animales de ese tipo. Los datos que tendrán en
comun sera su peso, y el nombre propio. Cada animal tendrá almenos dos atributos que lo defina.
Los animales se podrán comparar por defecto por su peso e individualmente por un atributo de su clase, deberemos hacer
entonces una serie de métodos en los que podamos añadir, sacar, mostrar, buscar, guardar en archivo y obtener de archivo.

*/
public class Animal implements Comparable<Animal> , Serializable {
    protected String nombre;
    protected int peso;


    public Animal(String nombre, int peso) {
        this.nombre = nombre;
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "nombre='" + nombre + '\'' +
                ", peso=" + peso +
                '}';
    }

    @Override
    public int compareTo(Animal o) {
        return this.getPeso()-o.getPeso();
    }
}
