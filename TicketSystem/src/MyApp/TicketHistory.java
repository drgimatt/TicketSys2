/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package MyApp;

import Database.Data_Tickets;
import Database.Tickets;
import com.formdev.flatlaf.FlatIntelliJLaf;
import java.util.ArrayList;
import javax.swing.UIManager;
import java.awt.Toolkit;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @OriginalAuthor @drgimatt
 * TicketHistory - A JFrame that is responsible in displaying the Ticket's History once invoked.
 * 
 */
public class TicketHistory extends javax.swing.JFrame {

    private Data_Tickets mySql = new Data_Tickets();
    private ArrayList<Tickets> history;
    String ticketid;
    DefaultTableModel model;
    
    /**
     * Creates new form TicketHistory
     */
    public TicketHistory() {
        initComponents();
        FrameCenter.centerJFrame(this);
    }
    
    public TicketHistory(String ticketid) {
        this.ticketid = ticketid;
        initComponents();
        FrameCenter.centerJFrame(this);
        initialView();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        ticketHistoryTable = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        descHistory = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        notesHistory = new javax.swing.JTextArea();
        titleHistory = new javax.swing.JTextField();
        TicketHistory = new javax.swing.JLabel();
        TicketDescription = new javax.swing.JLabel();
        TicketName = new javax.swing.JLabel();
        TicketNotes = new javax.swing.JLabel();
        creatorHistory = new javax.swing.JTextField();
        Creator = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setIconImage(Toolkit.getDefaultToolkit().getImage(TicketHistory.class.getResource("/Image/Icon.jpg")));

        ticketHistoryTable.setAutoCreateRowSorter(true);
        ticketHistoryTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Revision #", "Status", "Type", "Priority", "Department", "Date Updated", "Personnel Assigned"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        ticketHistoryTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ticketHistoryTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(ticketHistoryTable);

        descHistory.setEditable(false);
        descHistory.setColumns(20);
        descHistory.setLineWrap(true);
        descHistory.setRows(5);
        jScrollPane2.setViewportView(descHistory);

        notesHistory.setEditable(false);
        notesHistory.setColumns(20);
        notesHistory.setLineWrap(true);
        notesHistory.setRows(5);
        jScrollPane3.setViewportView(notesHistory);

        titleHistory.setEditable(false);

        TicketHistory.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        TicketHistory.setForeground(new java.awt.Color(0, 102, 204));
        TicketHistory.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TicketHistory.setText("Ticket History - ");

        TicketDescription.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        TicketDescription.setText("Ticket Description");

        TicketName.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        TicketName.setText("Ticket Name");

        TicketNotes.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        TicketNotes.setText("Ticket Notes");

        creatorHistory.setEditable(false);

        Creator.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Creator.setText("Creator");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(TicketDescription)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(TicketNotes)
                .addGap(172, 172, 172))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(titleHistory, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jScrollPane2))
                                        .addGap(18, 18, 18))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(TicketName)
                                        .addGap(337, 337, 337)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Creator)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 427, Short.MAX_VALUE)
                                        .addComponent(creatorHistory))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(317, 317, 317)
                        .addComponent(TicketHistory)))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(TicketHistory)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TicketName)
                    .addComponent(Creator))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(creatorHistory, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(titleHistory))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TicketNotes, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TicketDescription))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ticketHistoryTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ticketHistoryTableMouseClicked
        // TODO add your handling code here:
    int selectedRow = ticketHistoryTable.getSelectedRow();
    history = mySql.ShowRec("SELECT * FROM masterrecord WHERE TicketID = '" + ticketid + "' AND RevisionCount = '" + ticketHistoryTable.getValueAt(selectedRow,0).toString() + "'");
    for (Tickets t : history){
    titleHistory.setText(t.getTitle());
    descHistory.setText(t.getDesc());
    creatorHistory.setText(t.getCreator());
    notesHistory.setText(t.getNotes());
    }
    }//GEN-LAST:event_ticketHistoryTableMouseClicked

    private void initialView(){
    TicketHistory.setText("Ticket History - " + ticketid);
    history = mySql.ShowRec("SELECT * FROM masterrecord WHERE TicketID = '" + ticketid + "' ORDER BY RevisionCount ASC");
    model = (DefaultTableModel) ticketHistoryTable.getModel();
    model.setRowCount(0);
    for (Tickets t : history) {
    model.addRow(new Object[]{t.getRevcount(), t.getStatus(), t.getType(), t.getPriority(), t.getDepartment(), t.getDateUpdated(), t.getPersonnel()});
    titleHistory.setText(t.getTitle());
    descHistory.setText(t.getDesc());
    creatorHistory.setText(t.getCreator());
    notesHistory.setText(t.getNotes());
    }

    }
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
            java.util.logging.Logger.getLogger(TicketHistory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TicketHistory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TicketHistory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TicketHistory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        try {
            UIManager.setLookAndFeel(new FlatIntelliJLaf());
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    new TicketHistory().setVisible(true);
                }
            });
        } catch (Exception ex) {
            System.err.println("Failed to initialize LaF");
        }
    }

    public void setTicketid(String ticketid) {
        this.ticketid = ticketid;
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Creator;
    private javax.swing.JLabel TicketDescription;
    private javax.swing.JLabel TicketHistory;
    private javax.swing.JLabel TicketName;
    private javax.swing.JLabel TicketNotes;
    private javax.swing.JTextField creatorHistory;
    private javax.swing.JTextArea descHistory;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea notesHistory;
    private javax.swing.JTable ticketHistoryTable;
    private javax.swing.JTextField titleHistory;
    // End of variables declaration//GEN-END:variables
}
