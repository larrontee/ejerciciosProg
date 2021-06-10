import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
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
        Connection con = ConexionBd.getconnection();
        String consulta="select * from offices";
        List<Office> listaoficinas=new ArrayList<>();
        Gson gson = new Gson();
        try {
            PreparedStatement statement = con.prepareStatement(consulta);
            ResultSet rs = statement.executeQuery();
            while(rs.next()){
                String column1 =rs.getString(1);
                String column2 =rs.getString(2);
                String column3 =rs.getString(3);
                String column4 =rs.getString(4);
                String column5 =rs.getString(5);
                String column6 =rs.getString(6);
                String column7 =rs.getString(7);
                String column8 =rs.getString(8);
                String column9 =rs.getString(9);

                Office office = new Office(column1,column2,column3,column4,column5,column6,column7,column8,column9);
                listaoficinas.add(office);
            }
            String listado = gson.toJson(listaoficinas);
            System.out.println(listado);
            Type listType = new TypeToken<ArrayList<Office>>() {}.getType();
            listaoficinas=gson.fromJson(listado,listType);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            try {
                con.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        return listaoficinas;
    }
}