package com.intertech.lab1;


import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;

/**
 * Created by jayson on 8/14/16.
 */
public class Startup {
    @SuppressWarnings({"resource","unused"})
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("/META-INF/spring/si-components.xml");

        while (true) {

        }

    }
}
