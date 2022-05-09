package model;

public class Rentings
{
    private int period;
    private String nameOfRenter;

    public Rentings(int period, String nameOfRenter)
    {
        this.period = period;
        this.nameOfRenter = nameOfRenter;
    }

    public int getPeriod()
    {
        return period;
    }

    public void setPeriod(int period)
    {
        this.period = period;
    }

    public String getNameOfRenter()
    {
        return nameOfRenter;
    }

    public void setNameOfRenter(String nameOfRenter)
    {
        this.nameOfRenter = nameOfRenter;
    }
}
