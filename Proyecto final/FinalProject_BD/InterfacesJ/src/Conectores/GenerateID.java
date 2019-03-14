package Conectores;

import java.sql.*;
import javax.swing.*;
import java.util.Random;

/*@author Jesús Kaimorts Díaz Medina*/
public class GenerateID {

    connectionMYSQL cn = new connectionMYSQL();
    ResultSet rs = null;
    Statement stmnt = null;
    
    /*
    Metodo: generedCode(String nombTabla) 
    Descripción:    Genera un id consecutivo de la relación que se seleccione.
    Recibe:         Objeto de tipo String (referencia al nombre de la tabla para generar el ID)
    Devuelve:       Tipo de dato int (ID generado)
    Observación:    Previamente en la base de datos hay una relación llamada generador que hace
                    referencia a cada una de las relaciones que son mas utilizadas. 
                    Esta relación fue creada a razón de que no establecimos un AUTO_INCREMENT al
                    crear la tabla. 
    */
    public int generedCode(String nombTabla) {
        String copyID = "";
        int ID;
        try {
            String SQL_Query = "SELECT nomb_Tabla, numero FROM generador WHERE nomb_Tabla='" + nombTabla + "'";
            stmnt = cn.getConnection().createStatement();
            rs = stmnt.executeQuery(SQL_Query);

            if (rs.next()) {
                int indice = rs.getInt(2);
                if (indice > 0 && indice < 10) {
                    copyID = "" + (indice);
                } else if (indice > 9 && indice < 100) {
                    copyID = "00" + String.valueOf(indice);

                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        ID = Integer.parseInt(copyID);

        return ID;
    }

    
    /*
    Metodo:         UpdateCode(String nombTabla)
    Descripción:    Actualiza el código (consecutivo del generador) en la relación especificada
    Recibe:         Objeto String (Nombre de la tabla, del cual hace referencia a su PK, que se desea
                    actualizar)
    Devuelve:       Tipo de dato boolean (verificación de la consulta)
    Observación:    No se ha adaptado para verificar si la BD está vacía. En ese caso el generador será 0
    */
    public boolean UpdateCode(String nombTabla) {
        boolean actualizar = false;

        try {
            String SQL_Update = "UPDATE generador SET numero = numero+1 WHERE nomb_tabla='" + nombTabla + "'";
            stmnt = cn.getConnection().createStatement();
            int modificado = stmnt.executeUpdate(SQL_Update);

            if (modificado > 0) {
                actualizar = true;
            }

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return actualizar;
    }

    /*public String generatorID(Cliente user)
    {
        String completeID;
        //Generador de letra al azar
        int startRango=65, finalRango = 90, letter;
        String letterID, letterAP, letterAM, numID;
        
        letter = (int)(Math.floor(Math.random()*(finalRango-startRango)+startRango));
        char c = (char)(letter);
        letterID = ""+c;
        //Cierra geneador de letra al azar
        
        //Obtener 1a letra de apellido paterno y materno
        letterAP = ""+(user.getA_Paterno()).charAt(1);
        letterAM = ""+(user.getA_Materno()).charAt(1);
        
        completeID = (letterID+letterAP+letterAM);
        
        return completeID;
    }*/
}
