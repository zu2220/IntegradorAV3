
package clases;

import java.sql.Date;


public class InsumoPorAgotarse extends Insumo {
    private double cantidadRestante;

    public InsumoPorAgotarse() {
    }

    public InsumoPorAgotarse(double cantidadRestante) {
        this.cantidadRestante = cantidadRestante;
    }

    public InsumoPorAgotarse(double cantidadRestante, String nombre, double cantidad, Date fechavencimiento, double precio, String Categoria, String codigo) {
        super(nombre, cantidad, fechavencimiento, precio, Categoria, codigo);
        this.cantidadRestante = cantidadRestante;
    }
    
    public double getCantidadRestante() {
        return cantidadRestante;
    }

    public void setCantidadRestante(double cantidadRestante) {
        this.cantidadRestante = cantidadRestante;
    }
    
}
