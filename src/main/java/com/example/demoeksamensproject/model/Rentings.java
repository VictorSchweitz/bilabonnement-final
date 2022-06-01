package com.example.demoeksamensproject.model;

import java.util.Date;

public class Rentings
{

    // Defining my attributes
    private int rentingId;
    private String pickupLocation;
    private String startDate;
    private String endDate;
    private int carNumber;
    private int chassisNumber;

    /*
       Creating an empty no arguments constructor to make use of
       in BeanRowMapper in the RentingsRepo class
    */
    public Rentings() {}

    /*
        Then making another Rentings object, but this time filling it with the fields defined up above,
        in order to add getters and setters to them afterwards
     */
    public Rentings(int rentingId, String pickupLocation, String startDate, String endDate, int carNumber, int chassisNumber)
    {
        this.rentingId = rentingId;
        this.pickupLocation = pickupLocation;
        this.startDate = startDate;
        this.endDate = endDate;
        this.carNumber = carNumber;
        this.chassisNumber = chassisNumber;
    }


    // Adding getters and setters
    public int getRentingId()
    {
        return rentingId;
    }

    public void setRentingId(int rentingId)
    {
        this.rentingId = rentingId;
    }

    public String getPickupLocation()
    {
        return pickupLocation;
    }

    public void setPickupLocation(String pickupLocation)
    {
        this.pickupLocation = pickupLocation;
    }

    public String getStartDate()
    {
        return startDate;
    }

    public void setStartDate(String startDate)
    {
        this.startDate = startDate;
    }

    public String getEndDate()
    {
        return endDate;
    }

    public void setEndDate(String endDate)
    {
        this.endDate = endDate;
    }

    public int getCarNumber()
    {
        return carNumber;
    }

    public void setCarNumber(int carNumber)
    {
        this.carNumber = carNumber;
    }

    public int getChassisNumber()
    {
        return chassisNumber;
    }

    public void setChassisNumber(int chassisNumber)
    {
        this.chassisNumber = chassisNumber;
    }

    // Overriding my getters and setters with this toString method
    @Override
    public String toString()
    {
        return "Rentings{" +
                "rentingId=" + rentingId +
                ", pickupLocation='" + pickupLocation + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", carNumber=" + carNumber +
                ", chassisNumber=" + chassisNumber +
                '}';
    }
}
