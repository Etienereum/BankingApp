package com.dominic.assignment.dto.user;

//import com.dominic.assignment.model.entities.Account;
//import com.dominic.assignment.model.entities.AccountStatus;
//import com.dominic.assignment.model.entities.AccountType;
//import com.dominic.assignment.model.entities.Role;
import com.dominic.assignment.model.entities.Account;
import com.dominic.assignment.model.entities.Role;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import javax.persistence.OneToOne;

@Getter
@Setter
@RequiredArgsConstructor(staticName = "construct")
public class UserDetailsRequest {

    @JsonProperty("users_table")
    private Integer id;
    private String userName;
    private String password;
    private String firstName;
    private String lastName;
    private String email;

    @OneToOne
    private Role role;

    @OneToOne
    private Account account;

}