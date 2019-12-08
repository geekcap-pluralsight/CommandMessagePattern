package com.pluralsight.globomantics.springintegrationexamples.services;

import com.pluralsight.globomantics.springintegrationexamples.config.SwagGateway;
import com.pluralsight.globomantics.springintegrationexamples.model.Swag;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

@Service
public class RegistrationServiceImpl implements RegistrationService {

    private static final Logger logger = LogManager.getLogger(RegistrationServiceImpl.class);

    @Autowired
    private SwagGateway swagGateway;

    @Override
    public void commit(String userId) {
        logger.info("Registration committed, sending Swag");
        Message<Swag> message = MessageBuilder.withPayload(new Swag("T-Shirt")).build();
        swagGateway.sendSwag(message);
    }
}
