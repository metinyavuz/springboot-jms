package com.softist.jms.tutorial.jms;

import com.softist.jms.tutorial.jms.model.Email;
import lombok.AllArgsConstructor;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class Sender {

    private final JmsTemplate jmsTemplate;
    private final JmsTemplate jmsTopicTemplate;

    public void sendQueueMessage(Email email) {
        jmsTemplate.convertAndSend("myQueue", email);
    }

    public void sendTopicMessage(Email email) {
        jmsTopicTemplate.convertAndSend("myTopic", email);
    }
}
