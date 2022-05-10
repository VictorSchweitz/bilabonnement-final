package com.example.demoeksamensproject.controller;

import org.springframework.stereotype.Controller;
import com.example.demoeksamensproject.repository.CustomerRepo;

@Controller
public class CustomerController
{
    CustomerRepo customerRepo = new CustomerRepo();
}
