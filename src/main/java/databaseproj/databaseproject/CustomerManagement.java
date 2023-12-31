/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package databaseproj.databaseproject;

import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JScrollBar;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.Border;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DateFormat;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JScrollBar;
import javax.swing.plaf.ColorUIResource;
import javax.swing.plaf.basic.BasicScrollBarUI;
import javax.swing.table.DefaultTableModel;
import oracle.jdbc.pool.OracleDataSource;

/**
 *
 * @author miraj
 */
public class CustomerManagement extends javax.swing.JFrame {

    /**
     * Creates new form CustomerManagemnt
     */
    ImageIcon ClickedAddCustomerImageIcon=new ImageIcon("ClickedAddCustomer.png");
    String username;
    String firstname;
    public CustomerManagement(String fn,String u) {
        username=u;
        firstname=fn;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Edit
     * r.
     */
    ScrollBarCustom SB=new ScrollBarCustom();
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton1 = new javax.swing.JToggleButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        LastNameTF = new javax.swing.JTextField();
        FirstNameTF = new javax.swing.JTextField();
        EmailTF = new javax.swing.JTextField();
        PhoneNumberTF = new javax.swing.JTextField();
        UsernameTF = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        UpdateButton = new javax.swing.JButton();
        FindCustomer = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        CustomerManagementTable = new javax.swing.JTable();
        BackButton = new javax.swing.JButton();
        ShutDownLabel = new javax.swing.JLabel();
        DAC = new javax.swing.JButton();

        jToggleButton1.setText("jToggleButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("GameMasters");
        setBackground(new java.awt.Color(0, 0, 0));
        setForeground(java.awt.Color.white);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("First Name");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Last Name");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Username");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Email");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Phone Number");

        LastNameTF.setForeground(new java.awt.Color(102, 102, 102));
        LastNameTF.setText("Last Name");
        LastNameTF.setToolTipText("");
        LastNameTF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        LastNameTF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LastNameTFMouseClicked(evt);
            }
        });
        LastNameTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LastNameTFActionPerformed(evt);
            }
        });

        FirstNameTF.setForeground(new java.awt.Color(102, 102, 102));
        FirstNameTF.setText("First Name");
        FirstNameTF.setToolTipText("");
        FirstNameTF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        FirstNameTF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FirstNameTFMouseClicked(evt);
            }
        });

        EmailTF.setForeground(new java.awt.Color(102, 102, 102));
        EmailTF.setText("Email");
        EmailTF.setToolTipText("");
        EmailTF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        EmailTF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EmailTFMouseClicked(evt);
            }
        });

        PhoneNumberTF.setForeground(new java.awt.Color(102, 102, 102));
        PhoneNumberTF.setText("Phone Number");
        PhoneNumberTF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        PhoneNumberTF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PhoneNumberTFMouseClicked(evt);
            }
        });
        PhoneNumberTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PhoneNumberTFActionPerformed(evt);
            }
        });

        UsernameTF.setForeground(new java.awt.Color(102, 102, 102));
        UsernameTF.setText("Username");
        UsernameTF.setToolTipText("");
        UsernameTF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        UsernameTF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UsernameTFMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel8)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LastNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(FirstNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(EmailTF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(UsernameTF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(PhoneNumberTF, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(FirstNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(LastNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(UsernameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(EmailTF, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(PhoneNumberTF, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 290, 290));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Customer Management");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 50, -1, -1));

        UpdateButton.setBackground(new java.awt.Color(255, 233, 43));
        UpdateButton.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        UpdateButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\miraj\\Documents\\DatabaseProject\\UpdateInformation.png")); // NOI18N
        UpdateButton.setText("Update Information");
        UpdateButton.setBorder(new javax.swing.border.MatteBorder(null));
        UpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateButtonActionPerformed(evt);
            }
        });
        jPanel1.add(UpdateButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 140, 30));

        FindCustomer.setBackground(new java.awt.Color(255, 233, 43));
        FindCustomer.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        FindCustomer.setIcon(new javax.swing.ImageIcon("C:\\Users\\miraj\\Documents\\DatabaseProject\\FindCustomer.png")); // NOI18N
        FindCustomer.setText("Find Customer");
        FindCustomer.setBorder(new javax.swing.border.MatteBorder(null));
        FindCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FindCustomerActionPerformed(evt);
            }
        });
        jPanel1.add(FindCustomer, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 360, 140, 30));

        jScrollPane1.setToolTipText("");
        jScrollPane1.setVerticalScrollBar(SB);

        CustomerManagementTable.setBackground(new java.awt.Color(255, 233, 43));
        CustomerManagementTable.setBorder(new javax.swing.border.MatteBorder(null));
        CustomerManagementTable.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        CustomerManagementTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Sex", "Birthdate", "Email", "Username", "Phone Number", "# Of Orders"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        CustomerManagementTable.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        CustomerManagementTable.setFillsViewportHeight(true);
        CustomerManagementTable.setGridColor(new java.awt.Color(0, 0, 0));
        CustomerManagementTable.setRequestFocusEnabled(false);
        CustomerManagementTable.setRowHeight(25);
        CustomerManagementTable.setSelectionBackground(new java.awt.Color(204, 204, 255));
        CustomerManagementTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(CustomerManagementTable);
        if (CustomerManagementTable.getColumnModel().getColumnCount() > 0) {
            CustomerManagementTable.getColumnModel().getColumn(5).setMaxWidth(75);
        }
        CustomerManagementTable.getTableHeader().setBackground(new java.awt.Color(255,255,255));
        jScrollPane1.getVerticalScrollBar().setForeground(new java.awt.Color(20,3,0));

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 110, 540, 440));

        BackButton.setBackground(new java.awt.Color(240, 236, 235));
        BackButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        BackButton.setText("Back");
        BackButton.setBorder(new javax.swing.border.MatteBorder(null));
        BackButton.setFocusable(false);
        BackButton.setMinimumSize(new java.awt.Dimension(168, 38));
        BackButton.setName(""); // NOI18N
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });
        jPanel1.add(BackButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 500, 80, 30));

        ShutDownLabel.setIcon(new javax.swing.ImageIcon("C:\\Users\\miraj\\Documents\\DatabaseProject\\ShutDown.gif")); // NOI18N
        ShutDownLabel.setText("    ");
        ShutDownLabel.setToolTipText("");
        ShutDownLabel.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        ShutDownLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ShutDownLabelMouseClicked(evt);
            }
        });
        jPanel1.add(ShutDownLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 10, 70, -1));

        DAC.setBackground(new java.awt.Color(255, 233, 43));
        DAC.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        DAC.setText("Display all customers");
        DAC.setBorder(new javax.swing.border.MatteBorder(null));
        DAC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DACActionPerformed(evt);
            }
        });
        jPanel1.add(DAC, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 410, 140, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 600));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void PhoneNumberTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PhoneNumberTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PhoneNumberTFActionPerformed

    private void PhoneNumberTFMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PhoneNumberTFMouseClicked
        // TODO add your handling code here:
        PhoneNumberTF.setText("");
        PhoneNumberTF.setForeground(Color.black);
    }//GEN-LAST:event_PhoneNumberTFMouseClicked

    private void EmailTFMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EmailTFMouseClicked
        // TODO add your handling code here:4
        EmailTF.setText("");
        EmailTF.setForeground(Color.black);
    }//GEN-LAST:event_EmailTFMouseClicked

    private void FirstNameTFMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FirstNameTFMouseClicked
        // TODO add your handling code here:
        FirstNameTF.setText("");
        FirstNameTF.setForeground(Color.black);
    }//GEN-LAST:event_FirstNameTFMouseClicked

    private void LastNameTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LastNameTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LastNameTFActionPerformed

    private void LastNameTFMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LastNameTFMouseClicked
        // TODO add your handling code here:
        LastNameTF.setText("");
        LastNameTF.setForeground(Color.black);
    }//GEN-LAST:event_LastNameTFMouseClicked

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        // TODO add your handling code here:
        this.toBack();
        AdministratorPortal AP=new AdministratorPortal(firstname,username);
        AP.setVisible(true);
        AP.toFront();
        this.dispose();
    }//GEN-LAST:event_BackButtonActionPerformed

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

    private void DACActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DACActionPerformed
        // TODO add your handling code here:
            try{
            OracleDataSource ods=new OracleDataSource();
            ods.setURL("jdbc:oracle:thin:@localhost:1521:orcl");
            ods.setUser("c##scott");
            ods.setPassword("tiger");
            Connection con=ods.getConnection();
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("select * from customer order by ssn");
            DefaultTableModel tblModel= (DefaultTableModel) CustomerManagementTable.getModel();
            
            tblModel.setRowCount(0);
            while(rs.next())
            {
                int id=rs.getInt(1);
                String name=rs.getString(2)+" "+rs.getString(3);
                String sex=rs.getString(4);
                String date=rs.getDate(5).toString();
                String[] dateSplit=date.split("-");
                date=dateSplit[2]+"-"+dateSplit[1]+dateSplit[0];
                String email=rs.getString(6);
                String username=rs.getString(7);
                String pn=rs.getString(8);
                int noo=rs.getInt(9);
                String []data={""+id,name,sex,date,email,username,pn,""+noo};
                tblModel.addRow(data);
            }
            con.setAutoCommit(false);
            con.commit();
            con.close();
            }catch(Exception ex)
            {
                System.out.println(ex.toString());
            }
    }//GEN-LAST:event_DACActionPerformed

    private void UpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateButtonActionPerformed
        // TODO add your handling code here:
        try{
            String firstname="";
            String username=UsernameTF.getText();
            String lastname="";
            String email="";
            String password="";
            String date="";
            String phonenumber="";
            String salary="";
            String ID="";
            int flag=0;
            DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
            String url="jdbc:oracle:thin:@localhost:1521:orcl";
            Connection con=DriverManager.getConnection(url,"c##scott","tiger");
            con.setAutoCommit(false);
            String sqlStmt="";
            if(( (EmailTF.getText().length() - EmailTF.getText().indexOf("@gmail.com"))==10 )&&
                    EmailTF.getText().contains("@gmail.com")     
               )
            {                     
                flag=0;
                email=EmailTF.getText();
                System.out.println("\n"+email+"  "+username);
                sqlStmt="update customer set email='"+email+"' where username='"+username+"'";
                PreparedStatement PrS=con.prepareStatement(sqlStmt);
                ResultSet rs=PrS.executeQuery();
                con.commit();
            }
            else if(( (EmailTF.getText().length() - EmailTF.getText().indexOf("@hotmail.com"))==12 )&&
                    EmailTF.getText().contains("@hotmail.com")     
               )
            {                    
                flag=0;
                email=EmailTF.getText();
                System.out.println("\n"+email+"  "+username);
                sqlStmt="update customer set email='"+email+"' where username='"+username+"'";
                PreparedStatement PrS=con.prepareStatement(sqlStmt);
                ResultSet rs=PrS.executeQuery();
                con.commit();
            }
            else if(( (EmailTF.getText().length() - EmailTF.getText().indexOf("@yahoo.com"))==10 )&&
                    EmailTF.getText().contains("@yahoo.com")     
               )
            {                      
                flag=0;
                email=EmailTF.getText();
                System.out.println("\n"+email+"  "+username);
                sqlStmt="update customer set email='"+email+"' where username='"+username+"'";
                PreparedStatement PrS=con.prepareStatement(sqlStmt);
                ResultSet rs=PrS.executeQuery();
                con.commit();
            }
            else if(( (EmailTF.getText().length() - EmailTF.getText().indexOf("@najah.edu"))==10 )&&
                    EmailTF.getText().contains("@najah.edu")     
               )
            {                       
                flag=0;
                email=EmailTF.getText();
                sqlStmt="update customer set email='"+email+"' where username='"+username+"'";
                PreparedStatement PrS=con.prepareStatement(sqlStmt);
                ResultSet rs=PrS.executeQuery();
                con.commit();
            }
            else
            {
                if(EmailTF.getText().isEmpty())
                    flag=0;
                else{
                flag=1;
                JOptionPane.showMessageDialog(this,"Invalid Email","Error",JOptionPane.ERROR_MESSAGE);
                }
            }
            
            if((flag==0)&&(!FirstNameTF.getText().isEmpty()))
            {
                firstname=FirstNameTF.getText();
                System.out.println(firstname+"  "+username);
                sqlStmt="update customer set first_name='"+firstname+"' where username='"+username+"'";
                PreparedStatement PrS=con.prepareStatement(sqlStmt);
                ResultSet rs=PrS.executeQuery();
                con.commit();
            }
            if((flag==0)&&(!LastNameTF.getText().isEmpty()))
            {
                lastname=LastNameTF.getText();
                System.out.println(lastname+"  "+username);
                sqlStmt="update customer set last_name='"+lastname+"' where username='"+username+"'";
                PreparedStatement PrS=con.prepareStatement(sqlStmt);
                ResultSet rs=PrS.executeQuery();
                con.commit();
            }
            if((flag==0)&&(!PhoneNumberTF.getText().isEmpty()))
            {
                phonenumber=PhoneNumberTF.getText();
                sqlStmt="update customer set phone_number='"+phonenumber+"' where username='"+username+"'";
                PreparedStatement PrS=con.prepareStatement(sqlStmt);
                ResultSet rs=PrS.executeQuery();
                con.commit();
            }
            

        }
        catch(Exception ex)
                {
                System.out.println(ex.toString());

                }
    }//GEN-LAST:event_UpdateButtonActionPerformed

    private void UsernameTFMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UsernameTFMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_UsernameTFMouseClicked

    private void FindCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FindCustomerActionPerformed
        // TODO add your handling code here:
        try{
            OracleDataSource ods=new OracleDataSource();
            ods.setURL("jdbc:oracle:thin:@localhost:1521:orcl");
            ods.setUser("c##scott");
            ods.setPassword("tiger");
            Connection con=ods.getConnection();
            Statement stmt=con.createStatement();
            username=UsernameTF.getText();
            ResultSet rs=stmt.executeQuery("select * from customer where username='"+username+"'");
            DefaultTableModel tblModel= (DefaultTableModel) CustomerManagementTable.getModel();
            
            tblModel.setRowCount(0);
            while(rs.next())
            {
                int id=rs.getInt(1);
                String name=rs.getString(2)+" "+rs.getString(3);
                String sex=rs.getString(4);
                String date=rs.getDate(5).toString();
                String[] dateSplit=date.split("-");
                date=dateSplit[2]+"-"+dateSplit[1]+dateSplit[0];
                String email=rs.getString(6);
                String username=rs.getString(7);
                String pn=rs.getString(8);
                int noo=rs.getInt(9);
                String []data={""+id,name,sex,date,email,username,pn,""+noo};
                tblModel.addRow(data);
            }
            con.setAutoCommit(false);
            con.commit();
            con.close();
            }catch(Exception ex)
            {
                System.out.println(ex.toString());
            }
    }//GEN-LAST:event_FindCustomerActionPerformed

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
            java.util.logging.Logger.getLogger(CustomerManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new CustomerManagement().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackButton;
    private javax.swing.JTable CustomerManagementTable;
    private javax.swing.JButton DAC;
    private javax.swing.JTextField EmailTF;
    private javax.swing.JButton FindCustomer;
    private javax.swing.JTextField FirstNameTF;
    private javax.swing.JTextField LastNameTF;
    private javax.swing.JTextField PhoneNumberTF;
    private javax.swing.JLabel ShutDownLabel;
    private javax.swing.JButton UpdateButton;
    private javax.swing.JTextField UsernameTF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToggleButton jToggleButton1;
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
        g2.setColor(new Color(240, 240, 240));
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
