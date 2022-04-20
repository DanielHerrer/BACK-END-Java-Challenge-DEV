package com.company.challenge.model;

public class Customer {
    private int id;
    private String name, lastName, address;
    private String dateBirth;

    public Customer() {
    }

    public Customer(int id, String name, String lastName, String address, String dateBirth) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.address = address;
        this.dateBirth = dateBirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDateBirth() {
        return dateBirth;
    }

    public void setDateBirth(String dateBirth) {
        this.dateBirth = dateBirth;
    }

    @Override
    public String toString() {
        return "\nCustomer{" +
                "id= " + id +
                ", name= " + name + " " + lastName + '\'' +
                ", address='" + address + '\'' +
                ", dateBirth='" + dateBirth + '\'' +
                '}';
    }
}