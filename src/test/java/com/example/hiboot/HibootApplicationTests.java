package com.example.hiboot;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class HibootApplicationTests {
    private JavaMailSender sender=new JavaMailSenderImpl();
    @Test
    void contextLoads() {
        SimpleMailMessage mailMessage=new SimpleMailMessage();
        mailMessage.setSubject("通知");
        mailMessage.setText("hello world!");

        mailMessage.setTo("xxx@qq.com");
        sender.send(mailMessage);
    }

}

