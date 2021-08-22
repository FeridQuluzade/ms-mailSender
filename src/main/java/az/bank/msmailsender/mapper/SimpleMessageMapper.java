package az.bank.msmailsender.mapper;

import az.bank.msmailsender.dto.MessageDto;
import org.springframework.mail.SimpleMailMessage;

public class SimpleMessageMapper {

    public static SimpleMailMessage toMail(MessageDto messageDto) {
        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
        simpleMailMessage.setFrom("quluzadef36@gmail.com");
        simpleMailMessage.setTo(messageDto.getEmail());
        simpleMailMessage.setText(messageDto.getText());
        simpleMailMessage.setSubject(messageDto.getSubject());
        return simpleMailMessage;
    }
}
