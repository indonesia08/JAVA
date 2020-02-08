import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
//@author yusufhome
public class tampil_data {
    
    public static void main(String[] args) throws SQLException {
        Connection con = new db_config().getConnection();
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("select * from mysql.user;");
        while (rs.next()){
            System.out.println("Daftar user di tabel mysql : Host ="+rs.getString("Host")+", User ="+rs.getString("User"));
        }
    }
}
