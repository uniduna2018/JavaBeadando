
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AreeshaJiwani
 */
public class UpdateRecord extends javax.swing.JFrame {

    /**
     * Creates new form UpdateRecord
     */
    public UpdateRecord() {
        initComponents();
        tableUpdate();
    }

    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        lblId = new javax.swing.JTextField();
        lblName = new javax.swing.JTextField();
        lblContact = new javax.swing.JTextField();
        lblAge = new javax.swing.JTextField();
        lblBlood = new javax.swing.JTextField();
        lblAddress = new javax.swing.JTextField();
        lblSymptoms = new javax.swing.JTextField();
        lblDiagnosis = new javax.swing.JTextField();
        lblMedicines = new javax.swing.JTextField();
        lblGender = new javax.swing.JComboBox<>();
        lblType = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        empTable = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Patient ID");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 240, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Name");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 280, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Contact No.");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 330, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Age");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 380, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Gender");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 380, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Blood Group");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 380, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Address");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 420, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Symptoms");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 460, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Diagnosis");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 510, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Medicines");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 550, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("Type of Ward");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 590, -1, -1));
        getContentPane().add(lblId, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 240, 200, -1));
        getContentPane().add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 280, 200, -1));
        getContentPane().add(lblContact, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 330, 200, -1));
        getContentPane().add(lblAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 370, 70, 30));
        getContentPane().add(lblBlood, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 370, 60, 30));
        getContentPane().add(lblAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 420, 200, -1));
        getContentPane().add(lblSymptoms, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 460, 200, -1));
        getContentPane().add(lblDiagnosis, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 510, 200, -1));
        getContentPane().add(lblMedicines, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 550, 200, -1));

        lblGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Other" }));
        getContentPane().add(lblGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 380, -1, -1));

        lblType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "General", "Single", "Duo" }));
        getContentPane().add(lblType, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 590, -1, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Close.png"))); // NOI18N
        jButton1.setText("Close");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 630, -1, -1));

        btnUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/save-icon--1.png"))); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        getContentPane().add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 630, -1, -1));

        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Close.png"))); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        getContentPane().add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 630, 90, 30));

        empTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "patientId", "name", "contactNo", "age", "gender", "bloodGroup", "address", "symptoms", "diagnosis", "medicines", "typeOfWard"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Long.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        empTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                empTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(empTable);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, 920, 90));

        jLabel11.setFont(new java.awt.Font("Goudy Stout", 1, 36)); // NOI18N
        jLabel11.setText("UPDATE RECORD");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 40, -1, -1));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/hospital1.jpg"))); // NOI18N
        jLabel14.setText("jLabel14");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

     public void tableUpdate()
    {
        int c;
        try {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            con = DriverManager.getConnection("jdbc:ucanaccess://Hospital.accdb");
            pst = con.prepareStatement("select * from hospital");
            rs = pst.executeQuery();
            
            ResultSetMetaData rsd = rs.getMetaData();
            c = rsd.getColumnCount();
            DefaultTableModel dft = (DefaultTableModel)empTable.getModel();
            dft.setRowCount(0);
            
            while(rs.next())
            {
                Vector v2 = new Vector();
                for(int i = 1; i<=c ;i++)
                {
                    v2.add(rs.getString("ID"));
                    v2.add(rs.getString("name"));
                    v2.add(rs.getString("contact"));
                    v2.add(rs.getString("age"));
                    v2.add(rs.getString("gender"));
                    v2.add(rs.getString("bloodGroup"));
                    v2.add(rs.getString("address"));
                    v2.add(rs.getString("symptoms"));
                    v2.add(rs.getString("diagnosis"));
                    v2.add(rs.getString("medicines"));
                    v2.add(rs.getString("typeOfWard"));
                    
                }
                dft.addRow(v2);
            
            }
            
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FullHistory.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(FullHistory.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new Home().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        
        DefaultTableModel model = (DefaultTableModel)empTable.getModel();
        int selectedIndex = empTable.getSelectedRow();

        int id = Integer.parseInt(model.getValueAt(selectedIndex, 0).toString());
      
        try {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            con = DriverManager.getConnection("jdbc:ucanaccess://Hospital.accdb");
            
                pst = con.prepareStatement("update hospital set name = ?, contact = ?, age = ?, gender = ?, bloodGroup = ?, address = ?, symptoms = ?, diagnosis = ?, medicines = ?, typeOfWard = ? where ID=?");
                pst.setString(1, lblName.getText());
                pst.setString(2, lblContact.getText());
                pst.setString(3, lblAge.getText());
                pst.setString(4, lblGender.getSelectedItem().toString());
                pst.setString(5, lblBlood.getText());
                pst.setString(6, lblAddress.getText());
                pst.setString(7, lblSymptoms.getText());
                pst.setString(8, lblDiagnosis.getText());
                pst.setString(9, lblMedicines.getText());
                pst.setString(10, lblType.getSelectedItem().toString());
                pst.setString(11, lblId.getText());
               
                pst.executeUpdate();
                JOptionPane.showMessageDialog(this, "Patient Updated.");
                
               lblId.setText("");
               lblName.setText("");
               lblContact.setText("");
               lblAge.setText("");
               lblGender.setSelectedIndex(0);
               lblBlood.setText("");
               lblAddress.setText("");
               lblSymptoms.setText("");
               lblDiagnosis.setText("");
               lblMedicines.setText("");
               lblType.setSelectedIndex(0);
            
            tableUpdate();
                    
        } 
        catch (ClassNotFoundException ex) {
            Logger.getLogger(UpdateRecord.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this,ex);
            
        } catch (SQLException ex) {
            Logger.getLogger(UpdateRecord.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this,ex);
            
        }
        
                                        
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)empTable.getModel();
        int selectedIndex = empTable.getSelectedRow();

        int id = Integer.parseInt(model.getValueAt(selectedIndex, 0).toString());
        
        int dialogresult = JOptionPane.showConfirmDialog(null, "Do you want to delete the record", "Warning ", JOptionPane.YES_NO_OPTION);
        
        if(dialogresult == JOptionPane.YES_OPTION)
        {
            try {
                Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
                con = DriverManager.getConnection("jdbc:ucanaccess://Hospital.accdb");
            
                pst = con.prepareStatement("delete from hospital where ID = ?");
                pst.setInt(1, id);
                pst.executeUpdate();
                JOptionPane.showMessageDialog(this, "Record is deleted");
                tableUpdate();
               lblId.setText("");
               lblName.setText("");
               lblContact.setText("");
               lblAge.setText("");
               lblGender.setSelectedIndex(0);
               lblBlood.setText("");
               lblAddress.setText("");
               lblSymptoms.setText("");
               lblType.setSelectedIndex(0);
               lblDiagnosis.setText("");
               lblMedicines.setText("");
               
               lblName.requestFocus();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(UpdateRecord.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(UpdateRecord.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void empTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_empTableMouseClicked
        // TODO add your handling code here:
         DefaultTableModel model = (DefaultTableModel)empTable.getModel();
        int selectedIndex = empTable.getSelectedRow();
        
        lblId.setText(model.getValueAt(selectedIndex, 0).toString());
        lblName.setText(model.getValueAt(selectedIndex, 1).toString());
        lblContact.setText(model.getValueAt(selectedIndex, 2).toString());
        lblAge.setText(model.getValueAt(selectedIndex, 3).toString());
        lblGender.setSelectedItem(model.getValueAt(selectedIndex, 4).toString());
        lblBlood.setText(model.getValueAt(selectedIndex, 5).toString());
        lblAddress.setText(model.getValueAt(selectedIndex, 6).toString());
        lblSymptoms.setText(model.getValueAt(selectedIndex, 7).toString());
        lblDiagnosis.setText(model.getValueAt(selectedIndex, 8).toString());
        lblMedicines.setText(model.getValueAt(selectedIndex, 9).toString());
        lblType.setSelectedItem(model.getValueAt(selectedIndex, 10).toString());
     
    }//GEN-LAST:event_empTableMouseClicked

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
            java.util.logging.Logger.getLogger(UpdateRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateRecord().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JTable empTable;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField lblAddress;
    private javax.swing.JTextField lblAge;
    private javax.swing.JTextField lblBlood;
    private javax.swing.JTextField lblContact;
    private javax.swing.JTextField lblDiagnosis;
    private javax.swing.JComboBox<String> lblGender;
    private javax.swing.JTextField lblId;
    private javax.swing.JTextField lblMedicines;
    private javax.swing.JTextField lblName;
    private javax.swing.JTextField lblSymptoms;
    private javax.swing.JComboBox<String> lblType;
    // End of variables declaration//GEN-END:variables
}
