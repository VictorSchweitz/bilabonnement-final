package com.example.demoeksamensproject.controller;

import com.example.demoeksamensproject.model.Car;
import com.example.demoeksamensproject.model.Rentings;
import com.zaxxer.hikari.pool.HikariProxyResultSet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Controller
public class RentingsController
{
    @Autowired
    JdbcTemplate template;

    List<Rentings> rentings = new ArrayList<>();


    @PostMapping("/checkoutbill")
    public void confirmRenting(Rentings r) {
        String updateQuery = "INSERT INTO bilabonnement.renting" +
                            " (renting_id,customer_id,car_id,start_date, pick_up_place, end_date)" +
                            " VALUES (null,null,null,'2022-02-10','lige her','2023-03-08')";  // todo getters til de rigtige parametre
        // VALUES (r.getRentingId,r.getStartDate,r.getPickUpPlace,r.getEndDate)
        template.update(updateQuery);

        System.out.println(template.update(updateQuery));

    }
        @GetMapping("/rentingsucces")
            public String rentingSucces() {
            return "/rentingsucces";

        }
        @PostMapping("/renting_list")
        public List<Rentings> fetchAllRentings(){
            String fetchRentings = "SELECT * FROM bilabonnement.renting;";
            RowMapper<Rentings> rentingRowMapper = new BeanPropertyRowMapper<>(Rentings.class);

            System.out.println(template.update(fetchRentings, rentingRowMapper));

            return template.query(fetchRentings, rentingRowMapper);
        }
    }

