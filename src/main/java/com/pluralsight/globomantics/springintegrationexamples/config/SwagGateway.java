package com.pluralsight.globomantics.springintegrationexamples.config;

import com.pluralsight.globomantics.springintegrationexamples.model.Swag;
import org.springframework.integration.annotation.Gateway;
import org.springframework.integration.annotation.MessagingGateway;
import org.springframework.messaging.Message;

@MessagingGateway(name = "swagGateway", defaultRequestChannel = "swagChannel")
public interface SwagGateway {
    @Gateway
    void sendSwag(Message<Swag> swag);
}
