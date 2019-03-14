package Conectores;
import javax.swing.*;
import java.sql.*;

/*Jesús Kaimorts Díaz Medina*/
public class connectionMYSQL 
{
    /*
    Metodo:         getConnection()
    Descripción:    Establece la conexión con la base de datos Agencia para realizar
                    las consultas necesarias en el programa.
    Recibe:         
    Devuelve:       Objeto de tipo Connection (establece la conexión con la base de datos
                    utilizando el driver correspondiente, el protocolo y la libreria [.jar])
    Descripción:    En dado caso de que el nombre de la Base de Datos cambie o bien, 
                    la contraseña, estas podrán sermodificadas sin afectar al sistema.
                    Siempre y cuando sean del mismo grado y cardinalidad.
    */
    String Protocol = "jdbc:mysql://localhost:3306/";
    String DataBase = "Agencia";
    String Password = "root1";
    String User = "root";
    
    public Connection getConnection()
    {
        Connection conexion = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conexion = DriverManager.getConnection(Protocol+DataBase,User,Password);
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        }
        return conexion;
    }
}
