package com.dominic.assignment.services.user_services.impl;

import com.dominic.assignment.PwdEncoderUtil;
import com.dominic.assignment.dto.user.UserDetailsRequest;
import com.dominic.assignment.dto.user.UserDetailsResponse;
import com.dominic.assignment.model.entities.BankUser;
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

    public boolean createUser(UserDetailsRequest userDetailsRequest) {

        String hash = PwdEncoderUtil.encode(userDetailsRequest.getPassword());

        BankUser bankuser = BankUser.construct(
                userDetailsRequest.getUserName(),
                hash,
                userDetailsRequest.getFirstName(),
                userDetailsRequest.getLastName(),
                userDetailsRequest.getEmail(),
                userDetailsRequest.getRole(),
                userDetailsRequest.getAccount()
        );

            userRepository.save(bankuser);
            return true;
        }

        public boolean deleteUser(Integer id) {
            Optional<BankUser> user = userRepository.findById(id);
            if (user.isPresent()) userRepository.deleteById(id);
            else return false;

            return true;
        }

}
