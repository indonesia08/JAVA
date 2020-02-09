import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
//@author yusufhome
public class insert_data {
    
    public static void main(String[] args) throws SQLException {
        Connection con  = new db_config().getConnection();
        Statement stmt  = con.createStatement();
        String sql      = "INSERT INTO `test`.`contact` (`name`, `address`, `city`, telp, `gender`) VALUES ('Ahmad', 'Senayan', 'Jakarta', '+62xxx', 'men');";
        stmt.executeUpdate(sql);
    }
}
