package com.pluralsight.globomantics.springintegrationexamples.services;

import com.pluralsight.globomantics.springintegrationexamples.model.Swag;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.integration.annotation.MessageEndpoint;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Service;

@MessageEndpoint
@Service
public class SwagServiceImpl implements SwagService {
    private static final Logger logger = LogManager.getLogger(SwagService.class);

    @ServiceActivator(inputChannel = "swagChannel")
    @Override
    public void sendSwag(Message<Swag> message) {
        logger.info("SwagService::Sending Swag: {}", message.getPayload());
    }
}
