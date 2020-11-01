package com.example.microservices.message_protocol;

import com.example.microservices.MessageObject;
import lombok.*;

@Getter @AllArgsConstructor @NoArgsConstructor @ToString @EqualsAndHashCode
public class PingMO implements MessageObject {
    private String id;
    private boolean success;
    private String applicationId;
}