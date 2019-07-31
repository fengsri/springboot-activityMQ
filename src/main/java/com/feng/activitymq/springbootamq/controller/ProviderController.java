package com.feng.activitymq.springbootamq.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.jms.Queue;
import javax.jms.Topic;

/**
 * @Description
 * @Author fengwen
 * @Date 2019/7/31 20:19
 * @Version V1.0
 */
@RestController
public class ProviderController {

    @Autowired
    private JmsMessagingTemplate jmsMessagingTemplate;

    @Autowired
    private Queue queue;

    @Autowired
    private Topic topic;

    /*
     * 消息生产者
     */
    @RequestMapping("/sendmsg")
    public void sendmsg(String msg) {
        // 指定消息发送的目的地及内容
        this.jmsMessagingTemplate.convertAndSend(this.queue, msg);
    }

    @RequestMapping("/send")
    public void send(String msg) {
        // 指定消息发送的目的地及内容
        System.out.println("@@@@@@@@@@@@@@" + msg);
        this.jmsMessagingTemplate.convertAndSend(this.topic, msg);
    }

}
