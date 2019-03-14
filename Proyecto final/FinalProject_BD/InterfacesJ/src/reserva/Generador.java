package reserva;


import java.sql.*;
import javax.swing.JOptionPane;

public class Generador {
        Statement stmnt;
        ResultSet rs;
      
        
    public int generedCode(String nombTabla){
        String copyID="";
        int ID;
        try
        {
            String SQL_Query = "SELECT nomb_Tabla, numero FROM generador where nomb_tabla='"
                    +nombTabla+"'";
            stmnt = cn.createStatement();
            rs = stmnt.executeQuery(SQL_Query);
            
            
            if(rs.next()){
                int indice = rs.getInt(2);
                if (indice > 0 && indice < 10){
                    copyID=""+indice;
                }else if (indice > 9 && indice < 100){
                    copyID = "00"+String.valueOf(indice);
                }
            }
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        ID = Integer.parseInt(copyID);
        
        return ID;
    }
    
    public boolean UpdateCode(String nombTabla){
        boolean actualizar = false;
        
            try {
                String SQL_Update = "UPDATE generador set numero = numero+1 WHERE "
                    + "nomb_tabla='"+nombTabla+"'";
                stmnt = cn.createStatement();
                int modificado = stmnt.executeUpdate(SQL_Update);
                
                if (modificado > 0){
                    actualizar = true;
                }
                
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
            return actualizar;
        }
    
    
    
    
    ConexionSQL co = new ConexionSQL();
    Connection cn = co.getConnection();
}


