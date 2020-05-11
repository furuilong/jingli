package cn.bdqn.task;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.io.File;

@SpringBootTest
class Springboot04TaskApplicationTests {

    @Autowired
    JavaMailSenderImpl JavaMailSenderImpl;

    @Test
    void contextLoads() {
        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
        simpleMailMessage.setSubject("通知-今晚开会");
        simpleMailMessage.setText("今天7:30开会");

        simpleMailMessage.setTo("furuilong123@163.com");
        simpleMailMessage.setFrom("2535181242@qq.com");

        JavaMailSenderImpl.send(simpleMailMessage);
    }

    @Test
    public void test02() throws MessagingException {

        MimeMessage mimeMessage = JavaMailSenderImpl.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(mimeMessage,true);

        helper.setSubject("通知-今晚开会");
        helper.setText("<b style='color:red'>今天7:30开会</b>",true);

        helper.setTo("furuilong123@163.com");
        helper.setFrom("2535181242@qq.com");

        helper.addAttachment("1.jsp",new File("C:\\Users\\furuilong\\Desktop\\捕获1.PNG"));

        JavaMailSenderImpl.send(mimeMessage);
    }

}
