/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospitalmanagementsystem;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Fame
 */
public class ViewDoctorDetailsFrame extends javax.swing.JFrame {

    /**
     * Creates new form ViewDoctorDetailsFrame
     */
    public ViewDoctorDetailsFrame() {
        super("****DOCTOR DETAILS****");
        initComponents();
    }
public void displayData(ArrayList <Doctor>s){
       String array[] = new String[5];
        DefaultTableModel tb = (DefaultTableModel)doctorDetailsJTable.getModel();
        for(Doctor i: s){
            array[0] = i.getName();
            array[1] = i.getContact();
            array[2] = i.getSpecialization();
            array[3] = i.getId()+"";
            array[4] = i.getFee()+"";
            tb.addRow(array);
        }
        
    }
    public void deleteData(){
        DefaultTableModel tb = (DefaultTableModel)doctorDetailsJTable.getModel();
        //jTable1.gets
        int i = doctorDetailsJTable.getSelectedRow();
        
        String name = tb.getValueAt(i, 0) + "";
         String contact = tb.getValueAt(i, 1) + "";
          String specialization = tb.getValueAt(i, 2) + "";
        int id = Integer.parseInt(tb.getValueAt(i, 3)+"");
        int fee = Integer.parseInt(tb.getValueAt(i, 4)+"");
        System.out.print(name+contact+specialization+id+fee);
        Doctor s = new Doctor(name,contact,specialization, id, fee);
        FileHandler f = new FileHandler();
        f.delete(s);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        doctorDetailsJTable = new javax.swing.JTable();
        backJB = new javax.swing.JToggleButton();
        deleteJB = new javax.swing.JToggleButton();
        refreshJB = new javax.swing.JToggleButton();
        logoutJB = new javax.swing.JToggleButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Stencil", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 0));
        jLabel1.setText("VIEW DOCTOR DETAILS");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 35, -1, -1));

        doctorDetailsJTable.setBackground(new java.awt.Color(204, 153, 255));
        doctorDetailsJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Contact", "Specialization", "ID", "Fee"
            }
        ));
        jScrollPane1.setViewportView(doctorDetailsJTable);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 141, 493, 91));

        backJB.setBackground(new java.awt.Color(255, 153, 153));
        backJB.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        backJB.setIcon(new javax.swing.ImageIcon("C:\\Users\\Fame\\Documents\\NetBeansProjects\\HospitalManagementSystem\\src\\hospitalmanagementsystem\\Images\\Go-back-icon.png")); // NOI18N
        backJB.setText("BACK");
        backJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJBActionPerformed(evt);
            }
        });
        getContentPane().add(backJB, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 110, 30));

        deleteJB.setBackground(new java.awt.Color(255, 153, 0));
        deleteJB.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        deleteJB.setIcon(new javax.swing.ImageIcon("C:\\Users\\Fame\\Documents\\NetBeansProjects\\HospitalManagementSystem\\src\\hospitalmanagementsystem\\Images\\Button-Close-icon.png")); // NOI18N
        deleteJB.setText("DELETE");
        deleteJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteJBActionPerformed(evt);
            }
        });
        getContentPane().add(deleteJB, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 310, 120, 30));

        refreshJB.setBackground(new java.awt.Color(102, 255, 0));
        refreshJB.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        refreshJB.setIcon(new javax.swing.ImageIcon("C:\\Users\\Fame\\Documents\\NetBeansProjects\\HospitalManagementSystem\\src\\hospitalmanagementsystem\\Images\\refresh-icon.png")); // NOI18N
        refreshJB.setText("REFRESH");
        refreshJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshJBActionPerformed(evt);
            }
        });
        getContentPane().add(refreshJB, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 310, 130, 30));

        logoutJB.setBackground(new java.awt.Color(255, 153, 0));
        logoutJB.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        logoutJB.setIcon(new javax.swing.ImageIcon("C:\\Users\\Fame\\Documents\\NetBeansProjects\\HospitalManagementSystem\\src\\hospitalmanagementsystem\\Images\\log out.png")); // NOI18N
        logoutJB.setText("LOGOUT");
        logoutJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutJBActionPerformed(evt);
            }
        });
        getContentPane().add(logoutJB, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 310, 120, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Fame\\Documents\\NetBeansProjects\\HospitalManagementSystem\\src\\hospitalmanagementsystem\\Images\\view doc details.jpg")); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 390));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void backJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJBActionPerformed
        // TODO add your handling code here:
        DoctorModuleFrame dmf=new DoctorModuleFrame();
        dmf.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backJBActionPerformed

    private void logoutJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutJBActionPerformed
        // TODO add your handling code here:
        new AdminFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logoutJBActionPerformed

    private void deleteJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteJBActionPerformed
        // TODO add your handling code here:
       
        if(doctorDetailsJTable.getSelectedRowCount()==1){
    int option=JOptionPane.showConfirmDialog(this, "ARE YOU SURE YOU WANT TO DELETE?","QUESTION MESSAGE",JOptionPane.YES_NO_OPTION);         
        
        if(option==0){
        deleteData();
        JOptionPane.showMessageDialog(this, "DELETED SUCCESSFULLY");
        }
        }
        else{
            JOptionPane.showMessageDialog(this, "**SELECT ANY SINGLE ROW IF YOU WANT TO DELETE ANY DATA**");
        }
    }//GEN-LAST:event_deleteJBActionPerformed

    private void refreshJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshJBActionPerformed
        // TODO add your handling code here:
         DefaultTableModel tb = (DefaultTableModel)doctorDetailsJTable.getModel();
        tb.setRowCount(0);
        FileHandler f = new FileHandler();
        ArrayList <Doctor> s = f.read();
        this.displayData(s);
    }//GEN-LAST:event_refreshJBActionPerformed

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
            java.util.logging.Logger.getLogger(ViewDoctorDetailsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewDoctorDetailsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewDoctorDetailsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewDoctorDetailsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewDoctorDetailsFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton backJB;
    private javax.swing.JToggleButton deleteJB;
    private javax.swing.JTable doctorDetailsJTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToggleButton logoutJB;
    private javax.swing.JToggleButton refreshJB;
    // End of variables declaration//GEN-END:variables
}