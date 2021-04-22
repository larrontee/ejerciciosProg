package Entregable1920;

import java.util.Arrays;

public class Pizza {
    private Size tam;
    private Ingrediente[] ingredientes;
    private int longitud;



    public Pizza(Size tam, Ingrediente ingrediente1) {
        this.tam = tam;
        this.ingredientes = new Ingrediente[0];
        this.ingredientes=Arrays.copyOf(ingredientes,ingredientes.length +1);
        ingredientes[ingredientes.length-1]=ingrediente1;
        this.longitud=3;
    }
    public Pizza(Size tam, Ingrediente ingrediente1,Ingrediente ingrediente2 ) {
        this(tam,ingrediente1);
        this.ingredientes=Arrays.copyOf(ingredientes,ingredientes.length +1);
        ingredientes[ingredientes.length-1]=ingrediente2;
    }
    public Pizza(Size tam, Ingrediente ingrediente1,Ingrediente ingrediente2, Ingrediente ingrediente3 ) {
        this(tam,ingrediente1, ingrediente2);
        this.ingredientes=Arrays.copyOf(ingredientes,ingredientes.length +1);
        ingredientes[ingredientes.length-1]=ingrediente3
        ;
    }
    public Pizza(Ingrediente ingrediente1) {
        this(Size.FAMILIAR,ingrediente1);
    }
    public Pizza(Ingrediente ingrediente1, Ingrediente ingrediente2) {
        this(Size.FAMILIAR,ingrediente1, ingrediente2);
    }
    public Pizza(Ingrediente ingrediente1, Ingrediente ingrediente2, Ingrediente ingrediente3) {
        this(Size.FAMILIAR,ingrediente1, ingrediente2, ingrediente3);
    }


    public Size getTam() {
        return tam;
    }

    public void setTam(Size tam) {
        this.tam = tam;
    }

    public Ingrediente[] getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(Ingrediente[] ingredientes) {
        this.ingredientes = ingredientes;
    }


    public boolean anadiringrediente(Ingrediente nuevoingrediente){
        if (longitud<3){
            Arrays.copyOf(ingredientes,ingredientes.length+1);
            ingredientes[ingredientes.length-1]=nuevoingrediente;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Pizza:" + "tam=" + tam +" ingredientes=" + Arrays.toString(ingredientes)  ;
    }
}
