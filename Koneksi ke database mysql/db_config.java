
import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;
//@author yusufhome
public class db_config {
    private static Connection connection;

    public static Connection getConnection(){
        //pengecekan koneksi database
        if (connection==null){
            try{
               
                String host     = "localhost";
                String username = "root";
                String password = "";
                String db_name  = "";
                String port     = "3306";
                
                String url = "jdbc:mysql://"+host+":"+port+"/"+db_name;
                
                MysqlDataSource source = new MysqlDataSource();
                source.setUser(username);
                source.setPassword(password);
                source.setURL(url);
                connection = source.getConnection();
                System.out.println("sukses menyambung ke database");
            } catch (SQLException ex){
                System.out.println("tidak dapat menyambung ke database");
            }
        }
        return connection;
    }
}
