
package reserva;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import static reserva.Hoteles.TXF_LUGAR_AMRESORTS;
import static reserva.Hoteles.TXF_PRECIO_TEMPBAJA_RIU;
import static reserva.Hoteles.TXT_DIA;
import static reserva.Hoteles.TXT_MES;
import static reserva.Hoteles.TXT_NP;


public class Hoteles3 extends javax.swing.JFrame {
             
    public Hoteles3() 
    {
        initComponents();
        setLocationRelativeTo(null);
    }
void mostrarDatos5()
    {
        String agencia = "FIESTA AMERICANA";
        String lugar = TXF_LUGAR_FIESTAAMERICANA.getText();
        String completo = agencia +" "+ lugar;
        String datos;      
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery("select costo from hotelregion where nombre like '%"+completo+"%'");
            while(rs.next())
            {
                datos= rs.getString("costo");
                TXF_PRECIO_TEMPBAJA_FIESTAAMERICANA.setText(datos);
                //CALCULANDO INCREMENTO
                String sinEspacios = ( TXF_PRECIO_TEMPBAJA_FIESTAAMERICANA.getText()).trim();
                int numero = Integer.parseInt(sinEspacios);
                int precioIncre = numero + (int)(numero *.20);
                String nuevoPrecio = String.valueOf(precioIncre);
                TXF_PRECIO_TEMPALTA_FIESTAAMERICANA.setText(nuevoPrecio);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Hoteles.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LBL_TITULO_FIESTAAMERICANA = new javax.swing.JLabel();
        LBL_TITULO_CATEG_FIESTAAMERICANA = new javax.swing.JLabel();
        LBL_TITULO_LUGAR_FIESTAAMERICANA = new javax.swing.JLabel();
        LBL_5ESTRELLAS_FIESTAAMERICANA = new javax.swing.JLabel();
        LBL_TITULO_HOTELES4 = new javax.swing.JLabel();
        LBL_TITULO_PRECIOS_FIESTAAMERICANA = new javax.swing.JLabel();
        LBL_TITULO_TEMPALTA_FIESTAAMERICANA = new javax.swing.JLabel();
        LBL_TITULO_TEMPBAJA_FIESTAAMERICANA = new javax.swing.JLabel();
        LBL_SIGNO_PESOS_FIESTAAMERICANA2 = new javax.swing.JLabel();
        LBL_SIGNO_PESOS_FIESTAAMERICANA = new javax.swing.JLabel();
        LBL_MXN_FIESTAAMERICANA = new javax.swing.JLabel();
        LBL_MXN_FIESTAAMERICANA2 = new javax.swing.JLabel();
        TXF_LUGAR_FIESTAAMERICANA = new javax.swing.JTextField();
        LBL_FOTO_FIESTAAMERICANA = new javax.swing.JLabel();
        TXF_PRECIO_TEMPALTA_FIESTAAMERICANA = new javax.swing.JTextField();
        BTN_OBTENER_PAQ_FIESTAAMERICANA = new javax.swing.JButton();
        LBL_REGRESAR_4 = new javax.swing.JButton();
        TXF_PRECIO_TEMPBAJA_FIESTAAMERICANA = new javax.swing.JTextField();
        LBL_PANEL4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LBL_TITULO_FIESTAAMERICANA.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        LBL_TITULO_FIESTAAMERICANA.setForeground(new java.awt.Color(255, 255, 0));
        LBL_TITULO_FIESTAAMERICANA.setText("FIESTA AMERICANA");
        getContentPane().add(LBL_TITULO_FIESTAAMERICANA, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 210, 170, 30));

        LBL_TITULO_CATEG_FIESTAAMERICANA.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        LBL_TITULO_CATEG_FIESTAAMERICANA.setForeground(new java.awt.Color(255, 255, 255));
        LBL_TITULO_CATEG_FIESTAAMERICANA.setText("Categoría :");
        getContentPane().add(LBL_TITULO_CATEG_FIESTAAMERICANA, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 250, -1, 30));

        LBL_TITULO_LUGAR_FIESTAAMERICANA.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        LBL_TITULO_LUGAR_FIESTAAMERICANA.setForeground(new java.awt.Color(255, 255, 255));
        LBL_TITULO_LUGAR_FIESTAAMERICANA.setText("Lugar :");
        getContentPane().add(LBL_TITULO_LUGAR_FIESTAAMERICANA, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 300, -1, 30));

        LBL_5ESTRELLAS_FIESTAAMERICANA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva/5_estrellas.png"))); // NOI18N
        getContentPane().add(LBL_5ESTRELLAS_FIESTAAMERICANA, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 260, -1, -1));

        LBL_TITULO_HOTELES4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        LBL_TITULO_HOTELES4.setForeground(new java.awt.Color(255, 255, 255));
        LBL_TITULO_HOTELES4.setText("H  O  T  E  L  E  S");
        getContentPane().add(LBL_TITULO_HOTELES4, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 50, 180, 30));

        LBL_TITULO_PRECIOS_FIESTAAMERICANA.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        LBL_TITULO_PRECIOS_FIESTAAMERICANA.setForeground(new java.awt.Color(255, 153, 0));
        LBL_TITULO_PRECIOS_FIESTAAMERICANA.setText("Precio por noche :");
        getContentPane().add(LBL_TITULO_PRECIOS_FIESTAAMERICANA, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 220, -1, -1));

        LBL_TITULO_TEMPALTA_FIESTAAMERICANA.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        LBL_TITULO_TEMPALTA_FIESTAAMERICANA.setForeground(new java.awt.Color(255, 255, 255));
        LBL_TITULO_TEMPALTA_FIESTAAMERICANA.setText("Temporada alta :");
        getContentPane().add(LBL_TITULO_TEMPALTA_FIESTAAMERICANA, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 260, -1, -1));

        LBL_TITULO_TEMPBAJA_FIESTAAMERICANA.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        LBL_TITULO_TEMPBAJA_FIESTAAMERICANA.setForeground(new java.awt.Color(255, 255, 255));
        LBL_TITULO_TEMPBAJA_FIESTAAMERICANA.setText("Temporada baja :");
        getContentPane().add(LBL_TITULO_TEMPBAJA_FIESTAAMERICANA, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 300, -1, -1));

        LBL_SIGNO_PESOS_FIESTAAMERICANA2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        LBL_SIGNO_PESOS_FIESTAAMERICANA2.setForeground(new java.awt.Color(255, 255, 255));
        LBL_SIGNO_PESOS_FIESTAAMERICANA2.setText("$");
        getContentPane().add(LBL_SIGNO_PESOS_FIESTAAMERICANA2, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 300, -1, -1));

        LBL_SIGNO_PESOS_FIESTAAMERICANA.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        LBL_SIGNO_PESOS_FIESTAAMERICANA.setForeground(new java.awt.Color(255, 255, 255));
        LBL_SIGNO_PESOS_FIESTAAMERICANA.setText("$");
        getContentPane().add(LBL_SIGNO_PESOS_FIESTAAMERICANA, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 260, -1, -1));

        LBL_MXN_FIESTAAMERICANA.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        LBL_MXN_FIESTAAMERICANA.setForeground(new java.awt.Color(255, 255, 51));
        LBL_MXN_FIESTAAMERICANA.setText("MXN");
        getContentPane().add(LBL_MXN_FIESTAAMERICANA, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 260, -1, -1));

        LBL_MXN_FIESTAAMERICANA2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        LBL_MXN_FIESTAAMERICANA2.setForeground(new java.awt.Color(255, 255, 51));
        LBL_MXN_FIESTAAMERICANA2.setText("MXN");
        getContentPane().add(LBL_MXN_FIESTAAMERICANA2, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 300, -1, -1));

        TXF_LUGAR_FIESTAAMERICANA.setEditable(false);
        TXF_LUGAR_FIESTAAMERICANA.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        TXF_LUGAR_FIESTAAMERICANA.setForeground(new java.awt.Color(204, 0, 0));
        TXF_LUGAR_FIESTAAMERICANA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXF_LUGAR_FIESTAAMERICANAActionPerformed(evt);
            }
        });
        getContentPane().add(TXF_LUGAR_FIESTAAMERICANA, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 300, 120, 30));

        LBL_FOTO_FIESTAAMERICANA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva/FA.png"))); // NOI18N
        getContentPane().add(LBL_FOTO_FIESTAAMERICANA, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, 220, 170));

        TXF_PRECIO_TEMPALTA_FIESTAAMERICANA.setEditable(false);
        TXF_PRECIO_TEMPALTA_FIESTAAMERICANA.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        TXF_PRECIO_TEMPALTA_FIESTAAMERICANA.setToolTipText("Incremento de 20%");
        getContentPane().add(TXF_PRECIO_TEMPALTA_FIESTAAMERICANA, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 260, 70, -1));

        BTN_OBTENER_PAQ_FIESTAAMERICANA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva/obtenerPaquete.png"))); // NOI18N
        BTN_OBTENER_PAQ_FIESTAAMERICANA.setToolTipText("¡Quiero ver detalles!");
        BTN_OBTENER_PAQ_FIESTAAMERICANA.setBorderPainted(false);
        BTN_OBTENER_PAQ_FIESTAAMERICANA.setContentAreaFilled(false);
        BTN_OBTENER_PAQ_FIESTAAMERICANA.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BTN_OBTENER_PAQ_FIESTAAMERICANA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_OBTENER_PAQ_FIESTAAMERICANAActionPerformed(evt);
            }
        });
        getContentPane().add(BTN_OBTENER_PAQ_FIESTAAMERICANA, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 340, 120, 20));

        LBL_REGRESAR_4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva/volver.png"))); // NOI18N
        LBL_REGRESAR_4.setToolTipText("Regresar");
        LBL_REGRESAR_4.setBorderPainted(false);
        LBL_REGRESAR_4.setContentAreaFilled(false);
        LBL_REGRESAR_4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LBL_REGRESAR_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LBL_REGRESAR_4ActionPerformed(evt);
            }
        });
        getContentPane().add(LBL_REGRESAR_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 50, 30));

        TXF_PRECIO_TEMPBAJA_FIESTAAMERICANA.setEditable(false);
        TXF_PRECIO_TEMPBAJA_FIESTAAMERICANA.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        getContentPane().add(TXF_PRECIO_TEMPBAJA_FIESTAAMERICANA, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 300, 70, -1));

        LBL_PANEL4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva/fondoFHotel.png"))); // NOI18N
        getContentPane().add(LBL_PANEL4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LBL_REGRESAR_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LBL_REGRESAR_4ActionPerformed
        Hoteles2 j =new Hoteles2();
        j.setVisible(true);
        this.dispose();
         Hoteles2.TXF_LUGAR_SOLARIS.setText(TXF_LUGAR_FIESTAAMERICANA.getText());
         Hoteles2.TXF_LUGAR_EMPORIO.setText(TXF_LUGAR_FIESTAAMERICANA.getText());
         j.mostrarDatos3();
         j.mostrarDatos4();
    }//GEN-LAST:event_LBL_REGRESAR_4ActionPerformed

    private void TXF_LUGAR_FIESTAAMERICANAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXF_LUGAR_FIESTAAMERICANAActionPerformed
       VentanaReserva v = new VentanaReserva();
        v.setVisible(true);
    }//GEN-LAST:event_TXF_LUGAR_FIESTAAMERICANAActionPerformed

    private void BTN_OBTENER_PAQ_FIESTAAMERICANAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_OBTENER_PAQ_FIESTAAMERICANAActionPerformed
        Generador indice = new Generador();
        int id=indice.generedCode("ofrece");
        
        //para agregar la region del hotel
        String region = TXF_LUGAR_AMRESORTS.getText();
        String cadena = "FIESTA AMERICANA";
        Home19 H1 = new Home19();
        
        //con esto podemos agregar el costo si es tempAlta o Baja 
        String aux= TXT_MES.getText();
        int rpt = Integer.parseInt(aux);
        String aux2 = TXT_NP.getText();
        int plaza = Integer.parseInt(aux2);
        
        String aux3 = TXF_PRECIO_TEMPALTA_FIESTAAMERICANA.getText();
        int costoA = Integer.parseInt(aux3);
        
        String aux4 = TXF_PRECIO_TEMPBAJA_FIESTAAMERICANA.getText();
        int costoB = Integer.parseInt(aux4);
        
        //con esto controlamos los días que se van a hospedar
        String aux5 = TXT_DIA.getText();
        int diaT = Integer.parseInt(aux5);
        
        if(rpt==6 || rpt ==3 || rpt ==10 || rpt==11){
            if(plaza==1)
            H1.setCostoTempA(costoA*diaT);
            //se genera un descuento del 35%
            if(plaza==2)
            H1.setCostoTempA((int)(costoA*2*0.35*diaT));
            if(plaza==3)
            H1.setCostoTempA((int)(costoA*3*0.60*diaT));
        }else{    
            if(plaza==1)
            H1.setCostoTempB(costoB*diaT);
            if(plaza==2)
            H1.setCostoTempB((int)(costoB*2*0.35*diaT));
            if(plaza==3)
            H1.setCostoTempB((int)(costoB*3*0.60*diaT));
        }    
        
        //con esto podemos actualizar el registro de idHotel  
        String auxid=""+id;
            try {
                PreparedStatement pst;
                pst = cn.prepareStatement("update ofrece set idHotel=5 "
                        + "WHERE idReservacion="+auxid);
                pst.executeUpdate();
                

            } catch (SQLException ex) {
                Logger.getLogger(Hoteles.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        H1.setRegion(region);
        H1.setNameH(cadena);
        H1.setVisible(true);
        this.dispose();    
    }//GEN-LAST:event_BTN_OBTENER_PAQ_FIESTAAMERICANAActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Hoteles3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Hoteles3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Hoteles3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Hoteles3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Hoteles3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTN_OBTENER_PAQ_FIESTAAMERICANA;
    private javax.swing.JLabel LBL_5ESTRELLAS_FIESTAAMERICANA;
    private javax.swing.JLabel LBL_FOTO_FIESTAAMERICANA;
    private javax.swing.JLabel LBL_MXN_FIESTAAMERICANA;
    private javax.swing.JLabel LBL_MXN_FIESTAAMERICANA2;
    private javax.swing.JLabel LBL_PANEL4;
    private javax.swing.JButton LBL_REGRESAR_4;
    private javax.swing.JLabel LBL_SIGNO_PESOS_FIESTAAMERICANA;
    private javax.swing.JLabel LBL_SIGNO_PESOS_FIESTAAMERICANA2;
    private javax.swing.JLabel LBL_TITULO_CATEG_FIESTAAMERICANA;
    private javax.swing.JLabel LBL_TITULO_FIESTAAMERICANA;
    private javax.swing.JLabel LBL_TITULO_HOTELES4;
    private javax.swing.JLabel LBL_TITULO_LUGAR_FIESTAAMERICANA;
    private javax.swing.JLabel LBL_TITULO_PRECIOS_FIESTAAMERICANA;
    private javax.swing.JLabel LBL_TITULO_TEMPALTA_FIESTAAMERICANA;
    private javax.swing.JLabel LBL_TITULO_TEMPBAJA_FIESTAAMERICANA;
    public static javax.swing.JTextField TXF_LUGAR_FIESTAAMERICANA;
    private javax.swing.JTextField TXF_PRECIO_TEMPALTA_FIESTAAMERICANA;
    private javax.swing.JTextField TXF_PRECIO_TEMPBAJA_FIESTAAMERICANA;
    // End of variables declaration//GEN-END:variables
Conectar co = new Conectar();
Connection cn = co.conectar();
}
