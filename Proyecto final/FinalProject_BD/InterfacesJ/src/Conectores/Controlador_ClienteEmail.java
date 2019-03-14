package Conectores;

import Relaciones.Cliente;
import FrameSingUp_In.*;
import java.sql.*;
import java.util.logging.*;
import javax.swing.*;
import FrameSingUp_In.*;
import java.awt.HeadlessException;
import reserva.VentanaReserva;

/*@author Jesus Kaimorts Díaz Medina*/
public class Controlador_ClienteEmail {

    /*DECLARACIÓN DE VARIABLES*/
    GenerateID ID = new GenerateID();
    Splash screen = new Splash();
    int ID_general = ID.generedCode("Cliente");
    String idCliente = "";

    /*
    Metodo:          verifyRegister
    Descripcion:     Verificar que no exista ningún campo vacío o nulo.
    Recibe:          Objeto de tipo Cliente (referencia al cliente que ha llenado el formulario)
    Devuelve:        Tipo de dato primitivo boolean
    Observaciones:   El manejo de limpieza de las cajas de texto del formulario se hace 
                     directamente en el frame de Registro.
     */
    public boolean verifyRegister(Cliente user) {
        boolean continuar;
        if (("".equals(user.getNombre())) || ("".equals(user.getA_Paterno())) || ("".equals(user.getA_Materno()))
                || ("".equals(user.getEmail())) || ("".equals(user.getConfirmPassword())) || ("".equals(user.getPassword()))) {

            JOptionPane.showMessageDialog(null, "Campos incompletos", "AVISO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            continuar = false;
        } else {
            continuar = true;
        }
        return continuar;
    }

    /*
    Metodo:         void insertar(Cliente user, Connection conexion, String nombreTabla)
    Descripcion:    Insertar nuevos registros en la base de datos de la agencia 
    Recibe:         Cliente user (referencia al cliente nuevo), 
                    Connection conexion (referencia a la conexión establecida con la base de datos) y
                    String tabla (Especificacion del nombre de la tabla para hacer la inserción).
    Devuelve: 
    Observaciones:  El nombre de la tabla en este metodo siempre sera Cliente
                    Dentro del cupero del metodo hay un objeto Splash el cual 
                    simula un screenLoader al cargar un registro (se puede mejorar con hilos)
     */
    public void insertar(Cliente user, Connection conexion, String nombreTabla) {
        if (verifyRegister(user) == true) {
            try {
                PreparedStatement PSInsert;
                Statement st = null;
                ResultSet rs = null;
                connectionMYSQL a = new connectionMYSQL();

                String SQL_InsertCliente = "INSERT INTO cliente VALUES(" + ID_general + ","
                        + "'" + user.getNombre() + "',"
                        + "'" + user.getA_Paterno() + "',"
                        + "'" + user.getA_Materno() + "')";

                String SQL_InsertEmail = "INSERT INTO emailCliente VALUES(" + ID_general + ","
                        + "'" + user.getEmail() + "',"
                        + "'" + user.getPassword() + "')";

                st = a.getConnection().createStatement();

                int registradoData = st.executeUpdate(SQL_InsertCliente);
                int registradoEmail = st.executeUpdate(SQL_InsertEmail);

                if (registradoData > 0 && registradoEmail > 0) {
                    screen.setVisible(true);
                    ID.UpdateCode(nombreTabla);
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }

    /*
    Metodo:         public void accederCuenta(Cliente user, Connection conexion)
    Descripcion:    Acceder a la cuenta, para poder visualizar la pantalla principal de reservacion.
    Recibe:         Objeto de tipo Cliente (referente a un cliente antes registrado que quiere iniciar sesión)
                    Objeto Connection (referencia a la conexión establecida con la Base de Datos de Agencia)
    Devuelve:        
    Observaciones:  Se implementa directamente en la interfaz newSession.
                    Dentro del cuerpo de este metodo se ha establecido un objeto de tipo
                    CircleProgressBar que simula la carga al iniciar la sesión.
                    Este metodo nos ayuda a establecer el perfil (aun en desarrollo) del cliente
                    gracias a una instancia de la clase VentanaReserva que a su vez hará uso de una
                    instancia de la ventana User_Profile para establecer los datos del cliente.
     */
    public void accederCuenta(Cliente user, Connection conexion) {
        String SQL_Login = "SELECT * FROM emailCliente WHERE email ='" + user.getEmail() + "'"
                + "AND CONTRASEÑA = '" + user.getPassword() + "'";
        String email = "", pssw = "";

        try {
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery(SQL_Login);
            while (rs.next()) {
                email = rs.getString("email");
                pssw = rs.getString("contraseña");
                idCliente = rs.getString("idCliente");
            }
            System.out.println(idCliente);
            if ((user.getEmail().equals(email)) && (user.getPassword().equals(pssw))) {
                progressCircle();
            } else {
                JOptionPane.showMessageDialog(null, "Compruebe sus datos");
            }

        } catch (SQLException ex) {
            ex.getMessage();
        }
        //VentanaReserva a = new VentanaReserva(user);
    }

    /*
    Metodo:         buscarCorreoRepetida(Cliente user, Connection conexion)
    Descripcion:    Analiza posibles casos de redundancia de correos electronicos
                    previamente registrados y los deniega para volver a registrarlos
    Recibe:         Objeto de tipo Cliente (referencia al posible candidato que quiera hacer)
                    uso del correo previamente registrado).
                    Objeto de tipo Connection(establece la conexión con la base de datos de Agencia)
    Retorna:        Dato primitivo de tipo boolean.
    Observaciones:  Se realiza una actualización del correo, en caso de que el usuario lo quiera
                    y que cuente con la contraseña anterior.
     */
    public boolean buscarCorreoRepetida(Cliente user, Connection conexion) {
        boolean correoNoRepetido = true;
        String SQL_verifyEmail;

        SQL_verifyEmail = "SELECT email FROM emailCliente WHERE email like '"
                + user.getEmail() + "'";

        try {
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery(SQL_verifyEmail);

            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "Este correo ya fue registrado");
                correoNoRepetido = true;
            } else {
                correoNoRepetido = false;
            }

        } catch (NumberFormatException | SQLException e) {
        }

        return correoNoRepetido;
    }

    /*
    Metodo:         buscarCliente_Repetido(Cliente user, Connection conexion)
    Descripcion:    Analiza posibles casos de redundancia de clientes previamente registrados
                    y los deniega para volver a registrarlos
    Recibe:         Objeto de tipo Cliente (referencia al posible candidato que quiera hacer)
                    uso de la cuenta previamente registrada).
                    Objeto de tipo Connection(establece la conexión con la base de datos de Agencia)
    Retorna:        Dato primitivo de tipo boolean.
    Observaciones:  En caso de que el cliente se repita, se llama al metodo justInsertEmail
                    el cual actualizará.
     */
    public boolean buscarCliente_Repetido(Cliente user, Connection conexion) {
        boolean clienteNoRepetido = false;
        String SQL_verifyName;

        SQL_verifyName = "SELECT nombre,apPaterno,apMaterno FROM Cliente"
                + " WHERE nombre like '" + user.getNombre() + "'"
                + " AND apPaterno like '" + user.getA_Paterno() + "'"
                + " AND apMaterno like '" + user.getA_Materno() + "'";

        try {
            Statement st = conexion.createStatement();
            ResultSet rs01;
            rs01 = st.executeQuery(SQL_verifyName);

            if (rs01.next()) {
                //System.out.println("Ya existe");
                clienteNoRepetido = true;
            } else {
                //System.out.println("No existe");
                clienteNoRepetido = false;
            }

        } catch (NumberFormatException | SQLException e) {
            System.out.println(e.getMessage());
        }
        //JOptionPane.showMessageDialog(null, SQL_verifyName);
        //System.out.println(""+SQL_verifyName);
        return clienteNoRepetido;
    }

    /*
    Metodo:         justInsertedEmail(Cliente user, Connection conexion)
    Descripcion:    Actualiza el correo electrónico y contraseña en caso de que el cliente lo requiera.
    Recibe:         Objeto de tipo Cliente (Hace referencia al cliente ya registrado que desea
                    actualizar su correo electrónico y su contraseña)
                    Objeto de tipo Connection (Toma la conexión con la la base de datos de Agencia)
    Retorna:        
    Observaciones:  Este metodo se implementa en el Frame de Registro, asi como (en un futuro) en el 
                    frame de User_Profile.
     */
    public void justInsertedEmail(Cliente user, Connection conexion) {
        String SQL_insertedEmail, SQL_getCliente, SQL_updateEmail;

        SQL_getCliente = "SELECT idCliente FROM Cliente WHERE nombre like '" + user.getNombre() + "'"
                + " AND apPaterno like '" + user.getA_Paterno() + "'"
                + " AND apMaterno like '" + user.getA_Materno() + "'";

        SQL_updateEmail = "UPDATE emailCliente SET email='" + user.getEmail()
                + "',contraseña='" + user.getPassword()
                + "' WHERE idCliente = (" + SQL_getCliente + ")";

        /*SQL_insertedEmail = "INSERT INTO emailCliente VALUES(("+SQL_getCliente+")," 
                          + "'"+user.getEmail()+"',"
                          + "'"+user.getPassword()+"')";*/
        try {
            connectionMYSQL a = new connectionMYSQL();
            Statement st = conexion.createStatement();
            ResultSet rs;

            st = a.getConnection().createStatement();
            int registradoData = st.executeUpdate(SQL_updateEmail);

            rs = st.executeQuery(SQL_updateEmail);

            JOptionPane.showMessageDialog(null, "YES");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    /*public void DeleteClient(String ID_Delete, int fila) {
        if (fila >= 0) {
            try {
                connectionMYSQL cn = new connectionMYSQL();
                Connection conexion = cn.getConnection();
                String SQL_DELETE = "DELETE FROM Cliente WHERE idCliente =" + ID_Delete+";";
                String SQL_DELETE_EMAIL = "DELETE FROM emailCliente WHERE idCliente = " + ID_Delete+";";
                System.out.println(SQL_DELETE);
                System.out.println(SQL_DELETE_EMAIL);
                Statement st = conexion.createStatement();
                Statement st1 = conexion.createStatement();
                ResultSet rs = st.executeQuery(SQL_DELETE_EMAIL);
                ResultSet rsE = st1.executeQuery(SQL_DELETE);
                while (rs.next() && rsE.next()) {
                    JOptionPane.showMessageDialog(null, "Cliente Eliminado");
                }
            } catch (HeadlessException | NumberFormatException | SQLException e) {
                e.getMessage();
            }
        }

    }*/

    /*public void getDataProfile(Cliente user, Connection conexion)
    {
        String nombre="",apPat="",apMat="",email="",pss="";
        String idProfile="";
        String getID = "SELECT idCliente FROM emailCliente WHERE email like '"+user.getEmail()
                +"' AND contraseña like '"+user.getPassword()+"'";
        
        try {
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery(getID);
            while(rs.next())
            {
                idProfile = rs.getString("idCliente");
            }
            System.out.println(idProfile);
        } catch (SQLException e) { e.printStackTrace();}
        
        String getDataProfile = "SELECT nombre,apPaterno, apMaterno FROM Cliente WHERE idCliente ="+idProfile;
        String getEmailDataProfile = "SELECT email,contraseña FROM emailcliente WHERE idCliente="+idProfile;
        
        try {
            Statement st = conexion.createStatement();
            Statement st2 = conexion.createStatement();
            ResultSet rs = st.executeQuery(getDataProfile);
            ResultSet rs2 = st2.executeQuery(getEmailDataProfile);
            
            while(rs.next() && rs2.next())
            {
                nombre = rs.getString(1);
                apPat = rs.getString(2);
                apMat = rs.getString(3);
                email = rs2.getString(1);
                pss = rs2.getString(2);
            }
            
            System.out.println(nombre);
            System.out.println(apPat);
            System.out.println(apMat);
            System.out.println(email);
            System.out.println(pss);
                        
        } catch (SQLException e) {
        }
       
    }*/
    public void progressCircle() {
        new Thread(new Runnable() {
            /*Instancia del hilo con su respecti metodo
                                              abstracto de la interfaz Runnable*/
            @Override
            public void run() {//Abre método run del hilo
                CircleProgressBar circle = new CircleProgressBar();
                circle.setVisible(true);
                for (int num = 1; num <= 100; num++) {//Inicio de for
                    try {
                        circle.getCirclePB().UpdateProgress(num);
                        circle.getCirclePB().repaint();
                        Thread.sleep(35);
                    } catch (InterruptedException ex) {
                        ex.printStackTrace();
                    }
                }//Cierra for
                circle.setVisible(false);
            }//Cierra método run del hilo
        }).start(); //Inicia el hilo
    }

    public GenerateID getID() {
        return ID;
    }

    public void setID(GenerateID ID) {
        this.ID = ID;
    }

    public int getID_general() {
        return ID_general;
    }

    public void setID_general(int ID_general) {
        this.ID_general = ID_general;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

}
