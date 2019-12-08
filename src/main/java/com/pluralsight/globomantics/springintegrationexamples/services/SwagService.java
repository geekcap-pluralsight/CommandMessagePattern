package com.pluralsight.globomantics.springintegrationexamples.services;

import com.pluralsight.globomantics.springintegrationexamples.model.Swag;
import org.springframework.messaging.Message;

public interface SwagService {
    void sendSwag(Message<Swag> swag);
}
