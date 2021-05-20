package Recuperacion2T;

import java.io.*;
import java.util.*;

public class EmpresaOnline {
    public static void main(String[] args) {
        EmpresaOnline empresaOnline=new EmpresaOnline("qwe");
    }
    Map<Integer,PedidoOnline> listaPedidosOnline;
    String nombreEmpresa;

    public EmpresaOnline(String nombreEmpresa) {
        this.listaPedidosOnline = new HashMap<>();
        this.nombreEmpresa = nombreEmpresa;
    }
    public void escribirPedidosOnline(){
        try {
            ObjectOutputStream escribir=new ObjectOutputStream(new FileOutputStream("online.dat"));
            Collection<PedidoOnline> pedidos=listaPedidosOnline.values();
            for (PedidoOnline po : pedidos) {
                escribir.writeObject(po);
            }
            escribir.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void cagarPedidoOnline(){
        try {
            ObjectInputStream reader =new ObjectInputStream(new FileInputStream("online.dat"));
            while (true){
                PedidoOnline po =(PedidoOnline)reader.readObject();
                listaPedidosOnline.put(po.getIdPedido(),po);
            }
        } catch (Exception e) {
            //e.printStackTrace();
        }
    }

    public void mostrarPedidosOrdenados(){
        Collection<PedidoOnline>pedidos=listaPedidosOnline.values();
        ArrayList<PedidoOnline> list=new ArrayList<>(pedidos);
        Collections.sort(list);
        System.out.println(list);
    }

    public boolean vendidoProducto(int codigop){
        boolean vendido=false;
        Collection<PedidoOnline> pedidos=listaPedidosOnline.values();
        Iterator<PedidoOnline> it= pedidos.iterator();
        while (it.hasNext()){
            PedidoOnline aux=(PedidoOnline)it.next();
            for (Producto p:aux.listaProductos) {
                if (p.getIdProducto()==codigop){
                    return true;
                }
            }

        }
        return false;
    }


        public Map<Integer, PedidoOnline> getListaPedidosOnline() {
        return listaPedidosOnline;
    }

    public void setListaPedidosOnline(Map<Integer, PedidoOnline> listaPedidosOnline) {
        this.listaPedidosOnline = listaPedidosOnline;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }
}
