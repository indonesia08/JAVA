
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
//@author yusufhome
public class test_koneksi {
    
    public static void main(String[] args) throws SQLException {
        Connection con = new db_config().getConnection();
        Statement stmt = con.createStatement();
    }
}
