package com.example.demoeksamensproject.controller;

import com.example.demoeksamensproject.model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Controller;
import com.example.demoeksamensproject.repository.CarRepo;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class CarController
{

    @Autowired
    JdbcTemplate template;

    @Autowired
    CarRepo carRepo;
}