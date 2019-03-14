package Relaciones;

import java.math.BigInteger;
import java.sql.*;


/*@author Jesús Kaimorts Díaz Medina*/
public class Tarjeta {

    private String noTarjeta;
    private int CVV;
    private String tipo;
    private String fecha; // Date fecha;

    public Tarjeta() {
    }

    public Tarjeta(String noTarjeta, int CVV, String tipo, String fecha) {
        this.noTarjeta = noTarjeta;
        this.CVV = CVV;
        this.tipo = tipo;
        this.fecha = fecha;
    }

    public String getNoTarjeta() {
        return noTarjeta;
    }

    public void setNoTarjeta(String noTarjeta) {
        this.noTarjeta = noTarjeta;
    }

    public int getCVV() {
        return CVV;
    }

    public void setCVV(int CVV) {
        this.CVV = CVV;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

}
