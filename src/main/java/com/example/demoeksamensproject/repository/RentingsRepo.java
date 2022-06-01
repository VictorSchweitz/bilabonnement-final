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

    // This method adds the renting to the database
    public void confirmOrder(Rentings r)
    {
        // The name after "INSERT INTO" has to match the name of the table in the database

        String updateQuery = "INSERT INTO rentings"
                // The number of queries must match the number of question marks passed into the VALUES method
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
        // Selecting everything from the rentings table
        String fetchAllQuery = "SELECT * FROM rentings;";

        /*
            Here, I set a RowMapper of the Rentings List to be equal to a new BeanPropertyRowMapper.
            A RowMapper is being used to display one ResultSet per row, and the BeanPropertyRowMapper
            is being used to pack everything in the Rentings class into a single object for the class
            to be used as a parameter.
        */
        RowMapper<Rentings> rentingsRowMapper = new BeanPropertyRowMapper<>(Rentings.class);

        // Then the template with all queries and the rentings are returned.
        return template.query(fetchAllQuery, rentingsRowMapper);
    }
}
