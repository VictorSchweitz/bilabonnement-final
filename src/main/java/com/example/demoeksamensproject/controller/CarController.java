package com.example.demoeksamensproject.controller;

import com.example.demoeksamensproject.model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Controller;
import com.example.demoeksamensproject.repository.CarRepo;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;

@Controller
public class CarController {


   @Autowired

   JdbcTemplate template;

   ArrayList<Car> cars = new ArrayList<>();
   @Autowired
   CarRepo carRepo;

   @PostMapping("/car_list")
   public String fetchAllCars() {
      String selectCarsFromDatabase = "SELECT * FROM bilabonnement.car";
      RowMapper<Car> carRowMapper = new BeanPropertyRowMapper<>(Car.class);
      System.out.println(template.query(selectCarsFromDatabase, carRowMapper));

      return "redirect:/carList";

      // return template.query(selectCarsFromDatabase, carRowMapper);
/*
   @PostMapping("/createCar")

   public String createCar() {

      String selectCarsFromDatabase = "";  //todo - query med data fra createCar form som add'er til
      // car table..

      RowMapper<Car> carRowMapper = new BeanPropertyRowMapper<>(Car.class);

      System.out.println(template.query(selectCarsFromDatabase, carRowMapper));

      return "redirect:/carList";   // todo - en succes page eller en car liste page?
   }*/
   }
}