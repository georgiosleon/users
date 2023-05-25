package com.gleon.usersapi.services.impl;

import com.gleon.usersapi.services.EmailService;
import com.mailersend.sdk.MailerSend;
import com.mailersend.sdk.MailerSendResponse;
import com.mailersend.sdk.emails.Email;
import com.mailersend.sdk.exceptions.MailerSendException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class EmailServiceImpl implements EmailService {

    @Override
    public void sendEmail(String email ) throws Exception {
            log.info("Send Welcome email to  {} ", email);
//        Email email = new Email();
//
//        email.setFrom("name", "");
//        email.addRecipient("name", "");
//
////        // you can also add multiple recipients by calling addRecipient again
////        email.addRecipient("name 2", "your@recipient2.com");
//
//        email.setSubject("Welcome to users api ");
//
//        email.setPlain("This is the text content");
//        email.setHtml("<p>This is the HTML content</p>");
//
//        MailerSend ms = new MailerSend();
//
//        ms.setToken("Your API token");
//
//        try {
//
//            MailerSendResponse response = ms.emails().send(email);
//
//        } catch (MailerSendException e) {
//
//            e.printStackTrace();
//        }

    }
}


