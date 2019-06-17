package com.softist.jms.tutorial.jms;

import com.softist.jms.tutorial.jms.model.Email;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class Sender {

    private final JmsTemplate queueJmsTemplate;
    private final JmsTemplate topicJmsTemplate;

    public void sendQueueMessage(Email email){
        queueJmsTemplate.convertAndSend(email);
    }

    public void sendTopicMessage(Email email){
        topicJmsTemplate.convertAndSend(email);
    }
}
