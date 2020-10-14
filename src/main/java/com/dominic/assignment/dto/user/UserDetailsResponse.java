package com.dominic.assignment.dto.user;

//import com.dominic.assignment.model.entities.Account;
//import com.dominic.assignment.model.entities.AccountStatus;
//import com.dominic.assignment.model.entities.AccountType;
//import com.dominic.assignment.model.entities.Role;
//import com.fasterxml.jackson.annotation.JsonProperty;
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

//    @JsonProperty("role")
//    @NonNull private Role role;
//
//    @JsonProperty("account_status")
//    @NonNull private AccountStatus accountStatus;
//
//    @JsonProperty("account_status")
//    @NonNull private AccountType accountType;
//
//    @JsonProperty("account")
//    @NonNull private Account account;
    
}