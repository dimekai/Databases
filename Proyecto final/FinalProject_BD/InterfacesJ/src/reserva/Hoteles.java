package reserva;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Hoteles extends javax.swing.JFrame {
        
    public Hoteles() {
        initComponents();
        setLocationRelativeTo(null);
        
    }
    
    
    void mostrarDatos1()
    {
        String agencia = "AM RESORTS";
        String lugar = TXF_LUGAR_AMRESORTS.getText();
        //nombre de la region
        
        String completo = agencia +" "+ lugar;
        String datos;      
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery("select costo from hotelregion where nombre='"+completo+"'");
            while(rs.next())
            {
                datos= rs.getString("costo");
                TXF_PRECIO_TEMPBAJA_RESORTS.setText(datos);
                //CALCULANDO INCREMENTO
                String sinEspacios = (TXF_PRECIO_TEMPBAJA_RESORTS.getText()).trim();
                int numero = Integer.parseInt(sinEspacios);
                int precioIncre = numero + (int)(numero *.20);
                String nuevoPrecio = String.valueOf(precioIncre);
                TXF_PRECIO_TEMPALTA_RESORTS.setText(nuevoPrecio);
                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Hoteles.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    void mostrarDatos2()
    {
        String agencia = "RIU";
        String lugar = TXF_LUGAR_AMRESORTS.getText();
        String completo = agencia +" "+ lugar;
        String datos;      
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery("select costo from hotelregion where nombre='"+completo+"'");
          
            
            while(rs.next())
            {
                datos= rs.getString("costo");
                TXF_PRECIO_TEMPBAJA_RIU.setText(datos);
                //CALCULANDO INCREMENTO
                String sinEspacios = (TXF_PRECIO_TEMPBAJA_RIU.getText()).trim();
                int numero = Integer.parseInt(sinEspacios);
                int precioIncre = numero + (int)(numero *.20);
                String nuevoPrecio = String.valueOf(precioIncre);
                TXF_PRECIO_TEMPALTA_RIU.setText(nuevoPrecio);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Hoteles.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LBL_TITULO_AMRESORTS = new javax.swing.JLabel();
        LBL_TITULO_CATEG = new javax.swing.JLabel();
        LBL_TITULO_LUGAR = new javax.swing.JLabel();
        LBL_TITULO_PRECIO = new javax.swing.JLabel();
        LBL_TITULO_TEMPALTA = new javax.swing.JLabel();
        LBL_TITULO_TEMPBAJA = new javax.swing.JLabel();
        LBL_SIGNO_PESOS2 = new javax.swing.JLabel();
        LBL_SIGNO_PESOS = new javax.swing.JLabel();
        LBL_MXN1 = new javax.swing.JLabel();
        LBL_MXN2 = new javax.swing.JLabel();
        LBL_TITULO_PRECIOS_RIU = new javax.swing.JLabel();
        LBL_TITULO_RIU = new javax.swing.JLabel();
        LBL_TITULO_CATEG_RIU = new javax.swing.JLabel();
        LBL_TITULO_LUGAR_RIU = new javax.swing.JLabel();
        LBL_5ESTRELLAS_RIU = new javax.swing.JLabel();
        LBL_TITULO_TEMPALTA_RIU = new javax.swing.JLabel();
        LBL_TITULO_TEMPBAJA_RIU = new javax.swing.JLabel();
        LBL_SIGNO_PESOS_4 = new javax.swing.JLabel();
        LBL_SIGNO_PESOS_3 = new javax.swing.JLabel();
        LBL_MXN4 = new javax.swing.JLabel();
        LBL_MXN3 = new javax.swing.JLabel();
        LBL_TITULO_HOTELES = new javax.swing.JLabel();
        BTN_SIGUIENTE_VENTANA = new javax.swing.JButton();
        TXF_PRECIO_TEMPALTA_RESORTS = new javax.swing.JTextField();
        TXT_LUGAR_RIU = new javax.swing.JTextField();
        TXF_PRECIO_TEMPALTA_RIU = new javax.swing.JTextField();
        TXF_PRECIO_TEMPBAJA_RIU = new javax.swing.JTextField();
        LBL_5ESTRELLAS = new javax.swing.JLabel();
        LBL_FOTO_RESOTRS = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        BTN_OBTENER_RESORTS = new javax.swing.JButton();
        BTN_OBTENER_RIU = new javax.swing.JButton();
        LBL_FOTO_RIU = new javax.swing.JLabel();
        TXF_LUGAR_AMRESORTS = new javax.swing.JTextField();
        TXF_PRECIO_TEMPBAJA_RESORTS = new javax.swing.JTextField();
        TXT_MES = new javax.swing.JTextField();
        LBL_PANEL_HOTELES = new javax.swing.JLabel();
        TXT_NP = new javax.swing.JLabel();
        TXT_DIA = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LBL_TITULO_AMRESORTS.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        LBL_TITULO_AMRESORTS.setForeground(new java.awt.Color(255, 255, 0));
        LBL_TITULO_AMRESORTS.setText("AM RESORTS");
        getContentPane().add(LBL_TITULO_AMRESORTS, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 160, 120, 30));

        LBL_TITULO_CATEG.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        LBL_TITULO_CATEG.setForeground(new java.awt.Color(255, 255, 255));
        LBL_TITULO_CATEG.setText("Categoría :");
        getContentPane().add(LBL_TITULO_CATEG, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 200, -1, 30));

        LBL_TITULO_LUGAR.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        LBL_TITULO_LUGAR.setForeground(new java.awt.Color(255, 255, 255));
        LBL_TITULO_LUGAR.setText("Lugar :");
        getContentPane().add(LBL_TITULO_LUGAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 247, -1, 30));

        LBL_TITULO_PRECIO.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        LBL_TITULO_PRECIO.setForeground(new java.awt.Color(255, 153, 0));
        LBL_TITULO_PRECIO.setText("Precio por noche :");
        getContentPane().add(LBL_TITULO_PRECIO, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 190, -1, -1));

        LBL_TITULO_TEMPALTA.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        LBL_TITULO_TEMPALTA.setForeground(new java.awt.Color(255, 255, 255));
        LBL_TITULO_TEMPALTA.setText("Temporada alta :");
        getContentPane().add(LBL_TITULO_TEMPALTA, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 220, -1, -1));

        LBL_TITULO_TEMPBAJA.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        LBL_TITULO_TEMPBAJA.setForeground(new java.awt.Color(255, 255, 255));
        LBL_TITULO_TEMPBAJA.setText("Temporada baja :");
        getContentPane().add(LBL_TITULO_TEMPBAJA, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 250, -1, -1));

        LBL_SIGNO_PESOS2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        LBL_SIGNO_PESOS2.setForeground(new java.awt.Color(255, 255, 255));
        LBL_SIGNO_PESOS2.setText("$");
        getContentPane().add(LBL_SIGNO_PESOS2, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 250, -1, -1));

        LBL_SIGNO_PESOS.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        LBL_SIGNO_PESOS.setForeground(new java.awt.Color(255, 255, 255));
        LBL_SIGNO_PESOS.setText("$");
        getContentPane().add(LBL_SIGNO_PESOS, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 220, -1, -1));

        LBL_MXN1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        LBL_MXN1.setForeground(new java.awt.Color(255, 255, 51));
        LBL_MXN1.setText("MXN");
        getContentPane().add(LBL_MXN1, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 220, -1, -1));

        LBL_MXN2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        LBL_MXN2.setForeground(new java.awt.Color(255, 255, 51));
        LBL_MXN2.setText("MXN");
        getContentPane().add(LBL_MXN2, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 250, -1, -1));

        LBL_TITULO_PRECIOS_RIU.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        LBL_TITULO_PRECIOS_RIU.setForeground(new java.awt.Color(255, 153, 0));
        LBL_TITULO_PRECIOS_RIU.setText("Precio por noche :");
        getContentPane().add(LBL_TITULO_PRECIOS_RIU, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 400, -1, -1));

        LBL_TITULO_RIU.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        LBL_TITULO_RIU.setForeground(new java.awt.Color(255, 255, 0));
        LBL_TITULO_RIU.setText("RIU");
        getContentPane().add(LBL_TITULO_RIU, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 370, 40, 30));

        LBL_TITULO_CATEG_RIU.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        LBL_TITULO_CATEG_RIU.setForeground(new java.awt.Color(255, 255, 255));
        LBL_TITULO_CATEG_RIU.setText("Categoría :");
        getContentPane().add(LBL_TITULO_CATEG_RIU, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 410, -1, 30));

        LBL_TITULO_LUGAR_RIU.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        LBL_TITULO_LUGAR_RIU.setForeground(new java.awt.Color(255, 255, 255));
        LBL_TITULO_LUGAR_RIU.setText("Lugar :");
        getContentPane().add(LBL_TITULO_LUGAR_RIU, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 450, -1, 30));
        getContentPane().add(LBL_5ESTRELLAS_RIU, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 410, 90, 30));

        LBL_TITULO_TEMPALTA_RIU.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        LBL_TITULO_TEMPALTA_RIU.setForeground(new java.awt.Color(255, 255, 255));
        LBL_TITULO_TEMPALTA_RIU.setText("Temporada alta :");
        getContentPane().add(LBL_TITULO_TEMPALTA_RIU, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 430, -1, -1));

        LBL_TITULO_TEMPBAJA_RIU.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        LBL_TITULO_TEMPBAJA_RIU.setForeground(new java.awt.Color(255, 255, 255));
        LBL_TITULO_TEMPBAJA_RIU.setText("Temporada baja :");
        getContentPane().add(LBL_TITULO_TEMPBAJA_RIU, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 460, -1, -1));

        LBL_SIGNO_PESOS_4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        LBL_SIGNO_PESOS_4.setForeground(new java.awt.Color(255, 255, 255));
        LBL_SIGNO_PESOS_4.setText("$");
        getContentPane().add(LBL_SIGNO_PESOS_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 460, 10, -1));

        LBL_SIGNO_PESOS_3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        LBL_SIGNO_PESOS_3.setForeground(new java.awt.Color(255, 255, 255));
        LBL_SIGNO_PESOS_3.setText("$");
        getContentPane().add(LBL_SIGNO_PESOS_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 430, -1, -1));

        LBL_MXN4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        LBL_MXN4.setForeground(new java.awt.Color(255, 255, 51));
        LBL_MXN4.setText("MXN");
        getContentPane().add(LBL_MXN4, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 460, -1, -1));

        LBL_MXN3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        LBL_MXN3.setForeground(new java.awt.Color(255, 255, 51));
        LBL_MXN3.setText("MXN");
        getContentPane().add(LBL_MXN3, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 430, -1, -1));

        LBL_TITULO_HOTELES.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        LBL_TITULO_HOTELES.setForeground(new java.awt.Color(255, 255, 255));
        LBL_TITULO_HOTELES.setText("H  O  T  E  L  E  S");
        getContentPane().add(LBL_TITULO_HOTELES, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 50, 180, 30));

        BTN_SIGUIENTE_VENTANA.setToolTipText("¡Ver más hoteles!");
        BTN_SIGUIENTE_VENTANA.setBorderPainted(false);
        BTN_SIGUIENTE_VENTANA.setContentAreaFilled(false);
        BTN_SIGUIENTE_VENTANA.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BTN_SIGUIENTE_VENTANA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_SIGUIENTE_VENTANAActionPerformed(evt);
            }
        });
        getContentPane().add(BTN_SIGUIENTE_VENTANA, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 290, 60, 60));

        TXF_PRECIO_TEMPALTA_RESORTS.setEditable(false);
        TXF_PRECIO_TEMPALTA_RESORTS.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        TXF_PRECIO_TEMPALTA_RESORTS.setToolTipText("Incremento de 20%");
        TXF_PRECIO_TEMPALTA_RESORTS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXF_PRECIO_TEMPALTA_RESORTSActionPerformed(evt);
            }
        });
        getContentPane().add(TXF_PRECIO_TEMPALTA_RESORTS, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 220, 50, -1));

        TXT_LUGAR_RIU.setEditable(false);
        TXT_LUGAR_RIU.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        TXT_LUGAR_RIU.setForeground(new java.awt.Color(204, 0, 0));
        TXT_LUGAR_RIU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXT_LUGAR_RIUActionPerformed(evt);
            }
        });
        getContentPane().add(TXT_LUGAR_RIU, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 450, 130, 30));

        TXF_PRECIO_TEMPALTA_RIU.setEditable(false);
        TXF_PRECIO_TEMPALTA_RIU.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        TXF_PRECIO_TEMPALTA_RIU.setToolTipText("Incremento de 20%");
        getContentPane().add(TXF_PRECIO_TEMPALTA_RIU, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 430, 50, -1));

        TXF_PRECIO_TEMPBAJA_RIU.setEditable(false);
        TXF_PRECIO_TEMPBAJA_RIU.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        getContentPane().add(TXF_PRECIO_TEMPBAJA_RIU, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 460, 50, -1));

        LBL_5ESTRELLAS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva/5_estrellas.png"))); // NOI18N
        getContentPane().add(LBL_5ESTRELLAS, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 200, -1, 30));

        LBL_FOTO_RESOTRS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva/amresorts2.png"))); // NOI18N
        getContentPane().add(LBL_FOTO_RESOTRS, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, 170, 130));

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva/5_estrellas.png"))); // NOI18N
        getContentPane().add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 420, -1, -1));

        BTN_OBTENER_RESORTS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva/obtenerPaquete.png"))); // NOI18N
        BTN_OBTENER_RESORTS.setToolTipText("¡Quiero ver detalles!");
        BTN_OBTENER_RESORTS.setBorderPainted(false);
        BTN_OBTENER_RESORTS.setContentAreaFilled(false);
        BTN_OBTENER_RESORTS.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BTN_OBTENER_RESORTS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_OBTENER_RESORTSActionPerformed(evt);
            }
        });
        getContentPane().add(BTN_OBTENER_RESORTS, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 290, 140, 20));

        BTN_OBTENER_RIU.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva/obtenerPaquete.png"))); // NOI18N
        BTN_OBTENER_RIU.setToolTipText("¡Quiero ver detalles!");
        BTN_OBTENER_RIU.setBorderPainted(false);
        BTN_OBTENER_RIU.setContentAreaFilled(false);
        BTN_OBTENER_RIU.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BTN_OBTENER_RIU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_OBTENER_RIUActionPerformed(evt);
            }
        });
        getContentPane().add(BTN_OBTENER_RIU, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 500, 130, 20));

        LBL_FOTO_RIU.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva/riu.png"))); // NOI18N
        getContentPane().add(LBL_FOTO_RIU, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 380, 180, 120));

        TXF_LUGAR_AMRESORTS.setEditable(false);
        TXF_LUGAR_AMRESORTS.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        TXF_LUGAR_AMRESORTS.setForeground(new java.awt.Color(204, 0, 0));
        TXF_LUGAR_AMRESORTS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXF_LUGAR_AMRESORTSActionPerformed(evt);
            }
        });
        TXF_LUGAR_AMRESORTS.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                TXF_LUGAR_AMRESORTSPropertyChange(evt);
            }
        });
        getContentPane().add(TXF_LUGAR_AMRESORTS, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 250, 130, 30));

        TXF_PRECIO_TEMPBAJA_RESORTS.setEditable(false);
        TXF_PRECIO_TEMPBAJA_RESORTS.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        TXF_PRECIO_TEMPBAJA_RESORTS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXF_PRECIO_TEMPBAJA_RESORTSActionPerformed(evt);
            }
        });
        getContentPane().add(TXF_PRECIO_TEMPBAJA_RESORTS, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 250, 50, -1));

        TXT_MES.setForeground(new java.awt.Color(255, 255, 255));
        TXT_MES.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXT_MESActionPerformed(evt);
            }
        });
        getContentPane().add(TXT_MES, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 250, 10, 0));

        LBL_PANEL_HOTELES.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reserva/fondoHoteles.png"))); // NOI18N
        getContentPane().add(LBL_PANEL_HOTELES, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 970, 570));

        TXT_NP.setText("jLabel1");
        getContentPane().add(TXT_NP, new org.netbeans.lib.awtextra.AbsoluteConstraints(534, 450, 10, 0));

        TXT_DIA.setText("jLabel1");
        getContentPane().add(TXT_DIA, new org.netbeans.lib.awtextra.AbsoluteConstraints(804, 160, 0, 0));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTN_SIGUIENTE_VENTANAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_SIGUIENTE_VENTANAActionPerformed
        Hoteles2 t = new Hoteles2();
        t.setVisible(true);
        this.dispose();
        
        Hoteles2.TXF_LUGAR_EMPORIO.setText(TXF_LUGAR_AMRESORTS.getText());
        Hoteles2.TXF_LUGAR_SOLARIS.setText(TXT_LUGAR_RIU.getText());
        
        t.mostrarDatos3();
        t.mostrarDatos4();
    }//GEN-LAST:event_BTN_SIGUIENTE_VENTANAActionPerformed

    private void BTN_OBTENER_RESORTSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_OBTENER_RESORTSActionPerformed
        Generador indice = new Generador();
        int id=indice.generedCode("OFRECE");
        //para agregar la region del hotel
        String region = TXF_LUGAR_AMRESORTS.getText();
        
        String hotel = "AM RESORTS";
        Home19 H1 = new Home19();
        
        //con esto podemos agregar el costo si es tempAlta o Baja 
        String aux= TXT_MES.getText();
        int rpt = Integer.parseInt(aux);
        String aux2 = TXT_NP.getText();
        int plaza = Integer.parseInt(aux2);
        
        String aux3 = TXF_PRECIO_TEMPALTA_RESORTS.getText();
        int costoA = Integer.parseInt(aux3);
        
        String aux4 = TXF_PRECIO_TEMPBAJA_RESORTS.getText();
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
                pst = cn.prepareStatement("update ofrece set idHotel=1 "
                        + "WHERE idReservacion="+auxid);
                pst.executeUpdate();   
                
                
            } catch (SQLException ex) {
                Logger.getLogger(Hoteles.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        
            
        H1.setRegion(region);
        H1.setNameH(hotel);
        H1.setVisible(true);
       
        
        this.dispose();
        
    }//GEN-LAST:event_BTN_OBTENER_RESORTSActionPerformed

    private void TXT_LUGAR_RIUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXT_LUGAR_RIUActionPerformed
        VentanaReserva v = new VentanaReserva();
        v.setVisible(true);
    }//GEN-LAST:event_TXT_LUGAR_RIUActionPerformed

    private void TXF_LUGAR_AMRESORTSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXF_LUGAR_AMRESORTSActionPerformed
        VentanaReserva v = new VentanaReserva();
        v.setVisible(true);
        
    }//GEN-LAST:event_TXF_LUGAR_AMRESORTSActionPerformed

    private void TXF_LUGAR_AMRESORTSPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_TXF_LUGAR_AMRESORTSPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_TXF_LUGAR_AMRESORTSPropertyChange

    private void TXF_PRECIO_TEMPALTA_RESORTSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXF_PRECIO_TEMPALTA_RESORTSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXF_PRECIO_TEMPALTA_RESORTSActionPerformed

    private void BTN_OBTENER_RIUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_OBTENER_RIUActionPerformed
        Generador indice = new Generador();
        int id=indice.generedCode("OFRECE");
        
        //para agregar la region del hotel
        String region = TXF_LUGAR_AMRESORTS.getText();
        String cadena = "RIU";
        Home19 H1 = new Home19();
        H1.setNameH(cadena);
        
        //con esto podemos agregar el costo si es tempAlta o Baja 
        String aux= TXT_MES.getText();
        int rpt = Integer.parseInt(aux);
        String aux2 = TXT_NP.getText();
        int plaza = Integer.parseInt(aux2);
        
        String aux3 = TXF_PRECIO_TEMPALTA_RIU.getText();
        int costoA = Integer.parseInt(aux3);
        
        String aux4 = TXF_PRECIO_TEMPBAJA_RIU.getText();
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
            H1.setCostoTempB((int)(costoB*3*0.60+diaT));
        }    
        
        //con esto podemos actualizar el registro de idHotel
        String auxid=""+id;
            try {
                PreparedStatement pst;
                pst = cn.prepareStatement("update ofrece set idHotel=2 "
                        + "WHERE idReservacion="+auxid);
                pst.executeUpdate();
      
            } catch (SQLException ex) {
                Logger.getLogger(Hoteles.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        H1.setRegion(region);
        H1.setVisible(true);
        this.dispose();    
    }//GEN-LAST:event_BTN_OBTENER_RIUActionPerformed

    private void TXF_PRECIO_TEMPBAJA_RESORTSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXF_PRECIO_TEMPBAJA_RESORTSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXF_PRECIO_TEMPBAJA_RESORTSActionPerformed

    private void TXT_MESActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXT_MESActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXT_MESActionPerformed

    public static void main(String args[]) 
    {
      
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Hoteles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Hoteles().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTN_OBTENER_RESORTS;
    private javax.swing.JButton BTN_OBTENER_RIU;
    private javax.swing.JButton BTN_SIGUIENTE_VENTANA;
    private javax.swing.JLabel LBL_5ESTRELLAS;
    private javax.swing.JLabel LBL_5ESTRELLAS_RIU;
    private javax.swing.JLabel LBL_FOTO_RESOTRS;
    private javax.swing.JLabel LBL_FOTO_RIU;
    private javax.swing.JLabel LBL_MXN1;
    private javax.swing.JLabel LBL_MXN2;
    private javax.swing.JLabel LBL_MXN3;
    private javax.swing.JLabel LBL_MXN4;
    private javax.swing.JLabel LBL_PANEL_HOTELES;
    private javax.swing.JLabel LBL_SIGNO_PESOS;
    private javax.swing.JLabel LBL_SIGNO_PESOS2;
    private javax.swing.JLabel LBL_SIGNO_PESOS_3;
    private javax.swing.JLabel LBL_SIGNO_PESOS_4;
    private javax.swing.JLabel LBL_TITULO_AMRESORTS;
    private javax.swing.JLabel LBL_TITULO_CATEG;
    private javax.swing.JLabel LBL_TITULO_CATEG_RIU;
    private javax.swing.JLabel LBL_TITULO_HOTELES;
    private javax.swing.JLabel LBL_TITULO_LUGAR;
    private javax.swing.JLabel LBL_TITULO_LUGAR_RIU;
    private javax.swing.JLabel LBL_TITULO_PRECIO;
    private javax.swing.JLabel LBL_TITULO_PRECIOS_RIU;
    private javax.swing.JLabel LBL_TITULO_RIU;
    private javax.swing.JLabel LBL_TITULO_TEMPALTA;
    private javax.swing.JLabel LBL_TITULO_TEMPALTA_RIU;
    private javax.swing.JLabel LBL_TITULO_TEMPBAJA;
    private javax.swing.JLabel LBL_TITULO_TEMPBAJA_RIU;
    public static javax.swing.JTextField TXF_LUGAR_AMRESORTS;
    private javax.swing.JTextField TXF_PRECIO_TEMPALTA_RESORTS;
    private javax.swing.JTextField TXF_PRECIO_TEMPALTA_RIU;
    private javax.swing.JTextField TXF_PRECIO_TEMPBAJA_RESORTS;
    public static javax.swing.JTextField TXF_PRECIO_TEMPBAJA_RIU;
    public static javax.swing.JLabel TXT_DIA;
    public static javax.swing.JTextField TXT_LUGAR_RIU;
    public static javax.swing.JTextField TXT_MES;
    public static javax.swing.JLabel TXT_NP;
    private javax.swing.JLabel jLabel25;
    // End of variables declaration//GEN-END:variables
    ConexionSQL co = new ConexionSQL();
    Connection cn = co.getConnection();
}
