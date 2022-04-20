package com.company.challenge.controllers;
import com.company.challenge.model.*;
import com.company.challenge.config.*;
import java.sql.*;

public class CustomerDB {
    private ConnectDB connectdb;

    public CustomerDB(){
        connectdb = ConnectDB.getInstance();
    }

    public void insertCustomer(Customer customer) {
        Connection connect = connectdb.getConnection();
        try {
            PreparedStatement st = connect.prepareStatement("INSERT INTO Customer(id_Customer,name,lastName,address,dateBirth) values(?,?,?,?,?);");
            st.setInt(1, customer.getId());
            st.setString(2, customer.getName());
            st.setString(3, customer.getLastName());
            st.setString(4, customer.getAddress());
            st.setString(5, customer.getDateBirth());
            st.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void selectCustomer() {
        Connection connect = connectdb.getConnection();
        try {
            Statement st = connect.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM Customer");
            while (rs.next()) {
                int id = rs.getInt("id_Customer");
                String name = rs.getString("name");
                String lastName = rs.getString("lastName");
                String address = rs.getString("address");
                String dateBirth = rs.getString("dateBirth");

                System.out.println("Customer ID: " + id);
                System.out.println("Name: " + name);
                System.out.println("Last Name: " + lastName);
                System.out.println("Address: " + address);
                System.out.println("Date of Birth: " + dateBirth);
                System.out.println("------------------------------------------------------");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Customer getCustomerByID(int id_customer){
        Connection connect = connectdb.getConnection();
        Customer customerT = new Customer();
        try {
            PreparedStatement ps = connect.prepareStatement("SELECT * FROM customer WHERE id_Customer = ?");
            ps.setInt(1,id_customer);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id_Customer");
                String name = rs.getString("name");
                String lastName = rs.getString("lastName");
                String address = rs.getString("address");
                String dateBirth = rs.getString("dateBirth");

                customerT.setId(id);
                customerT.setName(name);
                customerT.setLastName(lastName);
                customerT.setAddress(address);
                customerT.setDateBirth(dateBirth);

                System.out.println("Customer ID: " + id);
                System.out.println("Name: " + name);
                System.out.println("Last Name: " + lastName);
                System.out.println("Address: " + address);
                System.out.println("Date of Birth: " + dateBirth);
                System.out.println("------------------------------------------------------");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return customerT;
    }


}
