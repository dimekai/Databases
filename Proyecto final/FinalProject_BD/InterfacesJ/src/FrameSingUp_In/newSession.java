/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FrameSingUp_In;

import Relaciones.*;
import Conectores.*;
import java.sql.*;
import javax.swing.*;
import reserva.VentanaReserva;

/**
 *
 * @author Jesús Kaimorts Díaz Medina
 */
public class newSession extends javax.swing.JFrame {

    /**
     * Creates new form inicioSesion
     */
    public newSession() {
        initComponents();
        this.setLocationRelativeTo(null);
        limpiar();
    }

    public void limpiar() {
        JTXT_email.setText("");
        JTXT_password.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        JLBL_email = new javax.swing.JLabel();
        JTXT_email = new javax.swing.JTextField();
        JSP_email = new javax.swing.JSeparator();
        JLBL_password = new javax.swing.JLabel();
        JSP_password = new javax.swing.JSeparator();
        JTXT_password = new javax.swing.JPasswordField();
        JBTN_iniciaSesion = new javax.swing.JButton();
        LBL_backRegister = new javax.swing.JLabel();
        JLBL_RegisterGo = new javax.swing.JLabel();
        LBL_Exit = new javax.swing.JLabel();
        JLBL_backGround = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 254, 252));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JLBL_email.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        JLBL_email.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos8/Message_15px.png"))); // NOI18N
        JLBL_email.setText("Correo");
        jPanel3.add(JLBL_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 70, 20));

        JTXT_email.setBorder(null);
        JTXT_email.setOpaque(false);
        JTXT_email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTXT_emailActionPerformed(evt);
            }
        });
        jPanel3.add(JTXT_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 170, 20));
        jPanel3.add(JSP_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 170, 10));

        JLBL_password.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        JLBL_password.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos8/Password_15px_1.png"))); // NOI18N
        JLBL_password.setText("Contraseña");
        jPanel3.add(JLBL_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 100, 20));
        jPanel3.add(JSP_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 160, 10));

        JTXT_password.setText("jPasswordField1");
        JTXT_password.setBorder(null);
        JTXT_password.setOpaque(false);
        jPanel3.add(JTXT_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 160, -1));

        JBTN_iniciaSesion.setBackground(new java.awt.Color(126, 67, 194));
        JBTN_iniciaSesion.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        JBTN_iniciaSesion.setForeground(new java.awt.Color(255, 255, 255));
        JBTN_iniciaSesion.setText("Iniciar sesión");
        JBTN_iniciaSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBTN_iniciaSesionActionPerformed(evt);
            }
        });
        jPanel3.add(JBTN_iniciaSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 230, -1, -1));

        LBL_backRegister.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        LBL_backRegister.setForeground(new java.awt.Color(255, 255, 255));
        LBL_backRegister.setText("No tengo cuenta, quiero");
        jPanel3.add(LBL_backRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 140, -1));

        JLBL_RegisterGo.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        JLBL_RegisterGo.setForeground(new java.awt.Color(126, 67, 194));
        JLBL_RegisterGo.setText("Registrarme");
        JLBL_RegisterGo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JLBL_RegisterGoMouseClicked(evt);
            }
        });
        jPanel3.add(JLBL_RegisterGo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 270, -1, -1));

        LBL_Exit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LBL_Exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos8/Delete_15px_2.png"))); // NOI18N
        LBL_Exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LBL_ExitMouseClicked(evt);
            }
        });
        jPanel3.add(LBL_Exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 0, 40, 30));

        JLBL_backGround.setBackground(new java.awt.Color(64, 64, 115));
        JLBL_backGround.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Poema-viajar.jpg"))); // NOI18N
        jPanel3.add(JLBL_backGround, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 300));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JTXT_emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTXT_emailActionPerformed
        JTXT_email.transferFocus();
    }//GEN-LAST:event_JTXT_emailActionPerformed

    private void JBTN_iniciaSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBTN_iniciaSesionActionPerformed
        Cliente newSession = new Cliente();

        //Verificar campos llenos
        if (JTXT_email.getText().trim().equals("") && JTXT_password.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Campos incompletos");
            limpiar();
        } else {
            //Establecer conexión
            connectionMYSQL conectarSesion = new connectionMYSQL();
            Connection succesfulConnection;
            succesfulConnection= conectarSesion.getConnection();

            //Obtener datos ingresados
            Controlador_ClienteEmail cn = new Controlador_ClienteEmail();
            newSession.setEmail(JTXT_email.getText());
            newSession.setPassword(JTXT_password.getText());
            
            if (newSession.getEmail().equals("admin") && newSession.getPassword().equals("admin")) {
                Administrador admin = new Administrador();
                setVisible(false);
                admin.setVisible(true);
            }else{
                //Realizar consulta de para accedercuenta
            cn.accederCuenta(newSession, succesfulConnection);

            VentanaReserva goReserva = new VentanaReserva();
            this.setVisible(false);
            goReserva.TXT_email.setText(newSession.getEmail());
            goReserva.TXT_pss.setText(newSession.getPassword());
            goReserva.asignaProf();
            goReserva.setVisible(true);
            //Limpiar los campos
            limpiar();
            /*User_Profile gox = new User_Profile();
            gox.insertData(newSession, succesfulConnection);
            gox.setVisible(true);*/
            }
            
        }
    }//GEN-LAST:event_JBTN_iniciaSesionActionPerformed

    private void JLBL_RegisterGoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JLBL_RegisterGoMouseClicked
        setVisible(false);
        Registro register = new Registro();
        register.setVisible(true);
    }//GEN-LAST:event_JLBL_RegisterGoMouseClicked

    private void LBL_ExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LBL_ExitMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_LBL_ExitMouseClicked

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
            java.util.logging.Logger.getLogger(newSession.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(newSession.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(newSession.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(newSession.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new newSession().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBTN_iniciaSesion;
    private javax.swing.JLabel JLBL_RegisterGo;
    private javax.swing.JLabel JLBL_backGround;
    private javax.swing.JLabel JLBL_email;
    private javax.swing.JLabel JLBL_password;
    private javax.swing.JSeparator JSP_email;
    private javax.swing.JSeparator JSP_password;
    private javax.swing.JTextField JTXT_email;
    private javax.swing.JPasswordField JTXT_password;
    private javax.swing.JLabel LBL_Exit;
    private javax.swing.JLabel LBL_backRegister;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables

}
