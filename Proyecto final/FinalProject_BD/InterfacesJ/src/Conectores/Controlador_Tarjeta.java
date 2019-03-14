package Conectores;

/*@author Jesús Kaimorts Díaz Medina*/
import Relaciones.Tarjeta;
import FrameSingUp_In.*;
import java.sql.*;
import javax.swing.*;

public class Controlador_Tarjeta {

    GenerateID ID = new GenerateID();
    Splash screen = new Splash();
    int ID_general = (ID.generedCode("Cliente") - 1);
    
    /*
    Metodo:         verifyCard(Tarjeta card)
    Descripción:    Verifica que ninguno de los campos del objeto Tarjeta se encuentre vacío.
    Recibe:         Objeto de tipo Tarjeta (referencia a la tarjeta que ingresará el cliente en el
                    el proceso de registro).
    Devuelve:       Booleano (respuesta afirmativa o negativa del metodo)
    Obserervación:  El manejo del metodo se hace en la interfaz verifyCard, en el evento
                    del botón registrarse.
    */
    public boolean verifyCard(Tarjeta card) {
        boolean continuar;
        if ((card.getNoTarjeta().equals("")) || (card.getNoTarjeta().length() < 16)
                || (Integer.toString(card.getCVV()).length() < 4) || card.getCVV() == 0
                || (card.getTipo().equals("")) || (card.getFecha().equals(""))) {

            JOptionPane.showMessageDialog(null, "Campos incompletos", "AVISO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            continuar = false;
        } else {
            continuar = true;
        }
        return continuar;
    }

    /*
    Metodo:         insertCard(Tarjeta userCard)
    Descripcion:    Realizar la inserción de la tarjeta a partir de una consulta a la Base de
                    datos de Agencia, tomando como referencia el idCliente.
    Recibe:         Objeto de tipo Tarjeta (hace referencia según la tarjeta que vaya a utilizar
                    para relizar alguna reservacion).
    Devuelve:
    Observación:    Este metodo se manda a llamar, una vez que se verifica que la fecha de de
                    vencimiento de la tarjeta no haya ya pasado, además de haber verificado que 
                    los datos de la tarjeta no estén nulos o vacio.
    */
    public void insertCard(Tarjeta userCard) {
        try {
            if (verifyCard(userCard) == true)
            {
                connectionMYSQL a = new connectionMYSQL();

                PreparedStatement PSInsert;
                Statement st = null;
                ResultSet rs = null;
                String SQL_idCliente, SQL_InsertCard;

                //Obtenemos idCliente de la relacion Cliente para pasarla como (FK) 
                SQL_idCliente = "SELECT idCliente FROM Cliente WHERE idCliente =" + ID_general;

                SQL_InsertCard = "INSERT INTO Tarjeta VALUES('" + userCard.getNoTarjeta() + "',"
                        + "'" + userCard.getTipo() + "',"
                        + "'" + userCard.getFecha() + "',"
                        + "(" + SQL_idCliente + "),"
                        + userCard.getCVV() + ")";

                st = a.getConnection().createStatement();
                int registradoTarjeta = st.executeUpdate(SQL_InsertCard);

                if (registradoTarjeta > 0) {
                    screen.setVisible(true);
                }
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void prueba() {
        connectionMYSQL pruebaConexion = new connectionMYSQL();
        Connection conexionP = pruebaConexion.getConnection();

        String SQL_prueba;
        int pruebaID = 0;

        SQL_prueba = "SELECT idCliente FROM cliente WHERE idCliente =" + ID_general;

        try {
            Statement st;
            ResultSet rs;

            st = conexionP.createStatement();
            rs = st.executeQuery(SQL_prueba);

            while (rs.next()) {
                pruebaID = rs.getInt("idCliente");
            }

            System.out.println(pruebaID);

        } catch (SQLException e) {
        }
    }

}
