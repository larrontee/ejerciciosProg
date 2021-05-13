package teoria;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        //Creamos el objeto venta que vamos a transformar en un cadena en formato JSON.
        Calendar calendario = Calendar.getInstance();
        Date fecha = new Date(calendario.getTimeInMillis());

        Venta venta = new Venta(fecha,"Juanito");

        //Creamos el objeto Gson que se encargará de las conversiones
        Gson gson = new Gson();

        //Convertimos un objeto sencillo a Json.
        System.out.println(gson.toJson(venta));

        //Creamos los modelos de datos con los objetos. Es decir, creamos los detalles
        DetalleVenta detalle1 = new DetalleVenta("Silicona Térmica",56.0,7.0,8);
        DetalleVenta detalle2 = new DetalleVenta("Radiador",90.0,45.0,2);
        DetalleVenta detalle3 = new DetalleVenta("GTX 2080 Ti",3500.0,700.0,5);

        //Creamos la lista de detalles para incluirla posteriormente en una Venta.
        ArrayList<DetalleVenta> detalles = new ArrayList<>();
        detalles.add(detalle1);
        detalles.add(detalle2);
        detalles.add(detalle3);

        venta.setDetalle(detalles);

        //Convertimos un objeto compuesto con ArrayList a Json.
        System.out.println(gson.toJson(venta));
        String json_completo = gson.toJson(venta);

        Venta nueva_venta = gson.fromJson(json_completo,Venta.class);
        System.out.println(nueva_venta);

        String json_array = gson.toJson(detalles);

        Type listType = new TypeToken<ArrayList<DetalleVenta>>() {}.getType();

        ArrayList<DetalleVenta> array_de_json = gson.fromJson(json_array,listType);
        System.out.println(array_de_json);

    }
}
