package com.progressivecoder.es.eventsourcingaxonspringboot.queue;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class Receiver {
    public void onMessage(String message) {
        log.info("Received <" + message + ">");
    }
}
