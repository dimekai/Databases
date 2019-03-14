package reserva;

import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JOptionPane;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.*;
import javax.swing.*;
import static reserva.Reserva.contador;
import FrameSingUp_In.*;
import Relaciones.Cliente;

public class VentanaReserva extends javax.swing.JFrame {

    Generador indice = new Generador();
    int id = indice.generedCode("OFRECE");
    String nombre = "", apPat = "", apMat = "", email = "", pss = "";
    String numTarjeta = "", CVV = "", tipo = "", fechaVencimiento = "";

    public VentanaReserva() {
        initComponents();
        galeriaHome();
        setLocationRelativeTo(null);
    }

    public VentanaReserva(String email, String pss) {
        initComponents();
        galeriaHome();
        setLocationRelativeTo(null);
        System.out.println("PRUEBAVEN " + email);
        System.out.println("PRUEBA VEN " + pss);
        this.email = email;
        this.pss = pss;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BTN_CERRAR = new javax.swing.JButton();
        LBL_ICONO_LOGO = new javax.swing.JLabel();
        BTN_MEDIOTRANSPORTE = new javax.swing.JButton();
        LBL_PERFIL = new javax.swing.JLabel();
        LBL_CERRSESION = new javax.swing.JLabel();
        LBL_TEXTO3 = new javax.swing.JLabel();
        LBL_TEXTO2 = new javax.swing.JLabel();
        BTN_BUSCARHOTEL = new javax.swing.JButton();
        LBL_FOTOS_PRINCIPAL = new javax.swing.JLabel();
        LBL_TEXTO = new javax.swing.JLabel();
        TXF_NUMPERSONAS = new javax.swing.JTextField();
        LBL_ICONO_TEL = new javax.swing.JLabel();
        LBL_TELEFONO_AGENCIA = new javax.swing.JLabel();
        LBL_ICONO_PERFIL = new javax.swing.JLabel();
        LBL_TEXTO4 = new javax.swing.JLabel();
        COMBO_DESTINOS = new javax.swing.JComboBox();
        CALENDARIO_SALIDA = new com.toedter.calendar.JDateChooser();
        CALENDARIO_LLEGADA = new com.toedter.calendar.JDateChooser();
        LBL_CUADRO_RESERVA = new javax.swing.JLabel();
        LBL_PANEL = new javax.swing.JLabel();
        TXT_NombreUser = new javax.swing.JTextField();
        TXT_email = new javax.swing.JTextField();
        TXT_apPat = new javax.swing.JTextField();
        TXT_apMat = new javax.swing.JTextField();
        TXT_pss = new javax.swing.JTextField();
        TXT_Card = new javax.swing.JTextField();
        TXT_cvv = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BTN_CERRAR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva/cerrar.png"))); // NOI18N
        BTN_CERRAR.setBorderPainted(false);
        BTN_CERRAR.setContentAreaFilled(false);
        BTN_CERRAR.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BTN_CERRAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_CERRARActionPerformed(evt);
            }
        });
        getContentPane().add(BTN_CERRAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 10, 40, 20));

        LBL_ICONO_LOGO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva/logo.png"))); // NOI18N
        getContentPane().add(LBL_ICONO_LOGO, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, -10, -1, -1));

        BTN_MEDIOTRANSPORTE.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        BTN_MEDIOTRANSPORTE.setForeground(new java.awt.Color(255, 255, 255));
        BTN_MEDIOTRANSPORTE.setText("Medios de Transporte");
        BTN_MEDIOTRANSPORTE.setBorderPainted(false);
        BTN_MEDIOTRANSPORTE.setContentAreaFilled(false);
        BTN_MEDIOTRANSPORTE.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BTN_MEDIOTRANSPORTE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_MEDIOTRANSPORTEActionPerformed(evt);
            }
        });
        getContentPane().add(BTN_MEDIOTRANSPORTE, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 70, 160, 40));

        LBL_PERFIL.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        LBL_PERFIL.setText("Mi perfil     |");
        LBL_PERFIL.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LBL_PERFIL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LBL_PERFILMouseClicked(evt);
            }
        });
        getContentPane().add(LBL_PERFIL, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 20, -1, 20));

        LBL_CERRSESION.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        LBL_CERRSESION.setForeground(new java.awt.Color(51, 51, 51));
        LBL_CERRSESION.setText("Cerrar sesión");
        LBL_CERRSESION.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LBL_CERRSESION.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LBL_CERRSESIONMouseClicked(evt);
            }
        });
        getContentPane().add(LBL_CERRSESION, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 20, -1, 20));

        LBL_TEXTO3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        LBL_TEXTO3.setText("Destino:");
        getContentPane().add(LBL_TEXTO3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, -1, -1));

        LBL_TEXTO2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        LBL_TEXTO2.setText("Fecha de salida:");
        getContentPane().add(LBL_TEXTO2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 300, -1, -1));

        BTN_BUSCARHOTEL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva/buscar.png"))); // NOI18N
        BTN_BUSCARHOTEL.setToolTipText("Buscar hoteles");
        BTN_BUSCARHOTEL.setBorderPainted(false);
        BTN_BUSCARHOTEL.setContentAreaFilled(false);
        BTN_BUSCARHOTEL.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BTN_BUSCARHOTEL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_BUSCARHOTELActionPerformed(evt);
            }
        });
        getContentPane().add(BTN_BUSCARHOTEL, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 440, 100, -1));

        LBL_FOTOS_PRINCIPAL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Cancun.png"))); // NOI18N
        getContentPane().add(LBL_FOTOS_PRINCIPAL, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 180, 530, 300));

        LBL_TEXTO.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        LBL_TEXTO.setText("Número de personas:");
        getContentPane().add(LBL_TEXTO, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 370, -1, 20));

        TXF_NUMPERSONAS.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        TXF_NUMPERSONAS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXF_NUMPERSONASActionPerformed(evt);
            }
        });
        getContentPane().add(TXF_NUMPERSONAS, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 400, 80, 30));

        LBL_ICONO_TEL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva/contacto-telefono-icono.png"))); // NOI18N
        getContentPane().add(LBL_ICONO_TEL, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, 30, 40));

        LBL_TELEFONO_AGENCIA.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        LBL_TELEFONO_AGENCIA.setText("01.800.237.8888");
        LBL_TELEFONO_AGENCIA.setToolTipText("¡Contáctanos!");
        getContentPane().add(LBL_TELEFONO_AGENCIA, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, -1, 40));

        LBL_ICONO_PERFIL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva/icono-contacto.png"))); // NOI18N
        getContentPane().add(LBL_ICONO_PERFIL, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 20, -1, -1));

        LBL_TEXTO4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        LBL_TEXTO4.setText("Fecha de llegada:");
        getContentPane().add(LBL_TEXTO4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, -1, -1));

        COMBO_DESTINOS.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        COMBO_DESTINOS.setForeground(new java.awt.Color(153, 0, 153));
        COMBO_DESTINOS.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ACAPULCO", "CANCUN", "CHIAPAS", "CIUDAD DE MEXICO", "COZUMEL", "GUADALAJARA", "MAZATLAN", "MERIDA", "OAXACA", "PUERTO VALLARTA", "RIVERA MAYA", "SAN JOSE DEL CABO", "TIJUANA", "VERACRUZ", "VILLAHERMOSA" }));
        COMBO_DESTINOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                COMBO_DESTINOSActionPerformed(evt);
            }
        });
        getContentPane().add(COMBO_DESTINOS, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 260, 160, 30));

        CALENDARIO_SALIDA.setDateFormatString("yyyy/MM/dd");
        getContentPane().add(CALENDARIO_SALIDA, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 330, 130, 30));

        CALENDARIO_LLEGADA.setDateFormatString("yyyy/MM/dd");
        getContentPane().add(CALENDARIO_LLEGADA, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, 130, 30));

        LBL_CUADRO_RESERVA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva/reserva.png"))); // NOI18N
        getContentPane().add(LBL_CUADRO_RESERVA, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 310, 360));

        LBL_PANEL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva/Imagen2.png"))); // NOI18N
        getContentPane().add(LBL_PANEL, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -10, -1, 540));

        TXT_NombreUser.setEditable(false);
        TXT_NombreUser.setText("jTextField1");
        TXT_NombreUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXT_NombreUserActionPerformed(evt);
            }
        });
        getContentPane().add(TXT_NombreUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 90, -1, -1));

        TXT_email.setEditable(false);
        TXT_email.setText("jTextField1");
        getContentPane().add(TXT_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 90, -1, -1));

        TXT_apPat.setEditable(false);
        TXT_apPat.setText("jTextField1");
        getContentPane().add(TXT_apPat, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 90, -1, -1));

        TXT_apMat.setEditable(false);
        TXT_apMat.setText("jTextField1");
        getContentPane().add(TXT_apMat, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, -1, -1));

        TXT_pss.setEditable(false);
        TXT_pss.setText("jTextField1");
        getContentPane().add(TXT_pss, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        TXT_Card.setEditable(false);
        TXT_Card.setText("jTextField1");
        getContentPane().add(TXT_Card, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 140, -1, -1));

        TXT_cvv.setEditable(false);
        TXT_cvv.setText("jTextField1");
        getContentPane().add(TXT_cvv, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 150, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTN_CERRARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_CERRARActionPerformed
        System.exit(0);

    }//GEN-LAST:event_BTN_CERRARActionPerformed

    private void BTN_BUSCARHOTELActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_BUSCARHOTELActionPerformed
        //insertamos la fecha en ofrece
        //ALMACENAR FECHAS
        String formato = CALENDARIO_LLEGADA.getDateFormatString();
        Date date = CALENDARIO_LLEGADA.getDate();
        SimpleDateFormat sdf = new SimpleDateFormat(formato);
        //FECHA DE LLEGADA
        String fechaLlegada = String.valueOf(sdf.format(date));
        String formato2 = CALENDARIO_SALIDA.getDateFormatString();
        Date date2 = CALENDARIO_SALIDA.getDate();

        SimpleDateFormat sdf2 = new SimpleDateFormat(formato2);
        //FECHA DE SALIDA
        String fechaSalida = String.valueOf(sdf.format(date2));

        //COMPARAMOS LAS FECHAS
        Calendar cal1 = Calendar.getInstance();
        Calendar cal2 = Calendar.getInstance();
        cal1.setTime(date); //date = fecha de llegada
        cal2.setTime(date2); //date2 = fecha de salida

        //--------------------------
        //dias
        int fLdia = date.getDate();
        int fIdia = date2.getDate();

        //meses
        int fLmes = date.getMonth();
        int fImes = date2.getMonth();

        //con esto podemos controlar los días
        int diaT = fIdia - fLdia;

        //obtenemos un true si la fecha de ida es despues que la de llegada
        boolean fechaDespues = cal2.after(cal1);

        //verificamos que la fecha de llegada no sea antes que la de ida
        if (fechaDespues == false) {
            JOptionPane.showMessageDialog(null, "Ingresa una fecha valida");
        }

        //verificamos que la reservación se haga en el mes seleccionado(que no pase de un mes)
        boolean auxMes = true;
        if (fLmes != fImes) {
            JOptionPane.showMessageDialog(null, "Sólo se permite un máximo de un mes para dar de alta tu reservacion");
            auxMes = false;
        }

        String plaza = TXF_NUMPERSONAS.getText();
        int rpt = Integer.parseInt(plaza);
        boolean auxP = true;
        if (rpt > 3) {
            JOptionPane.showMessageDialog(null, "Sólo se permite un máximo de 3 personas por reservacion");
            auxP = false;
        }

        while (fechaDespues == true && auxMes == true && auxP == true) {

            //insertamos el registro
            try {

                //insertamos un valor para la llave primaria de la relacion ofrece
                PreparedStatement pstid = cn.prepareStatement("INSERT INTO ofrece(idReservacion,idCliente) VALUES (?,?)");
                pstid.setInt(1, id);
                pstid.setInt(2, id);
                pstid.executeUpdate();

                String auxid = "" + id;
                PreparedStatement pst = cn.prepareStatement("update ofrece set fecha='" + fechaLlegada + "' "
                        + "WHERE idReservacion=" + auxid);

                pst.executeUpdate();
            } catch (SQLException ex) {
                Logger.getLogger(VentanaReserva.class.getName()).log(Level.SEVERE, null, ex);
            }

            //insertamos el segurodeViajero, la llave primaria
            try {
                PreparedStatement pstcomp = cn.prepareStatement("INSERT INTO seguroViajero(idCliente) VALUES (?)");
                pstcomp.setInt(1, id);
                pstcomp.executeUpdate();

                String aux = TXF_NUMPERSONAS.getText();
                int numPersonas = Integer.parseInt(aux);
                String tipo = "";
                int costo = 0;
                if (numPersonas == 1) {
                    tipo = "Individual";
                    costo = 150;
                }

                if (numPersonas == 2) {
                    tipo = "Pareja";
                    costo = 250;
                }

                if (numPersonas == 3) {
                    tipo = "Familiar";
                    costo = 400;
                }

                String auxCosto = "" + costo;

                String auxid = "" + id;
                PreparedStatement pst = cn.prepareStatement("update seguroViajero set tipo='" + tipo + "'"
                        + ",costo=" + auxCosto + " WHERE idCliente=" + auxid);

                pst.executeUpdate();
            } catch (SQLException ex) {
                Logger.getLogger(VentanaReserva.class.getName()).log(Level.SEVERE, null, ex);
            }

            //llenamos el atributo de plaza
            try {

                String plaza2 = TXF_NUMPERSONAS.getText();
                //int numero = Integer.parseInt(plaza);
                String use = "";
                String sql = "update ofrece set plaza=" + plaza2 + " where "
                        + "idReservacion=" + id;
                PreparedStatement psta = cn.prepareStatement(sql);
                psta.executeUpdate();

            } catch (SQLException ex) {
                Logger.getLogger(VentanaReserva.class.getName()).log(Level.SEVERE, null, ex);
            }

            //Siguiente formulario
            Hoteles ho1 = new Hoteles();
            ho1.setVisible(true);

            this.dispose();
            Connection cn;
            Conectar con = new Conectar();
            cn = con.conectar();

            String auxfLmes = "" + fLmes;
            if (cn != null) {
                Hoteles.TXF_LUGAR_AMRESORTS.setText(COMBO_DESTINOS.getSelectedItem().toString());
                Hoteles.TXT_LUGAR_RIU.setText(COMBO_DESTINOS.getSelectedItem().toString());
                Hoteles.TXT_MES.setText(auxfLmes);
                Hoteles.TXT_NP.setText(TXF_NUMPERSONAS.getText());
                Hoteles.TXT_DIA.setText("" + diaT);
                ho1.mostrarDatos1();
                ho1.mostrarDatos2();
            } else {
                JOptionPane.showMessageDialog(null, "Error al conectar");
            }

            //para que sólo se ejecute el ciclo una vez
            fechaDespues = false;
        }


    }//GEN-LAST:event_BTN_BUSCARHOTELActionPerformed

    private void BTN_MEDIOTRANSPORTEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_MEDIOTRANSPORTEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BTN_MEDIOTRANSPORTEActionPerformed

    private void COMBO_DESTINOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_COMBO_DESTINOSActionPerformed

    }//GEN-LAST:event_COMBO_DESTINOSActionPerformed

    private void TXF_NUMPERSONASActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXF_NUMPERSONASActionPerformed


    }//GEN-LAST:event_TXF_NUMPERSONASActionPerformed

    private void LBL_CERRSESIONMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LBL_CERRSESIONMouseClicked
        // TODO add your handling code here:
        setVisible(false);
        newSession ns = new newSession();
        ns.setVisible(true);
    }//GEN-LAST:event_LBL_CERRSESIONMouseClicked

    private void TXT_NombreUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXT_NombreUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXT_NombreUserActionPerformed

    private void LBL_PERFILMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LBL_PERFILMouseClicked
        // TODO add your handling code here:
        System.out.println(email+" ESTO TIENE");
        System.out.println(pss+" ESTO TIENE-");
        System.out.println(TXT_email.getText() +" ESTO TIENE-");
        System.out.println(TXT_pss.getText() +" ESTO TIENE-");
        if (!(TXT_email.getText().equals("jTextField1") && TXT_pss.getText().equals("jTextField1"))) {
            System.out.println("NO ESTÁN VACIOS");
            Cliente user = new Cliente();
            user.setEmail(TXT_email.getText());
            user.setPassword(TXT_pss.getText());
            User_Profile prof = new User_Profile();
            prof.insertData(user, cn);
            prof.asignar();
            setVisible(false);
            prof.setVisible(true);
        }else
         {
             System.out.println("SI ESTÁN VACIOS");
            Cliente user = new Cliente();
            user.setEmail(email);
            user.setPassword(pss);
            User_Profile prof = new User_Profile();
            prof.insertData(user, cn);
            prof.asignar();
            setVisible(false);
            prof.setVisible(true);
        }


    }//GEN-LAST:event_LBL_PERFILMouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new VentanaReserva().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton BTN_BUSCARHOTEL;
    private javax.swing.JButton BTN_CERRAR;
    private javax.swing.JButton BTN_MEDIOTRANSPORTE;
    public com.toedter.calendar.JDateChooser CALENDARIO_LLEGADA;
    public com.toedter.calendar.JDateChooser CALENDARIO_SALIDA;
    public javax.swing.JComboBox COMBO_DESTINOS;
    private javax.swing.JLabel LBL_CERRSESION;
    private javax.swing.JLabel LBL_CUADRO_RESERVA;
    public javax.swing.JLabel LBL_FOTOS_PRINCIPAL;
    private javax.swing.JLabel LBL_ICONO_LOGO;
    private javax.swing.JLabel LBL_ICONO_PERFIL;
    private javax.swing.JLabel LBL_ICONO_TEL;
    private javax.swing.JLabel LBL_PANEL;
    private javax.swing.JLabel LBL_PERFIL;
    private javax.swing.JLabel LBL_TELEFONO_AGENCIA;
    private javax.swing.JLabel LBL_TEXTO;
    private javax.swing.JLabel LBL_TEXTO2;
    private javax.swing.JLabel LBL_TEXTO3;
    private javax.swing.JLabel LBL_TEXTO4;
    private javax.swing.JTextField TXF_NUMPERSONAS;
    public javax.swing.JTextField TXT_Card;
    public javax.swing.JTextField TXT_NombreUser;
    public javax.swing.JTextField TXT_apMat;
    public javax.swing.JTextField TXT_apPat;
    public javax.swing.JTextField TXT_cvv;
    public javax.swing.JTextField TXT_email;
    public javax.swing.JTextField TXT_pss;
    // End of variables declaration//GEN-END:variables

    private void conectar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    Conectar co = new Conectar();
    Connection cn = co.conectar();

    public void galeriaHome() {
        // PARA QUE LAS IMÁGENES SE CAMBIEN CADA CIERTO TIEMPO
        int velocidad = 2;
        Timer timer;
        TimerTask tarea;
        int velmil = velocidad * 1000;

        tarea = new TimerTask() {
            int contador = 0;

            @Override
            public void run() {
                Icon icono;
                switch (contador) //Para cambiar la imagen controlar con el contador
                {
                    case 0: //PRIMERA IMAGEN
                        contador = 1;
                        icono = new ImageIcon(getClass().getResource("/Iconos/Cancun.png"));
                        LBL_FOTOS_PRINCIPAL.setIcon(icono);
                        break;
                    case 1: //SEGUNDA IMAGEN
                        contador = 2;
                        icono = new ImageIcon(getClass().getResource("/Iconos/Taxco.png"));
                        LBL_FOTOS_PRINCIPAL.setIcon(icono);
                        break;
                    case 2: //TERCERA IMGEN
                        contador = 3;
                        icono = new ImageIcon(getClass().getResource("/Iconos/chichen-itza-tour01.png"));
                        LBL_FOTOS_PRINCIPAL.setIcon(icono);
                        break;
                    case 3: //CUARTA IMAGEN
                        contador = 4;
                        icono = new ImageIcon(getClass().getResource("/Iconos/cidade-de-cancun-1.png"));
                        LBL_FOTOS_PRINCIPAL.setIcon(icono);
                        break;
                    case 4: //QUINTA IMAGEN
                        contador = 5;
                        icono = new ImageIcon(getClass().getResource("/Iconos/m_10932_Palacio de Bellas Artes.png"));
                        LBL_FOTOS_PRINCIPAL.setIcon(icono);
                        break;
                    case 5: //SEXTA IMAGEN
                        contador = 6;
                        icono = new ImageIcon(getClass().getResource("/Iconos/revolucion.png"));
                        LBL_FOTOS_PRINCIPAL.setIcon(icono);
                        break;
                    case 6: //SÉPTIMA IMAGEN
                        contador = 7;
                        icono = new ImageIcon(getClass().getResource("/Iconos/zacatlan.png"));
                        LBL_FOTOS_PRINCIPAL.setIcon(icono);
                        break;
                    case 7: //OCTAVA IMAGEN
                        contador = 8;
                        icono = new ImageIcon(getClass().getResource("/Iconos/zacatecas.png"));
                        LBL_FOTOS_PRINCIPAL.setIcon(icono);
                        break;
                    case 8: //NOVENA IMAGEN
                        contador = 9;
                        icono = new ImageIcon(getClass().getResource("/Iconos/vallebravo.png"));
                        LBL_FOTOS_PRINCIPAL.setIcon(icono);
                        break;
                    case 9: //DÉCIMA IMAGEN
                        contador = 10;
                        icono = new ImageIcon(getClass().getResource("/Iconos/sinaloa.png"));
                        LBL_FOTOS_PRINCIPAL.setIcon(icono);
                        break;
                    case 10: //IMAGEN 11
                        contador = 11;
                        icono = new ImageIcon(getClass().getResource("/Iconos/guanajuato.png"));
                        LBL_FOTOS_PRINCIPAL.setIcon(icono);
                        break;
                    case 11: //IMAGEN 12
                        contador = 12;
                        icono = new ImageIcon(getClass().getResource("/Iconos/aca.png"));
                        LBL_FOTOS_PRINCIPAL.setIcon(icono);
                        break;
                    case 12: //IMAGEN 13
                        contador = 13;
                        icono = new ImageIcon(getClass().getResource("/Iconos/colima.png"));
                        LBL_FOTOS_PRINCIPAL.setIcon(icono);
                        break;
                    case 13: //IMAGEN 14
                        contador = 14;
                        icono = new ImageIcon(getClass().getResource("/Iconos/coahuila.png"));
                        LBL_FOTOS_PRINCIPAL.setIcon(icono);
                        break;
                    case 14: //IMAGEN 15
                        contador = 0;
                        icono = new ImageIcon(getClass().getResource("/Iconos/aguascalientes.png"));
                        LBL_FOTOS_PRINCIPAL.setIcon(icono);
                        break;
                }
            }
        };

        timer = new Timer();
        timer.scheduleAtFixedRate(tarea, velmil, velmil);
    }

    public void getDataProfile(Cliente user, Connection conexion) {
        String idProfile = "";
        String getID = "SELECT idCliente FROM emailCliente WHERE email like '" + user.getEmail()
                + "' AND contraseña like '" + user.getPassword() + "'";

        try {
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery(getID);
            while (rs.next()) {
                idProfile = rs.getString("idCliente");
            }
            System.out.println(idProfile);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        String getDataProfile = "SELECT nombre,apPaterno, apMaterno FROM Cliente WHERE idCliente =" + idProfile;
        String getEmailDataProfile = "SELECT email,contraseña FROM emailcliente WHERE idCliente=" + idProfile;
        String getCardProfile = "SELECT numTarjeta,CVV,tipo,fechaVencimiento FROM Tarjeta WHERE"
                + "idCliente =" + idProfile;

        try {
            Statement st = conexion.createStatement();
            Statement st2 = conexion.createStatement();
            Statement st3 = conexion.createStatement();
            ResultSet rs = st.executeQuery(getDataProfile);
            ResultSet rs2 = st2.executeQuery(getEmailDataProfile);
            ResultSet rs3 = st3.executeQuery(getCardProfile);

            while (rs.next() && rs2.next() && rs3.next()) {
                nombre = rs.getString(1);
                apPat = rs.getString(2);
                apMat = rs.getString(3);
                email = rs2.getString(1);
                pss = rs2.getString(2);
                numTarjeta = rs3.getString(1);
                CVV = rs3.getString(2);
            }

            System.out.println(nombre);
            System.out.println(apPat);
            System.out.println(apMat);
            System.out.println(email);
            System.out.println(pss);

        } catch (SQLException e) {
        }
    }

    public void asignaProf() {
        String correo = TXT_email.getText();
        System.out.println(correo);
        String pss = TXT_pss.getText();
        System.out.println(pss);
        Cliente profile = new Cliente();
        profile.setEmail(correo);
        profile.setPassword(pss);
        getDataProfile(profile, cn);
    }

}
