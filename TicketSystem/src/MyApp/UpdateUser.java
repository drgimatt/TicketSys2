/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package MyApp;

import com.formdev.flatlaf.FlatIntelliJLaf;
import Database.Credentials;
import Database.Data_Credentials;
import Database.EncryptionDecryption;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Year;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @OriginalAuthors @drgimatt & @YumenoRetort
 * UpdateUser - JFrame containing the User update function of the system.
 * 
 */
public class UpdateUser extends javax.swing.JFrame {

    /**
     * Creates new form NewUser
     */
    public UpdateUser() {
        initComponents();
        FrameCenter.centerJFrame(this);
        setResizable(false);
    }
    
    public UpdateUser(String privilage, String department){
        this.privilage = privilage;
        this.department = department;
        initComponents();
        FrameCenter.centerJFrame(this);
        setResizable(false);
        setInterface(privilage);
    }
    
    private String privilage, firstname, lastname, department, empid, username;
    Data_Credentials creds = new Data_Credentials();
    ArrayList<Credentials> user;    
    Login login;
    boolean enableAccType = false;
    int num = 0;
    List<String> array = new ArrayList<>();
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        resetBttn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        usernameFld = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        f_namefld = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        acctypeSel = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        m_namefld = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        l_namefld = new javax.swing.JTextField();
        m_numfld = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        em_addfld = new javax.swing.JTextField();
        UpdateAccountBttn = new javax.swing.JButton();
        cancelBttn1 = new javax.swing.JButton();
        passFld = new javax.swing.JPasswordField();
        passConFld = new javax.swing.JPasswordField();
        empIDFld = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        posFld = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        birthday = new com.toedter.calendar.JDateChooser();
        deptFld = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        resFld = new javax.swing.JTextArea();
        jLabel16 = new javax.swing.JLabel();
        genderFld = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        dateStart = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        resetBttn.setBackground(new java.awt.Color(204, 153, 0));
        resetBttn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        resetBttn.setForeground(new java.awt.Color(255, 255, 255));
        resetBttn.setText("Reset");
        resetBttn.setBorder(new javax.swing.border.MatteBorder(null));
        resetBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetBttnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Update Existing Account");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Ticket Management System for Winrock International");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setText("Username: ");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setText("Password:");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel5.setText("Confirm Password:");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel6.setText("Residence:");

        jLabel7.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel7.setText("First Name:");

        acctypeSel.setBackground(new java.awt.Color(0, 102, 204));
        acctypeSel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        acctypeSel.setForeground(new java.awt.Color(255, 255, 255));
        acctypeSel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Employee", "Administrator", "Superadmin" }));
        acctypeSel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        acctypeSel.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                acctypeSelItemStateChanged(evt);
            }
        });
        acctypeSel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acctypeSelActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel8.setText("Middle Name:");

        jLabel9.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel9.setText("Last Name:");

        jLabel10.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel10.setText("Mobile Number:");

        jLabel11.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel11.setText("Email:");

        UpdateAccountBttn.setBackground(new java.awt.Color(0, 153, 51));
        UpdateAccountBttn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        UpdateAccountBttn.setForeground(new java.awt.Color(255, 255, 255));
        UpdateAccountBttn.setText("Update Account");
        UpdateAccountBttn.setBorder(new javax.swing.border.MatteBorder(null));
        UpdateAccountBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateAccountBttnActionPerformed(evt);
            }
        });

        cancelBttn1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        cancelBttn1.setText("Cancel");
        cancelBttn1.setBorder(new javax.swing.border.MatteBorder(null));
        cancelBttn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBttn1ActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel12.setText("Employee ID:");

        jLabel13.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel13.setText("Department:");

        posFld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                posFldActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel14.setText("Position:");

        jLabel15.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel15.setText("Birthday:");

        deptFld.setBackground(new java.awt.Color(0, 102, 204));
        deptFld.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        deptFld.setForeground(new java.awt.Color(255, 255, 255));
        deptFld.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Technical", "Financial", "Operations ", "Legal", "Engineering", "Logistics", "Marketing", "Administration" }));
        deptFld.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        resFld.setColumns(20);
        resFld.setLineWrap(true);
        resFld.setRows(5);
        jScrollPane1.setViewportView(resFld);

        jLabel16.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel16.setText("Account Type:");

        genderFld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genderFldActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel17.setText("Gender:");

        jLabel18.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel18.setText("Start Date:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(233, 233, 233)
                .addComponent(jLabel2)
                .addContainerGap(210, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel8)
                                .addComponent(jLabel7)
                                .addComponent(jLabel12))
                            .addGap(41, 41, 41)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(f_namefld)
                                .addComponent(l_namefld)
                                .addComponent(m_namefld)
                                .addComponent(m_numfld)
                                .addComponent(empIDFld, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(jLabel9)
                        .addComponent(jLabel10))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17)
                            .addComponent(jLabel15)
                            .addComponent(jLabel18))
                        .addGap(69, 69, 69)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(birthday, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                            .addComponent(genderFld)
                            .addComponent(dateStart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(em_addfld)))
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel14)
                            .addComponent(jLabel13)
                            .addComponent(jLabel16)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(usernameFld)
                            .addComponent(passFld)
                            .addComponent(passConFld)
                            .addComponent(acctypeSel, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(posFld)
                            .addComponent(deptFld, 0, 176, Short.MAX_VALUE))
                        .addGap(54, 54, 54))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(UpdateAccountBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(resetBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cancelBttn1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(249, 249, 249))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(188, 188, 188))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(empIDFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13)
                    .addComponent(deptFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(f_namefld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel14))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(m_namefld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel9)
                                    .addComponent(l_namefld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel10)
                                    .addComponent(m_numfld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel11)
                                .addComponent(em_addfld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel16)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(posFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(usernameFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(passFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(passConFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))
                                .addGap(18, 18, 18)
                                .addComponent(acctypeSel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4)))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(birthday, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel17)
                                    .addComponent(genderFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel6)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(dateStart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jScrollPane1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UpdateAccountBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(resetBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelBttn1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelBttn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBttn1ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_cancelBttn1ActionPerformed

    private void UpdateAccountBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateAccountBttnActionPerformed
        try {                                                  
            // TODO add your handling code here:
            EncryptionDecryption hash = new EncryptionDecryption();
            boolean emailAddCorFormat = false; // implement email format check
            SimpleDateFormat dFormat = new SimpleDateFormat("yyyy-MM-dd");
            SimpleDateFormat birthYear = new SimpleDateFormat("yyyy");
            int currYear = Year.now().getValue();
            String fname = f_namefld.getText();
            String mname = m_namefld.getText();
            String lname = l_namefld.getText();
            String email = em_addfld.getText();
            char[] ch = email.toCharArray();
            CharSequence seq = new StringBuilder(1).append(ch);
            String regex = "^(.+)@(.+)$";
            //Compile regular expression to get the pattern
            Pattern pattern = Pattern.compile(regex);
            
            for(char eml : ch){
                //Create instance of matcher
                Matcher matcher = pattern.matcher(seq);
                if(matcher.matches()==false){  
                    JOptionPane.showMessageDialog(null,"Invalid Email");
                }
                else
                    emailAddCorFormat = true;
            }
            String mnum = m_numfld.getText();
            String uname = usernameFld.getText();
            String pass = passFld.getText(); //
            String conpass = passConFld.getText();
            String acttyp = acctypeSel.getSelectedItem().toString();
            String empnum = empIDFld.getText();
            
            String bday = "";
            String sdate = "";
            int age = 0;
            
            try {
                bday = dFormat.format(birthday.getDate());
            } catch (Exception ex) {
                //Logger.getLogger(NewUser.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, "Birthdate was not provided.","Missing Birthdate",JOptionPane.ERROR_MESSAGE);
                System.out.println("Blank field - Birthdate");
            }
            
            try {
                sdate = dFormat.format(dateStart.getDate());
            } catch (Exception ex) {
                //Logger.getLogger(NewUser.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, "Startdate was not provided.","Missing Startdate",JOptionPane.ERROR_MESSAGE);
                System.out.println("Blank field - Birthdate");
            }
            
            try {
                age = currYear - Integer.parseInt(birthYear.format(birthday.getDate()));
            } catch (Exception ex) {
                //Logger.getLogger(NewUser.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println("Age cannot be computed");
            }
            
            String gender = genderFld.getText();
            String resi = resFld.getText();
            String dep = deptFld.getSelectedItem().toString();
            String pos = posFld.getText();
            List<String> array = Arrays.asList(empnum, uname, pass, email, fname, mname, lname, mnum, gender, resi, pos, sdate, bday); 
            boolean passAreEqual = pass.equals(conpass);
            if (passAreEqual && emailAddCorFormat && checkFields(array).equals("valid")){ //add appropriate checks for user-provided data
                pass = hash.encrypt(pass);
                String table = "credentials";
                Data_Credentials creds = new Data_Credentials();
                Credentials information = new Credentials (num,empnum,uname,pass,email,fname,mname,lname,age,bday,mnum,gender,resi,acttyp,sdate,dep,pos);
                creds.editRow(table,information);
                clearflds();
                dispose();
            }
            else if (checkFields(array).equals("not valid")){
                JOptionPane.showMessageDialog(null, "All fields must not be blank","Missing fields",JOptionPane.ERROR_MESSAGE);
            }
            else if (emailAddCorFormat == false){
                JOptionPane.showMessageDialog(null, "The email provided is not acceptable","Email Not Accepted",JOptionPane.ERROR_MESSAGE);
            }
            else if (passAreEqual == false){
                JOptionPane.showMessageDialog(null, "The passwords entered don't match!","Password Mismatch",JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception ex) {
            Logger.getLogger(UpdateUser.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_UpdateAccountBttnActionPerformed

    private String checkFields(List<String> strings){
        for (String s : strings) {
        if (s == null || s.trim().isEmpty()) {
            System.out.println(s);
            return "not valid";
        }
    }
        return "valid";
    }    
    
    private void resetBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetBttnActionPerformed
        // TODO add your handling code here:
        clearflds();
    }//GEN-LAST:event_resetBttnActionPerformed

    private void posFldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_posFldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_posFldActionPerformed

    private void genderFldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genderFldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_genderFldActionPerformed

    private void acctypeSelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acctypeSelActionPerformed
        // TODO add your handling code here:
        if (enableAccType == true){
        if(acctypeSel.getSelectedItem() == "Superadmin"){
        String qry = "SELECT COUNT(*) FROM credentials WHERE acctype='Superadmin'";
        try {
            user = creds.ShowRec(qry);          
                if (!user.isEmpty() && user.get(1).equals("0")) {
                        JOptionPane.showMessageDialog(null, "There is already a Superadmin account", "Error", JOptionPane.ERROR_MESSAGE);
                        acctypeSel.setSelectedIndex(0);
                }        
        } catch (Exception ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            }
        }       
      } 
    }//GEN-LAST:event_acctypeSelActionPerformed

    private void acctypeSelItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_acctypeSelItemStateChanged
        // TODO add your handling code here:      
    }//GEN-LAST:event_acctypeSelItemStateChanged

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
            java.util.logging.Logger.getLogger(UpdateUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        try{
        UIManager.setLookAndFeel( new FlatIntelliJLaf() );
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateUser().setVisible(true);
            }
        });
        }catch( Exception ex ) {
                System.err.println( "Failed to initialize LaF" );
            }    
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton UpdateAccountBttn;
    private javax.swing.JComboBox<String> acctypeSel;
    private com.toedter.calendar.JDateChooser birthday;
    private javax.swing.JButton cancelBttn1;
    private com.toedter.calendar.JDateChooser dateStart;
    private javax.swing.JComboBox<String> deptFld;
    private javax.swing.JTextField em_addfld;
    private javax.swing.JTextField empIDFld;
    private javax.swing.JTextField f_namefld;
    private javax.swing.JTextField genderFld;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField l_namefld;
    private javax.swing.JTextField m_namefld;
    private javax.swing.JTextField m_numfld;
    private javax.swing.JPasswordField passConFld;
    private javax.swing.JPasswordField passFld;
    private javax.swing.JTextField posFld;
    private javax.swing.JTextArea resFld;
    private javax.swing.JButton resetBttn;
    private javax.swing.JTextField usernameFld;
    // End of variables declaration//GEN-END:variables

    private void clearflds() {
        String t = "";
        empIDFld.setText(t);
        posFld.setText(t);
        resFld.setText(t);
        genderFld.setText(t);
        f_namefld.setText(t);
        m_namefld.setText(t);
        l_namefld.setText(t);
        m_numfld.setText(t);
        em_addfld.setText(t);
        usernameFld.setText(t);
        passFld.setText(t);
        passConFld.setText(t);
        acctypeSel.setSelectedIndex(0);
        deptFld.setSelectedIndex(0);
        birthday.setCalendar(null);
        dateStart.setCalendar(null);
    }
    
    public void populateflds(String t) throws ParseException{
        try {
            EncryptionDecryption hash = new EncryptionDecryption();
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
            ArrayList<Credentials> userinfo;
            Data_Credentials creds = new Data_Credentials();
            String parameters = "credentials WHERE empnum = '" + t + "'";
            userinfo = creds.ShowRec(parameters);
            
            for(Credentials u: userinfo){
                empIDFld.setText(u.getEmpnum());
                posFld.setText(u.getPosition());
                resFld.setText(u.getResidence());
                genderFld.setText(u.getGender());
                f_namefld.setText(u.getF_name());
                m_namefld.setText(u.getM_name());
                l_namefld.setText(u.getL_name());
                m_numfld.setText(u.getPhonenum());
                em_addfld.setText(u.getEmail());
                usernameFld.setText(u.getU_name());
                passFld.setText(hash.decrypt(u.getPass()));
                passConFld.setText(hash.decrypt(u.getPass()));
                acctypeSel.setSelectedItem(u.getActType());
                deptFld.setSelectedItem(u.getDepartment());
                birthday.setDate(format.parse(u.getBday()));
                dateStart.setDate(format.parse(u.getStartdate()));
                num = u.getNum();
                String acctype = u.getActType();
                String usern = u.getU_name();
                String cdept = u.getDepartment();
                enableAccType = true;
            }
        } catch (Exception ex) {
            Logger.getLogger(UpdateUser.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void setInterface(String x) {
        System.out.println("User Type: " + x);
        System.out.println("Department: " + getDepartment());
        if ("Administrator".equals(x)) {
            deptFld.setSelectedItem(getDepartment());
            deptFld.setEnabled(false);
            acctypeSel.setEnabled(false);
        }
    }

    public String getPrivilage() {
        return privilage;
    }

    public String getDepartment() {
        return department;
    }

}
