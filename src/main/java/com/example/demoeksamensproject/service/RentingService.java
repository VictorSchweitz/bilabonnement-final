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

    // This method has to match the one in RentingsRepo as far as naming goes
    public void confirmOrder(Rentings renting)
    {
        rentingsRepo.confirmOrder(renting);
    }

    public List<Rentings> allRentings()
    {
        return rentingsRepo.fetchAllRentings();
    }
}
