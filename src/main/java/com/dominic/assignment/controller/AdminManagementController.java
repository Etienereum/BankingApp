package com.dominic.assignment.controller;

import org.jboss.logging.Logger;
import org.springframework.stereotype.Controller;

@Controller
public class AdminManagementController {

    public final Logger logger = Logger.getLogger(AdminManagementController.class);

    public void called() {
        logger.info("getting AdminManagementController called");
    }
}
