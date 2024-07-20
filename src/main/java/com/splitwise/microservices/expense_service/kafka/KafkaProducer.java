package com.splitwise.microservices.expense_service.kafka;

import com.splitwise.microservices.expense_service.external.ActivityRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducer {
    @Autowired
    private KafkaTemplate kafkaTemplate;

    public void sendActivityMessage(ActivityRequest activityRequest)
    {
        kafkaTemplate.send("activity",activityRequest);
    }

}
