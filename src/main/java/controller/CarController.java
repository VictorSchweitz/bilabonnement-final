package controller;

import org.springframework.stereotype.Controller;
import repository.CarRepo;

@Controller
public class CarController
{
   CarRepo carRepo = new CarRepo();
}