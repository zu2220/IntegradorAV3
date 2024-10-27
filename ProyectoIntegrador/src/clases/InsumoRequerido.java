
package clases;


public class InsumoRequerido {
    private Insumo insumo;
    private double cantidadUsada;

    public InsumoRequerido() {
    }

    public InsumoRequerido(Insumo insumo, double cantidadUsada) {
        this.insumo = insumo;
        this.cantidadUsada = cantidadUsada;
    }

    public Insumo getInsumo() {
        return insumo;
    }

    public void setInsumo(Insumo insumo) {
        this.insumo = insumo;
    }

    public double getCantidadUsada() {
        return cantidadUsada;
    }

    public void setCantidadUsada(double cantidadUsada) {
        this.cantidadUsada = cantidadUsada;
    }
    
    
}
