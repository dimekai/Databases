
package reserva;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
//con esta clase nos conectamos a la BD
public class ConexionSQL {
    
    private static Connection conn;
    private static final String driver="com.mysql.jdbc.Driver";
    private static final String user="root";
    private static final String password="root1";
    private static final String url="jdbc:mysql://localhost:3306/agencia";

    public ConexionSQL() {
        conn=null;
        //por si ocurre un error en la conexión con la BD al ejecutar el bloque de código
        try{
            Class.forName(driver);
            conn = DriverManager.getConnection(url, user, password);
            if(conn!=null){
                System.out.println("Conexion establecida...");
            }
        }catch(ClassNotFoundException | SQLException e){
            System.out.println("Error al conectar: "+e);
        }
          
    }   
    //crearemos un método que nos retorne la conexión
    public Connection getConnection(){
        return conn;
    }
    
    //con este método nos desconectamos de la BD
    public void desconectar(){
        conn=null;
        if(conn==null){
            System.out.println("Conexion terminada...");
        }
    } 
    
    
    
    
}
