/*
package Examen_estacion_meteorologica;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EstacionMetereologica {
    List<Medicion> mediciones;
    Coordenada coordenada;


    public EstacionMetereologica(String nombrefichero, Coordenada coordenada) {
        this.mediciones =new ArrayList<>();
        this.coordenada = coordenada;
        try {
            ObjectInputStream leerfichero=new ObjectInputStream(new FileInputStream(nombrefichero));
            do {
                Medicion medicion1;
                medicion1=(Medicion)( leerfichero.readObject());
                addMedicion(medicion1);
            }while (true);
        }   catch (IOException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    private void addMedicion(Medicion medicion1) {
        mediciones.add(medicion1);
    }
    private void ordenaTempreaturasAsc(){
        Collections.sort(mediciones);
    }
    private void ordenaHumedadesDes(){
        mediciones.sort(new Medicion.ordenarDescHumedad());
    }
    private Medicion presionMax(Medicion medicion){
        Medicion max=mediciones.get(0);
        for (int i = 1; i < mediciones.size(); i++) {
            if (max.presion<mediciones.get(i).presion){
                max=mediciones.get(i);
            }
        }
        return max;
    }

    private boolean buscarMedicion (Medicion medicion){
        return mediciones.contains(medicion);
    }

    private void guardarFichero(String fichero){
        try {
            ObjectOutputStream escribir=new ObjectOutputStream(new FileOutputStream(fichero));
            do {

            }while (false);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



}
*/
