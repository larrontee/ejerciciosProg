package Recuperacion2T;

public interface Log {
   default void printLog(PedidoOnline p){
       System.out.println("Fecha de envio: "+p.getFechaEntrega());
       System.out.println("Fecha de entrega: "+p.getFechaEntrega());
   }
}
