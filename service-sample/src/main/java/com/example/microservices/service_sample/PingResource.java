package com.example.microservices.service_sample;

import com.example.microservices.IdGenerator;
import com.example.microservices.message_protocol.PingMO;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PingResource {
    @RequestMapping(value = "/ping", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody PingMO getAll() {
        return new PingMO(IdGenerator.uuid(), true, ServiceSampleApplication.APPLICATION_ID);
    }
}