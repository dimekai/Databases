
package reserva;

import java.sql.*;

public class Conectar
{
    Connection conectar = null;
    public Connection conectar() 
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            conectar = DriverManager.getConnection("jdbc:mysql://localhost:3306/agencia","root","root1");
        }
        catch(ClassNotFoundException | SQLException e)
        {
            System.out.println("Error al conectar: " + e.getMessage());
        }
        return conectar;
    }
    
}
