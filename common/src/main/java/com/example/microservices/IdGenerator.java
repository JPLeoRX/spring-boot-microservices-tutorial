package com.example.microservices;

import java.util.UUID;

public class IdGenerator {
    /**
     * Generate a new UUID string
     * @return UUID string
     */
    public static String uuid() {
        return UUID.randomUUID().toString();
    }
}