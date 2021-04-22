/*
Inicialmente reservar espacio para 5 pedidos, aunque si vamos a abrir una Pizzería con más capacidad podremos darle una
capacidad inicial distinta. En caso de sobrepasar esa capacidad iremos añadiendo más espacio para guardarlos si es necesario.
Podremos añadir pedidos.
Podré mostrar todos los pedidos realizados a la pizzería.
Podré mostrar la cantidad de pedidos que se han realizado.
*/



package Entregable1920;

import java.util.Arrays;

public class Pedido {
    private Pizza[] pedidos;
    private int longini;

    public Pedido() {
        this.longini=5;
        this.pedidos = new Pizza[0];
    }

    public void anadirpedido(Pizza pedido){
        if (pedidos.length<longini) {
            pedidos=Arrays.copyOf(pedidos, pedidos.length + 1);
            pedidos[pedidos.length - 1] = pedido;
        } else{
            longini+=5;
            anadirpedido(pedido);
        }
    }

    @Override
    public String toString() {
        return "pedidos=" + Arrays.toString(pedidos) +
                ", cantidad=" + pedidos.length;
    }
}
