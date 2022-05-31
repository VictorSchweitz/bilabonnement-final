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
public class RentingsRepo
{
    @Autowired
    JdbcTemplate template;

    public void confirmOrder(Rentings r)
    {
        // The name after "INSERT INTO" has to match the name of the table in the database
        String updateQuery = "INSERT INTO rentings"
                +
                " (pick_up_location, start_date, end_date, car_number, chassis_number)"
                +
                " VALUES (?, ?, ?, ?, ?)";

        // The parameters have to match the getters in the query
        template.update(updateQuery, r.getPickupLocation(),
                r.getStartDate(),  r.getEndDate(), r.getCarNumber(), r.getChassisNumber());
    }


    public List<Rentings> fetchAllRentings()
    {
        String fetchAllQuery = "SELECT * FROM rentings;";
        RowMapper<Rentings> rentingsRowMapper = new BeanPropertyRowMapper<>(Rentings.class);
        System.out.println(template.query(fetchAllQuery, rentingsRowMapper));
        return template.query(fetchAllQuery, rentingsRowMapper);
    }
}
