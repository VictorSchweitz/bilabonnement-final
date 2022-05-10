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

   CarRepo carRepo = new CarRepo();

   @PostMapping("/createCar")

   public String createCar() {

      String selectCarsFromDatabase = "";  //todo - query med data fra createCar form..

      RowMapper<Car> carRowMapper = new BeanPropertyRowMapper<>(Car.class);

      System.out.println(template.query(selectCarsFromDatabase, carRowMapper));

      return "redirect:/carList";   // todo - redirect til en succes page eller en car liste page
   }
}