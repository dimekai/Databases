package Relaciones;
/*@author Jesús Kaimorts Díaz Medina*/

public class Cliente 
{
    private String ID;
    private String nombre;
    private String A_Paterno;
    private String A_Materno;
    private String Password;
    private String confirmPassword;
    private String email;
    
    public Cliente(){}

    public Cliente(String ID, String nombre, String A_Paterno, String A_Materno, String Password, String confirmPassword, String email) {
        this.ID = ID;
        this.nombre = nombre;
        this.A_Paterno = A_Paterno;
        this.A_Materno = A_Materno;
        this.Password = Password;
        this.confirmPassword = confirmPassword;
        this.email = email;
        System.err.println(this.email+"--"+this.Password);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getA_Paterno() {
        return A_Paterno;
    }

    public void setA_Paterno(String A_Paterno) {
        this.A_Paterno = A_Paterno;
    }

    public String getA_Materno() {
        return A_Materno;
    }

    public void setA_Materno(String A_Materno) {
        this.A_Materno = A_Materno;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }
}
