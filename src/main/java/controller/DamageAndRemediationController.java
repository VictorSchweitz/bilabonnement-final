package controller;

import org.springframework.stereotype.Controller;
import repository.DamageAndRemediationRepo;

@Controller
public class DamageAndRemediationController
{
    DamageAndRemediationRepo damageAndRemediationRepo = new DamageAndRemediationRepo();
}
