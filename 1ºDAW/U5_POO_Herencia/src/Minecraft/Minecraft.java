package Minecraft;

import java.util.Arrays;

public class Minecraft {
    int cantidad_max;
    Materiales[] materiales;

    public Minecraft() {

        this.cantidad_max = 10;
        this.materiales = new Materiales[0];
    }

    public Materiales[] getMateriales() {
        return materiales;
    }

    public void setMateriales(Materiales[] materiales) {
        this.materiales = materiales;
    }

    public int getCantidad_max() {
        return cantidad_max;
    }

    public void setCantidad_max(int cantidad_max) {
        this.cantidad_max = cantidad_max;
    }

    public boolean anadirmaterialboolean(Materiales material){
        if (materiales.length<cantidad_max) {
            materiales = Arrays.copyOf(materiales, materiales.length + 1);
            materiales[materiales.length - 1] = material;
            return true;
        }
        return false;
    }

    public void anadirmaterial(Materiales material){
        if (materiales.length<cantidad_max) {
            materiales = Arrays.copyOf(materiales, materiales.length + 1);
            materiales[materiales.length - 1] = material;
        }
    }
    public void borrarMaterialSinMasa(){
        Materiales[] materiales1=new Materiales[0];

        for (int i = 0; i < materiales.length; i++) {
            if (materiales[i].masa>0){
                materiales1=Arrays.copyOf(materiales1,materiales1.length+1);
                materiales1[i]=materiales[i];
            }
        }
        materiales=materiales1;
    }

    public void mostrarEstado(){
        System.out.println(Arrays.toString(materiales));
    }


    public void ultimoMaterialQueQueda(){
        if (materiales.length>=1){
            System.out.println(Arrays.toString(materiales));
        }
    }





}





