
package clases;

import java.sql.Date;


public class InsumoRequerido extends Insumo {
    private double cantidadUsada;

    public InsumoRequerido() {
    }

    public InsumoRequerido(double cantidadUsada) {
        this.cantidadUsada = cantidadUsada;
    }

    public InsumoRequerido(double cantidadUsada, String nombre, double cantidad, Date fechavencimiento, double precio, String Categoria, String codigo) {
        super(nombre, cantidad, fechavencimiento, precio, Categoria, codigo);
        this.cantidadUsada = cantidadUsada;
    }

    public InsumoRequerido(double cantidadUsada, String nombre, int cantidad) {
        super(nombre, cantidad);
        this.cantidadUsada = cantidadUsada;
    }
    
    public double getCantidadUsada() {
        return cantidadUsada;
    }

    public void setCantidadUsada(double cantidadUsada) {
        this.cantidadUsada = cantidadUsada;
    }
    
    
}
