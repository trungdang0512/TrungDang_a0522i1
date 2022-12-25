package com.example.bt_mail.service;

import com.example.bt_mail.model.Mail;

public interface IMailService {
    void save(Mail newMail);
    Mail display();
}
