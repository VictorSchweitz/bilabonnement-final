package model;

public class Customer
{
    private String name;
    private int age;
    private String email;
    private int phoneNumber;
    private String address;
    private int dateOfBirth;


    public void CarConstructor(String name, int age, int phoneNumber, String address, int dateOfBirth)
    {
        this.name = name;
        this.age = age;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.dateOfBirth = dateOfBirth;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public int getPhoneNumber()
    {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber)
    {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress()
    {
        return address;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }

    public int getDateOfBirth()
    {
        return dateOfBirth;
    }

    public void setDateOfBirth(int dateOfBirth)
    {
        this.dateOfBirth = dateOfBirth;
    }
}
