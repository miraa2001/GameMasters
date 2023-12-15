/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package databaseproj.databaseproject;

/**
 *
 * @author miraj
 */
import javax.mail.*;
import javax.mail.internet.*;
import java.util.Properties;

public class JavaEmailSender {
    public static void sendMail(String recipient,String number) throws Exception {
     
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
     
     Message message= prepareMessage(session,myAccountEmail,recipient,number);
     Transport.send(message);
     System.out.println("Message sent successfully");
    } 
     
    private static Message prepareMessage(Session session,String myAccountEmail,String recipient,String number){
        Message message = null;
        try{
        message = new MimeMessage(session);
        message.setFrom(new InternetAddress(myAccountEmail));
        message.setRecipient(Message.RecipientType.TO,new InternetAddress(recipient));
        message.setSubject("Game Masters - Confirmation Email");
        message.setText("Hello!\nYour confirmation code is: "+number);
        message.saveChanges();
        }
        catch(Exception ex)
        {
        System.out.println(ex.toString());
        }
        return message;
    } 
}
