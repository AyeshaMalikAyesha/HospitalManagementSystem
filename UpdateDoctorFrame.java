/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospitalmanagementsystem;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Fame
 */
public class UpdateDoctorFrame extends javax.swing.JFrame {
FileHandler f=new FileHandler();
ArrayList<Doctor> s=new ArrayList<Doctor>();
    /**
     * Creates new form UpdateDoctorFrame
     */
    public UpdateDoctorFrame() {
        super("****UPDATE DOCTOR DETAILS****");
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        idJLabel = new javax.swing.JLabel();
        doctorIdJF = new javax.swing.JTextField();
        okJB = new javax.swing.JButton();
        nameJLabel = new javax.swing.JLabel();
        doctorIdJLabel = new javax.swing.JLabel();
        contactJLabel = new javax.swing.JLabel();
        specializationJLabel = new javax.swing.JLabel();
        feeJLabel = new javax.swing.JLabel();
        nameJF = new javax.swing.JTextField();
        idJF = new javax.swing.JTextField();
        contactJF = new javax.swing.JTextField();
        specializationJF = new javax.swing.JTextField();
        feeJF = new javax.swing.JTextField();
        backJB = new javax.swing.JButton();
        updateJB = new javax.swing.JButton();
        updateDoctorDetailsJLabel = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        idJLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        idJLabel.setForeground(new java.awt.Color(255, 0, 51));
        idJLabel.setText("ID:");
        getContentPane().add(idJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 42, 22));

        doctorIdJF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                doctorIdJFMouseClicked(evt);
            }
        });
        getContentPane().add(doctorIdJF, new org.netbeans.lib.awtextra.AbsoluteConstraints(209, 77, 260, 30));

        okJB.setBackground(new java.awt.Color(255, 204, 153));
        okJB.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        okJB.setIcon(new javax.swing.ImageIcon("C:\\Users\\Fame\\Documents\\NetBeansProjects\\HospitalManagementSystem\\src\\hospitalmanagementsystem\\Images\\Done-icon.png")); // NOI18N
        okJB.setText("OK");
        okJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okJBActionPerformed(evt);
            }
        });
        getContentPane().add(okJB, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 110, 90, 31));

        nameJLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        nameJLabel.setForeground(new java.awt.Color(255, 0, 51));
        nameJLabel.setText("NAME:");
        getContentPane().add(nameJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, -1, -1));

        doctorIdJLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        doctorIdJLabel.setForeground(new java.awt.Color(255, 0, 51));
        doctorIdJLabel.setText("ID:");
        getContentPane().add(doctorIdJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 202, -1, -1));

        contactJLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        contactJLabel.setForeground(new java.awt.Color(255, 0, 51));
        contactJLabel.setText("CONTACT:");
        getContentPane().add(contactJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 253, -1, -1));

        specializationJLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        specializationJLabel.setForeground(new java.awt.Color(255, 0, 51));
        specializationJLabel.setText("SPECIALIZATION:");
        getContentPane().add(specializationJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, -1, -1));

        feeJLabel.setBackground(new java.awt.Color(255, 102, 102));
        feeJLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        feeJLabel.setForeground(new java.awt.Color(255, 0, 51));
        feeJLabel.setText("FEE:");
        getContentPane().add(feeJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 368, -1, -1));
        getContentPane().add(nameJF, new org.netbeans.lib.awtextra.AbsoluteConstraints(209, 149, 260, 28));
        getContentPane().add(idJF, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, 260, 30));
        getContentPane().add(contactJF, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 250, 260, 30));
        getContentPane().add(specializationJF, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 310, 260, 30));
        getContentPane().add(feeJF, new org.netbeans.lib.awtextra.AbsoluteConstraints(209, 363, 260, 30));

        backJB.setBackground(new java.awt.Color(204, 255, 51));
        backJB.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        backJB.setIcon(new javax.swing.ImageIcon("C:\\Users\\Fame\\Documents\\NetBeansProjects\\HospitalManagementSystem\\src\\hospitalmanagementsystem\\Images\\back-icon.png")); // NOI18N
        backJB.setText("BACK");
        backJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJBActionPerformed(evt);
            }
        });
        getContentPane().add(backJB, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 400, 120, 30));

        updateJB.setBackground(new java.awt.Color(255, 153, 0));
        updateJB.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        updateJB.setIcon(new javax.swing.ImageIcon("C:\\Users\\Fame\\Documents\\NetBeansProjects\\HospitalManagementSystem\\src\\hospitalmanagementsystem\\Images\\update.png")); // NOI18N
        updateJB.setText("UPDATE");
        updateJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateJBActionPerformed(evt);
            }
        });
        getContentPane().add(updateJB, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 400, -1, -1));

        updateDoctorDetailsJLabel.setFont(new java.awt.Font("Stencil", 1, 24)); // NOI18N
        updateDoctorDetailsJLabel.setForeground(new java.awt.Color(255, 51, 0));
        updateDoctorDetailsJLabel.setText("UPDATE DOCTOR DETAILS");
        getContentPane().add(updateDoctorDetailsJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(147, 11, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\Fame\\Documents\\NetBeansProjects\\HospitalManagementSystem\\src\\hospitalmanagementsystem\\Images\\doctor with mediacl.jpg")); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, 440));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void backJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJBActionPerformed
        // TODO add your handling code here:
        new DoctorModuleFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backJBActionPerformed

    private void okJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okJBActionPerformed
        // TODO add your handling code here:
          boolean check=false;
        
        idJF.setEditable(false);
        String id=doctorIdJF.getText();
        
        try{
            if(id.equals("")){
            throw new NullPointerException();
            }
            else{
                try{
                int idd=Integer.parseInt(id);
        s=f.getArray();
        for(int i=0;i<s.size();i++){
            Doctor p=s.get(i);
            if(p.getId()==(idd)){
                check=true;
                nameJF.setText(p.getName());
                contactJF.setText(p.getContact());
                specializationJF.setText(p.getSpecialization());
                idJF.setText(p.getId()+"");
                feeJF.setText(p.getFee()+"");
            }
        }
         if(check==true){
            JOptionPane.showMessageDialog(this, "****RECORD IS FOUND SUCCESSFULLY****","***CONFIRMATION***",JOptionPane.INFORMATION_MESSAGE);
        }
        else if(check==false){
            JOptionPane.showMessageDialog(this, "****RECORD IS NOT FOUND!!!!","***INVALID***",JOptionPane.ERROR_MESSAGE);
        }
            }
                catch(NumberFormatException e){
                     JOptionPane.showMessageDialog(this, "****NUMBER FORMAT EXCEPTION,ENTER INTEGER IN FIELD FEE****","**INVALID**",JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        catch(NullPointerException e){
            JOptionPane.showMessageDialog(this, "NULL POINTER EXCEPTION OCCURED!!! ENTER ID IN FIELD ID");
        }
         
    }//GEN-LAST:event_okJBActionPerformed

    private void updateJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateJBActionPerformed
        // TODO add your handling code here:
         String name=nameJF.getText();
        String contact=contactJF.getText();
        String specialization=specializationJF.getText();
        int fee=Integer.parseInt(feeJF.getText());
        int id=Integer.parseInt(idJF.getText());
        Doctor p=new Doctor(name,contact,specialization,id,fee);
        f.update(p);
        JOptionPane.showMessageDialog(this, "UPDATED SUCCESSFULLY","***CONFIRMATION***",JOptionPane.INFORMATION_MESSAGE);
        nameJF.setText("");
        contactJF.setText("");
        specializationJF.setText("");
        feeJF.setText("");
        idJF.setText("");
        doctorIdJF.setText("");
    }//GEN-LAST:event_updateJBActionPerformed

    private void doctorIdJFMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_doctorIdJFMouseClicked
        // TODO add your handling code here:
        doctorIdJF.setText("");
    }//GEN-LAST:event_doctorIdJFMouseClicked

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
            java.util.logging.Logger.getLogger(UpdateDoctorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateDoctorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateDoctorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateDoctorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateDoctorFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJB;
    private javax.swing.JTextField contactJF;
    private javax.swing.JLabel contactJLabel;
    private javax.swing.JTextField doctorIdJF;
    private javax.swing.JLabel doctorIdJLabel;
    private javax.swing.JTextField feeJF;
    private javax.swing.JLabel feeJLabel;
    private javax.swing.JTextField idJF;
    private javax.swing.JLabel idJLabel;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField nameJF;
    private javax.swing.JLabel nameJLabel;
    private javax.swing.JButton okJB;
    private javax.swing.JTextField specializationJF;
    private javax.swing.JLabel specializationJLabel;
    private javax.swing.JLabel updateDoctorDetailsJLabel;
    private javax.swing.JButton updateJB;
    // End of variables declaration//GEN-END:variables
}
