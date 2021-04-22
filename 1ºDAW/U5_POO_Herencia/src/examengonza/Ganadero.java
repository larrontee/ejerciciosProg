package examengonza;

import java.util.Arrays;

public class Ganadero extends Persona {
    protected String idganadero;
    protected Ganado[] animals;

    public Ganadero(String nombre, String dni, int edad, String idganadero) {
        super(nombre, dni, edad);
        this.idganadero = idganadero;
        this.animals =new Ganado[0];
    }

    public String getIdganadero() {
        return idganadero;
    }

    public void setIdganadero(String idganadero) {
        this.idganadero = idganadero;
    }

    public Ganado[] getAnimals() {
        return animals;
    }

    public void setAnimals(Ganado[] animals) {
        this.animals = animals;
    }

    public void addganado(Ganado ganado){
        Arrays.copyOf(animals,animals.length+1);
        animals[animals.length-1]=ganado;
    }

    public void eliminarganado(){
        Ganado[] ganado1=new Ganado[0];
        for (int i = 0; i <animals.length ; i++) {
        if (animals[i].isVivo()){
            Arrays.copyOf(ganado1,ganado1.length+1);
            ganado1[ganado1.length-1]=animals[i];
            }
        animals=ganado1;
        }

    }




    @Override
    public String toString() {
        return "Ganadero{" +
                "idganadero='" + idganadero + '\'' +
                ", animals=" + Arrays.toString(animals) +
                ", nombre='" + nombre + '\'' +
                ", dni='" + dni + '\'' +
                ", edad=" + edad +
                '}';
    }
}
