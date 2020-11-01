package com.example.microservices;

import com.google.gson.GsonBuilder;
import java.io.Serializable;

public interface MessageObject extends Serializable {
    default String toJson() {
        return new GsonBuilder().create().toJson(this);
    }
}