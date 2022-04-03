package com.progressivecoder.es.eventsourcingaxonspringboot.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@ToString
public class AccountQueryEntity {
    @Id
    private String id;

    private double accountBalance;

    private String currency;

    private String status;
}
