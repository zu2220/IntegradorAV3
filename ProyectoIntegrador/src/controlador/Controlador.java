
package controlador;
import clases.Ambiente;
import clases.Insumo;
import clases.ServicioSolicitado;
import modelo.Modelo;
import java.util.Date;
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
    
    /*
    <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
    <<<<<<<< HECTOR, NO TOQUES EL CÓDIGO QUE ESTÁ ABAJO POR FAVOR >>>>>>>>>>>>>>>>>>>>>>
    <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
    */
    
    public List<Ambiente> getAmbientes(String tipo_ambiente){
        Modelo modelo = new Modelo();
        return modelo.getAmbientes(tipo_ambiente);
    }
    
    public List<ServicioSolicitado> getServiciosPorTipo(String tipo_servicio){
        Modelo modelo = new Modelo();
        return modelo.getServiciosPorTipo(tipo_servicio);
    }
}
