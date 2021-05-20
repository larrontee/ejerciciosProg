package Recuperacion2T;

import java.util.Set;

public class PedidoEnTienda extends Pedido {
    String direccionTienda;

    public PedidoEnTienda(int idPedido, String fechaEnvio, String fechaEntrega, String direccionTienda) {
        super(idPedido, fechaEnvio, fechaEntrega);
        this.direccionTienda = direccionTienda;
    }

    public String getDireccionTienda() {
        return direccionTienda;
    }

    public void setDireccionTienda(String direccionTienda) {
        this.direccionTienda = direccionTienda;
    }

    @Override
    public String toString() {
        return "PedidosEnTienda{" +
                "idPedido=" + idPedido +
                ", listaProductos=" + listaProductos +
                ", fechaEnvio='" + fechaEnvio + '\'' +
                ", fechaEntrega='" + fechaEntrega + '\'' +
                ", direccionTienda='" + direccionTienda + '\'' +
                '}';
    }
}