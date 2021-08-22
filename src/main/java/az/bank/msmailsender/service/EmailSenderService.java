package az.bank.msmailsender.service;

import az.bank.msmailsender.dto.MessageDto;
import az.bank.msmailsender.mapper.SimpleMessageMapper;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailSenderService {
    private final JavaMailSender javaMailSender;

    public EmailSenderService(JavaMailSender javaMailSender) {
        this.javaMailSender = javaMailSender;
    }

    public void sendEmail(MessageDto messageDto) {
        javaMailSender.send(SimpleMessageMapper.toMail(messageDto));
    }
}
