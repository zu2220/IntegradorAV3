
package clases;

import java.util.ArrayList;

public class PaqueteServicio {
    private String codigoPaquete;
    private Cliente cliente;       
    private ArrayList<ServicioSolicitado> servicios;
    private boolean estado;
    
    public PaqueteServicio(){
    
    }

    public PaqueteServicio(String codigoPaquete, Cliente cliente, ArrayList<ServicioSolicitado> servicios, boolean estado) {
        this.codigoPaquete = codigoPaquete;
        this.cliente = cliente;
        this.servicios = servicios;
        this.estado = estado;
    }

    public String getCodigoPaquete() {
        return codigoPaquete;
    }

    public void setCodigoPaquete(String codigoPaquete) {
        this.codigoPaquete = codigoPaquete;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ArrayList<ServicioSolicitado> getServicios() {
        return servicios;
    }

    public void setServicios(ArrayList<ServicioSolicitado> servicios) {
        this.servicios = servicios;
    }

    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
}
    

