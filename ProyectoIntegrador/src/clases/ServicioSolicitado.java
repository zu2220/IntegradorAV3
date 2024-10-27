
package clases;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ServicioSolicitado extends ServicioEspecifico{
    private Date fechaServicio;
    private String horaInicio;
    private String horaTermino;
    private String estado;
    private String CodigoServicio;
    private PaqueteServicio paquete;
    private Terapeuta terapeuta;
    private Ambiente ambiente;
    private Cliente cliente;
    
    public ServicioSolicitado() {
    }

    public ServicioSolicitado(String tipoServicio, Date fechaServicio, String horaInicio, String horaTermino, String estado,PaqueteServicio paquete, double Precio, Terapeuta terapeuta, Ambiente ambiente, Cliente cliente) {
        this.fechaServicio = fechaServicio;
        this.horaInicio = horaInicio;
        this.horaTermino = horaTermino;
        this.estado = estado;
        this.paquete = paquete;
        this.CodigoServicio = generarCodigo(fechaServicio, horaInicio, horaTermino);
        this.terapeuta = terapeuta;
        this.ambiente = ambiente;
        this.cliente = cliente;
    }

    public ServicioSolicitado(Date fechaServicio, String horaInicio, String horaTermino, String estado,PaqueteServicio paquete, Terapeuta terapeuta, Ambiente ambiente, Cliente cliente) {
        
        this.fechaServicio = fechaServicio;
        this.horaInicio = horaInicio;
        this.horaTermino = horaTermino;
        this.estado = estado;
        this.paquete = paquete;
        this.CodigoServicio = generarCodigo(fechaServicio, horaInicio, horaTermino);
        this.terapeuta = terapeuta;
        this.ambiente = ambiente;
        this.cliente = cliente;
    }

    public ServicioSolicitado(Date fechaServicio, String horaInicio, String horaTermino, String estado, PaqueteServicio paquete, Terapeuta terapeuta, Ambiente ambiente, Cliente cliente, String Nombre, String tipoServicio, Double precio, InsumoRequerido[] insumoRequerido) {
        super(Nombre, tipoServicio, precio, insumoRequerido);
        this.fechaServicio = fechaServicio;
        this.horaInicio = horaInicio;
        this.horaTermino = horaTermino;
        this.estado = estado;
        this.CodigoServicio = generarCodigo(fechaServicio, horaInicio, horaTermino);
        this.paquete = paquete;
        this.terapeuta = terapeuta;
        this.ambiente = ambiente;
        this.cliente = cliente;
    }


    

    public Date getFechaServicio() {
        return fechaServicio;
    }

    public void setFechaServicio(Date fechaServicio) {
        this.fechaServicio = fechaServicio;
    }
    

    public String getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(String horaInicio) {
        this.horaInicio = horaInicio;
    }

    public String getHoraTermino() {
        return horaTermino;
    }

    public void setHoraTermino(String horaTermino) {
        this.horaTermino = horaTermino;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public PaqueteServicio getPaquete() {
        return paquete;
    }

    public void setPaquete(PaqueteServicio paquete) {
        this.paquete = paquete;
    }
    
    public String getCodigoServicio() {
        return CodigoServicio;
    }

    public void setCodigoServicio(String CodigoServicio) {
        this.CodigoServicio = CodigoServicio;
    }

    public Terapeuta getTerapeuta() {
        return terapeuta;
    }

    public void setTerapeuta(Terapeuta terapeuta) {
        this.terapeuta = terapeuta;
    }
    
    public Ambiente getAmbiente() {
        return ambiente;
    }

    public void setAmbiente(Ambiente ambiente) {
        this.ambiente = ambiente;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    private String generarCodigo(Date fechaServicio, String horaInicio, String horaTermino) {
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
        String fechaString = formatoFecha.format(fechaServicio);
        String[] splitFecha = fechaString.split("/");
        
        String[] splitHoraInicio = horaInicio.split(":");
        String[] splitHoraTermino = horaTermino.split(":");
        
        String codigo = "";
        codigo+= splitFecha[0] + splitFecha[1] + splitFecha[2];
        codigo+= splitHoraInicio[0] + splitHoraInicio[1];
        codigo+= splitHoraTermino[0] + splitHoraTermino[1];
                
        return codigo;
    }
    
}
