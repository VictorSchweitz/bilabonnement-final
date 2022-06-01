package com.example.demoeksamensproject.service;

import com.example.demoeksamensproject.model.Rentings;
import com.example.demoeksamensproject.repository.RentingsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RentingService
{
    @Autowired
    RentingsRepo rentingsRepo;

    /*
        This method has to match the one in RentingsRepo as far as naming goes
        This method takes care of taking the order and pass it on to the actual confirmOrder method
        in the confirmOrder method in the RentingsRepo class.
     */
    public void confirmOrder(Rentings renting)
    {
        rentingsRepo.confirmOrder(renting);
    }

    /*
        Returning the list of all rentings from the database by callin

     */
    public List<Rentings> allRentings()
    {
        return rentingsRepo.fetchAllRentings();
    }
}
