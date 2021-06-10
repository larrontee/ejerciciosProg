import com.google.gson.Gson;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Transacciones {
    public static void main(String[] args) {
        Transacciones.insertarCliente();
    }

    public static int insertarCliente() {
        Connection con = ConexionBd.getconnection();
        int nfilasInsertadas=0;
        try {
            con.setAutoCommit(false);
            String consulta = "INSERT into customers values (?,?,?,?,?,?,?,?,?,?,?,?,?);";
            PreparedStatement statement = con.prepareStatement(consulta);

            statement.setInt(1,600);
            statement.setString(2,"larra");
            statement.setString(3,"Bondur");
            statement.setString(4,"Loui");
            statement.setString(5,"123456789");
            statement.setString(6,"calle");
            statement.setString(7,"barrio");
            statement.setString(8,"Lyon");
            statement.setString(9,"Soltero");
            statement.setString(10,"69004");
            statement.setString(11,"France");
            statement.setInt(12,1337);
            statement.setDouble(13,138500.00);
            String cadena = statement.toString();
            statement.executeUpdate();
            nfilasInsertadas++;

            String consulta2 = "INSERT into payments values (?,?,?,?);";
            PreparedStatement statement2 = con.prepareStatement(consulta2);

            statement2.setInt(1,600);
            statement2.setString(2, "123");
            statement2.setString(3, "2000-02-01");
            statement2.setDouble(4, 120.35);
            statement2.executeUpdate();
            nfilasInsertadas++;

            statement2.setInt(1,600);
            statement2.setString(2, "150");
            statement2.setString(3, "2020-05-05");
            statement2.setDouble(4, 200.35);
            statement2.executeUpdate();
            nfilasInsertadas++;
            con.commit();



        } catch (SQLException throwables) {
            throwables.printStackTrace();

        }finally {
            try {
                con.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        return nfilasInsertadas;
    }
}