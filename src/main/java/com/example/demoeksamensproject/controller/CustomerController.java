package com.example.demoeksamensproject.controller;

import org.springframework.stereotype.Controller;
import com.example.demoeksamensproject.repository.CustomerRepo;

@Controller
public class CustomerController
{
    // Assigning the customerRepo to a new object called CustomerRepo
    CustomerRepo customerRepo = new CustomerRepo();
}
