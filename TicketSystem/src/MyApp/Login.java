/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package MyApp;

import Database.Credentials;
import Database.Data_Credentials;
import Database.EncryptionDecryption;
import com.formdev.flatlaf.FlatIntelliJLaf;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

/**
 *
 * @OriginalAuthors @drgimatt, @paulreonal, & @YumenoRetort
 * Login - JFrame containing the Login Screen. 
 * It also contains the Login Process.
 * 
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        FrameCenter.centerJFrame(this);
    }
    
    MainMenu menu;
    Data_Credentials login = new Data_Credentials();
    ArrayList<Credentials> user;
    String username, password, accType, fname, lname, dept, empID , uname, pass = "";
    ScheduledExecutorService executorService = Executors.newScheduledThreadPool(1);
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Loadtext = new javax.swing.JLabel();
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
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(Loadtext, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 360, 60, 20));

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

        usernameFld.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                usernameFldKeyPressed(evt);
            }
        });
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

        passwordFld.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passwordFldKeyPressed(evt);
            }
        });
        jPanel1.add(passwordFld, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 330, 290, -1));

        LoginBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/LoginBackground.png"))); // NOI18N
        jPanel1.add(LoginBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 970, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
        jPanel1.getAccessibleContext().setAccessibleName("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtnActionPerformed
        // TODO add your handling code here:
        Loadtext.setText("Loading...");
        executorService.schedule((Runnable) () -> executeLogin(), 3, TimeUnit.SECONDS);  
        //executorService.shutdownNow();
    }//GEN-LAST:event_loginBtnActionPerformed

    private void debugTest(){
        System.out.println("tst");
    }
    
    private void exitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBtnActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exitBtnActionPerformed

    private void executeLogin (){
        boolean btn = false;
        System.out.println("Login SQL process initiated");
        username = usernameFld.getText();
        password = passwordFld.getText();
        loginBtn.setDisabledIcon(loginBtn.getIcon());
        loginBtn.setEnabled(btn);
        // Check if the username and password fields are not blank
        if (username.trim().isEmpty()|| password.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "All fields must not be blank!", "Error", JOptionPane.ERROR_MESSAGE);
            Loadtext.setText("");
        } 
        else {
            try {
                EncryptionDecryption hash = new EncryptionDecryption();
                // Encrypt the password
                // Check if encryption was successful
                // Query the credentials table to check if the entered username and encrypted password match
                String qry = "credentials WHERE username='" + username + "' && password = '" + hash.encrypt(password) + "'";
                accType = "";
                fname = "";
                lname = "";
                dept = "";
                empID = "";
                uname = "napakahabakasetesterasf";
                pass = "napakahabakasetesterasf";
                try {
                    user = login.ShowRec(qry);
                        for(Credentials u: user){
                            accType = u.getActType();
                            fname = u.getF_name();
                            lname = u.getL_name();
                            dept = u.getDepartment();
                            empID = u.getEmpnum();
                            uname = u.getU_name();
                            pass = u.getPass();
                            if (accType.equals("Administrator") || accType.equals("Employee") || accType.equals("Superadmin")) {
                                menu = new MainMenu(accType,fname,lname,dept,empID);
                                menu.show();
                                dispose();
                                break;
                            }                        

                            else if (!accType.equals("Administrator") || !accType.equals("Employee") || !accType.equals("Superadmin")){
                                JOptionPane.showMessageDialog(null, "Account Type is not supported", "Information Test", JOptionPane.INFORMATION_MESSAGE);
                                Loadtext.setText("");
                                break;
                            }
                        }
                        if (login.ShowRec("credentials").isEmpty()){
                            JOptionPane.showMessageDialog(null, "Cannot connect to database. Please try again.", "Error", JOptionPane.ERROR_MESSAGE);
                            
                        }                        
                        else if (user.isEmpty()){
                            JOptionPane.showMessageDialog(null, "The credentials dooesn't match!", "Error", JOptionPane.ERROR_MESSAGE);                            
                        }

                        usernameFld.setText("");
                        passwordFld.setText("");
                        Loadtext.setText("");  
                    

            } catch (Exception ex) {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            }                              

            } catch (Exception ex) {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            }                 

        }
        btn = true;
        loginBtn.setEnabled(btn);
}
    
    private void usernameFldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_usernameFldKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
        Loadtext.setText("Loading...");
        executorService.schedule((Runnable) () -> executeLogin(), 3, TimeUnit.SECONDS);  
        //executorService.shutdownNow();
        }
    }//GEN-LAST:event_usernameFldKeyPressed

    private void passwordFldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordFldKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
        Loadtext.setText("Loading...");
        executorService.schedule((Runnable) () -> executeLogin(), 3, TimeUnit.SECONDS);  
        //executorService.shutdownNow();
        }
    }//GEN-LAST:event_passwordFldKeyPressed

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
    private javax.swing.JLabel Loadtext;
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
