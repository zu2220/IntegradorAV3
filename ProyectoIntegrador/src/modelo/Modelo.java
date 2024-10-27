
package modelo;

import clases.Ambiente;
import clases.Insumo;
import clases.ServicioSolicitado;
import static conexionDB.DataSource.DataSource;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;



public class Modelo {
    public boolean AgregarInsumo(Insumo insumo){
     boolean flag= false ; 
     try{
      String Query= " INSERT INTO INVENTARIO values(?, ?, ?, ?, ?, ?)";
            PreparedStatement  stmt = DataSource().prepareStatement(Query);
            
            stmt.setString(1,insumo.getCodigo());
            stmt.setString(2, insumo.getNombre());
            stmt.setDouble(3, insumo.getCantidad());
            stmt.setString(4, insumo.getCategoria());
            stmt.setString(5, insumo.getFechavencimiento());
            stmt.setDouble(6, insumo.getPrecio());
            
            
            flag = stmt.execute();
      
      
      
     }  catch (SQLException ex) { 
           System.out.println(ex.getMessage());
 
        } 
        return flag;
       
        
        
 
    
   
    
    }
    
    
    
    
    /*
    <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
    <<<<<<<< HECTOR, NO TOQUES EL CÓDIGO QUE ESTÁ ABAJO POR FAVOR >>>>>>>>>>>>>>>>>>>>>>
    <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
    */
    
    public List<Ambiente> getAmbientes(String tipo_ambiente){
        List<Ambiente> ambientes = new ArrayList<>();
        
        try{
            String query = "select* from Ambientes ";
                   query+= "where tipo_ambiente='?'";
            PreparedStatement pstmt = DataSource().prepareStatement(query);
            
            pstmt.setString(1, tipo_ambiente);
            ResultSet rs = pstmt.executeQuery();
            
            //Recuperación de ambientes
            while(rs.next()){
                Ambiente ambiente = new Ambiente();
                ambiente.setNombreAmbiente(rs.getString(1));
                ambiente.setTipodeAmbiente(rs.getString(2));
                
                ambientes.add(ambiente);
            }
        }catch(Exception ex){System.out.println(ex);}
        return ambientes;
    }
    
    public List<ServicioSolicitado> getServiciosPorTipo(String tipo_servicio){
        List<ServicioSolicitado> servicios = new ArrayList<>();
        
        try{
            String query = "select* ServiciosSolicitados where tipo_servicio =?";
            PreparedStatement pstmt = DataSource().prepareStatement(query);
            pstmt.setString(1, tipo_servicio);
            ResultSet rs = pstmt.executeQuery();
            
            //capturamos servicios con tipo_servicio igual al parametro del método
            while(rs.next()){
                ServicioSolicitado servicio = new ServicioSolicitado();
                servicio.setCodigoServicio(rs.getString(1));
                //servicio
            }
            
        }catch(Exception ex){System.out.println(ex);}
        return servicios;
    }
}
