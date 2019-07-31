package com.feng.activitymq.springbootamq.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.web.bind.annotation.RestController;

/*
 * 客户控制器
 */
@RestController
public class ConsumerController {

    @Autowired
    private JmsMessagingTemplate jmsMessagingTemplate;


    /*
     * 监听和读取消息
     */
    @JmsListener(destination="ActiveMQQueue",containerFactory = "jmsListenerContainerQueue")
    public void readActiveQueue(String message) {
        System.out.println("接受到queue：" + message);
        //TODO something
    }

    /*
     * 监听和读取消息
     */
    @JmsListener(destination="ActiveMQTopic",containerFactory = "jmsListenerContainerTopic")
    public void readActiveTopic(String message) {
        System.out.println("接受到topic：" + message);
        //TODO something
    }
}