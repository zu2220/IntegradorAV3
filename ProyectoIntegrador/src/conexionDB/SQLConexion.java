package conexionDB;
import java.sql.*;
public class SQLConexion
 { 
public static Connection getConexion(){ 
Connection con = null;
 try { Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver"); 
String url ="jdbc:sqlserver://localhost;database=InventarioZariSPA"; 
String usr = "sa"; 
String psw = "hector123"; 
con = DriverManager.getConnection(url,usr,psw); } 
catch (ClassNotFoundException ex) { System.out.println("No hay Driver!!"); } 
catch (SQLException ex) 
{ System.out.println("Error con la BD"); }
 return con; }
 } 