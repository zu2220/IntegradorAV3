
package clases;

public class Cliente extends Persona{
    private boolean Discapacitado;
    private String DetalleDiscapacidad;
    
    public Cliente(){
    
    }

    public boolean isDiscapacitado() {
        return Discapacitado;
    }

    public void setDiscapacitado(boolean Discapacitado) {
        this.Discapacitado = Discapacitado;
    }

    public String getDetalleDiscapacidad() {
        return DetalleDiscapacidad;
    }

    public void setDetalleDiscapacidad(String DetalleDiscapacidad) {
        this.DetalleDiscapacidad = DetalleDiscapacidad;
    }
}
