
package controlador;
import clases.Ambiente;
import clases.AmbienteDisponible;
import clases.Insumo;
import clases.InsumoPorAgotarse;
import clases.InsumoPorCaducar;
import clases.ServicioEspecifico;
import clases.ServicioSolicitado;
import modelo.Modelo;
import java.sql.Date;
import java.util.List;

public class Controlador {
    
    public List<Insumo> getInsumos(){
        Modelo modelo = new Modelo();
        return modelo.getInsumos();
    }
    
    public boolean AgregarInsumo(Insumo insumo){
        Modelo modelo= new Modelo();
        return modelo.AgregarInsumo(insumo);
    }
    
    public boolean  ReducirStock(String codigoInsumo, double cantidad){
        Modelo modelo= new Modelo();
        return modelo.ReducirStock(codigoInsumo, cantidad);//modelo.Reducirstock(insumo);
    }
    
    public boolean AñadirCantidadInsumo(double cantidad, String codigoInsumo){
        Modelo modelo= new Modelo();
        return modelo.AñadirCantidadInsumo(cantidad, codigoInsumo);
    }
    
    public List<InsumoPorAgotarse> getInsumosPorAgotarse(){
        Modelo modelo = new Modelo();
        return modelo.getInsumosPorAgotarse();
    }
    
    public List<InsumoPorCaducar> getInsumosPorCaducar(){
        Modelo modelo = new Modelo();
        return modelo.getInsumosPorCaducar();
    }
    
    /*
    <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
    <<<<<<<< HECTOR, NO TOQUES EL CÓDIGO QUE ESTÁ ABAJO POR FAVOR >>>>>>>>>>>>>>>>>>>>>>
    <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
    */
    
    public List<AmbienteDisponible> getAmbientesDisponibles(String tipo_ambiente, java.sql.Date fecha){
        Modelo modelo = new Modelo();
        return modelo.getAmbientesDisponibles(tipo_ambiente, fecha);
    }
    
    public List<String> getTiposAmbiente(){
        Modelo modelo = new Modelo();
        return modelo.getTiposAmbiente();
    }
    public List<ServicioSolicitado> getServiciosPorTipo(String tipo_servicio){
        Modelo modelo = new Modelo();
        return modelo.getServiciosPorTipo(tipo_servicio);
    }
    
    //Metodo para obtener los servicios especificos que brinda la empresa
    public List<ServicioEspecifico> getServicios(){
        Modelo modelo = new Modelo();
        return modelo.getServicios();
    }
    
    /*
    <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
    <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<METODOS GENERALES>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
    <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
    */
    
    public boolean validarCredenciales(String user_name, String password){
        Modelo modelo = new Modelo();
        return modelo.validarCredenciales(user_name, password);
    }
}
