package Recuperacion2T;

import java.util.*;

public abstract class Pedido {
    int idPedido;
    Set<Producto> listaProductos;
    String fechaEnvio;
    String fechaEntrega;
    public static int contadorPedidos=0;
    public Pedido(int idPedido, String fechaEnvio, String fechaEntrega) {
        this.idPedido = idPedido;
        this.listaProductos = new LinkedHashSet<>();
        this.fechaEnvio = fechaEnvio;
        this.fechaEntrega = fechaEntrega;
        contadorPedidos++;
    }


    public void addProducto(Producto p){
        if (!listaProductos.contains(p)){
            listaProductos.add(p);
        } else{
            Iterator<Producto> it=listaProductos.iterator();
            while (it.hasNext()){
                Producto aux= (Producto) it.next();
                if (aux.equals(p)){
                    aux.setCantidad(aux.getCantidad()+p.getCantidad());
                }
            }
        }
    }

    public void borrarProducto(Producto p){
        if (listaProductos.contains(p)){
            listaProductos.remove(p);
        } else{
            System.out.println("No tienes ese producto en el pedido.");
        }
    }

    public void cantidadPedidos(){
        System.out.println("se ha hecho "+contadorPedidos+" pedido");
    }

    public void precioTotal(Pedido p){
        Iterator<Producto> it= listaProductos.iterator();
        double total=0.0;
        while (it.hasNext()){
            Producto aux=(Producto) it.next();
            total+=(aux.getPrecio()*aux.getCantidad());
        }

        System.out.println(total + "€");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pedido pedido = (Pedido) o;
        return idPedido == pedido.idPedido;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idPedido);
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }


    public String getFechaEnvio() {
        return fechaEnvio;
    }

    public void setFechaEnvio(String fechaEnvio) {
        this.fechaEnvio = fechaEnvio;
    }

    public String getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(String fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }
}
