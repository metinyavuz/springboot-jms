package com.softist.jms.tutorial.jms;

import com.softist.jms.tutorial.jms.model.Email;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class Receiver {

    @JmsListener(destination = "${destination.queueName}")
    public void receiveQueueMessage(Email email) {
        System.out.println("QUEUE <" + email + ">");
    }

    @JmsListener(destination = "${destination.topicName}")
    public void receiveTopicMessage(Email email) {
        System.out.println("TOPIC <" + email + ">");
    }

}
