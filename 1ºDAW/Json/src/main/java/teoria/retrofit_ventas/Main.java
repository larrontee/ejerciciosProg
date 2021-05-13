package teoria.retrofit_ventas;

import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.Retrofit.Builder;
import retrofit2.converter.gson.GsonConverterFactory;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

public class Main {



    public static void main(String[] args) {

        Retrofit retrofit = new Retrofit.Builder().
                baseUrl("https://my-json-server.typicode.com/pekechis/").
                addConverterFactory(GsonConverterFactory.create())
                .build();

        CentralDeVentas service = retrofit.create(CentralDeVentas.class);

        Venta venta = null;
        final Integer ventaId =2;

        System.out.println("Obtenemos el listado completo de ventas");
        try {
            Response<List<Venta>> response = service.listVentas().execute();

            if (response.isSuccessful()) {
                List<Venta> ventas = response.body();
                System.out.println(ventas);
            } else {
                System.out.println("Petición no válida: "+response.message());
            }
        } catch (IOException e) {
            System.out.println("Error en la petición: "+e.getMessage());
        }

        //Obtenemos una venta concreta identificada por ID
        System.out.println("Obtenemos una venta concreta identcada por ID: "+ventaId);
        try {
            Response<Venta> response = service.getVentaId(ventaId).execute();

            if (response.isSuccessful()) {
                venta = response.body();
                System.out.println(venta);
            } else {
                System.out.println("Petición no válida: "+response.message());
            }
        } catch (IOException e) {
            System.out.println("Error en la petición: "+e.getMessage());
        }


        System.out.println("Obtenemos el listado de detalles de una venta concreta identificada por ID: "+ventaId);
        try {
            Response<List<DetalleVenta>> response = service.listVentaIdDetalles(ventaId).execute();

            if (response.isSuccessful()) {
                List<DetalleVenta> detalle_venta = response.body();
                System.out.println(detalle_venta);
                if (venta!=null) {
                    ArrayList<DetalleVenta> lista = new ArrayList<>(detalle_venta);
                    venta.setDetalle(lista);
                }
            } else {
                System.out.println("Petición no válida: "+response.message());
            }
        } catch (IOException e) {
            System.out.println("Error en la petición: "+e.getMessage());
        }

        System.out.println();
        System.out.println("Imprimimos el objeto venta");
        System.out.println(venta);


    }


}
