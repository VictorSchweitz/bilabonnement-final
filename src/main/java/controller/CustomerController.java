package controller;

import org.springframework.stereotype.Controller;
import repository.CustomerRepo;

@Controller
public class CustomerController
{
    CustomerRepo customerRepo = new CustomerRepo();
}
