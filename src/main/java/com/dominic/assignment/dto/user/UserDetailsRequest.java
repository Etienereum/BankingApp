package com.dominic.assignment.dto.user;

import com.dominic.assignment.model.entities.Account;
import com.dominic.assignment.model.entities.AccountStatus;
import com.dominic.assignment.model.entities.AccountType;
import com.dominic.assignment.model.entities.Role;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor(staticName = "construct")
public class UserDetailsRequest {

    @JsonProperty("users_table")
    private Integer id;
    private String userName;
    private String password;
    private String firstName;
    private String lastName;
    private String email;

    @JsonProperty("role")
    private Role role;

    @JsonProperty("account")
    private Account account;

    @JsonProperty("account_status")
    private AccountStatus accountStatus;


    @JsonProperty("account_status")
    private AccountType accountType;

}