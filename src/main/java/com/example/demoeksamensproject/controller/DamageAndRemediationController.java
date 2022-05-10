package com.example.demoeksamensproject.controller;

import org.springframework.stereotype.Controller;
import com.example.demoeksamensproject.repository.DamageAndRemediationRepo;

@Controller
public class DamageAndRemediationController
{
    DamageAndRemediationRepo damageAndRemediationRepo = new DamageAndRemediationRepo();
}
