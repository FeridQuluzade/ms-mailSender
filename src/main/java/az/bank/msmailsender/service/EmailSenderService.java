package az.bank.msmailsender.service;

import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailSenderService {

    private final JavaMailSender javaMailSender;

    public EmailSenderService(JavaMailSender javaMailSender) {
        this.javaMailSender = javaMailSender;
    }

    public void sendEmail(String toEmail,
                          String subject,
                          String text){
        SimpleMailMessage simpleMailMessage= new SimpleMailMessage();
        simpleMailMessage.setFrom("quluzadef36@gmail.com");
        simpleMailMessage.setTo(toEmail);
        simpleMailMessage.setText(text);
        simpleMailMessage.setSubject(subject);

        javaMailSender.send(simpleMailMessage);
    }

}
