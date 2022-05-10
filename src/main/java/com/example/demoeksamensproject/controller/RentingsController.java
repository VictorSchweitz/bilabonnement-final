package com.example.demoeksamensproject.controller;

import com.example.demoeksamensproject.model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.sql.ResultSet;
import java.util.List;

@Controller
public class RentingsController
{
    @Autowired
    JdbcTemplate template;

    @PostMapping("/createRenting")
    public String fetchAllCars()
    {
        String selectCarsFromDatabase = "SELECT * FROM bilabonnement.car";
        RowMapper<Car> carRowMapper = new BeanPropertyRowMapper<>(Car.class);
        System.out.println(template.query(selectCarsFromDatabase, carRowMapper));

        return "redirect:/";

        // return template.query(selectCarsFromDatabase, carRowMapper);
    }

}
