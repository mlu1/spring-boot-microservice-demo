package com.example.demostudygroup.controllers;


import com.example.demostudygroup.model.Customer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping
public class AccountController {

    @RequestMapping(value = "/getAccount", method = RequestMethod.GET ,produces = MediaType.APPLICATION_JSON_VALUE)

        public ResponseEntity<Object> getCustomerAccountDetails(){

            Customer customer = new Customer();
            customer.setAccountNumber("700");
            customer.setAvailableBalance(8000);
            customer.setCustomerName("newCustomer");


            return new ResponseEntity<Object>(customer, HttpStatus.OK);
        }
    }
