import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBd {
    static Connection con=null;


    public static Connection getconnection(){
        if (con==null) {
            try {
                con = DriverManager.getConnection("jdbc:mariadb://localhost:3336/classicmodels?user=root&password=root"
                        + "&useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC");
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        return con;
    }

    public static void close(){
        if (con!=null){
            try {
                con.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }

}
