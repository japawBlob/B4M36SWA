package com.progressivecoder.es.eventsourcingaxonspringboot.entities.repositories;

import com.progressivecoder.es.eventsourcingaxonspringboot.entities.AccountQueryEntity;
import org.springframework.data.repository.CrudRepository;

public interface AccountRepository extends CrudRepository<AccountQueryEntity, String> {
}
