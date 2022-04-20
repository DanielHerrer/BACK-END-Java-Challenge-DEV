package com.company.challenge.model;

public class Seller {
    private int id;
    private String name, lastName, address;
    private String dateBirth;
    private float salary;

    public Seller() {
    }

    public Seller(int id, String name, String lastName, String address, String dateBirth, float salary) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.address = address;
        this.dateBirth = dateBirth;
        this.salary = salary;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
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

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public String getDateBirth() {
        return dateBirth;
    }

    public void setDateBirth(String dateBirth) {
        this.dateBirth = dateBirth;
    }

    @Override
    public String toString() {
        return "\nSeller{" +
                "id= " + id +
                ", name= " + name + " " + lastName + '\'' +
                ", address= " + address + '\'' +
                ", dateBirth= " + dateBirth + '\'' +
                ", salary= " + salary +
                '}';
    }
}