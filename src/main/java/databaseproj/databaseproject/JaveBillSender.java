/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package databaseproj.databaseproject;

import java.util.ArrayList;
import java.util.Properties;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author miraj
 */
public class JaveBillSender {
 public static void sendMail(String recipient,ArrayList<Order> o,int sum,int flag) throws Exception {
     
     //Create email sending properties
     System.out.println("Preparing to send email");
     Properties properties = new Properties();
     
     properties.put("mail.smtp.auth", "true");
     properties.put("mail.smtp.starttls.enable", "true");
     properties.put("mail.smtp.host", "smtp.gmail.com");
     properties.put("mail.smtp.port", "587");
     
     String myAccountEmail="2022gamemasters@gmail.com";
     String password="gamemasters@2022";
     
     Session session=Session.getInstance(properties,new Authenticator(){
         @Override
         protected PasswordAuthentication getPasswordAuthentication(){
             return new PasswordAuthentication(myAccountEmail,password);
         }
     });
     String text="";
     for(int i=0;i<o.size();i++)
     {
         text=text+"\n"+o.get(i).toString();
     }
     if(flag==0)
     text=text+"\n"+"Your bill's sum is: "+sum+"$";
     else{
     text=text+"\n"+"Your bill's sum is: "+(sum-(0.1*sum))+"$";   
     }
     Message message= prepareMessage(session,myAccountEmail,recipient,text,flag);
     Transport.send(message);
     System.out.println("Message sent successfully");
    } 
     
    private static Message prepareMessage(Session session,String myAccountEmail,String recipient,String text,int flag){
        Message message = null;
        try{
        message = new MimeMessage(session);
        message.setFrom(new InternetAddress(myAccountEmail));
        message.setRecipient(Message.RecipientType.TO,new InternetAddress(recipient));
        message.setSubject("Game Masters - Bill Receipt");
        if(flag==0)
        message.setText("Hello!\nYour Bill information is: "+text);
        else
        message.setText("Hello!Thank you for being a loyal customer, we would like to thank you with a 10% discount!\nYour Bill information is: "+text);   
        message.saveChanges();
        }
        catch(Exception ex)
        {
        System.out.println(ex.toString());
        }
        return message;
    }   
}
