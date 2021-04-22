/*
package Examen_estacion_meteorologica;

import java.util.Comparator;

public class Medicion implements Comparable<Medicion> Serializable {
    public static Object ordenarDescHumedad;
    int temperatura;
    int humedad;
    int presion;

    public Medicion(int temperatura, int humedad, int presion) {
        this.temperatura = temperatura;
        this.humedad = humedad;
        this.presion = presion;
    }

    public int getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }

    public int getHumedad() {
        return humedad;
    }

    public void setHumedad(int humedad) {
        this.humedad = humedad;
    }

    public int getPresion() {
        return presion;
    }

    public void setPresion(int presion) {
        this.presion = presion;
    }



    @Override
    public String toString() {
        return "Medicion{" +
                "temperatura=" + temperatura +
                ", humedad=" + humedad +
                ", presion=" + presion +
                '}';
    }


    @Override
    public int compareTo(Medicion o) {
        return this.temperatura-o.temperatura;
    }
    public static class ordenarDescHumedad implements  Comparator<Medicion>{
        @Override
        public int compare(Medicion o1, Medicion o2) {
            return o2.humedad- o1.humedad;
        }
    }
}*/
