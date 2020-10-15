package com.dominic.assignment.services.user_services;

import com.dominic.assignment.dto.user.UserDetailsRequest;
import com.dominic.assignment.dto.user.UserDetailsResponse;

import java.util.List;

public interface UserServices {

    boolean createUser(UserDetailsRequest userDetailsRequest);
//    UserDetailsResponse getUserDetails(Integer id);
//    List<UserDetailsResponse> getUserAccounts(Integer id);
//    List<UserDetailsResponse> listAllUsers();

}
