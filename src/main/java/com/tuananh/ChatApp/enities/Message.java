package com.tuananh.ChatApp.enities;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.io.Serializable;

public class Message extends BaseModel implements Serializable {
    private static final long serialVersionUID = 1L;

    private int id;
    private String message;
    @Enumerated(EnumType.STRING)
    private MessageType messageType;


}
