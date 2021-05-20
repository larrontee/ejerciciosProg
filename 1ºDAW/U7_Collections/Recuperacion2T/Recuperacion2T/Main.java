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
        System.out.println(pedidoEnTienda.precioTotal());

        PedidoOnline po1=new PedidoOnline(1,"ayer","hoy","2",Pago.PAYPAL);
        po1.addProducto(p1);
        po1.addProducto(p2);
        po1.addProducto(p3);
        po1.addProducto(p5);

        PedidoOnline po2=new PedidoOnline(2,"ayer","hoy","2",Pago.PAYPAL);
        po2.addProducto(p1);
        po2.addProducto(p2);
        po2.addProducto(p5);
        po2.addProducto(p5);
        po2.addProducto(p1);
        po2.addProducto(p2);
        po2.addProducto(p5);
        po2.addProducto(p5);


        EmpresaOnline empresaOnline=new EmpresaOnline("amason");


        empresaOnline.listaPedidosOnline.put(po1.getIdPedido(),po1);
        empresaOnline.listaPedidosOnline.put(po2.getIdPedido(),po2);

        /*empresaOnline.cagarPedidoOnline();
        empresaOnline.escribirPedidosOnline();*/

        empresaOnline.mostrarPedidosOrdenados();
        System.out.println(empresaOnline.vendidoProducto(222));
    }
}
