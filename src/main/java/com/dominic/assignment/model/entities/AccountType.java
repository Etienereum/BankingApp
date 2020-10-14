package com.dominic.assignment.model.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class AccountType {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer typeId;

//    enum accountsTypes { CURRENT, SAVINGS };
    // Cheque or Savings accountsTypes
    private String type;
}
