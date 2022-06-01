package com.example.demoeksamensproject.controller;

import com.example.demoeksamensproject.model.Car;
import com.example.demoeksamensproject.model.Customer;
import com.example.demoeksamensproject.model.Rentings;
import com.example.demoeksamensproject.repository.RentingsRepo;
import com.example.demoeksamensproject.service.RentingService;
import com.zaxxer.hikari.pool.HikariProxyResultSet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Controller
public class RentingsController
{
    @Autowired
    RentingService rentingService;

    // Making a new for all the rentings
    List<Rentings> rentings = new ArrayList<Rentings>();

    Rentings r;
    Customer c = new Customer();
    Car car = new Car();


    // Here, I use RedirectAttributes, since I'm adding data to redirect
    @PostMapping("/checkoutbill")
    public String confirmRenting(@ModelAttribute Rentings renting, RedirectAttributes redirectAttributes)
    {
        // Here, I'm setting 'r', the rentings variable, to be equal the renting being passed in to the list
        r = renting;

        /*
            Here, addFlashAttribute is used to store the attributes passed in as a parameter
            The flashmap is being removed, once the redirect is returned on the line underneath.
        */

        redirectAttributes.addFlashAttribute("renting", renting);
        return "redirect:/checkoutbill";
    }

    @GetMapping("/checkoutbill")
    // The parameters send the value to the redirect model
    public String checkoutBill(@ModelAttribute Rentings renting, Model model)
    {
        r = renting;

        // Getting the redirect value
        model.addAttribute("renting", renting);

        /*
            Adding the confirmed order to the renting via the confirmOrder method
            in the RentingService class
         */
        rentingService.confirmOrder(renting);

        // Lastly returning the checkoutbill view
        return "checkoutbill";
    }

    @GetMapping("/showorders")
    public String showOrders(Model model)
    {
        model.addAttribute("orders", rentingService.allRentings());
        return "showorders";
    }


}

