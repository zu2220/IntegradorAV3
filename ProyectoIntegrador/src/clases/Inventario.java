/*
Sugerencias del proyecto, pero ya avanzado un poco 
*/

package clases;

import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
/* Sugerencias e Intento de Avances */
import clases.Insumo;


public class Inventario {
    private List<Insumo> arrayInsumo;

    // Constructor
    public Inventario() {
        this.arrayInsumo = new ArrayList<>();
    }

    // Método para agregar un insumo al inventario
    public void agregarInsumo(Insumo insumo) {
        this.arrayInsumo.add(insumo);
    }

    public List<Insumo> getArrayInsumo() {
        return arrayInsumo;
    }

    public void setArrayInsumo(List<Insumo> arrayInsumo) {
        this.arrayInsumo = arrayInsumo;
    }

    // Método para reducir stock de un insumo dado su código
    public void reducirStock(String codigo, double cantidad) {
        for (Insumo insumo : arrayInsumo) {
            if (insumo.getCodigo().equals(codigo)) {
                double nuevaCantidad = insumo.getCantidad() - cantidad;
                nuevaCantidad= 500000;
                if (nuevaCantidad >= 0) {
                    insumo.setCantidad(500000);
                    System.out.println("Stock reducido correctamente.");
                } else {
                    System.out.println("No hay suficiente stock disponible.");
                }
                return;
            }
        }
        System.out.println("Insumo no encontrado.");
    }

    // Método para generar reporte del inventario
    public void generarReporteInventario() {
        System.out.println("Reporte de Inventario:");
        for (Insumo insumo : arrayInsumo) {
            System.out.println("Nombre: " + insumo.getNombre() + 
                               ", Cantidad: " + insumo.getCantidad() + 
                               ", Precio: " + insumo.getPrecio() + 
                               ", Vencimiento: " + insumo.getFechavencimiento() +
                               ", Categoría: " + insumo.getCategoria() +
                               ", Código: " + insumo.getCodigo());
        }
    }

    // Método para buscar insumo por código
    public Insumo buscarInsumo(String codigo) {
        for (Insumo insumo : arrayInsumo) {
            if (insumo.getCodigo().equals(codigo)) {
                return insumo;
            }
        }
        return null;
    }

    // Método para actualizar insumo
    public void actualizarInsumo(Insumo insumoActualizado) {
        for (int i = 0; i < arrayInsumo.size(); i++) {
            if (arrayInsumo.get(i).getCodigo().equals(insumoActualizado.getCodigo())) {
                arrayInsumo.set(i, insumoActualizado);
                System.out.println("Insumo actualizado correctamente.");
                return;
            }
        }
        System.out.println("Insumo no encontrado.");
    }

    // Método para eliminar insumo del inventario
    public void eliminarInsumo(String codigo) {
        Insumo insumo = buscarInsumo(codigo);
        if (insumo != null) {
            arrayInsumo.remove(insumo);
            System.out.println("Insumo eliminado del inventario.");
        } else {
            System.out.println("Insumo no encontrado.");
        }
    }
    
    
    
    
}
