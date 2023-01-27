/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package MyApp;

import Database.Data_Credentials;
import Database.MySQLConnector;
import Database.EncryptionDecryption;
import com.formdev.flatlaf.FlatIntelliJLaf;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author True Gaming
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        FrameCenter.centerJFrame(this);
    }
    NewUser newUser;
    MainMenu mainMenu;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        titleText = new javax.swing.JLabel();
        LoginText = new javax.swing.JLabel();
        descriptionText = new javax.swing.JLabel();
        passwordText = new javax.swing.JLabel();
        usernameText = new javax.swing.JLabel();
        loginBtn = new javax.swing.JButton();
        usernameFld = new javax.swing.JTextField();
        exitBtn = new javax.swing.JButton();
        passwordFld = new javax.swing.JPasswordField();
        LoginBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("User Login");
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titleText.setFont(new java.awt.Font("Myanmar Text", 1, 100)); // NOI18N
        titleText.setForeground(new java.awt.Color(255, 255, 255));
        titleText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleText.setText("WinQueue");
        jPanel1.add(titleText, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 520, 130));

        LoginText.setFont(new java.awt.Font("Myanmar Text", 1, 30)); // NOI18N
        LoginText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LoginText.setText("Log in");
        jPanel1.add(LoginText, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 130, 280, 80));

        descriptionText.setFont(new java.awt.Font("Myanmar Text", 1, 20)); // NOI18N
        descriptionText.setForeground(new java.awt.Color(255, 255, 255));
        descriptionText.setText("Ticket Management System for Winrock International");
        jPanel1.add(descriptionText, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 520, 42));

        passwordText.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        passwordText.setForeground(new java.awt.Color(51, 51, 51));
        passwordText.setText("Password:");
        jPanel1.add(passwordText, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 300, 130, 20));

        usernameText.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        usernameText.setForeground(new java.awt.Color(51, 51, 51));
        usernameText.setText("Username:");
        jPanel1.add(usernameText, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 220, -1, -1));

        loginBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/LoginButton.png"))); // NOI18N
        loginBtn.setBorderPainted(false);
        loginBtn.setContentAreaFilled(false);
        loginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtnActionPerformed(evt);
            }
        });
        jPanel1.add(loginBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 380, 140, 40));
        jPanel1.add(usernameFld, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 260, 290, -1));

        exitBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/exitButton.png"))); // NOI18N
        exitBtn.setBorderPainted(false);
        exitBtn.setContentAreaFilled(false);
        exitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBtnActionPerformed(evt);
            }
        });
        jPanel1.add(exitBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 440, 60, 30));
        jPanel1.add(passwordFld, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 330, 290, -1));

        LoginBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/LoginBackground.png"))); // NOI18N
        jPanel1.add(LoginBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 970, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel1.getAccessibleContext().setAccessibleName("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtnActionPerformed
        // TODO add your handling code here:

        PreparedStatement ps;
        ResultSet rs;
        Data_Credentials login = new Data_Credentials();
        MySQLConnector connector;
        connector = MySQLConnector.getInstance();
        String username = usernameFld.getText();
        String password = passwordFld.getText();

        // Check if the username and password fields are not blank
        if (username.equals("") || password.equals("")) {
            JOptionPane.showMessageDialog(null, "All fields must not be blank!", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            EncryptionDecryption encryptionDecryption = new EncryptionDecryption();
            // Encrypt the password
            byte[] encryptedPassword = encryptionDecryption.encrypt(password);

            // Check if encryption was successful
            if (encryptedPassword != null) {
                // Query the credentials table to check if the entered username and encrypted password match
                String qry = "SELECT * FROM credentials WHERE username='" + username + "' && password = '" + new String(encryptedPassword) + "'";

                try {
                    Connection conn = connector.getConnection();
                    if (conn != null) {
                        ps = conn.prepareStatement(qry);
                        rs = ps.executeQuery();
                        if (rs.next()) {
                            String acctype = rs.getString("acctype");
                            if (acctype.equals("Administrator") || acctype.equals("Employee")) {
                                // Decrypt the password
                                password = encryptionDecryption.decrypt(rs.getBytes("password"));

                                MainMenu user = new MainMenu();
                                //insert pass information here for acctype, firstname, lastname, department
                                user.setAcctype(rs.getString("acctype"));
                                user.setFirstname(rs.getString("firstname"));
                                user.setLastname(rs.getString("lastname"));
                                user.setDepartment(rs.getString("department"));
                                user.show();
                            }
                            dispose();
                        } else {
                            JOptionPane.showMessageDialog(null, "The credentials provided doesn't match!", "Error", JOptionPane.ERROR_MESSAGE);
                            usernameFld.setText("");
                            passwordFld.setText("");
                        }
                        ps.close();
                        rs.close();
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
                }                
// modify so that it uses the MySQLConnector and Data_Credentials instead.
//                try {
//                    Connection conn = connector.getConnection();
//                    if (conn != null) {
//                        ps = conn.prepareStatement(qry);
//                        rs = ps.executeQuery();
//                        if (rs.next()) {
//                            String acctype = rs.getString("acctype");
//                            if (acctype.equals("Administrator") || acctype.equals("Employee")) {
//                                // Decrypt the password
//                                password = encryptionDecryption.decrypt(rs.getBytes("password"));
//
//                                MainMenu user = new MainMenu();
//                                //insert pass information here for acctype, firstname, lastname, department
//                                user.setAcctype(rs.getString("acctype"));
//                                user.setFirstname(rs.getString("firstname"));
//                                user.setLastname(rs.getString("lastname"));
//                                user.setDepartment(rs.getString("department"));
//                                user.show();
//                            }
//                            dispose();
//                        } else {
//                            JOptionPane.showMessageDialog(null, "The credentials provided doesn't match!", "Error", JOptionPane.ERROR_MESSAGE);
//                            usernameFld.setText("");
//                            passwordFld.setText("");
//                        }
//                        ps.close();
//                        rs.close();
//                    }
//                } catch (SQLException ex) {
//                    Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
//                }
            }
        }
    }//GEN-LAST:event_loginBtnActionPerformed

    private void exitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBtnActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exitBtnActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        try {
            UIManager.setLookAndFeel(new FlatIntelliJLaf());
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    new Login().setVisible(true);
                }
            });
        } catch (Exception ex) {
            System.err.println("Failed to initialize LaF");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LoginBackground;
    private javax.swing.JLabel LoginText;
    private javax.swing.JLabel descriptionText;
    private javax.swing.JButton exitBtn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton loginBtn;
    private javax.swing.JPasswordField passwordFld;
    private javax.swing.JLabel passwordText;
    private javax.swing.JLabel titleText;
    private javax.swing.JTextField usernameFld;
    private javax.swing.JLabel usernameText;
    // End of variables declaration//GEN-END:variables
}
