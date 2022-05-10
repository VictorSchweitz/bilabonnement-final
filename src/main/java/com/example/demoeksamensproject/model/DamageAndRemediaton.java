package com.example.demoeksamensproject.model;

public class DamageAndRemediaton
{
    private String typeOfDamage;
    private String mistakes;
    private String missings;
    private double priceOfDamage;

    public DamageAndRemediaton() {}

    public DamageAndRemediaton(String typeOfDamage, String mistakes, String missings, double priceOfDamage)
    {
        this.typeOfDamage = typeOfDamage;
        this.mistakes = mistakes;
        this.missings = missings;
        this.priceOfDamage = priceOfDamage;
    }


    public String getTypeOfDamage()
    {
        return typeOfDamage;
    }

    public void setTypeOfDamage(String typeOfDamage)
    {
        this.typeOfDamage = typeOfDamage;
    }

    public String getMistakes()
    {
        return mistakes;
    }

    public void setMistakes(String mistakes)
    {
        this.mistakes = mistakes;
    }

    public String getMissings()
    {
        return missings;
    }

    public void setMissings(String missings)
    {
        this.missings = missings;
    }

    public double getPriceOfDamage()
    {
        return priceOfDamage;
    }

    public void setPriceOfDamage(double priceOfDamage)
    {
        this.priceOfDamage = priceOfDamage;
    }
}
