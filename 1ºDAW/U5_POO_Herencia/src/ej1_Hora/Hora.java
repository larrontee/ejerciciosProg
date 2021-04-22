package ej1_Hora;

public class Hora {
    public static void main(String[] args) {
        Hora h=new Hora(0,8);

        System.out.println(h);
    }
    protected Integer hora, minuto;

    public Hora(Integer hora, Integer minuto) {

        if ((hora>23 || hora<0) && (minuto>59 || minuto<0) ){
            this.hora =0;
            this.minuto = 0;
        } else if (hora>23 || hora<0){
            this.hora =0;
            this.minuto = minuto;

        } else if (( minuto>59 || minuto<0))  {
            this.hora = hora;
            this.minuto = 0;
        } else{
            this.hora = hora;
            this.minuto = minuto;
        }
    }


    public Integer getHora() {
        return hora;
    }

    public void setHora(Integer hora) {
        if (hora>=0 && hora<24) {
            this.hora = hora;
        }
    }

    public Integer getMinuto() {
        return minuto;
    }

    public void setMinuto(Integer minuto) {
        if (minuto>=0 && minuto<60){
            this.minuto = minuto;
        }
    }

    @Override
    public String toString() {
        if ((hora>=0 && hora<=9)  && (minuto>=0 && minuto<=9)){
            return "Hora: "+ 0+ hora+":"+0+minuto;
        }   else if ((hora>=0 && hora<=23) && (minuto>=0 && minuto<=9)) {
            return "Hora: " + hora + ":" + 0 + minuto;
        }else if ((hora>=0 && hora<=9) && (minuto>=0 && minuto<=59)) {
            return "Hora: " +0+ hora + ":" +minuto;
        }else {
            return "Hora: " + hora + ":"  + minuto;
        }
    }

    public void inc(){
        minuto++;
        if (minuto>59){
            minuto=0;
            hora++;
            if (hora>23){
                hora=0;
            }
        }
    }
}