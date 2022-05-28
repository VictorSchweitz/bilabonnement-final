package com.example.demoeksamensproject.service;

import com.example.demoeksamensproject.model.Rentings;
import com.example.demoeksamensproject.repository.RentingsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RentingService
{
    @Autowired
    RentingsRepo rentingsRepo;

    public void confirmOrder(Rentings renting)
    {
        rentingsRepo.confirmOrder(renting);
    }
}
