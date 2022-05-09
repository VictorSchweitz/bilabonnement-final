package controller;

import model.Rentings;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import repository.RentingsRepo;

import java.util.ArrayList;

@Controller
public class RentingsController
{
    RentingsRepo rentingsRepo = new RentingsRepo();
    ArrayList<Rentings> rentings = new ArrayList<>();

    @PostMapping("/createRenting")
    public String createRenting(@ModelAttribute Rentings renting)
    {
        rentings.add(renting);
        System.out.println(renting);

        return "redirect:/";
    }
}
