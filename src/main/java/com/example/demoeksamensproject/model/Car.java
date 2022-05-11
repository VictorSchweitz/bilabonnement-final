package com.example.demoeksamensproject.model;

public class Car
{
    private int carId;
    private String licensePlateNumber;
    private String chassisNumber;
    private String brand;
    private String model;
    private String equipmentLevel;
    private double steelPrice;
    private String carbonDioxideEmissions;

    public Car() {}

    public Car(int carId, String licensePlateNumber, String chassisNumber, String brand, String model, String equipmentLevel, double steelPrice, String carbonDioxideEmissions)
    {
        this.carId = carId;
        this.licensePlateNumber = licensePlateNumber;
        this.chassisNumber = chassisNumber;
        this.brand = brand;
        this.model = model;
        this.equipmentLevel = equipmentLevel;
        this.steelPrice = steelPrice;
        this.carbonDioxideEmissions = carbonDioxideEmissions;
    }

    public String getLicensePlateNumber()
    {
        return licensePlateNumber;
    }

    public void setLicensePlateNumber(String licensePlateNumber)
    {
        this.licensePlateNumber = licensePlateNumber;
    }

    public String getChassisNumber()
    {
        return chassisNumber;
    }

    public void setChassisNumber(String chassisNumber)
    {
        this.chassisNumber = chassisNumber;
    }

    public String getBrand()
    {
        return brand;
    }

    public void setBrand(String brand)
    {
        this.brand = brand;
    }

    public String getModel()
    {
        return model;
    }

    public void setModel(String model)
    {
        this.model = model;
    }

    public String getEquipmentLevel()
    {
        return equipmentLevel;
    }

    public void setEquipmentLevel(String equipmentLevel)
    {
        this.equipmentLevel = equipmentLevel;
    }

    public double getSteelPrice()
    {
        return steelPrice;
    }

    public void setSteelPrice(double steelPrice)
    {
        this.steelPrice = steelPrice;
    }

    public String getCarbonDioxideEmissions()
    {
        return carbonDioxideEmissions;
    }

    public void setCarbonDioxideEmissions(String carbonDioxideEmissions)
    {
        this.carbonDioxideEmissions = carbonDioxideEmissions;
    }


    @Override
    public String toString()
    {
        return "Car{" +
                "licensePlateNumber='" + licensePlateNumber + '\'' +
                ", chassisNumber='" + chassisNumber + '\'' +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", equipmentLevel='" + equipmentLevel + '\'' +
                ", steelPrice=" + steelPrice +
                ", carbonDioxideEmissions='" + carbonDioxideEmissions + '\'' +
                '}';
    }
}

