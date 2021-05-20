package Recuperacion2T;

import java.util.Set;

public class PedidoOnline extends Pedido implements Login {
    String ipNav;
    Pago metodoPago;

    public PedidoOnline(int idPedido, String fechaEnvio, String fechaEntrega, String ipNav, Pago metodoPago) {
        super(idPedido, fechaEnvio, fechaEntrega);
        this.ipNav = ipNav;
        this.metodoPago = metodoPago;
    }

    public String getIpNav() {
        return ipNav;
    }

    public void setIpNav(String ipNav) {
        this.ipNav = ipNav;
    }

    public Pago getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(Pago metodoPago) {
        this.metodoPago = metodoPago;
    }

    @Override
    public String toString() {
        return "PedidoOnline{" +
                "idPedido=" + idPedido +
                ", listaProductos=" + listaProductos +
                ", fechaEnvio='" + fechaEnvio + '\'' +
                ", fechaEntrega='" + fechaEntrega + '\'' +
                ", ipNav='" + ipNav + '\'' +
                ", metodoPago=" + metodoPago +
                '}';
    }



}
