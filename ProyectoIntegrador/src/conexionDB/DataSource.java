
package conexionDB;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import java.sql.Connection;
import java.sql.SQLException;


public class DataSource {
    private static Connection conn;
    
    public static Connection DataSource(){
        SQLServerDataSource ds = new SQLServerDataSource();
        
        try{
            ds.setServerName("HECTORLAP");
            ds.setDatabaseName("InventarioZariSpa");
            
           //ds.setPortNumber(1433);
            ds.setUser("sa");
            ds.setPassword("hector123");
            ds.setEncrypt(false);            
            conn = ds.getConnection();
        }
        
        catch(SQLException ex){
            ex.printStackTrace();
        }        
        return conn;   
        
        
    }

    
}
