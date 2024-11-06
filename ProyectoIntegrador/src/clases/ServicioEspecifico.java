
package clases;

import clases.ServicioSolicitado;


public class ServicioEspecifico{
    private String Nombre;
    private String tipoServicio;
    private Double precio;
    private InsumoRequerido[] insumoRequerido;
    
    
    public ServicioEspecifico(){
    
    }

    public ServicioEspecifico(String Nombre, String tipoServicio, Double precio, InsumoRequerido[] insumoRequerido) {
        this.Nombre = Nombre;
        this.tipoServicio = tipoServicio;
        this.precio = precio;
        this.insumoRequerido = insumoRequerido;
       
    }


    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getTipoServicio() {
        return tipoServicio;
    }

    public void setTipoServicio(String tipoServicio) {
        this.tipoServicio = tipoServicio;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public InsumoRequerido[] getInsumoRequerido() {
        return insumoRequerido;
    }

    public void setInsumoRequerido(InsumoRequerido[] insumoRequerido) {
        this.insumoRequerido = insumoRequerido;
    }

   
    
}


