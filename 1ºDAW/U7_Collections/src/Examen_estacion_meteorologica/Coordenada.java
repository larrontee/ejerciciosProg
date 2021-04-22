package Examen_estacion_meteorologica;

import java.io.Serializable;

public class Coordenada implements Serializable {
    int latitud;
    int longitud;

    public Coordenada(int latitud, int longitud) {
        this.latitud = latitud;
        this.longitud = longitud;
    }

    public int getLatitud() {
        return latitud;
    }

    public void setLatitud(int latitud) {
        this.latitud = latitud;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    @Override
    public String toString() {
        return "Coordenadas{" +
                "latitud=" + latitud +
                ", longitud=" + longitud +
                '}';
    }
}
