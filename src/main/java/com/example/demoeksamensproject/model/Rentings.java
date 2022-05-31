package com.example.demoeksamensproject.model;

import java.util.Date;

public class Rentings
{

    /**
     * Jeg har opdateretet attributes, constructor, getters, setters og toString
     * Du kan sammenligne med din
     * Hvis du har brug for flere attribute, du kan tilføje eller fjerne en hvis det er ikke har brug for
     */
    private int rentingId;
    private String pickupLocation;
    private String startDate;
    private String endDate;
    private int carNumber;
    private int chassisNumber;

    public Rentings()
    {
    }

    public Rentings(int rentingId, String pickupLocation, String startDate, String endDate, int carNumber, int chassisNumber)
    {
        this.rentingId = rentingId;
        this.pickupLocation = pickupLocation;
        this.startDate = startDate;
        this.endDate = endDate;
        this.carNumber = carNumber;
        this.chassisNumber = chassisNumber;
    }


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
