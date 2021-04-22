package Entregable1920;

public class Main {

    public static void main(String[] args) {
        Ingrediente i1=new Ingrediente("jamon",10000);
        Pizza p1= new Pizza(i1);
        Pedido pedido1=new Pedido();
        pedido1.anadirpedido(p1);
        System.out.println(pedido1);
    }

}
