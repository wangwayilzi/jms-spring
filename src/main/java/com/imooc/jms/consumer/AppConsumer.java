package com.imooc.jms.consumer;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppConsumer {
    public static void main(String[] args) {//consumer.xml
        new ClassPathXmlApplicationContext("consumer.xml");
    }
}
