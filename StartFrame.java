/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospitalmanagementsystem;

/**
 *
 * @author Fame
 */
public class StartFrame extends javax.swing.JFrame {

    /**
     * Creates new form StartFrame
     */
    public StartFrame() {
        super("****WELCOME TO PIMS HOSPITAL****");
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

        jPanel1 = new javax.swing.JPanel();
        startJLabel = new javax.swing.JLabel();
        nextJB = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        startJLabel.setBackground(new java.awt.Color(255, 255, 255));
        startJLabel.setFont(new java.awt.Font("Stencil", 1, 24)); // NOI18N
        startJLabel.setForeground(new java.awt.Color(0, 0, 255));
        startJLabel.setText("START WITH THE NAME OF ALLAH");
        jPanel1.add(startJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 410, 36));

        nextJB.setBackground(new java.awt.Color(255, 153, 153));
        nextJB.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        nextJB.setIcon(new javax.swing.ImageIcon("C:\\Users\\Fame\\Documents\\NetBeansProjects\\HospitalManagementSystem\\src\\hospitalmanagementsystem\\Images\\next.png")); // NOI18N
        nextJB.setText("NEXT");
        nextJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextJBActionPerformed(evt);
            }
        });
        jPanel1.add(nextJB, new org.netbeans.lib.awtextra.AbsoluteConstraints(387, 343, 110, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Fame\\Documents\\NetBeansProjects\\HospitalManagementSystem\\src\\hospitalmanagementsystem\\Images\\bismillah edit.jpg")); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 520, 390));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void nextJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextJBActionPerformed
        // TODO add your handling code here:
        this.dispose();
        HospitalFrame hf=new HospitalFrame();
        hf.setVisible(true);
    }//GEN-LAST:event_nextJBActionPerformed

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
            java.util.logging.Logger.getLogger(StartFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StartFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StartFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StartFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StartFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton nextJB;
    private javax.swing.JLabel startJLabel;
    // End of variables declaration//GEN-END:variables
}