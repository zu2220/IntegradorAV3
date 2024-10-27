
package clases;
import java.util.Date;

public class Terapeuta extends Persona {

    private String[][] HorarioSemanalLaboral = new String[2][6];
    
    public Terapeuta(){}

    public Terapeuta(String[][] HorarioSemanalLaboral) {
        this.HorarioSemanalLaboral = HorarioSemanalLaboral;
    }

    public Terapeuta(String nombre, String apellido1, String apellido2, String sexo, String fechaNacimiento, int DNI, int NumeroCelular) {
        super(nombre, apellido1, apellido2, sexo, fechaNacimiento, DNI, NumeroCelular);
    }
   
}
