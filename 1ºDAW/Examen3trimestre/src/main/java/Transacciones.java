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
            Customer customer= new Customer(
                    123456789,
                    "Pedro",
                    "Bondur",
                    "Loui",
                    "123456789",
                    "calle",
                    "barrio",
                    "Lyon",
                    "soltero",
                    "69004",
                    "France",
                    1337,
                    138500.00);

            statement.setInt(1,customer.customerNumber);
            statement.setString(2,customer.customerName);
            statement.setString(3,customer.contactLastName);
            statement.setString(4,customer.contactFirstName);
            statement.setString(5,customer.phone);
            statement.setString(6,customer.addressLine1);
            statement.setString(7,customer.addressLine2);
            statement.setString(8,customer.city);
            statement.setString(9,customer.state);
            statement.setString(10,customer.postalCode);
            statement.setString(11,customer.country);
            statement.setInt(12,customer.salesRepEmployeeNumber);
            statement.setDouble(13,customer.creditLimit);
            statement.executeUpdate();
            nfilasInsertadas++;

            String consulta2 = "INSERT into payments values (?,?,?,?);";
            PreparedStatement statement2 = con.prepareStatement(consulta2);
            ResultSet rs2 = statement.executeQuery();
            Payments p1 = new Payments(123456789,"123","2000-02-01",120.35);
            Payments p2 = new Payments(123456789,"150","2020-05-05",200.35);

            statement2.setInt(1,1234);
            statement2.setString(2, "123");
            statement2.setString(3, "2000-02-01");
            statement2.setDouble(4, 120.35);
            statement2.executeUpdate();
            nfilasInsertadas++;

            statement2.setInt(1,1234);
            statement2.setString(2, "150");
            statement2.setString(3, "2020-05-05");
            statement2.setDouble(4, 200.35);
            statement2.executeUpdate();
            nfilasInsertadas++;
            con.commit();
            con.rollback();



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