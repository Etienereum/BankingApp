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

    public Integer getId() {
        return id;
    }

//    public UserDetailsRequest() { }
//
//    public UserDetailsRequest(Integer id, String userName, String password, String firstName, String lastName,
//                              String email, Role role, Account account, AccountStatus accountStatus, AccountType accountType)
//    {
//        this.id = id;
//        this.userName = userName;
//        this.password = password;
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.email = email;
//        this.role = role;
//        this.account = account;
//        this.accountStatus = accountStatus;
//        this.accountType = accountType;
//    }
//
//    public void setId(Integer id) {
//        this.id = id;
//    }
//
//    public String getUserName() {
//        return userName;
//    }
//
//    public void setUserName(String userName) {
//        this.userName = userName;
//    }
//
//    public String getPassword() {
//        return password;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }
//
//    public String getFirstName() {
//        return firstName;
//    }
//
//    public void setFirstName(String firstName) {
//        this.firstName = firstName;
//    }
//
//    public String getLastName() {
//        return lastName;
//    }
//
//    public void setLastName(String lastName) {
//        this.lastName = lastName;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public Role getRole() {
//        return role;
//    }
//
//    public void setRole(Role role) {
//        this.role = role;
//    }
//
//    public Account getAccount() {
//        return account;
//    }
//
//    public void setAccount(Account account) {
//        this.account = account;
//    }
//
//    public AccountStatus getAccountStatus() {
//        return accountStatus;
//    }
//
//    public void setAccountStatus(AccountStatus accountStatus) {
//        this.accountStatus = accountStatus;
//    }
//
//    public AccountType getAccountType() {
//        return accountType;
//    }
//
//    public void setAccountType(AccountType accountType) {
//        this.accountType = accountType;
//    }

}