
package Servicios;

import FrameSingUp_In.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import reserva.Home19;

public class MedioTransporte extends javax.swing.JFrame {
   
    
    
    public MedioTransporte() {
        initComponents();
        galeriaMT();
        setLocationRelativeTo(null);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        LBL_MTrans = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        galeriaImages = new javax.swing.JLabel();
        LBL_Origen = new javax.swing.JLabel();
        CB_Origen = new javax.swing.JComboBox<>();
        LBL_Destino = new javax.swing.JLabel();
        CB_Destinos = new javax.swing.JComboBox<>();
        LBL_MT = new javax.swing.JLabel();
        SPT_MT = new javax.swing.JSeparator();
        LBL_Avion = new javax.swing.JLabel();
        CB_Condicion1 = new javax.swing.JComboBox<>();
        LBL_Aerolinea = new javax.swing.JLabel();
        CB_Aerolinea = new javax.swing.JComboBox<>();
        LBL_Camión = new javax.swing.JLabel();
        Compañía = new javax.swing.JLabel();
        BTN_Reservar = new javax.swing.JButton();
        CB_Compañia = new javax.swing.JComboBox<>();
        CB_Condicion2 = new javax.swing.JComboBox<>();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setForeground(new java.awt.Color(153, 153, 153));

        LBL_MTrans.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        LBL_MTrans.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LBL_MTrans.setText("M E D I O   D E   T R A N S P O R T E");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(172, 172, 172)
                .addComponent(LBL_MTrans)
                .addContainerGap(197, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(LBL_MTrans)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 50));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        galeriaImages.setForeground(new java.awt.Color(255, 255, 255));
        galeriaImages.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        galeriaImages.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesMT/ado-logo.png"))); // NOI18N

        LBL_Origen.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        LBL_Origen.setForeground(new java.awt.Color(255, 255, 255));
        LBL_Origen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LBL_Origen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesMT/Order Delivered_15px.png"))); // NOI18N
        LBL_Origen.setText("Origen: ");

        CB_Origen.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        CB_Origen.setForeground(new java.awt.Color(102, 102, 255));
        CB_Origen.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ACAPULCO", "CANCUN", "CHIAPAS", "CIUDAD DE MEXICO", "COZUMEL", "GUADALAJARA", "MAZATLAN", "MERIDA", "OAXACA", "PUERTO VALLARTA", "RIVERA MAYA", "SAN JOSE DEL CABO", "TIJUANA", "VERACRUZ", "VILLAHERMOSA" }));

        LBL_Destino.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        LBL_Destino.setForeground(new java.awt.Color(255, 255, 255));
        LBL_Destino.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LBL_Destino.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesMT/Marker_15px.png"))); // NOI18N
        LBL_Destino.setText("Destino: ");

        CB_Destinos.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        CB_Destinos.setForeground(new java.awt.Color(102, 102, 255));
        CB_Destinos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ACAPULCO", "CANCUN", "CHIAPAS", "CIUDAD DE MEXICO", "COZUMEL", "GUADALAJARA", "MAZATLAN", "MERIDA", "OAXACA", "PUERTO VALLARTA", "RIVERA MAYA", "SAN JOSE DEL CABO", "TIJUANA", "VERACRUZ", "VILLAHERMOSA" }));

        LBL_MT.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        LBL_MT.setForeground(new java.awt.Color(255, 255, 255));
        LBL_MT.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LBL_MT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesMT/Luggage Trolley_15px.png"))); // NOI18N
        LBL_MT.setText("Medio de transporte");

        LBL_Avion.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        LBL_Avion.setForeground(new java.awt.Color(255, 255, 255));
        LBL_Avion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesMT/Airplane Take Off_15px.png"))); // NOI18N
        LBL_Avion.setText("Avión: ");

        CB_Condicion1.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        CB_Condicion1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sí", "No" }));
        CB_Condicion1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_Condicion1ActionPerformed(evt);
            }
        });

        LBL_Aerolinea.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        LBL_Aerolinea.setForeground(new java.awt.Color(255, 255, 255));
        LBL_Aerolinea.setText("Aerolínea: ");

        CB_Aerolinea.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        CB_Aerolinea.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AEROMEXICO", "VOLARIS", "INTERJET" }));

        LBL_Camión.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        LBL_Camión.setForeground(new java.awt.Color(255, 255, 255));
        LBL_Camión.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesMT/Shuttle_15px.png"))); // NOI18N
        LBL_Camión.setText("Camión: ");

        Compañía.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        Compañía.setForeground(new java.awt.Color(255, 255, 255));
        Compañía.setText("Compañía: ");

        BTN_Reservar.setBackground(new java.awt.Color(102, 102, 255));
        BTN_Reservar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BTN_Reservar.setForeground(new java.awt.Color(255, 255, 255));
        BTN_Reservar.setText("Reservar");
        BTN_Reservar.setBorder(null);
        BTN_Reservar.setOpaque(false);
        BTN_Reservar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_ReservarActionPerformed(evt);
            }
        });

        CB_Compañia.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        CB_Compañia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ADO", "ACN", "OCC" }));

        CB_Condicion2.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        CB_Condicion2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sí", "No" }));
        CB_Condicion2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_Condicion2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(32, 32, 32)
                            .addComponent(LBL_MT, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(44, 44, 44)
                            .addComponent(LBL_Aerolinea)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(CB_Aerolinea, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(LBL_Avion, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(CB_Condicion1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(LBL_Camión)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(CB_Condicion2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addGap(44, 44, 44)
                            .addComponent(Compañía, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(CB_Compañia, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(LBL_Destino, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(CB_Destinos, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(LBL_Origen, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(CB_Origen, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(SPT_MT, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(BTN_Reservar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(galeriaImages, javax.swing.GroupLayout.DEFAULT_SIZE, 440, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(galeriaImages, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LBL_Origen, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CB_Origen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LBL_Destino, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CB_Destinos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(LBL_MT)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(SPT_MT, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LBL_Avion)
                            .addComponent(CB_Condicion1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LBL_Aerolinea)
                            .addComponent(CB_Aerolinea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LBL_Camión)
                            .addComponent(CB_Condicion2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Compañía)
                            .addComponent(CB_Compañia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addComponent(BTN_Reservar, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37))))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 670, 380));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CB_Condicion1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_Condicion1ActionPerformed

    }//GEN-LAST:event_CB_Condicion1ActionPerformed
    //complemento a uno y suma binaria
    private void BTN_ReservarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_ReservarActionPerformed
            Generador indice1 = new Generador();
            Generador indice2 = new Generador();
            
            int id2=indice2.generedCode("INFOCLIENTE");
            id2 = id2-1;
            
            String cad1=null,cad2=null,cad3=null,cad4=null,cad5=null,cad6=null,
                    actualiza=null,auxSuma,auxID, auxOrigen, auxDestino,s="";
            cad1 = CB_Origen.getSelectedItem().toString();
            cad2 = CB_Destinos.getSelectedItem().toString();
            cad3 = CB_Condicion1.getSelectedItem().toString();
            cad4 = CB_Condicion2.getSelectedItem().toString();
            cad5 = CB_Aerolinea.getSelectedItem().toString();
            cad6 = CB_Compañia.getSelectedItem().toString();
           
            int sinoAvion = CB_Condicion1.getSelectedIndex();
            int sinoCamion = CB_Condicion2.getSelectedIndex();
            boolean rpt;
            
            if(cad1 == cad2)
                JOptionPane.showMessageDialog(null, "No puedes elegir el mismo origen y destino");
            
            rpt=true;
            if(sinoAvion==0 && sinoCamion==0){ 
                rpt=false;
                JOptionPane.showMessageDialog(null, "Solo puedes elegir una de las opciones");
            }
            
            while(cad1 != cad2 && rpt==true)
            {    

        try {
            
            String auxid=""+id2;
            
            if(cad1=="GUADALAJARA"){
            PreparedStatement pst2 = cn.prepareStatement("update ofrece set idTransporte=1 where idReservacion="
                    +auxid);
            
            pst2.executeUpdate();
            }
            
            if(cad1=="SAN JOSE DEL CABO"){
            PreparedStatement pst2 = cn.prepareStatement("update ofrece set idTransporte=2 where idReservacion="
                    +auxid);
            
            pst2.executeUpdate();
            }
            
            if(cad1=="CANCUN"){
            PreparedStatement pst2 = cn.prepareStatement("update ofrece set idTransporte=3 where idReservacion="
                    +auxid);
            
            pst2.executeUpdate();
            }
            
            if(cad1=="ACAPULCO"){
            PreparedStatement pst2 = cn.prepareStatement("update ofrece set idTransporte=4 where idReservacion="
                    +auxid);
            
            pst2.executeUpdate();
            }
            
            if(cad1=="PUERTO VALLARTA"){
            PreparedStatement pst2 = cn.prepareStatement("update ofrece set idTransporte=5 where idReservacion="
                    +auxid);
            
            pst2.executeUpdate();
            }
            
            if(cad1=="CHIAPAS"){
            PreparedStatement pst2 = cn.prepareStatement("update ofrece set idTransporte=6 where idReservacion="
                    +auxid);
            
            pst2.executeUpdate();
            }
            
            if(cad1=="MAZATLAN"){
            PreparedStatement pst2 = cn.prepareStatement("update ofrece set idTransporte=7 where idReservacion="
                    +auxid);
            
            pst2.executeUpdate();
            }
            
            if(cad1=="RIVERA MAYA"){
            PreparedStatement pst2 = cn.prepareStatement("update ofrece set idTransporte=8 where idReservacion="
                    +auxid);
            
            pst2.executeUpdate();
            }
            
            if(cad1=="VERACRUZ"){
            PreparedStatement pst2 = cn.prepareStatement("update ofrece set idTransporte=9 where idReservacion="
                    +auxid);
            
            pst2.executeUpdate();
            }
            
            if(cad1=="MERIDA"){
            PreparedStatement pst2 = cn.prepareStatement("update ofrece set idTransporte=10 where idReservacion="
                    +auxid);
            
            pst2.executeUpdate();
            }
            
            if(cad1=="COZUMEL"){
            PreparedStatement pst2 = cn.prepareStatement("update ofrece set idTransporte=11 where idReservacion="
                    +auxid);
            
            pst2.executeUpdate();
            }
            
            if(cad1=="OAXACA"){
            PreparedStatement pst2 = cn.prepareStatement("update ofrece set idTransporte=12 where idReservacion="
                    +auxid);
            
            pst2.executeUpdate();
            }
            
            if(cad1=="CIUDAD DE MEXICO"){
            PreparedStatement pst2 = cn.prepareStatement("update ofrece set idTransporte=13 where idReservacion="
                    +auxid);
            
            pst2.executeUpdate();
            }
            
            if(cad1=="VILLAHERMOSA"){
            PreparedStatement pst2 = cn.prepareStatement("update ofrece set idTransporte=14 where idReservacion="
                    +auxid);
            
            pst2.executeUpdate();
            }
            
            if(cad1=="TIJUANA"){
            PreparedStatement pst2 = cn.prepareStatement("update ofrece set idTransporte=15 where idReservacion="
                    +auxid);
            
            pst2.executeUpdate();
            }
            
           
            //COSTO DE AVION
            String sql1 = "select a.costo from avion a, mtd m, medioTransporte mt where mt.idTransporte = m.idTransporte "
                    + "and m.idTD = a.idTD and a.aerolinea ='"+cad5+"'"
                    + " and m.destino ='"+cad2+"' and mt.origen ='"+cad1+"'";
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql1);
            String rpt1="";
            while(rs.next())
               {
                   rpt1=rs.getString(1);   
               }
            int numero1 = Integer.parseInt(rpt1);
           
            
            
            //COSTO CAMION
            String sql2 = "select c.costo from camion c, mtd m, medioTransporte mt where mt.idTransporte = m.idTransporte"
                    + " and m.idTD = c.idTD and c.compania ='"+cad6+"'"
                    + " and m.destino ='"+cad2+"' and mt.origen ='"+cad1+"'";
            Statement st2 = cn.createStatement();
            ResultSet rs2 = st2.executeQuery(sql2);
            String rpt2="";
            while(rs2.next())
               {
                   rpt2=rs2.getString(1);  
               }
            int numero2 = Integer.parseInt(rpt2);
            System.out.println("COSTO CAMION "+numero2);
            
            //numero 1 - costo avion, numero2 - costo camion
            
            //obtenemos el costo anterior 
            String auxid2=""+id2;
            String sql = "select costoTotal from infocliente WHERE idReservacion="+auxid2;
            Statement stC = cn.createStatement();
            String rptC="";
            //almacena los datos de la consulta que vamosa realizar
            ResultSet rsC = stC.executeQuery(sql);
            while(rsC.next())
            {
            rptC=rsC.getString(1);  
            }
            int costoT = Integer.parseInt(rptC);
            
            
            //VALIDANDO CONDICIONES DE SI O NO
            int opc1=CB_Condicion1.getSelectedIndex();
            int opc2=CB_Condicion2.getSelectedIndex();
            String costoA = ""+(numero1+costoT);
            String costoC = ""+(numero2+costoT);
            auxID=" "+id2;
            String auxCostoA =""+numero1;
            String auxCostoC =""+numero2;
            
            
            
            //SOLO CAMION
             if (opc1==1 && opc2==0)
            {
                s="update infocliente set origen='"+cad1+"', destino='"+cad2+"', "
                    + "compañia='"+cad6+"',"+ "costoTotal="+costoC+" WHERE idReservacion="+auxID;
                PreparedStatement pst = cn.prepareStatement(s);
                pst.executeUpdate();
            }
            
            //SOLO AVION
            if (opc1==0 && opc2==1)
            {
                s="update infocliente set origen='"+cad1+"', destino='"+cad2+"', "
                    + "aerolinea='"+cad5+"',"+ "costoTotal="+costoA+" WHERE idReservacion="+auxID;
                PreparedStatement pst = cn.prepareStatement(s);
                pst.executeUpdate();
            }
              
            
        
        } catch (SQLException ex) {
            Logger.getLogger(MedioTransporte.class.getName()).log(Level.SEVERE, null, ex);
        }
        
       
        //indice2.UpdateCode("INFOCLIENTE");
       
        
        rpt=false;
        //System.exit(0);
        
        reserva.VentanaReserva prueba = new reserva.VentanaReserva();
        setVisible(false);
        prueba.setVisible(true);
        
        }
        
       
    }//GEN-LAST:event_BTN_ReservarActionPerformed

    private void CB_Condicion2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_Condicion2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CB_Condicion2ActionPerformed

    public static void main(String args[]) {
   
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MedioTransporte().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTN_Reservar;
    private javax.swing.JComboBox<String> CB_Aerolinea;
    private javax.swing.JComboBox<String> CB_Compañia;
    private javax.swing.JComboBox<String> CB_Condicion1;
    private javax.swing.JComboBox<String> CB_Condicion2;
    private javax.swing.JComboBox<String> CB_Destinos;
    private javax.swing.JComboBox<String> CB_Origen;
    private javax.swing.JLabel Compañía;
    private javax.swing.JLabel LBL_Aerolinea;
    private javax.swing.JLabel LBL_Avion;
    private javax.swing.JLabel LBL_Camión;
    private javax.swing.JLabel LBL_Destino;
    private javax.swing.JLabel LBL_MT;
    private javax.swing.JLabel LBL_MTrans;
    private javax.swing.JLabel LBL_Origen;
    private javax.swing.JSeparator SPT_MT;
    private javax.swing.JLabel galeriaImages;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
ConexionSQL co = new ConexionSQL();
Connection cn = co.getConnection();

    public void galeriaMT() {
        int velocidad = 2;

        Timer timer;
        TimerTask tarea;
        int velmil = velocidad * 1000;

        tarea = new TimerTask() {
            int contador = 0;

            @Override
            public void run() {
                Icon icono;

                switch (contador) {
                    case 0:
                        contador = 1;
                        icono = new ImageIcon(getClass().getResource("/ImagesMT/ado-logo.png"));
                        galeriaImages.setIcon(icono);
                        break;
                    case 1:
                        contador = 2;
                        icono = new ImageIcon(getClass().getResource("/ImagesMT/aero_mex.jpg"));
                        galeriaImages.setIcon(icono);
                        break;
                    case 2:
                        contador = 3;
                        icono = new ImageIcon(getClass().getResource("/ImagesMT/volaris.jpg"));
                        galeriaImages.setIcon(icono);
                        break;
                    case 3:
                        contador = 4;
                        icono = new ImageIcon(getClass().getResource("/ImagesMT/avion.jpg"));
                        galeriaImages.setIcon(icono);
                        break;
                    case 4:
                        contador = 5;
                        icono = new ImageIcon(getClass().getResource("/ImagesMT/in_airplane.jpg"));
                        galeriaImages.setIcon(icono);
                        break;
                    case 5:
                        contador = 0;
                        icono = new ImageIcon(getClass().getResource("/ImagesMT/in_bus.jpg"));
                        galeriaImages.setIcon(icono);
                        break;
                }
            }
        };
        timer = new Timer();
        timer.scheduleAtFixedRate(tarea, velmil, velmil);
    }
}
