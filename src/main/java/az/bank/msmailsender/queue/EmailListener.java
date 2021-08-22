package az.bank.msmailsender.queue;



import az.bank.msmailsender.dto.MessageDto;
import az.bank.msmailsender.service.EmailSenderService;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component
@Slf4j
public class EmailListener {
    private final EmailSenderService emailSenderService;

    public EmailListener(EmailSenderService emailSenderService) {
        this.emailSenderService = emailSenderService;
    }

    @RabbitListener(queues ="${spring.boot.queue}")
    public void sendMail(MessageDto messageDto){
        log.info(messageDto.toString());
        emailSenderService.sendEmail(messageDto);
    }
}
