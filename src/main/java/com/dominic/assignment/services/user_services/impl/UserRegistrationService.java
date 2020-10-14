package com.dominic.assignment.services.user_services.impl;

import com.dominic.assignment.PwdEncoderUtil;
import com.dominic.assignment.dto.user.UserDetailsRequest;
import com.dominic.assignment.dto.user.UserDetailsResponse;
import com.dominic.assignment.model.entities.User;
import com.dominic.assignment.model.repositories.UserRepository;
import com.dominic.assignment.services.user_services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserRegistrationService implements UserServices {

    @Autowired
    UserRepository userRepository;

    public UserDetailsRequest createUser(UserDetailsRequest userDetailsRequest) {
// Integer id, String userName, String password, String firstName, String lastName, String email, Account account,
// Role role, AccountStatus accountStatus, AccountType accountType

        String hash = PwdEncoderUtil.encode(userDetailsRequest.getPassword());

        User user = User.construct(
                userDetailsRequest.getUserName(),
                hash,
                userDetailsRequest.getFirstName(),
                userDetailsRequest.getLastName(),
                userDetailsRequest.getEmail(),
                userDetailsRequest.getAccount(),
                userDetailsRequest.getRole(),
                userDetailsRequest.getAccountStatus(),
                userDetailsRequest.getAccountType()
            );

            userRepository.save(user);
            return userDetailsRequest;
        }

        public boolean deleteUser(Integer id) {
            Optional<User> user = userRepository.findById(id);
            if (user.isPresent()) userRepository.deleteById(id);
            else return false;

            return true;
        }

}
