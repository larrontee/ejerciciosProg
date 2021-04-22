package examengonza;

import java.util.Arrays;
import java.util.Comparator;

public class Granja {
    Ganado[] animales;
    Persona[] personas;

    public Granja() {
        this.animales =new Ganado[0];
        this.personas = new Persona[0];
    }

    public Ganado[] getAnimales() {
        return animales;
    }

    public void setAnimales(Ganado[] animales) {
        this.animales = animales;
    }

    public Persona[] getPersonas() {
        return personas;
    }

    public void setPersonas(Persona[] personas) {
        this.personas = personas;
    }

    public void Ordenarpesomasamenos (){
        Arrays.sort(animales, new Comparator<Ganado>() {
            @Override
            public int compare(Ganado o1, Ganado o2) {
                if (o1.getPeso()- o2.getPeso()!=0){
                    return o1.getPeso()- o2.getPeso();

                } else{
                    return o1.getCalidad().compareTo(o2.getCalidad());
                }

            }

        });
    }

    private void addganado(Ganado ganado){
        animales=Arrays.copyOf(animales,animales.length+1);
        animales[animales.length-1]=ganado;
    }
    public void addganadero(Ganadero ganadero){

        personas=Arrays.copyOf(personas,personas.length+1);
        personas[personas.length-1]=ganadero;


        /*Arrays.copyOf(animales,animales.length+1);
        animales[animales.length-1]=ganado;*/
    }

    @Override
    public String toString() {
        return "Granja{" +
                "animales=" + Arrays.toString(animales) +
                ", personas=" + Arrays.toString(personas) +
                '}';
    }
}
