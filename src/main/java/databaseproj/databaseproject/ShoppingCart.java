/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package databaseproj.databaseproject;

import static databaseproj.databaseproject.CustomerSignIn.sendEmail;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.io.File;
import java.io.FileInputStream;
import java.io.*;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Random;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollBar;
import javax.swing.UIManager;
import javax.swing.plaf.ColorUIResource;
import javax.swing.plaf.basic.BasicScrollBarUI;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.swing.JRViewer;
import net.sf.jasperreports.view.JasperViewer;
import oracle.jdbc.pool.OracleDataSource;

/**
 *
 * @author miraj
 */
public class ShoppingCart extends javax.swing.JFrame {

    /**
     * Creates new form ShoppingCart
     */
    ScrollBarCustom SB=new ShoppingCart.ScrollBarCustom();
    String username;
    String orderID="";
    int sum=0;
    ArrayList<Order> order=new ArrayList<>();
    public ShoppingCart(String u,ArrayList<Order> o) {
        username=u;
        order=o;
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
        Display = new javax.swing.JButton();
        OrderNumber = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        OrderTable = new javax.swing.JTable();
        Submit = new javax.swing.JButton();

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

        Display.setBackground(new java.awt.Color(255, 233, 43));
        Display.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        Display.setText("Display Order");
        Display.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DisplayActionPerformed(evt);
            }
        });
        jPanel1.add(Display, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 550, -1, -1));

        OrderNumber.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        OrderNumber.setForeground(new java.awt.Color(255, 255, 255));
        OrderNumber.setText("Order #");
        jPanel1.add(OrderNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, 180, -1));

        OrderTable.setBackground(new java.awt.Color(255, 233, 43));
        OrderTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product ID", "Name", "Quantity", "Price (1 Qnty)", "Total Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        OrderTable.setGridColor(new java.awt.Color(0, 0, 0));
        OrderTable.setRowHeight(40);
        OrderTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(OrderTable);
        OrderTable.getTableHeader().setBackground(new java.awt.Color(255,255,255));
        jScrollPane1.getVerticalScrollBar().setForeground(new java.awt.Color(255,233,43));

        jScrollPane1.setVerticalScrollBar(SB);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 540, 480));

        Submit.setBackground(new java.awt.Color(255, 233, 43));
        Submit.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        Submit.setText("Submit");
        Submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitActionPerformed(evt);
            }
        });
        jPanel1.add(Submit, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 550, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 700));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    private void DisplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DisplayActionPerformed
        // TODO add your handling code here:
        try{
            DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
            String url="jdbc:oracle:thin:@localhost:1521:orcl";
            Connection con=DriverManager.getConnection(url,"c##scott","tiger");
            con.setAutoCommit(false);
            String sqlStmt="select id from orders order by id";
            PreparedStatement PrS=con.prepareStatement(sqlStmt);
            ResultSet rs=PrS.executeQuery();
            orderID="0";
            while(rs.next())
            {
                orderID=rs.getString(1);
            }

            System.out.println(orderID);
            orderID=String.valueOf(Integer.parseInt(orderID)+1);
            System.out.println(orderID);
            OrderNumber.setText("Order #"+orderID);
            con.commit();
            Collections.sort(order);
            String []SqlStmt;
            ResultSet []RS;
            PreparedStatement  []PRS;
            SqlStmt=new String[order.size()];
            RS=new ResultSet[order.size()];
            PRS=new PreparedStatement[order.size()];
            for(int i=0;i<order.size();i++)
            {
                SqlStmt[i]="insert into orders values('"+orderID+"','"+username+"',"+order.get(i).getpid()+","+order.get(i).getq()+")";
                System.out.println("values\t"+orderID+"\t"+username+"\t"+order.get(i).getpid()+"\t"+order.get(i).getq());       
                PRS[i]= con.prepareStatement(SqlStmt[i]);
                RS[i]=PRS[i].executeQuery();
                con.commit();
            }
            OracleDataSource ods=new OracleDataSource();
            ods.setURL("jdbc:oracle:thin:@localhost:1521:orcl");
            ods.setUser("c##scott");
            ods.setPassword("tiger");
            Connection con1=ods.getConnection();
            Statement stmt=con.createStatement();
            ResultSet rs1=stmt.executeQuery("select o.*,p.p_name,p.price from orders o,product p where o.product_id=p.p_id and o.ID="+orderID+" order by o.id, o.product_id");
            DefaultTableModel tblModel= (DefaultTableModel) OrderTable.getModel();
            tblModel.setRowCount(0);
            while(rs1.next())
            {
                int id=rs1.getInt(3);
                int q=rs1.getInt(4);
                String name=rs1.getString(5);
                int price=rs1.getInt(6);
                sum=sum+(q*price);
                String []data={""+id,name,""+q,""+price,""+(price*q)};
                tblModel.addRow(data);
            }
            con1.setAutoCommit(false);
            con1.commit();
            System.out.println(sum);
            int []quan;
            quan=new int[28];
            for(int i=0;i<28;i++){
                String sql="select quantity from orders where product_id="+i;
                PreparedStatement p=con.prepareStatement(sql);
                ResultSet n=p.executeQuery();
                int num=0;
                quan[i]=0;
                while(n.next())
                {
                    num=num+n.getInt(1);
                }
                quan[i]=num;
            }
            for(int i=0;i<28;i++){
                String sql1="update product set numberoforders="+quan[i]+" where p_id="+i;
                PreparedStatement p1=con.prepareStatement(sql1);
                ResultSet n1=p1.executeQuery();
                con.commit();
            }
        }catch(Exception ex)
        {
            System.out.println(ex.toString());
        }
    }//GEN-LAST:event_DisplayActionPerformed

    private void SubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitActionPerformed
        // TODO add your handling code here:
            String Email="";
            UIManager UI=new UIManager();
            UI.put("OptionPane.background",new ColorUIResource(0,0,0));
            UI.put("OptionPane.messageForeground",new ColorUIResource(255,233,43));
            UI.put("Panel.background",new ColorUIResource(0,0,0));
            UI.put("Button.Background",new ColorUIResource(255,233,43));
            ImageIcon icon=new ImageIcon("C:\\Users\\miraj\\Documents\\DatabaseProject\\Question.gif");
            Email=(String) JOptionPane.showInputDialog(this,"Please enter your email","Email Query", JOptionPane.INFORMATION_MESSAGE, icon, null, "");
            while(Email.isEmpty())
            {
                UIManager UI1=new UIManager();
                UI1.put("OptionPane.background",new ColorUIResource(0,0,0));
                UI1.put("OptionPane.messageForeground",new ColorUIResource(255,233,43));
                UI1.put("Panel.background",new ColorUIResource(0,0,0));
                UI1.put("Button.Background",new ColorUIResource(255,233,43));
                ImageIcon icon1=new ImageIcon("C:\\Users\\miraj\\Documents\\DatabaseProject\\Error.gif");
                JOptionPane.showMessageDialog(this,"Error!Make sure to fill in your email correctly","Error",JOptionPane.ERROR_MESSAGE,icon);
                UIManager UI4=new UIManager();
                UI4.put("OptionPane.background",new ColorUIResource(0,0,0));
                UI4.put("OptionPane.messageForeground",new ColorUIResource(255,233,43));
                UI4.put("Panel.background",new ColorUIResource(0,0,0));
                UI4.put("Button.Background",new ColorUIResource(255,233,43));
                ImageIcon icon4=new ImageIcon("C:\\Users\\miraj\\Documents\\DatabaseProject\\Question.gif");
                Email=(String) JOptionPane.showInputDialog(this,"Please enter your email","Email Query", JOptionPane.INFORMATION_MESSAGE, icon, null, "");

            }
            Random random=new Random();
            int randomInt=0;
            randomInt=random.nextInt(1000,9999);
            String randomString=""+randomInt;
            // TODO add your handling code here:
            try {
                sendEmail(Email,randomString);
            } catch (Exception ex) {
                System.out.println("btn\t"+ex.toString());
            }
            UIManager UI2=new UIManager();
            UI2.put("OptionPane.background",new ColorUIResource(0,0,0));
            UI2.put("OptionPane.messageForeground",new ColorUIResource(255,233,43));
            UI2.put("Panel.background",new ColorUIResource(0,0,0));
            UI2.put("Button.Background",new ColorUIResource(255,233,43));
            ImageIcon icon2=new ImageIcon("C:\\Users\\miraj\\Documents\\DatabaseProject\\Question.gif");
            String enteredCode=(String) JOptionPane.showInputDialog(this,"Enter the confirmation code","Confirmation", JOptionPane.INFORMATION_MESSAGE, icon, null, "");
            if(enteredCode.equals(randomString))
            {   
                try{
                DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
                String url="jdbc:oracle:thin:@localhost:1521:orcl";
                Connection con=DriverManager.getConnection(url,"c##scott","tiger");
                con.setAutoCommit(false);
                String sqlStmt="select noo from customer where username='"+username+"'";
                PreparedStatement PrS=con.prepareStatement(sqlStmt);
                ResultSet rs=PrS.executeQuery();
                int noo=0;
                if(rs.next())
                {
                    noo=rs.getInt(1);
                }
                noo++;
                con.commit();
                String sqlStmt1="update customer set noo="+noo+" where username='"+username+"'";
                PreparedStatement PrS1=con.prepareStatement(sqlStmt1);
                ResultSet rs1=PrS1.executeQuery();
                System.out.println(noo);
                if(noo==4)
                {
                    sendEmail1(Email,order,sum,1);
                }
                else{
                    sendEmail1(Email,order,sum,0);
                }
                con.commit();
                con.close();
                }catch(Exception ex)
                {
                    System.out.println(ex.toString());
                }
            }
    }//GEN-LAST:event_SubmitActionPerformed
    public static void sendEmail(String e,String number) throws Exception
    {
        JavaEmailSender.sendMail(e,number);
    }
    public static void sendEmail1(String e,ArrayList<Order> o,int  number,int f) throws Exception
    {
        JaveBillSender.sendMail(e, o, number,f);
    }
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
            java.util.logging.Logger.getLogger(ShoppingCart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ShoppingCart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ShoppingCart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ShoppingCart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new ShoppingCart().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Display;
    private javax.swing.JLabel OrderNumber;
    private javax.swing.JTable OrderTable;
    private javax.swing.JButton Submit;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
public class ScrollBarCustom extends JScrollBar {

    public ScrollBarCustom() {
        setUI(new ModernScrollBarUI());
        setPreferredSize(new Dimension(8, 8));
        setForeground(new Color(48, 144, 216));
        setBackground(Color.WHITE);
    }
}
public class ModernScrollBarUI extends BasicScrollBarUI {

    private final int THUMB_SIZE = 200;

    @Override
    protected Dimension getMaximumThumbSize() {
        if (scrollbar.getOrientation() == JScrollBar.VERTICAL) {
            return new Dimension(0, THUMB_SIZE);
        } else {
            return new Dimension(THUMB_SIZE, 0);
        }
    }

    @Override
    protected Dimension getMinimumThumbSize() {
        if (scrollbar.getOrientation() == JScrollBar.VERTICAL) {
            return new Dimension(0, THUMB_SIZE);
        } else {
            return new Dimension(THUMB_SIZE, 0);
        }
    }

    @Override
    protected JButton createIncreaseButton(int i) {
        return new ScrollBarButton();
    }

    @Override
    protected JButton createDecreaseButton(int i) {
        return new ScrollBarButton();
    }

    @Override
    protected void paintTrack(Graphics grphcs, JComponent jc, Rectangle rctngl) {
        Graphics2D g2 = (Graphics2D) grphcs;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        int orientation = scrollbar.getOrientation();
        int size;
        int x;
        int y;
        int width;
        int height;
        if (orientation == JScrollBar.VERTICAL) {
            size = rctngl.width / 2;
            x = rctngl.x + ((rctngl.width - size) / 2);
            y = rctngl.y;
            width = size;
            height = rctngl.height;
        } else {
            size = rctngl.height / 2;
            y = rctngl.y + ((rctngl.height - size) / 2);
            x = 0;
            width = rctngl.width;
            height = size;
        }
        g2.setColor(new Color(255,233,43));
        g2.fillRect(x, y, width, height);
    }

    @Override
    protected void paintThumb(Graphics grphcs, JComponent jc, Rectangle rctngl) {
        Graphics2D g2 = (Graphics2D) grphcs;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        int x = rctngl.x;
        int y = rctngl.y;
        int width = rctngl.width;
        int height = rctngl.height;
        if (scrollbar.getOrientation() == JScrollBar.VERTICAL) {
            y += 8;
            height -= 10;
        } else {
            x += 8;
            width -= 10;
        }
        g2.setColor(scrollbar.getForeground());
        g2.fillRoundRect(x, y, width, height, 10, 10);
    }

    private class ScrollBarButton extends JButton {

        public ScrollBarButton() {
            setBorder(BorderFactory.createEmptyBorder());
        }

        @Override
        public void paint(Graphics grphcs) {
        }
    }
}
}
