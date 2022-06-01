package com.example.demoeksamensproject.controller;

import org.springframework.stereotype.Controller;
import com.example.demoeksamensproject.repository.DamageAndRemediationRepo;

@Controller
public class DamageAndRemediationController
{
    // Assigning the damageAndRemediationRepo to a new object called DamageAndRemediationRepo
    DamageAndRemediationRepo damageAndRemediationRepo = new DamageAndRemediationRepo();
}
