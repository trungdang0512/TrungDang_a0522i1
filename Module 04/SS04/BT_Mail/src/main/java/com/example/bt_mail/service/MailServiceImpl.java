package com.example.bt_mail.service;

import com.example.bt_mail.model.Mail;
import org.springframework.stereotype.Service;

@Service
public class MailServiceImpl implements IMailService{
    Mail mail = new Mail("English", 25, "Enable", "Thor");


    @Override
    public void save(Mail newMail) {
        mail = newMail;
    }

    @Override
    public Mail display() {
        return mail;
    }
}
