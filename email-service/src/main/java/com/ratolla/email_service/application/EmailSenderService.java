package com.ratolla.email_service.application;

import com.ratolla.email_service.adapters.EmailSenderGateway;
import com.ratolla.email_service.core.EmailSenderUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class EmailSenderService implements EmailSenderUseCase {

    private final EmailSenderGateway emailSenderGatweay;

    @Autowired
    public EmailSenderService(EmailSenderGateway emailGateway){
        this.emailSenderGatweay = emailGateway;
    }

    @Override
    public void sendEmail(String to, String subject, String body) {
        this.emailSenderGatweay.sendEmail(to, subject, body);
    }
}
