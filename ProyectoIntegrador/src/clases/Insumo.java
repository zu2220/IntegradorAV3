
package clases;
import java.util.Date;

public class Insumo {
    private String codigo;
    private String nombre;
    private String Categoria;
    private java.sql.Date fechavencimiento;
    private double cantidad;
    private double precio;

    public Insumo() {
    }

    public Insumo(String nombre, double cantidad, java.sql.Date fechavencimiento, double precio, String Categoria, String codigo) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.fechavencimiento = fechavencimiento;
        this.precio = precio;
        this.Categoria = Categoria;
        this.codigo = codigo;
    }
    
    
    
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
  
  
    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String Categoria) {
        this.Categoria = Categoria;
    }

    public java.sql.Date getFechavencimiento() {
        return fechavencimiento;
    }

    public void setFechavencimiento(java.sql.Date fechavencimiento) {
        this.fechavencimiento = fechavencimiento;
    }


    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    
    public Insumo(String nombre, int cantidad) {
        this.nombre = nombre;
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }
    
    
    
    /*
       // Formato para fecha y hora
    private SimpleDateFormat FormatoFV = new SimpleDateFormat("dd/MM/yyyy");
    private SimpleDateFormat FormatoHora = new SimpleDateFormat("HH:mm:ss");
    
     private SimpleDateFormat FormatoFV = new SimpleDateFormat("dd/MM/yyyy");
    private SimpleDateFormat FormatoMinSeg = new SimpleDateFormat("mm:ss"); // Formato solo para minutos y segundos
    
        // Método para obtener solo minutos y segundos
    public String getMinutosYSegundos() {
        Date fechaActual = new Date(); // Obtenemos la fecha y hora actual

        // Formateamos solo los minutos y segundos en el formato mm:ss
        String minSeg = FormatoMinSeg.format(fechaActual);

        // Devolvemos los minutos y segundos formateados
        return minSeg; // Formato: mm:ss
    }
    
    
      // Métodos getter y setter omitidos por brevedad

    // Método para concatenar fecha y hora
    public String getFechaYHoraCompleta() {
        Date fechaActual = new Date(); // Obtenemos la fecha y hora actual

        // Formateamos la fecha y la hora por separado
        String fecha = FormatoFV.format(fechaActual);
        String hora = FormatoHora.format(fechaActual);

        // Concatenamos fecha y hora
        return fecha + " " + hora; // Formato: dd/MM/yyyy HH:mm:ss
    }
    
    // Método para obtener solo horas, minutos y segundos
    public String getHoraCompleta() {
        Date fechaActual = new Date(); // Obtenemos la hora actual

        // Formateamos la hora en el formato HH:mm:ss
        String hora = FormatoHora.format(fechaActual);

        // Devolvemos la hora formateada
        return hora; // Formato: HH:mm:ss
    }

      // Métodos getter y setter omitidos por brevedad

    // Método para obtener solo minutos y segundos
    public String getMinutosYSegundos() {
        Date fechaActual = new Date(); // Obtenemos la fecha y hora actual

        // Formateamos solo los minutos y segundos en el formato mm:ss
        String minSeg = FormatoMinSeg.format(fechaActual);

        // Devolvemos los minutos y segundos formateados
        return minSeg; // Formato: mm:ss
    }
    */
    
}
