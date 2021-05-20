package Recuperacion2T;

import Examen_estacion_meteorologica.Coordenada;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
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
    public void EscribirPedidosOnline(){
        try {
            ObjectOutputStream escribir=new ObjectOutputStream(new FileOutputStream("online.dat"));
            Collection<PedidoOnline> pedidos=listaPedidosOnline.values();
            Iterator<PedidoOnline> it= pedidos.iterator();
            while(it.hasNext()){
                escribir.writeObject((PedidoOnline)it.next());
            }
            escribir.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void mostrarPedidosOrdenados(){

    }

    public void vendidoProducto(int codigop){
        ArrayList<PedidoOnline> pedidoOnlineArrayList = new ArrayList<>(listaPedidosOnline.values());
        Iterator<PedidoOnline> it = pedidoOnlineArrayList.iterator();
        while (it.hasNext()){
            System.out.println("hola");
        }

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
