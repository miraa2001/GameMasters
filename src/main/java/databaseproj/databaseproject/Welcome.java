/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package databaseproj.databaseproject;

import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.plaf.ColorUIResource;

/**
 *
 * @author miraj
 */
public class Welcome extends javax.swing.JFrame {

    /**
     * Creates new form Welcome
     */
    public Welcome() {
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
        jLabel2 = new javax.swing.JLabel();
        CustomerButton = new javax.swing.JButton();
        AdminButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        ShutDownLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 233, 43));
        jLabel2.setText("Welcome to Game Masters!");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 390, 40));

        CustomerButton.setBackground(new java.awt.Color(255, 233, 43));
        CustomerButton.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        CustomerButton.setText("Customer");
        CustomerButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        CustomerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CustomerButtonActionPerformed(evt);
            }
        });
        jPanel1.add(CustomerButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, 240, 50));
        CustomerButton.setVisible(true);

        AdminButton.setBackground(new java.awt.Color(255, 233, 43));
        AdminButton.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        AdminButton.setText("Administrator");
        AdminButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        AdminButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdminButtonActionPerformed(evt);
            }
        });
        jPanel1.add(AdminButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, 240, 50));
        AdminButton.setVisible(true);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 233, 43));
        jLabel3.setText("Sign in as:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\miraj\\Documents\\DatabaseProject\\WelcomeBackground2.gif")); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 340, 200, 200));

        ShutDownLabel.setIcon(new javax.swing.ImageIcon("C:\\Users\\miraj\\Documents\\DatabaseProject\\SmallShutDown.gif")); // NOI18N
        ShutDownLabel.setText("    ");
        ShutDownLabel.setToolTipText("");
        ShutDownLabel.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        ShutDownLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ShutDownLabelMouseClicked(evt);
            }
        });
        jPanel1.add(ShutDownLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, 50, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 550));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
       
    }//GEN-LAST:event_formWindowOpened

    private void CustomerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CustomerButtonActionPerformed
        // TODO add your handling code here:
        this.toBack();
        CustomerSignIn CSI=new CustomerSignIn();
        CSI.setVisible(true);
        CSI.toFront();
        this.dispose();
    }//GEN-LAST:event_CustomerButtonActionPerformed

    private void AdminButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdminButtonActionPerformed

        this.toBack();
        AdministratorSignIn ASI=new AdministratorSignIn();
        ASI.setVisible(true);
        ASI.toFront();
        this.dispose();
    }//GEN-LAST:event_AdminButtonActionPerformed

    private void ShutDownLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ShutDownLabelMouseClicked
        // TODO add your handling code here:
        UIManager UI=new UIManager();
        UI.put("OptionPane.background",new ColorUIResource(0,0,0));
        UI.put("OptionPane.messageForeground",new ColorUIResource(0,0,0));
        UI.put("Panel.background",new ColorUIResource(0,0,0));
        JLabel label = new JLabel ("Are you sure you want to exit this program?");
        label.setForeground(new java.awt.Color(255,233,43));
        ImageIcon icon=new ImageIcon("C:\\Users\\miraj\\OneDrive\\Desktop\\E-Learning (Mira)\\(7) Second Semester 2021-2022\\DataBase\\DatabaseProject\\Question.gif");
        int  result=JOptionPane .showOptionDialog(null, label, "", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,icon, null,null);
        if(result==0)
        System.exit(0);
    }//GEN-LAST:event_ShutDownLabelMouseClicked

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
            java.util.logging.Logger.getLogger(Welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Welcome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AdminButton;
    private javax.swing.JButton CustomerButton;
    private javax.swing.JLabel ShutDownLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
