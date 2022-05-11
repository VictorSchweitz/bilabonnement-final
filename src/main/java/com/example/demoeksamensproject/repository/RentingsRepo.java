package com.example.demoeksamensproject.repository;

import com.example.demoeksamensproject.model.Customer;
import com.example.demoeksamensproject.model.Rentings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class RentingsRepo {
    @Autowired
    JdbcTemplate template;


    public void confirmOrder(Rentings r) {
        String updateQuery = "INSERT INTO bilabonnement.renting" +
                " (renting_id,customer_id,car_id,start_date, pick_up_place, end_date)" +
                " VALUES (?,?,?,?,?,?)";
        template.update(updateQuery, r.getRentingId(), r.getStartDate(), r.getPickUpPlace(), r.getEndDate());
        System.out.println(template.update(updateQuery, r.getRentingId()
                , r.getStartDate(), r.getPickUpPlace(), r.getEndDate()));
    }
    public List<Rentings> fetchAllRentings(){
        String fetchAllQuery = "SELECT * FROM bilabonnement.renting;";
        RowMapper<Rentings> rentingsRowMapper = new BeanPropertyRowMapper<>(Rentings.class);
        System.out.println(template.query(fetchAllQuery, rentingsRowMapper));
        return template.query(fetchAllQuery,rentingsRowMapper);
    }
    public Rentings searchRenting(Rentings customer_id){
        String searchQuery = "SELECT * FROM bilabonnement.renting WHERE customer_id = ?;";
        RowMapper<Rentings> rentingsRowMapper = new BeanPropertyRowMapper<>(Rentings.class);
        System.out.println(template.queryForObject(searchQuery,rentingsRowMapper, customer_id));
        Rentings r = template.queryForObject(searchQuery,rentingsRowMapper, customer_id);
        return r;
    }






}
