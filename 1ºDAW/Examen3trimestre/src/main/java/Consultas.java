import com.google.gson.Gson;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Spliterator;

public class Consultas {
    public static void main(String[] args) {
        Consultas.MostrarOficinas();
    }
    public static List<Office> MostrarOficinas(){
        Connection con=ConexionBd.getconnection();
        ArrayList<Office> listaOficinas=new ArrayList<>();

        String consulta="SELECT * from offices o ;";
        try {
            PreparedStatement statement= con.prepareStatement(consulta);
            ResultSet rs =statement.executeQuery();
            Gson gson=new Gson();
            while (rs.next()){
                String officeCode = rs.getString("officeCode");
                String city = rs.getString("city");
                String phone = rs.getString("phone");
                String addressLine1 = rs.getString("addressLine1");
                String addressLine2 = rs.getString("addressLine2");
                String state = rs.getString("state");
                String country = rs.getString("country");
                String postalCode = rs.getString("postalCode");
                String territory = rs.getString("territory");

                Office office= new Office(officeCode,city,phone,addressLine1,addressLine2,state,country,postalCode,territory);
              /*String officejs= gson.toJson(office);
                System.out.println(officejs);*/
                listaOficinas.add(office);

                String listaOficinasjs=gson.toJson(listaOficinas);
                System.out.println(listaOficinasjs);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            try {
                con.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        return listaOficinas;
    }
}