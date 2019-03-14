package Relaciones;

/*@author Jesus Kaimorts Díaz Medina*/
public class Agencia 
{
    private int idAgencia;
    private String nombre;
    private String region;
    
    public Agencia(){}

    public Agencia(int idAgencia, String nombre, String region) {
        this.idAgencia = idAgencia;
        this.nombre = nombre;
        this.region = region;
    }

    public int getIdAgencia() {
        return idAgencia;
    }

    public void setIdAgencia(int idAgencia) {
        this.idAgencia = idAgencia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }
    
    
}
