/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package databaseproj.databaseproject;

import java.io.*;
import java.sql.Connection;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.plaf.ColorUIResource;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.swing.JRViewer;
import oracle.jdbc.pool.OracleDataSource;

/**
 *
 * @author miraj
 */
public class AdministratorPortal extends javax.swing.JFrame {

    /**
     * Creates new form AdministratorPortal
     */
    String username;
    String firstname;
    public AdministratorPortal(String fn,String u){
        username=u;
        firstname=fn;
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
        EditProfileButton = new javax.swing.JButton();
        ProductsSales = new javax.swing.JButton();
        OrdersManagementButton = new javax.swing.JButton();
        CustomerManagementButton1 = new javax.swing.JButton();
        SignOutButton = new javax.swing.JButton();
        ShutDownLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 233, 43));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 32)); // NOI18N
        jLabel2.setText("Hello "+firstname+"!");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, 320, 40));

        EditProfileButton.setBackground(new java.awt.Color(213, 221, 255));
        EditProfileButton.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        EditProfileButton.setText("Edit Profile");
        EditProfileButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        EditProfileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditProfileButtonActionPerformed(evt);
            }
        });
        jPanel1.add(EditProfileButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 80, 30));

        ProductsSales.setBackground(new java.awt.Color(0, 0, 0));
        ProductsSales.setFont(new java.awt.Font("Arial", 1, 22)); // NOI18N
        ProductsSales.setForeground(new java.awt.Color(255, 255, 255));
        ProductsSales.setText("Products' Sales");
        ProductsSales.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        ProductsSales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProductsSalesActionPerformed(evt);
            }
        });
        jPanel1.add(ProductsSales, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 230, 300, 50));

        OrdersManagementButton.setBackground(new java.awt.Color(0, 0, 0));
        OrdersManagementButton.setFont(new java.awt.Font("Arial", 1, 22)); // NOI18N
        OrdersManagementButton.setForeground(new java.awt.Color(255, 255, 255));
        OrdersManagementButton.setText("Orders Management");
        OrdersManagementButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        OrdersManagementButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OrdersManagementButtonActionPerformed(evt);
            }
        });
        jPanel1.add(OrdersManagementButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 320, 300, 50));

        CustomerManagementButton1.setBackground(new java.awt.Color(0, 0, 0));
        CustomerManagementButton1.setFont(new java.awt.Font("Arial", 1, 22)); // NOI18N
        CustomerManagementButton1.setForeground(new java.awt.Color(255, 255, 255));
        CustomerManagementButton1.setText("Customer Management");
        CustomerManagementButton1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        CustomerManagementButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CustomerManagementButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(CustomerManagementButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 140, 300, 50));

        SignOutButton.setBackground(new java.awt.Color(213, 221, 255));
        SignOutButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        SignOutButton.setText("Sign Out");
        SignOutButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        SignOutButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SignOutButtonMouseClicked(evt);
            }
        });
        jPanel1.add(SignOutButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 410, 70, 33));

        ShutDownLabel.setIcon(new javax.swing.ImageIcon("C:\\Users\\miraj\\Documents\\DatabaseProject\\ShutDown.gif")); // NOI18N
        ShutDownLabel.setText("    ");
        ShutDownLabel.setToolTipText("");
        ShutDownLabel.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        ShutDownLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ShutDownLabelMouseClicked(evt);
            }
        });
        jPanel1.add(ShutDownLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 10, 70, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\miraj\\Documents\\DatabaseProject\\AdminPortal.png")); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 450));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void CustomerManagementButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CustomerManagementButton1ActionPerformed
        // TODO add your handling code here:
        this.toBack();
        CustomerManagement CM=new CustomerManagement(firstname,username);
        CM.setVisible(true);
        CM.toFront();
        this.dispose();
    }//GEN-LAST:event_CustomerManagementButton1ActionPerformed

    private void EditProfileButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditProfileButtonActionPerformed
        // TODO add your handling code here:
        this.toBack();
        EditProfileAdministrator EPA=new EditProfileAdministrator(firstname,username);
        EPA.setVisible(true);
        EPA.toFront();
        this.dispose();
    }//GEN-LAST:event_EditProfileButtonActionPerformed

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

    private void SignOutButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SignOutButtonMouseClicked
        // TODO add your handling code here:
        this.toBack();
        Welcome W=new Welcome();
        W.setVisible(true);
        W.toFront();
        this.dispose();
    }//GEN-LAST:event_SignOutButtonMouseClicked

    private void OrdersManagementButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OrdersManagementButtonActionPerformed
        // TODO add your handling code here:
        this.toBack();
        OrdersManagement OM=new OrdersManagement(firstname,username);
        OM.setVisible(true);
        OM.toFront();
        this.dispose();
    }//GEN-LAST:event_OrdersManagementButtonActionPerformed

    private void ProductsSalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProductsSalesActionPerformed
        // TODO add your handling code here:
        try{
        OracleDataSource ods= new OracleDataSource();
        ods.setUser("c##scott");
        ods.setPassword("tiger");
        ods.setURL("jdbc:oracle:thin:@localhost:1521:orcl");
        Connection con=ods.getConnection();
        InputStream input=new FileInputStream(new File("Sellings.jrxml"));
        JasperDesign jd=JRXmlLoader.load(input);
        JasperReport jr=JasperCompileManager.compileReport(jd);
        JasperPrint jp=JasperFillManager.fillReport(jr,null,con);
        
        JFrame frame=new JFrame("Sales Report");
        frame.getContentPane().add(new JRViewer(jp));
        frame.setLocationRelativeTo(null);
        frame.pack();
        frame.setVisible(true);
        
        OutputStream os=new FileOutputStream(new File("Sales.pdf"));
        JasperExportManager.exportReportToPdfStream(jp,os);
        os.close();
        input.close();
        }catch(Exception ex)
        {
            System.out.println(ex.toString());
        }
    }//GEN-LAST:event_ProductsSalesActionPerformed

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
            java.util.logging.Logger.getLogger(AdministratorPortal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdministratorPortal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdministratorPortal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdministratorPortal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new AdministratorPortal().setVisible(false);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CustomerManagementButton1;
    private javax.swing.JButton EditProfileButton;
    private javax.swing.JButton OrdersManagementButton;
    private javax.swing.JButton ProductsSales;
    private javax.swing.JLabel ShutDownLabel;
    private javax.swing.JButton SignOutButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
