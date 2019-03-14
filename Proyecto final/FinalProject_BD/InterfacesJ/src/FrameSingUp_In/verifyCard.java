package FrameSingUp_In;

/*@author Jesus Kaimorts Díaz Medina*/
import Relaciones.*;
import Conectores.*;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;

public class verifyCard extends javax.swing.JFrame {
    /**
     * Creates new form verifyCard
     */
    public verifyCard() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    public void limpiar() {
        TXT_Card01.setText("");
        TXT_Card02.setText("");
        TXT_Card03.setText("");
        TXT_Card04.setText("");
        TXT_Card_CVV.setText("");
    }
    int limCharacter = 4;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        JLBL_Card01 = new javax.swing.JLabel();
        guion01 = new javax.swing.JLabel();
        guion02 = new javax.swing.JLabel();
        guion03 = new javax.swing.JLabel();
        TXT_Card01 = new javax.swing.JTextField();
        TXT_Card02 = new javax.swing.JTextField();
        TXT_Card03 = new javax.swing.JTextField();
        TXT_Card04 = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        JLBL_Detalles = new javax.swing.JLabel();
        JLBL_Expiracion = new javax.swing.JLabel();
        Panel_Proceso = new javax.swing.JPanel();
        JLBL_Data_Personal = new javax.swing.JLabel();
        JLBL_WayPay = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        JCB_TypeCard = new javax.swing.JComboBox<>();
        JLBL_TypeCard = new javax.swing.JLabel();
        JLBL_TypeCard1 = new javax.swing.JLabel();
        TXT_Card_CVV = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jMonthChooser1 = new com.toedter.calendar.JMonthChooser();
        jYearChooser1 = new com.toedter.calendar.JYearChooser();
        JBTN_Next = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Aruba_Icons_05.png"))); // NOI18N

        JLBL_Card01.setBackground(new java.awt.Color(255, 255, 255));
        JLBL_Card01.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        JLBL_Card01.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos8/Bank Card Back Side_15px.png"))); // NOI18N
        JLBL_Card01.setText("Número de tarjeta");

        guion01.setText("-");

        guion02.setText("-");

        guion03.setText("-");

        TXT_Card01.setForeground(new java.awt.Color(153, 153, 153));
        TXT_Card01.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TXT_Card01.setToolTipText("XXXX");
        TXT_Card01.setBorder(null);
        TXT_Card01.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        TXT_Card01.setOpaque(false);
        TXT_Card01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXT_Card01ActionPerformed(evt);
            }
        });
        TXT_Card01.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TXT_Card01KeyTyped(evt);
            }
        });

        TXT_Card02.setForeground(new java.awt.Color(153, 153, 153));
        TXT_Card02.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TXT_Card02.setToolTipText("XXXX");
        TXT_Card02.setBorder(null);
        TXT_Card02.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        TXT_Card02.setOpaque(false);
        TXT_Card02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXT_Card02ActionPerformed(evt);
            }
        });
        TXT_Card02.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TXT_Card02KeyTyped(evt);
            }
        });

        TXT_Card03.setForeground(new java.awt.Color(153, 153, 153));
        TXT_Card03.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TXT_Card03.setToolTipText("XXXX");
        TXT_Card03.setBorder(null);
        TXT_Card03.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        TXT_Card03.setOpaque(false);
        TXT_Card03.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXT_Card03ActionPerformed(evt);
            }
        });
        TXT_Card03.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TXT_Card03KeyTyped(evt);
            }
        });

        TXT_Card04.setForeground(new java.awt.Color(153, 153, 153));
        TXT_Card04.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TXT_Card04.setToolTipText("XXXX");
        TXT_Card04.setBorder(null);
        TXT_Card04.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        TXT_Card04.setOpaque(false);
        TXT_Card04.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXT_Card04ActionPerformed(evt);
            }
        });
        TXT_Card04.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TXT_Card04KeyTyped(evt);
            }
        });

        JLBL_Detalles.setBackground(new java.awt.Color(204, 204, 204));
        JLBL_Detalles.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        JLBL_Detalles.setForeground(new java.awt.Color(51, 102, 0));
        JLBL_Detalles.setText("DETALLES DE FORMA DE PAGO");

        JLBL_Expiracion.setBackground(new java.awt.Color(255, 255, 255));
        JLBL_Expiracion.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        JLBL_Expiracion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos8/Calendar_15px.png"))); // NOI18N
        JLBL_Expiracion.setText("Expiración");

        Panel_Proceso.setBackground(new java.awt.Color(0, 102, 0));
        Panel_Proceso.setPreferredSize(new java.awt.Dimension(571, 68));

        JLBL_Data_Personal.setBackground(new java.awt.Color(255, 255, 255));
        JLBL_Data_Personal.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        JLBL_Data_Personal.setForeground(new java.awt.Color(255, 255, 255));
        JLBL_Data_Personal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLBL_Data_Personal.setText("Datos");
        JLBL_Data_Personal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JLBL_Data_Personal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JLBL_Data_PersonalMouseClicked(evt);
            }
        });

        JLBL_WayPay.setBackground(new java.awt.Color(255, 255, 255));
        JLBL_WayPay.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        JLBL_WayPay.setForeground(new java.awt.Color(255, 255, 255));
        JLBL_WayPay.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLBL_WayPay.setText("Forma de pago");
        JLBL_WayPay.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        javax.swing.GroupLayout Panel_ProcesoLayout = new javax.swing.GroupLayout(Panel_Proceso);
        Panel_Proceso.setLayout(Panel_ProcesoLayout);
        Panel_ProcesoLayout.setHorizontalGroup(
            Panel_ProcesoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_ProcesoLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(JLBL_Data_Personal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(54, 54, 54)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74)
                .addComponent(JLBL_WayPay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(733, 733, 733))
        );
        Panel_ProcesoLayout.setVerticalGroup(
            Panel_ProcesoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_ProcesoLayout.createSequentialGroup()
                .addGroup(Panel_ProcesoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel_ProcesoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator2))
                    .addGroup(Panel_ProcesoLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(JLBL_WayPay)
                        .addGap(0, 13, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_ProcesoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(JLBL_Data_Personal)
                .addGap(24, 24, 24))
        );

        JCB_TypeCard.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Crédito", "Débito" }));
        JCB_TypeCard.setBorder(null);
        JCB_TypeCard.setOpaque(false);
        JCB_TypeCard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCB_TypeCardActionPerformed(evt);
            }
        });

        JLBL_TypeCard.setBackground(new java.awt.Color(255, 255, 255));
        JLBL_TypeCard.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        JLBL_TypeCard.setText("Tipo");

        JLBL_TypeCard1.setBackground(new java.awt.Color(255, 255, 255));
        JLBL_TypeCard1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        JLBL_TypeCard1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos8/Card Verification Value_15px.png"))); // NOI18N
        JLBL_TypeCard1.setText("CVV");

        TXT_Card_CVV.setForeground(new java.awt.Color(153, 153, 153));
        TXT_Card_CVV.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TXT_Card_CVV.setToolTipText("XXXX");
        TXT_Card_CVV.setBorder(null);
        TXT_Card_CVV.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        TXT_Card_CVV.setOpaque(false);
        TXT_Card_CVV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXT_Card_CVVActionPerformed(evt);
            }
        });
        TXT_Card_CVV.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TXT_Card_CVVKeyTyped(evt);
            }
        });

        jMonthChooser1.setOpaque(false);
        jMonthChooser1.setYearChooser(jYearChooser1);

        jYearChooser1.setOpaque(false);
        jYearChooser1.setYear(2017);

        JBTN_Next.setBackground(new java.awt.Color(0, 102, 51));
        JBTN_Next.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        JBTN_Next.setForeground(new java.awt.Color(255, 255, 255));
        JBTN_Next.setText("Siguiente");
        JBTN_Next.setBorder(null);
        JBTN_Next.setBorderPainted(false);
        JBTN_Next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBTN_NextActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(Panel_Proceso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JLBL_Detalles)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(JLBL_TypeCard)
                                    .addComponent(JCB_TypeCard, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(JLBL_Expiracion)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jMonthChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jYearChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JLBL_Card01)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(TXT_Card01, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(guion01)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TXT_Card02, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(guion02)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TXT_Card03, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(guion03)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TXT_Card04, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JLBL_TypeCard1)
                            .addComponent(TXT_Card_CVV, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(90, 90, 90))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(JBTN_Next, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(Panel_Proceso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(JLBL_Detalles)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JLBL_Card01)
                            .addComponent(JLBL_TypeCard1))
                        .addGap(13, 13, 13)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(guion01)
                            .addComponent(TXT_Card01, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TXT_Card02, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(guion02)
                            .addComponent(TXT_Card03, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(guion03)
                            .addComponent(TXT_Card04, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TXT_Card_CVV, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(JLBL_TypeCard)
                                    .addComponent(JLBL_Expiracion))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(JCB_TypeCard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jMonthChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jYearChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                .addComponent(JBTN_Next, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TXT_Card03KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXT_Card03KeyTyped
        if (TXT_Card03.getText().length() == limCharacter) {
            evt.consume();
            TXT_Card03.transferFocus();
        }
    }//GEN-LAST:event_TXT_Card03KeyTyped

    private void TXT_Card03ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXT_Card03ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXT_Card03ActionPerformed

    private void TXT_Card02KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXT_Card02KeyTyped
        if (TXT_Card02.getText().length() == limCharacter) {
            evt.consume();
            TXT_Card02.transferFocus();
        }
    }//GEN-LAST:event_TXT_Card02KeyTyped

    private void TXT_Card02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXT_Card02ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXT_Card02ActionPerformed

    private void TXT_Card01KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXT_Card01KeyTyped
        if (TXT_Card01.getText().length() == limCharacter) {
            evt.consume();
            TXT_Card01.transferFocus();
        }
    }//GEN-LAST:event_TXT_Card01KeyTyped

    private void TXT_Card01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXT_Card01ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXT_Card01ActionPerformed

    private void TXT_Card04ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXT_Card04ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXT_Card04ActionPerformed

    private void TXT_Card04KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXT_Card04KeyTyped
        if (TXT_Card04.getText().length() == limCharacter) {
            evt.consume();
            TXT_Card04.transferFocus();
        }
    }//GEN-LAST:event_TXT_Card04KeyTyped

    private void JLBL_Data_PersonalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JLBL_Data_PersonalMouseClicked

    }//GEN-LAST:event_JLBL_Data_PersonalMouseClicked

    private void JCB_TypeCardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCB_TypeCardActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JCB_TypeCardActionPerformed

    private void TXT_Card_CVVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXT_Card_CVVActionPerformed

    }//GEN-LAST:event_TXT_Card_CVVActionPerformed

    private void TXT_Card_CVVKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXT_Card_CVVKeyTyped
        if (TXT_Card_CVV.getText().length() == limCharacter) {
            evt.consume();
            TXT_Card04.transferFocus();
        }
    }//GEN-LAST:event_TXT_Card_CVVKeyTyped

    private void JBTN_NextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBTN_NextActionPerformed
        try {
            Tarjeta card = new Tarjeta();
            Controlador_Tarjeta registro = new Controlador_Tarjeta();
            reserva.VentanaReserva goReserva = new reserva.VentanaReserva();

            card.setNoTarjeta(getNoCard().trim());
            card.setCVV(Integer.parseInt(TXT_Card_CVV.getText()));
            card.setTipo(JCB_TypeCard.getSelectedItem().toString());
            card.setFecha(getFecha().trim());

            if (card.getNoTarjeta().equals("") || card.getCVV() == 0 || card.getTipo().equals("") || card.getFecha().equals("")) {
                limpiar();
            } else {
                registro.insertCard(card);
                this.setVisible(false);
                Thread.sleep(1000);
                goReserva.setVisible(true);
            }

        } catch (InterruptedException ex) {
            System.out.println(ex.getMessage());
        }

    }//GEN-LAST:event_JBTN_NextActionPerformed

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
            java.util.logging.Logger.getLogger(verifyCard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(verifyCard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(verifyCard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(verifyCard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new verifyCard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBTN_Next;
    public static javax.swing.JComboBox<String> JCB_TypeCard;
    private javax.swing.JLabel JLBL_Card01;
    private javax.swing.JLabel JLBL_Data_Personal;
    private javax.swing.JLabel JLBL_Detalles;
    private javax.swing.JLabel JLBL_Expiracion;
    private javax.swing.JLabel JLBL_TypeCard;
    private javax.swing.JLabel JLBL_TypeCard1;
    private javax.swing.JLabel JLBL_WayPay;
    private javax.swing.JPanel Panel_Proceso;
    private javax.swing.JTextField TXT_Card01;
    private javax.swing.JTextField TXT_Card02;
    private javax.swing.JTextField TXT_Card03;
    private javax.swing.JTextField TXT_Card04;
    private javax.swing.JTextField TXT_Card_CVV;
    private javax.swing.JLabel guion01;
    private javax.swing.JLabel guion02;
    private javax.swing.JLabel guion03;
    private javax.swing.JLabel jLabel2;
    private com.toedter.calendar.JMonthChooser jMonthChooser1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private com.toedter.calendar.JYearChooser jYearChooser1;
    // End of variables declaration//GEN-END:variables

    public String getNoCard() {
        String noCardF = "";
        String noCard01, noCard02, noCard03, noCard04;

        if (TXT_Card01.getText().equals("") || TXT_Card02.getText().equals("")
                || TXT_Card03.getText().equals("") || TXT_Card04.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Numero de tarjeta no válido");
            limpiar();
        } else {
            noCard01 = TXT_Card01.getText();
            noCard02 = TXT_Card02.getText();
            noCard03 = TXT_Card03.getText();
            noCard04 = TXT_Card04.getText();
            noCardF = noCard01 + noCard02 + noCard03 + noCard04;
        }

        return noCardF;
    }

    public String getFecha() {
        Calendar month = new GregorianCalendar();
        int monthP = month.get(Calendar.MONTH);
        String fecha = "", mes, año;
        if ((jYearChooser1.getYear()) == 2017) {
            if (jMonthChooser1.getMonth() <= monthP) {
                System.out.println(jMonthChooser1.getMonth()+"pr");
                JOptionPane.showMessageDialog(null, "Tarjeta expirada");
                limpiar();

            } else {
                mes = Integer.toString(jMonthChooser1.getMonth() + 1);
                año = Integer.toString(jYearChooser1.getYear());
                if ((jMonthChooser1.getMonth() + 1) >= 10) {
                    fecha = "" + año + "-" + mes + "-01";
                } else {
                    fecha = "" + año + "-0" + mes + "-01";
                }
            }
        } else if (jYearChooser1.getYear() > 2017) {
            mes = Integer.toString(jMonthChooser1.getMonth() + 1);
            año = Integer.toString(jYearChooser1.getYear());
            if ((jMonthChooser1.getMonth() + 1) >= 10) {
                fecha = "" + año + "-" + mes + "-01";
            } else {
                fecha = "" + año + "-0" + mes + "-01";
            }
        } else {
            JOptionPane.showMessageDialog(null, "Tarjeta expirada");
            limpiar();
        }
        return fecha;
    }

}