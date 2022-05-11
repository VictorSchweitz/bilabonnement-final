package com.example.demoeksamensproject.model;

public class Customer
{
    private int customerId;
    private String firstName;
    private String lastName;
    private int age;
    private String email;
    private int phoneNumber;
    private String address;
    private int dateOfBirth;

    public Customer() {}

    public void carConstructor(int customerId,String firstName,String lastName,
           int age, int phoneNumber,String email, String address, int dateOfBirth)
    {
        this.customerId = customerId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.dateOfBirth = dateOfBirth;
    }

    public int getCustomerId() {
        return customerId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
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
