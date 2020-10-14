package com.dominic.assignment.controller;

import com.dominic.assignment.dto.user.UserDetailsRequest;
import com.dominic.assignment.model.entities.User;
import com.dominic.assignment.services.admin_operations.impl.AdminOperationsServiceImpl;
import com.dominic.assignment.services.employee_operations.impl.EmployeeOperationsServiceImpl;
import com.dominic.assignment.services.user_services.impl.UserManagementService;
import com.dominic.assignment.services.user_services.impl.UserRegistrationService;
import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

@Controller
public class UserManagementController {

    public final Logger logger = Logger.getLogger(UserManagementController.class);

    @Autowired
    public UserRegistrationService userRegistrationService;

//    @RequestMapping(value = "/register", method = )
//    public ResponseEntity<User> newUserRegistration(@RequestBody UserDetailsRequest request) //@RequestParam String userName, Model model, HttpSession session,
//    {
////        return userRegistrationService.createUser(request);
////                ? new ResponseEntity<UserDetailsRequest> a ("New User was created", HttpStatus.OK)
////                : new ResponseEntity<UserDetailsRequest>("Creation was not completed", HttpStatus.BAD_REQUEST);
//        return UserDetailsRequest;
//    }

}
