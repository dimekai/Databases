
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



public class Hoteles2 extends javax.swing.JFrame {
            
    
    public Hoteles2() {
        initComponents();
        setLocationRelativeTo(null);
    }

   void mostrarDatos3()
    {
        String agencia = "EMPORIO";
        String lugar = TXF_LUGAR_EMPORIO.getText();
        String completo = agencia +" "+ lugar;
        String datos;      
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery("select costo from hotelregion where nombre like '%"+completo+"%'");
            while(rs.next())
            {
                datos= rs.getString("costo");
                TXF_PRECIO_TEMPBAJA_EMPORIO.setText(datos);
                //CALCULANDO INCREMENTO
                String sinEspacios = (TXF_PRECIO_TEMPBAJA_EMPORIO.getText()).trim();
                int numero = Integer.parseInt(sinEspacios);
                int precioIncre = numero + (int)(numero *.20);
                String nuevoPrecio = String.valueOf(precioIncre);
                TXF_PRECIO_TEMPALTA_EMPORIO.setText(nuevoPrecio);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Hoteles.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
   void mostrarDatos4()
    {
        String agencia = "SOLARIS";
        String lugar = TXF_LUGAR_EMPORIO.getText();
        String completo = agencia +" "+ lugar;
        String datos;      
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery("select costo from hotelregion where nombre like '%"+completo+"%'");
            while(rs.next())
            {
                datos= rs.getString("costo");
                TXF_PRECIO_TEMPBAJA_SOLARIS.setText(datos);
                //CALCULANDO INCREMENTO
                String sinEspacios = (TXF_PRECIO_TEMPBAJA_SOLARIS.getText()).trim();
                int numero = Integer.parseInt(sinEspacios);
                int precioIncre = numero + (int)(numero *.20);
                String nuevoPrecio = String.valueOf(precioIncre);
                TXF_PRECIO_TEMPALTA_SOLARIS.setText(nuevoPrecio);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Hoteles.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LBL_TITULO_HOTELES = new javax.swing.JLabel();
        LBL_TITULO_SOLARIS = new javax.swing.JLabel();
        LBL_TITULO_CATEG_EMPORIO = new javax.swing.JLabel();
        LBL_5ESTRELLAS_SOLARIS = new javax.swing.JLabel();
        LBL_TITULO_LUGAR_EMPORIO = new javax.swing.JLabel();
        LBL_TITULO_PRECIOS_EMPORIO = new javax.swing.JLabel();
        LBL_TITULO_TEMPALTA_EMPORIO = new javax.swing.JLabel();
        LBL_TITULO_TEMPBAJA_EMPORIO = new javax.swing.JLabel();
        LBL_SIGNO_PESOS_EMPORIO2 = new javax.swing.JLabel();
        LBL_SIGNO_PESOS_EMPORIO = new javax.swing.JLabel();
        LBL_MXN_EMPORIO = new javax.swing.JLabel();
        LBL_MXN_EMPORIO2 = new javax.swing.JLabel();
        LBL_MXN_SOLARIS = new javax.swing.JLabel();
        LBL_MXN_SOLARIS2 = new javax.swing.JLabel();
        LBL_TITULO_TEMPBAJA_SOLARIS = new javax.swing.JLabel();
        LBL_PRECIO_TEMPALTA_SOLARIS = new javax.swing.JLabel();
        LBL_SIGNO_PESOS_SOLARIS = new javax.swing.JLabel();
        LBL_SIGNO_PESOS_SOLARIS2 = new javax.swing.JLabel();
        LBL_TITULO_PRECIOS_SOLARIS = new javax.swing.JLabel();
        LBL_TITULO_CATEG_SOLARIS = new javax.swing.JLabel();
        LBL_TITULO_EMPORIO = new javax.swing.JLabel();
        LBL_5ESTRELLAS_EMPORIO = new javax.swing.JLabel();
        LBL_TITULO_LUGAR_SOLARIS = new javax.swing.JLabel();
        TXF_PRECIO_TEMPBAJA_EMPORIO = new javax.swing.JTextField();
        TXF_PRECIO_TEMPALTA_SOLARIS = new javax.swing.JTextField();
        TXF_PRECIO_TEMPBAJA_SOLARIS = new javax.swing.JTextField();
        BTN_OBTENER_PAQUETE_EMPORIO = new javax.swing.JButton();
        BTN_OBTENER_PAQ_SOLARIS = new javax.swing.JButton();
        LBL_FOTO_EMPORIO = new javax.swing.JLabel();
        LBL_FOTO_SOLARIS = new javax.swing.JLabel();
        TXF_LUGAR_EMPORIO = new javax.swing.JTextField();
        BTN_SIGUIENTE_VENT2 = new javax.swing.JButton();
        BTN_REGRESAR_HOTELES2 = new javax.swing.JButton();
        TXF_LUGAR_SOLARIS = new javax.swing.JTextField();
        TXF_PRECIO_TEMPALTA_EMPORIO = new javax.swing.JTextField();
        LBL_PANEL3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LBL_TITULO_HOTELES.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        LBL_TITULO_HOTELES.setForeground(new java.awt.Color(255, 255, 255));
        LBL_TITULO_HOTELES.setText("H  O  T  E  L  E  S");
        getContentPane().add(LBL_TITULO_HOTELES, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 50, 180, 30));

        LBL_TITULO_SOLARIS.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        LBL_TITULO_SOLARIS.setForeground(new java.awt.Color(0, 255, 255));
        LBL_TITULO_SOLARIS.setText("SOLARIS");
        getContentPane().add(LBL_TITULO_SOLARIS, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 370, 120, 30));

        LBL_TITULO_CATEG_EMPORIO.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        LBL_TITULO_CATEG_EMPORIO.setForeground(new java.awt.Color(255, 255, 255));
        LBL_TITULO_CATEG_EMPORIO.setText("Categoría :");
        getContentPane().add(LBL_TITULO_CATEG_EMPORIO, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 200, -1, 30));

        LBL_5ESTRELLAS_SOLARIS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva/5_estrellas.png"))); // NOI18N
        getContentPane().add(LBL_5ESTRELLAS_SOLARIS, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 420, -1, -1));

        LBL_TITULO_LUGAR_EMPORIO.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        LBL_TITULO_LUGAR_EMPORIO.setForeground(new java.awt.Color(255, 255, 255));
        LBL_TITULO_LUGAR_EMPORIO.setText("Lugar :");
        getContentPane().add(LBL_TITULO_LUGAR_EMPORIO, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 247, -1, 30));

        LBL_TITULO_PRECIOS_EMPORIO.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        LBL_TITULO_PRECIOS_EMPORIO.setForeground(new java.awt.Color(255, 153, 0));
        LBL_TITULO_PRECIOS_EMPORIO.setText("Precio por noche :");
        getContentPane().add(LBL_TITULO_PRECIOS_EMPORIO, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 180, -1, -1));

        LBL_TITULO_TEMPALTA_EMPORIO.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        LBL_TITULO_TEMPALTA_EMPORIO.setForeground(new java.awt.Color(255, 255, 255));
        LBL_TITULO_TEMPALTA_EMPORIO.setText("Temporada alta :");
        getContentPane().add(LBL_TITULO_TEMPALTA_EMPORIO, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 210, -1, -1));

        LBL_TITULO_TEMPBAJA_EMPORIO.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        LBL_TITULO_TEMPBAJA_EMPORIO.setForeground(new java.awt.Color(255, 255, 255));
        LBL_TITULO_TEMPBAJA_EMPORIO.setText("Temporada baja :");
        getContentPane().add(LBL_TITULO_TEMPBAJA_EMPORIO, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 240, -1, -1));

        LBL_SIGNO_PESOS_EMPORIO2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        LBL_SIGNO_PESOS_EMPORIO2.setForeground(new java.awt.Color(255, 255, 255));
        LBL_SIGNO_PESOS_EMPORIO2.setText("$");
        getContentPane().add(LBL_SIGNO_PESOS_EMPORIO2, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 240, -1, -1));

        LBL_SIGNO_PESOS_EMPORIO.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        LBL_SIGNO_PESOS_EMPORIO.setForeground(new java.awt.Color(255, 255, 255));
        LBL_SIGNO_PESOS_EMPORIO.setText("$");
        getContentPane().add(LBL_SIGNO_PESOS_EMPORIO, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 210, -1, -1));

        LBL_MXN_EMPORIO.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        LBL_MXN_EMPORIO.setForeground(new java.awt.Color(255, 255, 51));
        LBL_MXN_EMPORIO.setText("MXN");
        getContentPane().add(LBL_MXN_EMPORIO, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 210, -1, -1));

        LBL_MXN_EMPORIO2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        LBL_MXN_EMPORIO2.setForeground(new java.awt.Color(255, 255, 51));
        LBL_MXN_EMPORIO2.setText("MXN");
        getContentPane().add(LBL_MXN_EMPORIO2, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 240, -1, -1));

        LBL_MXN_SOLARIS.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        LBL_MXN_SOLARIS.setForeground(new java.awt.Color(255, 255, 51));
        LBL_MXN_SOLARIS.setText("MXN");
        getContentPane().add(LBL_MXN_SOLARIS, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 430, -1, -1));

        LBL_MXN_SOLARIS2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        LBL_MXN_SOLARIS2.setForeground(new java.awt.Color(255, 255, 51));
        LBL_MXN_SOLARIS2.setText("MXN");
        getContentPane().add(LBL_MXN_SOLARIS2, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 470, -1, -1));

        LBL_TITULO_TEMPBAJA_SOLARIS.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        LBL_TITULO_TEMPBAJA_SOLARIS.setForeground(new java.awt.Color(255, 255, 255));
        LBL_TITULO_TEMPBAJA_SOLARIS.setText("Temporada baja :");
        getContentPane().add(LBL_TITULO_TEMPBAJA_SOLARIS, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 470, -1, -1));

        LBL_PRECIO_TEMPALTA_SOLARIS.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        LBL_PRECIO_TEMPALTA_SOLARIS.setForeground(new java.awt.Color(255, 255, 255));
        LBL_PRECIO_TEMPALTA_SOLARIS.setText("Temporada alta :");
        getContentPane().add(LBL_PRECIO_TEMPALTA_SOLARIS, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 430, -1, -1));

        LBL_SIGNO_PESOS_SOLARIS.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        LBL_SIGNO_PESOS_SOLARIS.setForeground(new java.awt.Color(255, 255, 255));
        LBL_SIGNO_PESOS_SOLARIS.setText("$");
        getContentPane().add(LBL_SIGNO_PESOS_SOLARIS, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 430, -1, -1));

        LBL_SIGNO_PESOS_SOLARIS2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        LBL_SIGNO_PESOS_SOLARIS2.setForeground(new java.awt.Color(255, 255, 255));
        LBL_SIGNO_PESOS_SOLARIS2.setText("$");
        getContentPane().add(LBL_SIGNO_PESOS_SOLARIS2, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 470, 10, -1));

        LBL_TITULO_PRECIOS_SOLARIS.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        LBL_TITULO_PRECIOS_SOLARIS.setForeground(new java.awt.Color(255, 153, 0));
        LBL_TITULO_PRECIOS_SOLARIS.setText("Precio por noche :");
        getContentPane().add(LBL_TITULO_PRECIOS_SOLARIS, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 390, -1, -1));

        LBL_TITULO_CATEG_SOLARIS.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        LBL_TITULO_CATEG_SOLARIS.setForeground(new java.awt.Color(255, 255, 255));
        LBL_TITULO_CATEG_SOLARIS.setText("Categoría :");
        getContentPane().add(LBL_TITULO_CATEG_SOLARIS, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 410, -1, 30));

        LBL_TITULO_EMPORIO.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        LBL_TITULO_EMPORIO.setForeground(new java.awt.Color(0, 255, 255));
        LBL_TITULO_EMPORIO.setText("EMPORIO");
        getContentPane().add(LBL_TITULO_EMPORIO, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 160, 120, 30));

        LBL_5ESTRELLAS_EMPORIO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva/5_estrellas.png"))); // NOI18N
        getContentPane().add(LBL_5ESTRELLAS_EMPORIO, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 210, -1, -1));

        LBL_TITULO_LUGAR_SOLARIS.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        LBL_TITULO_LUGAR_SOLARIS.setForeground(new java.awt.Color(255, 255, 255));
        LBL_TITULO_LUGAR_SOLARIS.setText("Lugar :");
        getContentPane().add(LBL_TITULO_LUGAR_SOLARIS, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 450, -1, 30));

        TXF_PRECIO_TEMPBAJA_EMPORIO.setEditable(false);
        TXF_PRECIO_TEMPBAJA_EMPORIO.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        getContentPane().add(TXF_PRECIO_TEMPBAJA_EMPORIO, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 240, 50, -1));

        TXF_PRECIO_TEMPALTA_SOLARIS.setEditable(false);
        TXF_PRECIO_TEMPALTA_SOLARIS.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        TXF_PRECIO_TEMPALTA_SOLARIS.setToolTipText("Incremento de 20%");
        getContentPane().add(TXF_PRECIO_TEMPALTA_SOLARIS, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 430, 50, -1));

        TXF_PRECIO_TEMPBAJA_SOLARIS.setEditable(false);
        TXF_PRECIO_TEMPBAJA_SOLARIS.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        getContentPane().add(TXF_PRECIO_TEMPBAJA_SOLARIS, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 470, 50, -1));

        BTN_OBTENER_PAQUETE_EMPORIO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva/obtenerPaquete.png"))); // NOI18N
        BTN_OBTENER_PAQUETE_EMPORIO.setToolTipText("¡Quiero ver detalles!");
        BTN_OBTENER_PAQUETE_EMPORIO.setBorderPainted(false);
        BTN_OBTENER_PAQUETE_EMPORIO.setContentAreaFilled(false);
        BTN_OBTENER_PAQUETE_EMPORIO.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BTN_OBTENER_PAQUETE_EMPORIO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_OBTENER_PAQUETE_EMPORIOActionPerformed(evt);
            }
        });
        getContentPane().add(BTN_OBTENER_PAQUETE_EMPORIO, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 280, 140, 20));

        BTN_OBTENER_PAQ_SOLARIS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva/obtenerPaquete.png"))); // NOI18N
        BTN_OBTENER_PAQ_SOLARIS.setToolTipText("¡Quiero ver detalles!");
        BTN_OBTENER_PAQ_SOLARIS.setBorderPainted(false);
        BTN_OBTENER_PAQ_SOLARIS.setContentAreaFilled(false);
        BTN_OBTENER_PAQ_SOLARIS.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BTN_OBTENER_PAQ_SOLARIS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_OBTENER_PAQ_SOLARISActionPerformed(evt);
            }
        });
        getContentPane().add(BTN_OBTENER_PAQ_SOLARIS, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 510, 140, 20));

        LBL_FOTO_EMPORIO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva/Emporio.png"))); // NOI18N
        getContentPane().add(LBL_FOTO_EMPORIO, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, 220, 150));

        LBL_FOTO_SOLARIS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva/solaris.png"))); // NOI18N
        getContentPane().add(LBL_FOTO_SOLARIS, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 380, 220, 140));

        TXF_LUGAR_EMPORIO.setEditable(false);
        TXF_LUGAR_EMPORIO.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        TXF_LUGAR_EMPORIO.setForeground(new java.awt.Color(204, 0, 0));
        TXF_LUGAR_EMPORIO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXF_LUGAR_EMPORIOActionPerformed(evt);
            }
        });
        getContentPane().add(TXF_LUGAR_EMPORIO, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 250, 130, 30));

        BTN_SIGUIENTE_VENT2.setToolTipText("¡Ver más hoteles!");
        BTN_SIGUIENTE_VENT2.setBorderPainted(false);
        BTN_SIGUIENTE_VENT2.setContentAreaFilled(false);
        BTN_SIGUIENTE_VENT2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BTN_SIGUIENTE_VENT2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_SIGUIENTE_VENT2ActionPerformed(evt);
            }
        });
        getContentPane().add(BTN_SIGUIENTE_VENT2, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 290, 60, 70));

        BTN_REGRESAR_HOTELES2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva/volver.png"))); // NOI18N
        BTN_REGRESAR_HOTELES2.setToolTipText("Regresar");
        BTN_REGRESAR_HOTELES2.setBorderPainted(false);
        BTN_REGRESAR_HOTELES2.setContentAreaFilled(false);
        BTN_REGRESAR_HOTELES2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BTN_REGRESAR_HOTELES2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_REGRESAR_HOTELES2ActionPerformed(evt);
            }
        });
        getContentPane().add(BTN_REGRESAR_HOTELES2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 40, 30));

        TXF_LUGAR_SOLARIS.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        TXF_LUGAR_SOLARIS.setForeground(new java.awt.Color(204, 0, 0));
        TXF_LUGAR_SOLARIS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXF_LUGAR_SOLARISActionPerformed(evt);
            }
        });
        getContentPane().add(TXF_LUGAR_SOLARIS, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 450, 130, 30));

        TXF_PRECIO_TEMPALTA_EMPORIO.setEditable(false);
        TXF_PRECIO_TEMPALTA_EMPORIO.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        TXF_PRECIO_TEMPALTA_EMPORIO.setToolTipText("Incremento de 20%");
        getContentPane().add(TXF_PRECIO_TEMPALTA_EMPORIO, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 210, 50, -1));

        LBL_PANEL3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva/fondoHoteles.png"))); // NOI18N
        getContentPane().add(LBL_PANEL3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 970, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTN_REGRESAR_HOTELES2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_REGRESAR_HOTELES2ActionPerformed
        Hoteles h = new Hoteles();
        h.setVisible(true);
        this.dispose();
        Hoteles.TXF_LUGAR_AMRESORTS.setText(TXF_LUGAR_SOLARIS.getText());
        Hoteles.TXT_LUGAR_RIU.setText(TXF_LUGAR_SOLARIS.getText());
        
        h.mostrarDatos1();
        h.mostrarDatos2();
    }//GEN-LAST:event_BTN_REGRESAR_HOTELES2ActionPerformed

    private void BTN_SIGUIENTE_VENT2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_SIGUIENTE_VENT2ActionPerformed
        Hoteles3 r = new Hoteles3();
        r.setVisible(true);
        this.dispose();
        Hoteles3.TXF_LUGAR_FIESTAAMERICANA.setText(TXF_LUGAR_SOLARIS.getText());
        r.mostrarDatos5();       
    }//GEN-LAST:event_BTN_SIGUIENTE_VENT2ActionPerformed

    private void TXF_LUGAR_EMPORIOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXF_LUGAR_EMPORIOActionPerformed
        VentanaReserva v = new VentanaReserva();
        v.setVisible(true);
    }//GEN-LAST:event_TXF_LUGAR_EMPORIOActionPerformed

    private void TXF_LUGAR_SOLARISActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXF_LUGAR_SOLARISActionPerformed
        VentanaReserva v = new VentanaReserva();
        v.setVisible(true);
    }//GEN-LAST:event_TXF_LUGAR_SOLARISActionPerformed

    private void BTN_OBTENER_PAQUETE_EMPORIOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_OBTENER_PAQUETE_EMPORIOActionPerformed
        Generador indice = new Generador();
        int id=indice.generedCode("ofrece");
        
        //para agregar la region del hotel
        String region = TXF_LUGAR_AMRESORTS.getText();
        String cadena = "EMPORIO";
        Home19 H1 = new Home19();
        H1.setNameH(cadena);
        
        //con esto podemos agregar el costo si es tempAlta o Baja 
        String aux= TXT_MES.getText();
        int rpt = Integer.parseInt(aux);
        String aux2 = TXT_NP.getText();
        int plaza = Integer.parseInt(aux2);
        
        String aux3 = TXF_PRECIO_TEMPALTA_EMPORIO.getText();
        int costoA = Integer.parseInt(aux3);
        
        String aux4 = TXF_PRECIO_TEMPBAJA_EMPORIO.getText();
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
                pst = cn.prepareStatement("update ofrece set idHotel=3 "
                        + "WHERE idReservacion="+auxid);
                pst.executeUpdate();

            } catch (SQLException ex) {
                Logger.getLogger(Hoteles.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        H1.setRegion(region);
        H1.setVisible(true);    
        this.dispose();
    }//GEN-LAST:event_BTN_OBTENER_PAQUETE_EMPORIOActionPerformed

    private void BTN_OBTENER_PAQ_SOLARISActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_OBTENER_PAQ_SOLARISActionPerformed
        Generador indice = new Generador();
        int id=indice.generedCode("ofrece");
        
        //para agregar la region del hotel
        String region = TXF_LUGAR_AMRESORTS.getText();
        String cadena = "SOLARIS";
        Home19 H1 = new Home19();
        H1.setNameH(cadena);
        
        
        //con esto podemos agregar el costo si es tempAlta o Baja 
        String aux= TXT_MES.getText();
        int rpt = Integer.parseInt(aux);
        String aux2 = TXT_NP.getText();
        int plaza = Integer.parseInt(aux2);
        
        String aux3 = TXF_PRECIO_TEMPALTA_SOLARIS.getText();
        int costoA = Integer.parseInt(aux3);
        
        String aux4 = TXF_PRECIO_TEMPBAJA_SOLARIS.getText();
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
                pst = cn.prepareStatement("update ofrece set idHotel=4 "
                        + "WHERE idReservacion="+auxid);
                pst.executeUpdate();

            } catch (SQLException ex) {
                Logger.getLogger(Hoteles.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        H1.setRegion(region);
        H1.setVisible(true);    
        this.dispose();
    }//GEN-LAST:event_BTN_OBTENER_PAQ_SOLARISActionPerformed

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
            java.util.logging.Logger.getLogger(Hoteles2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Hoteles2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Hoteles2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Hoteles2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Hoteles2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTN_OBTENER_PAQUETE_EMPORIO;
    private javax.swing.JButton BTN_OBTENER_PAQ_SOLARIS;
    private javax.swing.JButton BTN_REGRESAR_HOTELES2;
    private javax.swing.JButton BTN_SIGUIENTE_VENT2;
    private javax.swing.JLabel LBL_5ESTRELLAS_EMPORIO;
    private javax.swing.JLabel LBL_5ESTRELLAS_SOLARIS;
    private javax.swing.JLabel LBL_FOTO_EMPORIO;
    private javax.swing.JLabel LBL_FOTO_SOLARIS;
    private javax.swing.JLabel LBL_MXN_EMPORIO;
    private javax.swing.JLabel LBL_MXN_EMPORIO2;
    private javax.swing.JLabel LBL_MXN_SOLARIS;
    private javax.swing.JLabel LBL_MXN_SOLARIS2;
    private javax.swing.JLabel LBL_PANEL3;
    private javax.swing.JLabel LBL_PRECIO_TEMPALTA_SOLARIS;
    private javax.swing.JLabel LBL_SIGNO_PESOS_EMPORIO;
    private javax.swing.JLabel LBL_SIGNO_PESOS_EMPORIO2;
    private javax.swing.JLabel LBL_SIGNO_PESOS_SOLARIS;
    private javax.swing.JLabel LBL_SIGNO_PESOS_SOLARIS2;
    private javax.swing.JLabel LBL_TITULO_CATEG_EMPORIO;
    private javax.swing.JLabel LBL_TITULO_CATEG_SOLARIS;
    private javax.swing.JLabel LBL_TITULO_EMPORIO;
    private javax.swing.JLabel LBL_TITULO_HOTELES;
    private javax.swing.JLabel LBL_TITULO_LUGAR_EMPORIO;
    private javax.swing.JLabel LBL_TITULO_LUGAR_SOLARIS;
    private javax.swing.JLabel LBL_TITULO_PRECIOS_EMPORIO;
    private javax.swing.JLabel LBL_TITULO_PRECIOS_SOLARIS;
    private javax.swing.JLabel LBL_TITULO_SOLARIS;
    private javax.swing.JLabel LBL_TITULO_TEMPALTA_EMPORIO;
    private javax.swing.JLabel LBL_TITULO_TEMPBAJA_EMPORIO;
    private javax.swing.JLabel LBL_TITULO_TEMPBAJA_SOLARIS;
    public static javax.swing.JTextField TXF_LUGAR_EMPORIO;
    public static javax.swing.JTextField TXF_LUGAR_SOLARIS;
    private javax.swing.JTextField TXF_PRECIO_TEMPALTA_EMPORIO;
    private javax.swing.JTextField TXF_PRECIO_TEMPALTA_SOLARIS;
    private javax.swing.JTextField TXF_PRECIO_TEMPBAJA_EMPORIO;
    private javax.swing.JTextField TXF_PRECIO_TEMPBAJA_SOLARIS;
    // End of variables declaration//GEN-END:variables
    Conectar co = new Conectar();
    Connection cn = co.conectar();
}
