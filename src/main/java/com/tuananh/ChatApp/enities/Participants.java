package com.tuananh.ChatApp.enities;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

public class Participants {
    private int id;
    @Enumerated(EnumType.STRING)
    private Type type;
}
