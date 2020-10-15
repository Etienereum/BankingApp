package com.dominic.assignment.dto.user;

//import com.dominic.assignment.model.entities.Account;
//import com.dominic.assignment.model.entities.AccountStatus;
//import com.dominic.assignment.model.entities.AccountType;
//import com.dominic.assignment.model.entities.Role;
//import com.fasterxml.jackson.annotation.JsonProperty;
import com.dominic.assignment.model.entities.Account;
import com.dominic.assignment.model.entities.Role;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor(staticName = "construct")
public class UserDetailsResponse {

    @NonNull Integer id;
    @NonNull String userName;
    @NonNull String password;
    @NonNull String firstName;
    @NonNull String lastName;
    @NonNull String email;

    @NonNull private Role role;

    @NonNull private Account account;
    
}