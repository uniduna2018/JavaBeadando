
import java.io.IOException;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
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
public class NewPatient extends javax.swing.JFrame {

    
    /**
     * Creates new form NewPatient
     */
    public NewPatient() {
        initComponents();
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
        jLabel13 = new javax.swing.JLabel();
        lblId = new javax.swing.JTextField();
        lblName = new javax.swing.JTextField();
        lblContact = new javax.swing.JTextField();
        lblAge = new javax.swing.JTextField();
        lblBlood = new javax.swing.JTextField();
        lblAddress = new javax.swing.JTextField();
        lblSymptoms = new javax.swing.JTextField();
        lblDiagnosis = new javax.swing.JTextField();
        lblMedicines = new javax.swing.JTextField();
        lblType = new javax.swing.JComboBox<>();
        lblGender = new javax.swing.JComboBox<>();
        btnAdd = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel1.setText("Patient ID");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel2.setText("Name");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel3.setText("Contact No.");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel4.setText("Age");
        jLabel4.setToolTipText("");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel5.setText("Gender");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 210, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel6.setText("Blood group");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 210, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel7.setText("Address");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel8.setText("Symptoms");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 290, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel9.setText("Diagnosis");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 330, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel10.setText("Medicines");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 370, -1, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel13.setText("Type of Ward?");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 410, -1, -1));

        lblId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblIdActionPerformed(evt);
            }
        });
        getContentPane().add(lblId, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, 205, -1));

        lblName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblNameActionPerformed(evt);
            }
        });
        getContentPane().add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, 205, -1));
        getContentPane().add(lblContact, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, 205, -1));
        getContentPane().add(lblAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 210, 60, -1));
        getContentPane().add(lblBlood, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 210, 57, -1));
        getContentPane().add(lblAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 250, 205, -1));
        getContentPane().add(lblSymptoms, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 290, 205, -1));
        getContentPane().add(lblDiagnosis, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 330, 205, -1));
        getContentPane().add(lblMedicines, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 370, 205, -1));

        lblType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "General", "Single", "Duo" }));
        getContentPane().add(lblType, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 410, -1, -1));

        lblGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Other" }));
        getContentPane().add(lblGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 210, -1, -1));

        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/save-icon--1.png"))); // NOI18N
        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        getContentPane().add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 450, -1, -1));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Close.png"))); // NOI18N
        jButton2.setText("Close");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 450, -1, -1));

        jLabel12.setFont(new java.awt.Font("Lucida Calligraphy", 1, 36)); // NOI18N
        jLabel12.setText("ADD NEW PATIENT");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, -1, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/add new patient background.jpg"))); // NOI18N
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, 500));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lblIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lblIdActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new Home().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
            
        try {
                Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
                con = DriverManager.getConnection("jdbc:ucanaccess://Hospital.accdb");
                pst = con.prepareStatement("insert into hospital(name, contact, age, gender, bloodGroup, address, symptoms, diagnosis, medicines, typeOfWard)values(?,?,?,?,?,?,?,?,?,?) ");
               
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
               
                pst.executeUpdate();
                JOptionPane.showMessageDialog(this, "Patient Added.");
                
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
               
               
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(NewPatient.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(NewPatient.class.getName()).log(Level.SEVERE, null, ex);
        }    
            
    }//GEN-LAST:event_btnAddActionPerformed

    private void lblNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lblNameActionPerformed

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
            java.util.logging.Logger.getLogger(NewPatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewPatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewPatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewPatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewPatient().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
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