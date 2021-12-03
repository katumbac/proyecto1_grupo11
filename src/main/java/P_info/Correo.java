/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package P_info;

import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author Luis Burgos
 */
public class Correo {
    public static void enviarCorreo(String destinatario, String asunto, String contenido) {
    String emisor = "ad.elect2021@gmail.com";
    String clave="POO-2021";
    
    Properties props = System.getProperties();
    props.put("mail.smtp.host", "smtp.gmail.com");
    props.put("mail.smtp.user", emisor);
    props.put("mail.smtp.auth", "true");
    props.put("mail.smtp.starttls.enable", "true");
    props.put("mail.smtp.port", "587");

    Session session = Session.getDefaultInstance(props);
    MimeMessage message = new MimeMessage(session);

    try {
        message.setFrom(new InternetAddress(emisor));
        message.addRecipients(Message.RecipientType.TO, destinatario);
        message.setSubject(asunto);
        message.setText(contenido);
        Transport transport = session.getTransport("smtp");
        transport.connect("smtp.gmail.com", emisor, clave);
        transport.sendMessage(message, message.getAllRecipients());
        transport.close();
        System.out.println("Mensaje enviado");
    }
    catch (MessagingException me) {
        me.printStackTrace();
        System.out.println("Mensaje no enviado");
    }
}
}
