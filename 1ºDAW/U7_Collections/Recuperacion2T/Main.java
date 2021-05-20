package Recuperacion2T;

public class Main {
    public static void main(String[] args) {
        Producto p1=new Producto("leche",1,2.2,1);
        Producto p5=new Producto("leche",1,2.2,1);
        Producto p2=new Producto("pera",1,10,2);
        Producto p3=new Producto("pan",3,1,3);
        Producto p4=new Producto("vino",1,2,4);
        PedidoEnTienda pedidoEnTienda=new PedidoEnTienda(1,"12-15-2020","ayer","calle");

        pedidoEnTienda.addProducto(p1);
        System.out.println(pedidoEnTienda);
        pedidoEnTienda.addProducto(p2);
        pedidoEnTienda.addProducto(p3);
        pedidoEnTienda.addProducto(p4);
        pedidoEnTienda.addProducto(p5);
        System.out.println(pedidoEnTienda);


        pedidoEnTienda.borrarProducto(p2);
        System.out.println(pedidoEnTienda);

        pedidoEnTienda.cantidadPedidos();
        pedidoEnTienda.precioTotal(pedidoEnTienda);

        PedidoOnline p=new PedidoOnline(1,"ayer","hoy","2",Pago.PAYPAL);



    }
}
