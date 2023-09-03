/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospitalmanagementsystem;

import javax.swing.JOptionPane;

/**
 *
 * @author Fame
 */
public class DoctorStartFrame extends javax.swing.JFrame {

    /**
     * Creates new form DoctorStartFrame
     */
    public DoctorStartFrame() {
        super("***DOCTORS LOGIN PAGE***");
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

        backJB = new javax.swing.JButton();
        loginJB = new javax.swing.JButton();
        loginPageJLabel = new javax.swing.JLabel();
        usernameJLabel = new javax.swing.JLabel();
        passwordJLabel = new javax.swing.JLabel();
        userNameJTF = new javax.swing.JTextField();
        passwordJTF = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backJB.setBackground(new java.awt.Color(153, 255, 153));
        backJB.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        backJB.setIcon(new javax.swing.ImageIcon("C:\\Users\\Fame\\Documents\\NetBeansProjects\\HospitalManagementSystem\\src\\hospitalmanagementsystem\\Images\\back-icon.png")); // NOI18N
        backJB.setText("BACK");
        backJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJBActionPerformed(evt);
            }
        });
        getContentPane().add(backJB, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 110, 30));

        loginJB.setBackground(new java.awt.Color(255, 153, 153));
        loginJB.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        loginJB.setIcon(new javax.swing.ImageIcon("C:\\Users\\Fame\\Documents\\NetBeansProjects\\HospitalManagementSystem\\src\\hospitalmanagementsystem\\Images\\Login-icon.png")); // NOI18N
        loginJB.setText("LOG IN");
        loginJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginJBActionPerformed(evt);
            }
        });
        getContentPane().add(loginJB, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 240, -1, -1));

        loginPageJLabel.setFont(new java.awt.Font("Stencil", 1, 24)); // NOI18N
        loginPageJLabel.setForeground(new java.awt.Color(255, 0, 51));
        loginPageJLabel.setText("LOG IN PAGE");
        getContentPane().add(loginPageJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(123, 20, -1, -1));

        usernameJLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        usernameJLabel.setForeground(new java.awt.Color(255, 51, 51));
        usernameJLabel.setText("USERNAME");
        getContentPane().add(usernameJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 83, -1, -1));

        passwordJLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        passwordJLabel.setForeground(new java.awt.Color(255, 51, 51));
        passwordJLabel.setText("PASSWORD");
        getContentPane().add(passwordJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 168, -1, -1));
        getContentPane().add(userNameJTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(188, 80, 203, 30));
        getContentPane().add(passwordJTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, 200, 30));

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Fame\\Documents\\NetBeansProjects\\HospitalManagementSystem\\src\\hospitalmanagementsystem\\Images\\DOCTOR FUNCTION.jpg")); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 310));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void backJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJBActionPerformed
        // TODO add your handling code here:
        new Welcome().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backJBActionPerformed

    private void loginJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginJBActionPerformed
        // TODO add your handling code here:
       Doctor doc=new Doctor();
        String text1=userNameJTF.getText();
        String text2=passwordJTF.getText();
        try{
        if(text1.equals("")||text2.equals(""))
        {
            throw new NullPointerException();
        }
        
         else{
                if(!text1.equals(doc.getUsername())){
                    JOptionPane.showMessageDialog(null,"INCORRECT USERNAME ","****INVALID****",JOptionPane.CANCEL_OPTION);
             
                }
                  else if(!text2.equals(doc.getPassword())){
                    JOptionPane.showMessageDialog(null,"INCORRECT PASSWARD","****INVALID****",JOptionPane.CANCEL_OPTION);
                    }
        }
        
           
            if(text1.equals(doc.getUsername())&&text2.equals(doc.getPassword())){
         JOptionPane.showMessageDialog(null, "YOU HAVE SUCCESSFULLY LOGGED IN","****CONFIRMATION****",JOptionPane.INFORMATION_MESSAGE);
        
        DoctorFunctionsFrame dff=new DoctorFunctionsFrame();
        dff.setVisible(true);
        this.dispose();
            }}
         catch(NullPointerException e){
           JOptionPane.showMessageDialog(null,"NULL POINTER EXCEPTION,**FILL BOTH FIELDS**");
        }
    }//GEN-LAST:event_loginJBActionPerformed

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
            java.util.logging.Logger.getLogger(DoctorStartFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DoctorStartFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DoctorStartFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DoctorStartFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DoctorStartFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJB;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton loginJB;
    private javax.swing.JLabel loginPageJLabel;
    private javax.swing.JLabel passwordJLabel;
    private javax.swing.JPasswordField passwordJTF;
    private javax.swing.JTextField userNameJTF;
    private javax.swing.JLabel usernameJLabel;
    // End of variables declaration//GEN-END:variables
}
