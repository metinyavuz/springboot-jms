package com.softist.jms.tutorial.jms.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Email implements Serializable {
    private static final long serialVersionUID = -4606428759458467423L;

    private String fromEmail;
    private String toEmail;
    private String subject;
    private String body;

}
