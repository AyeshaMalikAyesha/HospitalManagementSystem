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
public class BillFrame extends javax.swing.JFrame {
FileHandlerPatient f=new FileHandlerPatient();
FileHandler f1=new FileHandler();
    /**
     * Creates new form BillFrame
     */
    public BillFrame() {
        super("****BILL****");
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

        billJLabel = new javax.swing.JLabel();
        patientIdJLabel = new javax.swing.JLabel();
        patientIdJField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        billJTA = new javax.swing.JTextArea();
        backJB = new javax.swing.JButton();
        submitJB = new javax.swing.JButton();
        doctorIdJLabel = new javax.swing.JLabel();
        doctorIdJField = new javax.swing.JTextField();
        testJLabel = new javax.swing.JLabel();
        testJCombo = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        billJLabel.setFont(new java.awt.Font("Stencil", 1, 24)); // NOI18N
        billJLabel.setForeground(new java.awt.Color(255, 0, 0));
        billJLabel.setText("BILL");
        getContentPane().add(billJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(178, 11, -1, -1));

        patientIdJLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        patientIdJLabel.setForeground(new java.awt.Color(255, 102, 0));
        patientIdJLabel.setText("Patient ID:");
        getContentPane().add(patientIdJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        patientIdJField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                patientIdJFieldMouseClicked(evt);
            }
        });
        patientIdJField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                patientIdJFieldKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                patientIdJFieldKeyTyped(evt);
            }
        });
        getContentPane().add(patientIdJField, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 210, 29));

        billJTA.setColumns(20);
        billJTA.setRows(5);
        jScrollPane1.setViewportView(billJTA);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, 233, 119));

        backJB.setBackground(new java.awt.Color(51, 255, 0));
        backJB.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        backJB.setIcon(new javax.swing.ImageIcon("C:\\Users\\Fame\\Documents\\NetBeansProjects\\HospitalManagementSystem\\src\\hospitalmanagementsystem\\Images\\Go-back-icon.png")); // NOI18N
        backJB.setText("BACK");
        backJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJBActionPerformed(evt);
            }
        });
        getContentPane().add(backJB, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 110, 31));

        submitJB.setBackground(new java.awt.Color(255, 204, 153));
        submitJB.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        submitJB.setIcon(new javax.swing.ImageIcon("C:\\Users\\Fame\\Documents\\NetBeansProjects\\HospitalManagementSystem\\src\\hospitalmanagementsystem\\Images\\Done-icon.png")); // NOI18N
        submitJB.setText("SUBMIT");
        submitJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitJBActionPerformed(evt);
            }
        });
        getContentPane().add(submitJB, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 290, -1, 31));

        doctorIdJLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        doctorIdJLabel.setForeground(new java.awt.Color(255, 0, 102));
        doctorIdJLabel.setText("DOCTOR ID:");
        getContentPane().add(doctorIdJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        doctorIdJField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                doctorIdJFieldMouseClicked(evt);
            }
        });
        doctorIdJField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doctorIdJFieldActionPerformed(evt);
            }
        });
        doctorIdJField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                doctorIdJFieldKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                doctorIdJFieldKeyTyped(evt);
            }
        });
        getContentPane().add(doctorIdJField, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 210, 30));

        testJLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        testJLabel.setForeground(new java.awt.Color(255, 51, 0));
        testJLabel.setText("TEST:");
        getContentPane().add(testJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        testJCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BLOOD TEST", "X-RAY", "CT SCAN", "SUGAR TEST", "THYROID TEST", "COVID-19", "NONE", " " }));
        getContentPane().add(testJCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 170, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Fame\\Documents\\NetBeansProjects\\HospitalManagementSystem\\src\\hospitalmanagementsystem\\Images\\medical-chemical-laboratory-background.jpg")); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 330));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void backJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJBActionPerformed
        // TODO add your handling code here:
        ViewPatientDetailsFrame vpdf=new ViewPatientDetailsFrame();
        vpdf.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backJBActionPerformed

    private void patientIdJFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_patientIdJFieldMouseClicked
        // TODO add your handling code here:
        patientIdJField.setText("");
    }//GEN-LAST:event_patientIdJFieldMouseClicked

    private void doctorIdJFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_doctorIdJFieldMouseClicked
        // TODO add your handling code here:
        doctorIdJField.setText("");
    }//GEN-LAST:event_doctorIdJFieldMouseClicked

    private void submitJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitJBActionPerformed
        // TODO add your handling code here:
        ArrayList<Bill> billRecord=new ArrayList<Bill>();
        billJTA.setEditable(false);
        Bill b=new Bill();
          boolean check=false;
        ArrayList<Patients> s=f.read();
        ArrayList<Doctor> s1=f1.read();
        try{     
       
        String id=patientIdJField.getText();
          String id1=doctorIdJField.getText();
          if(id.equals("")||id1.equals("")){
              throw new NullPointerException();
          }
          else{
              try{
           int idd=Integer.parseInt(id);
        int idd1=Integer.parseInt(id1);
        s=f.getArray();
        s1=f1.getArray();
        for(int i=0;i<s.size();i++){
            Patients p=s.get(i);
            if(p.getId()==(idd)){
                for(int j=0;j<s1.size();j++){
                    Doctor d=s1.get(j);
                    if(d.getId()==idd1){
                        
                       if(testJCombo.getSelectedItem().equals("BLOOD TEST")){
                           b.setBillNo(s.get(i).getId()+100);
                           int totalAmount=s1.get(j).getFee()+  b.calculateBill("blood test");
billJTA.append("\n*******BILL RECEIPT*******"+"\nBILL NO>>>:"+b.getBillNo());
billJTA.append("\nPATIENT NAME>>>:"+s.get(i).getName()+"\nPATIENT ID>>>: "+s.get(i).getId()+"\nDOCTOR NAME>>>:"+s1.get(j).getName()+"\nDOCTOR ID>>>:"+s1.get(j).getId());
billJTA.append( "\nTEST NAME>>>:BLOOD TEST"+"\nTEST AMOUNT>>>:"+b.calculateBill("blood test")+"\nDOCTOR FEE>>>:"+s1.get(j).getFee());
billJTA.append("\nTOTAL AMOUNT PAID IS>>>:"+totalAmount);
billRecord.add(b);
                check=true;
                       }
                       else if(testJCombo.getSelectedItem().equals("X-RAY")){
                           b.setBillNo(s.get(i).getId()+100);
                           int totalAmount=s1.get(j).getFee()+  b.calculateBill("X-RAY");
billJTA.append("\n*******BILL RECEIPT*******"+"\nBILL NO>>>:"+b.getBillNo());
billJTA.append("\nPATIENT NAME>>>:"+s.get(i).getName()+"\nPATIENT ID>>>: "+s.get(i).getId()+"\nDOCTOR NAME>>>:"+s1.get(j).getName()+"\nDOCTOR ID>>>:"+s1.get(j).getId());
billJTA.append( "\nTEST NAME>>>:X-RAY"+"\nTEST AMOUNT>>>:"+b.calculateBill("X-RAY")+"\nDOCTOR FEE>>>:"+s1.get(j).getFee());
billJTA.append("\nTOTAL AMOUNT PAID IS>>>:"+totalAmount);
billRecord.add(b);
                check=true;
                       }
                       else if(testJCombo.getSelectedItem().equals("CT SCAN")){
                            b.setBillNo(s.get(i).getId()+100);
                           int totalAmount=s1.get(j).getFee()+  b.calculateBill("CT SCAN");
billJTA.append("\n*******BILL RECEIPT*******"+"\nBILL NO>>>:"+b.getBillNo());
billJTA.append("\nPATIENT NAME>>>:"+s.get(i).getName()+"\nPATIENT ID>>>: "+s.get(i).getId()+"\nDOCTOR NAME>>>:"+s1.get(j).getName()+"\nDOCTOR ID>>>:"+s1.get(j).getId());
billJTA.append( "\nTEST NAME>>>:CT SCAN"+"\nTEST AMOUNT>>>:"+b.calculateBill("CT SCAN")+"\nDOCTOR FEE>>>:"+s1.get(j).getFee());
billJTA.append("\nTOTAL AMOUNT PAID IS>>>:"+totalAmount);
billRecord.add(b);
                check=true;
                       }
                       
                       else if(testJCombo.getSelectedItem().equals("SUGAR TEST")){
                            b.setBillNo(s.get(i).getId()+100);
                           int totalAmount=s1.get(j).getFee()+  b.calculateBill("SUGAR TEST");
billJTA.append("\n*******BILL RECEIPT*******"+"\nBILL NO>>>:"+b.getBillNo());
billJTA.append("\nPATIENT NAME>>>:"+s.get(i).getName()+"\nPATIENT ID>>>: "+s.get(i).getId()+"\nDOCTOR NAME>>>:"+s1.get(j).getName()+"\nDOCTOR ID>>>:"+s1.get(j).getId());
billJTA.append( "\nTEST NAME>>>:SUGAR TEST"+"\nTEST AMOUNT>>>:"+b.calculateBill("SUGAR TEST")+"\nDOCTOR FEE>>>:"+s1.get(j).getFee());
billJTA.append("\nTOTAL AMOUNT PAID IS>>>:"+totalAmount);
billRecord.add(b);
                check=true;
                       }
                       
                       else if(testJCombo.getSelectedItem().equals("THYROID TEST")){
                            b.setBillNo(s.get(i).getId()+100);
                           int totalAmount=s1.get(j).getFee()+  b.calculateBill("THYROID TEST");
billJTA.append("\n*******BILL RECEIPT*******"+"\nBILL NO>>>:"+b.getBillNo());
billJTA.append("\nPATIENT NAME>>>:"+s.get(i).getName()+"\nPATIENT ID>>>: "+s.get(i).getId()+"\nDOCTOR NAME>>>:"+s1.get(j).getName()+"\nDOCTOR ID>>>:"+s1.get(j).getId());
billJTA.append( "\nTEST NAME>>>:THYROID TEST"+"\nTEST AMOUNT>>>:"+b.calculateBill("THYROID TEST")+"\nDOCTOR FEE>>>:"+s1.get(j).getFee());
billJTA.append("\nTOTAL AMOUNT PAID IS>>>:"+totalAmount);
billRecord.add(b);
                check=true;
                       }
                        else if(testJCombo.getSelectedItem().equals("COVID-19")){
                            b.setBillNo(s.get(i).getId()+100);
                           int totalAmount=s1.get(j).getFee()+  b.calculateBill("COVID-19");
billJTA.append("\n*******BILL RECEIPT*******"+"\nBILL NO>>>:"+b.getBillNo());
billJTA.append("\nPATIENT NAME>>>:"+s.get(i).getName()+"\nPATIENT ID>>>: "+s.get(i).getId()+"\nDOCTOR NAME>>>:"+s1.get(j).getName()+"\nDOCTOR ID>>>:"+s1.get(j).getId());
billJTA.append( "\nTEST NAME>>>:COVID-19"+"\nTEST AMOUNT>>>:"+b.calculateBill("COVID-19")+"\nDOCTOR FEE>>>:"+s1.get(j).getFee());
billJTA.append("\nTOTAL AMOUNT PAID IS>>>:"+totalAmount);
billRecord.add(b);
                check=true;
                       }
               else if(testJCombo.getSelectedItem().equals("NONE")){
                            b.setBillNo(s.get(i).getId()+100);
                           int totalAmount=s1.get(j).getFee()+  b.calculateBill("NONE");
billJTA.append("\n*******BILL RECEIPT*******"+"\nBILL NO>>>:"+b.getBillNo());
billJTA.append("\nPATIENT NAME>>>:"+s.get(i).getName()+"\nPATIENT ID>>>: "+s.get(i).getId()+"\nDOCTOR NAME>>>:"+s1.get(j).getName()+"\nDOCTOR ID>>>:"+s1.get(j).getId());
billJTA.append( "\nTEST NAME>>>:NO TEST"+"\nTEST AMOUNT>>>:"+b.calculateBill("NONE")+"\nDOCTOR FEE>>>:"+s1.get(j).getFee());
billJTA.append("\nTOTAL AMOUNT PAID IS>>>:"+totalAmount);
billRecord.add(b);
                check=true;
                       }
                } 
                }
            }
        }
        if(check==true){
            JOptionPane.showMessageDialog(this, "****RECORD IS FOUND SUCCESSFULLY****","***CONFIRMATION***",JOptionPane.INFORMATION_MESSAGE);
        }
        else if(check==false){
            JOptionPane.showMessageDialog(this, "****RECORD IS NOT FOUND!!!!","INVALID!!!",JOptionPane.INFORMATION_MESSAGE);
        }
        
          }
              catch(NumberFormatException e){
JOptionPane.showMessageDialog(this, "NUMBER FORMAT EXCEPTION OCCURED,***ENTER INTEGER IN BOTH FIELDS***");
        } 
        }
        }
        catch(NullPointerException e){
            JOptionPane.showMessageDialog(this, "NULL POINTER EXCEPTION OCCURED,***FILL BOTH FIELDS***");
        }
        
        
    }//GEN-LAST:event_submitJBActionPerformed

    private void patientIdJFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_patientIdJFieldKeyPressed
        // TODO add your handling code here:
     
    }//GEN-LAST:event_patientIdJFieldKeyPressed

    private void patientIdJFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_patientIdJFieldKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_patientIdJFieldKeyTyped

    private void doctorIdJFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_doctorIdJFieldKeyPressed
        // TODO add your handling code here:
         
    }//GEN-LAST:event_doctorIdJFieldKeyPressed

    private void doctorIdJFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_doctorIdJFieldKeyTyped
        // TODO add your handling code here:
     
    }//GEN-LAST:event_doctorIdJFieldKeyTyped

    private void doctorIdJFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doctorIdJFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_doctorIdJFieldActionPerformed

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
            java.util.logging.Logger.getLogger(BillFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BillFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BillFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BillFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BillFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJB;
    private javax.swing.JLabel billJLabel;
    private javax.swing.JTextArea billJTA;
    private javax.swing.JTextField doctorIdJField;
    private javax.swing.JLabel doctorIdJLabel;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField patientIdJField;
    private javax.swing.JLabel patientIdJLabel;
    private javax.swing.JButton submitJB;
    private javax.swing.JComboBox<String> testJCombo;
    private javax.swing.JLabel testJLabel;
    // End of variables declaration//GEN-END:variables
}