package com.dominic.assignment.controller;

import com.dominic.assignment.dto.user.UserDetailsRequest;
import com.dominic.assignment.services.user_services.impl.UserRegistrationService;
import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

@RestController
public class UserManagementController {

//    public final Logger logger = Logger.getLogger(UserManagementController.class);

    @Autowired
    public UserRegistrationService userRegistrationService;

    //@RequestMapping(value = "/test", method = RequestMethod.POST)
    @PostMapping(path = "/reg")
    @ResponseBody
    @Transactional
    public ResponseEntity<String> createNewUser(@RequestBody  UserDetailsRequest userDetailsRequest) {
        userRegistrationService.createUser(userDetailsRequest);

        return new ResponseEntity<>("Created", HttpStatus.OK);
    }
}
