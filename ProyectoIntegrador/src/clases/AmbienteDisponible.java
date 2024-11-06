
package clases;

import java.util.Date;


public class AmbienteDisponible {
    private String nombre_ambiente;
    private Date inicio_disponible;
    private Date fin_disponible;
    private double duracion_horas;

    public AmbienteDisponible() {
    }

    public AmbienteDisponible(String nombre_ambiente, Date inicio_disponible, Date fin_disponible, double duracion_horas) {
        this.nombre_ambiente = nombre_ambiente;
        this.inicio_disponible = inicio_disponible;
        this.fin_disponible = fin_disponible;
        this.duracion_horas = duracion_horas;
    }

    public String getNombre_ambiente() {
        return nombre_ambiente;
    }

    public void setNombre_ambiente(String nombre_ambiente) {
        this.nombre_ambiente = nombre_ambiente;
    }

    public Date getInicio_disponible() {
        return inicio_disponible;
    }

    public void setInicio_disponible(Date inicio_disponible) {
        this.inicio_disponible = inicio_disponible;
    }

    public Date getFin_disponible() {
        return fin_disponible;
    }

    public void setFin_disponible(Date fin_disponible) {
        this.fin_disponible = fin_disponible;
    }

    public double getDuracion_horas() {
        return duracion_horas;
    }

    public void setDuracion_horas(double duracion_horas) {
        this.duracion_horas = duracion_horas;
    }
    
    
}
