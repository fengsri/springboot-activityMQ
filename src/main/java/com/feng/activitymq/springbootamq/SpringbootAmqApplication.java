package com.feng.activitymq.springbootamq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.annotation.EnableJms;

@SpringBootApplication
public class SpringbootAmqApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootAmqApplication.class, args);
    }

}
