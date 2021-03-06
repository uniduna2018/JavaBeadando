
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
 * @author DUE_prog3
 */
public class Adatmodositas extends javax.swing.JFrame {

    /**
     * Creates new form UpdateRecord
     */
    public Adatmodositas() {
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
        jButton1 = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        empTable = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMaximumSize(new java.awt.Dimension(1407, 768));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("ID:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 240, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Név:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 280, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Telefonszám:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 330, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Kor:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 380, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Nem:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 380, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Vércsoport:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 380, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("Cím:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 420, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("Tünetek:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 460, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("Diagnózis:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 510, -1, 20));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setText("Gyógyszerek:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 550, -1, -1));
        getContentPane().add(lblId, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 240, 200, -1));
        getContentPane().add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 280, 200, -1));
        getContentPane().add(lblContact, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 330, 200, -1));
        getContentPane().add(lblAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 370, 70, 30));
        getContentPane().add(lblBlood, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 370, 60, 30));
        getContentPane().add(lblAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 420, 200, -1));
        getContentPane().add(lblSymptoms, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 460, 200, -1));
        getContentPane().add(lblDiagnosis, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 510, 200, -1));
        getContentPane().add(lblMedicines, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 550, 200, -1));

        lblGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Férfi", "Nő" }));
        getContentPane().add(lblGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 380, -1, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Close.png"))); // NOI18N
        jButton1.setText("Bezárás");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 630, -1, -1));

        btnUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/save-icon--1.png"))); // NOI18N
        btnUpdate.setText("Módosítás");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        getContentPane().add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 630, -1, -1));

        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Close.png"))); // NOI18N
        btnDelete.setText("Törlés");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        getContentPane().add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 630, 90, 30));

        empTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Név", "Telefonszám", "Kor", "Nem", "Vércsoport", "Cím", "Tünetek", "Diagnózis", "Gyógyszerek"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Long.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
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
        jLabel11.setForeground(new java.awt.Color(102, 102, 102));
        jLabel11.setText("ADATMÓDOSÍTÁS");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 40, -1, -1));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/hospital1.jpg"))); // NOI18N
        jLabel14.setText("jLabel14");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1360, 690));

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
                    v2.add(rs.getString("Név"));
                    v2.add(rs.getString("Telefonszám"));
                    v2.add(rs.getString("Kor"));
                    v2.add(rs.getString("Nem"));
                    v2.add(rs.getString("Vércsoport"));
                    v2.add(rs.getString("Cím"));
                    v2.add(rs.getString("Tünetek"));
                    v2.add(rs.getString("Diagnózis"));
                    v2.add(rs.getString("Gyógyszerek"));
                }
                dft.addRow(v2);
            
            }
            
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Kortortenet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Kortortenet.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
        new Home().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed

        DefaultTableModel model = (DefaultTableModel)empTable.getModel();
        int selectedIndex = empTable.getSelectedRow();
        int id = Integer.parseInt(model.getValueAt(selectedIndex, 0).toString());
      
        try {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            con = DriverManager.getConnection("jdbc:ucanaccess://Hospital.accdb");
            
                pst = con.prepareStatement("update hospital set Név=?, Telefonszám=?, Kor=?, Nem=?, Vércsoport=?, Cím=?, Tünetek=?, Diagnózis=?, Gyógyszerek=? where ID=?");
                pst.setString(1, lblName.getText());
                pst.setString(2, lblContact.getText());
                pst.setString(3, lblAge.getText());
                pst.setString(4, lblGender.getSelectedItem().toString());
                pst.setString(5, lblBlood.getText());
                pst.setString(6, lblAddress.getText());
                pst.setString(7, lblSymptoms.getText());
                pst.setString(8, lblDiagnosis.getText());
                pst.setString(9, lblMedicines.getText());
                pst.setString(10, lblId.getText());
               
                pst.executeUpdate();
                JOptionPane.showMessageDialog(this, "Adatok módosítva.");
                
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
            
            tableUpdate();
                    
        } 
        catch (ClassNotFoundException ex) {
            Logger.getLogger(Adatmodositas.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this,ex);
            
        } catch (SQLException ex) {
            Logger.getLogger(Adatmodositas.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this,ex);
            
        }
        
                                        
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        DefaultTableModel model = (DefaultTableModel)empTable.getModel();
        int selectedIndex = empTable.getSelectedRow();

        int id = Integer.parseInt(model.getValueAt(selectedIndex, 0).toString());
        
        int dialogresult = JOptionPane.showConfirmDialog(null, "Tényleg törölni szeretnéd?", "Figyelmeztetés", JOptionPane.YES_NO_OPTION);
        
        if(dialogresult == JOptionPane.YES_OPTION)
        {
            try {
                Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
                con = DriverManager.getConnection("jdbc:ucanaccess://Hospital.accdb");
            
                pst = con.prepareStatement("delete from hospital where ID = ?");
                pst.setInt(1, id);
                pst.executeUpdate();
                JOptionPane.showMessageDialog(this, "Páciens törölve.");
                tableUpdate();
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
               
               lblName.requestFocus();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Adatmodositas.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(Adatmodositas.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void empTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_empTableMouseClicked
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
            java.util.logging.Logger.getLogger(Adatmodositas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Adatmodositas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Adatmodositas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Adatmodositas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Adatmodositas().setVisible(true);
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
    // End of variables declaration//GEN-END:variables
}
