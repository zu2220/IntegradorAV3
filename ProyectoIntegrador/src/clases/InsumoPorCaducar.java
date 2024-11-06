
package clases;

import java.sql.Date;


public class InsumoPorCaducar extends Insumo{
    private int diasRestantes;

    public InsumoPorCaducar() {
    }

    public InsumoPorCaducar(int diasRestantes) {
        this.diasRestantes = diasRestantes;
    }

    public InsumoPorCaducar(int diasRestantes, String nombre, double cantidad, Date fechavencimiento, double precio, String Categoria, String codigo) {
        super(nombre, cantidad, fechavencimiento, precio, Categoria, codigo);
        this.diasRestantes = diasRestantes;
    }

    public InsumoPorCaducar(int diasRestantes, String nombre, int cantidad) {
        super(nombre, cantidad);
        this.diasRestantes = diasRestantes;
    }
    
    public int getDiasRestantes() {
        return diasRestantes;
    }

    public void setDiasRestantes(int diasRestantes) {
        this.diasRestantes = diasRestantes;
    }
    
    
}
