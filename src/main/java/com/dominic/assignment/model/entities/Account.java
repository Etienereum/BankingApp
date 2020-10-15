package com.dominic.assignment.model.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer accountId;

    private double balance;

    @OneToOne
    private AccountStatus status;

    @OneToOne
    private AccountType accountType;
}