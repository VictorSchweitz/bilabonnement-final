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

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Controller
public class RentingsController
{
    @Autowired
    RentingService rentingService;

    List<Rentings> rentings = new ArrayList<>();

    Rentings r = new Rentings();
    Customer c = new Customer();
    Car car = new Car();

    @PostMapping("/checkoutbill")
    public String confirmRenting(@ModelAttribute Rentings renting, ModelMap model)
    {
        rentingService.confirmOrder(renting);
        model.addAttribute("renting", renting);
        return "redirect:/checkoutbill";
    }

    @GetMapping("/checkoutbill")
    public String checkoutBill(){
        return "checkoutbill";
    }




    @PostMapping("/confirmedorder")
    public String confirmedOrder()
    {
        return "/confirmedorder";
    }
}

