/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacesj;


import Relaciones.Cliente;
import Conectores.*;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Home
 */
public class Registro extends javax.swing.JFrame {

    /**
     * Creates new form Registro
     */
    public Registro() {
        initComponents();
        this.setLocationRelativeTo(null);
        limpiar();
    }

    public void limpiar() {
        TXTNombre.setText("");
        TXTAPat.setText("");
        TXTAM.setText("");
        TXTEmail.setText("");
        TXTPassword.setText("");
        TXTConfirmPassword.setText("");
    }

    public void bloquear() {
        TXTNombre.setEnabled(false);
        TXTAPat.setEnabled(false);
        TXTAM.setEnabled(false);
        TXTEmail.setEnabled(false);
        TXTPassword.setEnabled(false);
        TXTConfirmPassword.setEnabled(false);
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BTNSalir = new javax.swing.JButton();
        jLabelUserIcon = new javax.swing.JLabel();
        jLabelNombre = new javax.swing.JLabel();
        jLabelApellido = new javax.swing.JLabel();
        jLabelPassword = new javax.swing.JLabel();
        jLabelConfirmPSSW = new javax.swing.JLabel();
        jLabelAM = new javax.swing.JLabel();
        jLabelEmail = new javax.swing.JLabel();
        jLabelRegisterUser = new javax.swing.JLabel();
        jLabelnewUser = new javax.swing.JLabel();
        jLabelCorreoUserRegister = new javax.swing.JLabel();
        jLabelPSSWUserRegister = new javax.swing.JLabel();
        jTextFieldcorreoUserRegister = new javax.swing.JTextField();
        jPasswordFieldPSSWUserRegister = new javax.swing.JPasswordField();
        TXTNombre = new javax.swing.JTextField();
        TXTAPat = new javax.swing.JTextField();
        TXTAM = new javax.swing.JTextField();
        TXTEmail = new javax.swing.JTextField();
        TXTPassword = new javax.swing.JPasswordField();
        TXTConfirmPassword = new javax.swing.JPasswordField();
        BTNRegistrarse = new javax.swing.JButton();
        BTNIniciarSesion = new javax.swing.JButton();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BTNSalir.setBackground(new java.awt.Color(0, 0, 51));
        BTNSalir.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BTNSalir.setForeground(new java.awt.Color(255, 255, 255));
        BTNSalir.setText("Salir");
        BTNSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNSalirActionPerformed(evt);
            }
        });
        getContentPane().add(BTNSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 10, -1, -1));

        jLabelUserIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/UserLogo.png"))); // NOI18N
        getContentPane().add(jLabelUserIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 230, 210));

        jLabelNombre.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelNombre.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNombre.setText("Nombre(s): ");
        getContentPane().add(jLabelNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 60, -1, -1));

        jLabelApellido.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelApellido.setForeground(new java.awt.Color(255, 255, 255));
        jLabelApellido.setText("Apellido Paterno: ");
        getContentPane().add(jLabelApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 100, -1, -1));

        jLabelPassword.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelPassword.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPassword.setText("Contraseña: ");
        getContentPane().add(jLabelPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 220, -1, -1));

        jLabelConfirmPSSW.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelConfirmPSSW.setForeground(new java.awt.Color(255, 255, 255));
        jLabelConfirmPSSW.setText("Confirmar contraseña:");
        getContentPane().add(jLabelConfirmPSSW, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 260, -1, -1));

        jLabelAM.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelAM.setForeground(new java.awt.Color(255, 255, 255));
        jLabelAM.setText("Apellido Materno:");
        getContentPane().add(jLabelAM, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 140, -1, -1));

        jLabelEmail.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelEmail.setForeground(new java.awt.Color(255, 255, 255));
        jLabelEmail.setText("Correo:");
        getContentPane().add(jLabelEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 180, -1, -1));

        jLabelRegisterUser.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelRegisterUser.setForeground(new java.awt.Color(255, 255, 255));
        jLabelRegisterUser.setText("Usuario Registrado");
        getContentPane().add(jLabelRegisterUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, -1, -1));

        jLabelnewUser.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelnewUser.setForeground(new java.awt.Color(255, 255, 255));
        jLabelnewUser.setText("Nuevo Usuario");
        getContentPane().add(jLabelnewUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabelCorreoUserRegister.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelCorreoUserRegister.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCorreoUserRegister.setText("Correo: ");
        getContentPane().add(jLabelCorreoUserRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 390, -1, -1));

        jLabelPSSWUserRegister.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelPSSWUserRegister.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPSSWUserRegister.setText("Contraseña:");
        getContentPane().add(jLabelPSSWUserRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 420, -1, -1));

        jTextFieldcorreoUserRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldcorreoUserRegisterActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldcorreoUserRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 390, 140, -1));

        jPasswordFieldPSSWUserRegister.setText("jPasswordField2");
        getContentPane().add(jPasswordFieldPSSWUserRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 420, 140, -1));

        TXTNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTNombreActionPerformed(evt);
            }
        });
        getContentPane().add(TXTNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 60, 140, -1));

        TXTAPat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTAPatActionPerformed(evt);
            }
        });
        getContentPane().add(TXTAPat, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 100, 140, -1));

        TXTAM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTAMActionPerformed(evt);
            }
        });
        getContentPane().add(TXTAM, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 140, 140, -1));

        TXTEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTEmailActionPerformed(evt);
            }
        });
        getContentPane().add(TXTEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 180, 140, 30));

        TXTPassword.setText("jPasswordField1");
        TXTPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTPasswordActionPerformed(evt);
            }
        });
        getContentPane().add(TXTPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 220, 140, -1));

        TXTConfirmPassword.setText("jPasswordField2");
        TXTConfirmPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTConfirmPasswordActionPerformed(evt);
            }
        });
        getContentPane().add(TXTConfirmPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 260, 140, -1));

        BTNRegistrarse.setBackground(new java.awt.Color(0, 0, 51));
        BTNRegistrarse.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BTNRegistrarse.setForeground(new java.awt.Color(255, 255, 255));
        BTNRegistrarse.setText("Registrarse");
        BTNRegistrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNRegistrarseActionPerformed(evt);
            }
        });
        getContentPane().add(BTNRegistrarse, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 300, -1, -1));

        BTNIniciarSesion.setBackground(new java.awt.Color(0, 0, 51));
        BTNIniciarSesion.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BTNIniciarSesion.setForeground(new java.awt.Color(255, 255, 255));
        BTNIniciarSesion.setText("Iniciar Sesión");
        BTNIniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNIniciarSesionActionPerformed(evt);
            }
        });
        getContentPane().add(BTNIniciarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 420, -1, -1));

        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoAzul2.jpg"))); // NOI18N
        jLabelFondo.setMaximumSize(new java.awt.Dimension(560, 600));
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTNSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_BTNSalirActionPerformed

    private void BTNRegistrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNRegistrarseActionPerformed

        Cliente user = new Cliente();

        user.setNombre(TXTNombre.getText());
        user.setA_Paterno(TXTAPat.getText());
        user.setA_Materno(TXTAM.getText());
        user.setEmail(TXTEmail.getText());
        user.setPassword(TXTPassword.getText());
        user.setConfirmPassword(TXTConfirmPassword.getText());

        /*if ((user.getPassword()).equalsIgnoreCase(user.getConfirmPassword())) {
            Controlador_Tarjeta conexion = new Controlador_Tarjeta();
            Connection conectar = conexion.getConnection();

            if (conectar != null) {
                JOptionPane.showMessageDialog(null, "Registrando");
                String url = "jdbc:mysql://localhost:3306/", nameBD = "Agencia";

                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection cn = DriverManager.getConnection(url + nameBD, "root", "root1");
                    Controlador_Tarjeta registro = new Controlador_Tarjeta();
                    conexion.insertar(user, cn);

                } catch (ClassNotFoundException | SQLException ex) {
                    System.out.print(ex.getMessage());
                    System.exit(0);
                }
                limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "Conexión fallida.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "La contraseña no conicide");
            limpiar();
        }*/

    }//GEN-LAST:event_BTNRegistrarseActionPerformed

    private void TXTConfirmPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTConfirmPasswordActionPerformed
        TXTConfirmPassword.transferFocus();
    }//GEN-LAST:event_TXTConfirmPasswordActionPerformed

    private void TXTAPatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTAPatActionPerformed
        TXTAPat.transferFocus();
    }//GEN-LAST:event_TXTAPatActionPerformed

    private void TXTEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTEmailActionPerformed
        TXTEmail.transferFocus();
    }//GEN-LAST:event_TXTEmailActionPerformed

    private void jTextFieldcorreoUserRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldcorreoUserRegisterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldcorreoUserRegisterActionPerformed

    private void BTNIniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNIniciarSesionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BTNIniciarSesionActionPerformed

    private void TXTNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTNombreActionPerformed
        TXTNombre.transferFocus();
    }//GEN-LAST:event_TXTNombreActionPerformed

    private void TXTAMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTAMActionPerformed
        TXTAM.transferFocus();
    }//GEN-LAST:event_TXTAMActionPerformed

    private void TXTPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTPasswordActionPerformed
        TXTPassword.transferFocus();
    }//GEN-LAST:event_TXTPasswordActionPerformed

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
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNIniciarSesion;
    private javax.swing.JButton BTNRegistrarse;
    private javax.swing.JButton BTNSalir;
    private javax.swing.JTextField TXTAM;
    private javax.swing.JTextField TXTAPat;
    private javax.swing.JPasswordField TXTConfirmPassword;
    private javax.swing.JTextField TXTEmail;
    private javax.swing.JTextField TXTNombre;
    private javax.swing.JPasswordField TXTPassword;
    private javax.swing.JLabel jLabelAM;
    private javax.swing.JLabel jLabelApellido;
    private javax.swing.JLabel jLabelConfirmPSSW;
    private javax.swing.JLabel jLabelCorreoUserRegister;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelPSSWUserRegister;
    private javax.swing.JLabel jLabelPassword;
    private javax.swing.JLabel jLabelRegisterUser;
    private javax.swing.JLabel jLabelUserIcon;
    private javax.swing.JLabel jLabelnewUser;
    private javax.swing.JPasswordField jPasswordFieldPSSWUserRegister;
    private javax.swing.JTextField jTextFieldcorreoUserRegister;
    // End of variables declaration//GEN-END:variables
}