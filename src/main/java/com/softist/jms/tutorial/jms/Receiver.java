package com.softist.jms.tutorial.jms;

import com.softist.jms.tutorial.jms.model.Email;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class Receiver {

    @JmsListener(destination = "myQueue")
    public void receiveQueueMessage(Email email) {
        System.out.println("QUEUE <" + email + ">");
    }

    @JmsListener(destination = "myTopic", containerFactory = "topicJmsListenerContainerFactory")
    public void receiveTopicMessage(String email) {
        System.out.println("TOPIC <" + email + ">");
    }

}
