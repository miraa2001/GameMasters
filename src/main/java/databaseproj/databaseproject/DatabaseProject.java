/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package databaseproj.databaseproject;

import javax.swing.JOptionPane;

/**
 *
 * @author miraj
 */
public class DatabaseProject {

    public static void main(String[] args) {
        try
        {
            //AdministratorPortal AP=new AdministratorPortal();
            //AP.setVisible(true);
            //CustomerSignUp CS=new CustomerSignUp();
            //CS.setVisible(true);
            LoadingScreen LS=new LoadingScreen();
            LS.setVisible(true);
            Welcome w=new Welcome();

                for(int i=0;i<=100;i++)
                {
                    Thread.sleep(50);
                    LS.LoadingValue.setText(i+"%");
                    LS.LoadingBar.setValue(i);
                }
                LS.setVisible(false);
                w.setVisible(true);
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e.toString());
        }
        
    }
}
