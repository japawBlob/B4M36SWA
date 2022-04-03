package com.progressivecoder.es.eventsourcingaxonspringboot.services.queries;

import com.progressivecoder.es.eventsourcingaxonspringboot.entities.AccountQueryEntity;

import java.util.List;

public interface AccountQueryService {
    List<Object> listEventsForAccount(String accountNumber);
    AccountQueryEntity getAccount(String accountNumber);
}
