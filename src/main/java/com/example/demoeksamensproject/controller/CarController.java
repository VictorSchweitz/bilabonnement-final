package com.example.demoeksamensproject.controller;

import org.springframework.stereotype.Controller;
import com.example.demoeksamensproject.repository.CarRepo;

@Controller
public class CarController
{
   CarRepo carRepo = new CarRepo();
}