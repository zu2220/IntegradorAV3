
package clases;

import java.util.Date;

public class Ambiente {
    
    private String NombreAmbiente;
    private String tipodeAmbiente;


    public Ambiente(){}

    public Ambiente(String NombreAmbiente, String tipodeAmbiente) {
        this.NombreAmbiente = NombreAmbiente;
        this.tipodeAmbiente = tipodeAmbiente;
    }

    public String getNombreAmbiente() {
        return NombreAmbiente;
    }

    public void setNombreAmbiente(String NombreAmbiente) {
        this.NombreAmbiente = NombreAmbiente;
    }

    public String getTipodeAmbiente() {
        return tipodeAmbiente;
    }

    public void setTipodeAmbiente(String tipodeAmbiente) {
        this.tipodeAmbiente = tipodeAmbiente;
    }
   
}
