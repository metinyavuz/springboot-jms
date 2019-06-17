package com.softist.jms.tutorial.jms;

import com.softist.jms.tutorial.jms.model.Email;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("/send")
@AllArgsConstructor
public class Controller {

    private final Sender sender;

    @PostMapping("/queue")
    private void sendQueuMessage(@RequestBody Email email){

        sender.sendQueueMessage(email);
    }
    @PostMapping("/topic")
    private void sendTopicMessage(@RequestBody Email email){

        sender.sendTopicMessage(email);
    }

}
