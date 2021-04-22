package ej1_Hora;

import java.util.Locale;

public class Hora12 extends Hora {
    public static void main(String[] args) {
        Hora12 relojmanual=new Hora12(24,59,"pm");
        System.out.println(relojmanual);
    }
    String partedia;


    public Hora12(Integer hora, Integer minuto,String partedia) {
        super(hora, minuto);
        setHora(hora);
        this.partedia=partedia;
        
    }


    public String getPartedia() {
        return partedia;
    }

    public void setPartedia(String partedia) {
        this.partedia = partedia;
    }


    @Override
    public void setHora(Integer hora) {
        if (hora>=0 && hora<13) {
            this.hora = hora;
        }else if(hora>12 && hora<=24){
            this.hora = hora-12;
        }
    }




    @Override
    public String toString() {
        return super.toString()+partedia.toUpperCase();
    }
}