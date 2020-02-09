import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
//@author yusufhome
public class membuat_tabel {
    
    public static void main(String[] args) throws SQLException {
        Connection con   = new db_config().getConnection();
        Statement stmt  = con.createStatement();
        String sql      = "CREATE TABLE IF NOT EXISTS `test`.`contact` (\n" +
"  `id` INT(11) NOT NULL AUTO_INCREMENT,\n" +
"  `name` VARCHAR(50) DEFAULT '',\n" +
"  `address` VARCHAR(100) DEFAULT '',\n" +
"  `city` VARCHAR(100) DEFAULT '',\n" +
"  `telp` VARCHAR(20) DEFAULT '',\n" +
"  `gender` ENUM('men','women') DEFAULT 'men',\n" +
"  PRIMARY KEY (`id`)\n" +
") ENGINE=INNODB DEFAULT CHARSET=latin1;";
        stmt.executeUpdate(sql);
    }
}
