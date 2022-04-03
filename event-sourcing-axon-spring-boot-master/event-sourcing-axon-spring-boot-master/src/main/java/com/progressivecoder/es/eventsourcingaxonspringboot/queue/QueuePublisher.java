package com.progressivecoder.es.eventsourcingaxonspringboot.queue;

import com.google.gson.Gson;
import com.progressivecoder.es.eventsourcingaxonspringboot.aggregates.AccountAggregate;
import com.progressivecoder.es.eventsourcingaxonspringboot.entities.AccountQueryEntity;
import com.progressivecoder.es.eventsourcingaxonspringboot.entities.repositories.AccountRepository;
import com.progressivecoder.es.eventsourcingaxonspringboot.events.BaseEvent;
import lombok.extern.slf4j.Slf4j;
import org.axonframework.eventsourcing.EventSourcingHandler;
import org.axonframework.eventsourcing.EventSourcingRepository;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class QueuePublisher {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @EventSourcingHandler
    void on(BaseEvent event) { publishEvent(event); }

    private void publishEvent(BaseEvent event) {
        /*log.info("Publishing event {} to RabbitMQ ...", event.getClass().getSimpleName());
        Gson gson = new Gson();
        String json = gson.toJson(event);
        rabbitTemplate.convertAndSend(
                RabbitMQQueue.topicExchangeName,
                event.getClass().getSimpleName(),
                json);*/
    }
}

