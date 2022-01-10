
/**
 *
 * @author Kreesan
 */

import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Connection_To_Db 
{
    private static String servername="localhost";
    private static String dbname="dbkkmnd";
    private static String username="root";
    private static Integer portnumber=3306;
    private static String password="";
    
    public static Connection getConnectionToDb()
    {
        Connection con = null;
        MysqlDataSource datasource = new MysqlDataSource();
        
        datasource.setServerName(servername);
        datasource.setUser(username);
        datasource.setDatabaseName(dbname);
        datasource.setPortNumber(portnumber);
        datasource.setPassword(password);
        
        try {
            con=datasource.getConnection();
        } catch (SQLException ex) {
            Logger.getLogger(Connection_To_Db.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        return con;
        
    }
}
