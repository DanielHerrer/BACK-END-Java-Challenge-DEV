package com.company.challenge.controllers;
import com.company.challenge.model.*;
import com.company.challenge.config.*;
import java.sql.*;

public class SellerDB {
    private ConnectDB connectdb;

    public SellerDB(){
        connectdb = ConnectDB.getInstance();
    }

    public void insertSeller(Seller seller) {
        Connection connect = connectdb.getConnection();
        try {
            PreparedStatement st = connect.prepareStatement("INSERT INTO Seller(id_Seller,name,lastName,address,dateBirth,salary) values(?,?,?,?,?,?);");
            st.setInt(1, seller.getId());
            st.setString(2, seller.getName());
            st.setString(3, seller.getLastName());
            st.setString(4, seller.getAddress());
            st.setString(5, seller.getDateBirth());
            st.setFloat(6, seller.getSalary());
            st.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void selectSeller() {
        Connection connect = connectdb.getConnection();
        try {
            Statement st = connect.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM Seller");
            while (rs.next()) {
                int dni = rs.getInt("id_Seller");
                String name = rs.getString("name");
                String lastName = rs.getString("lastName");
                String address = rs.getString("address");
                String dateBirth = rs.getString("dateBirth");
                float salary = rs.getFloat("salary");

                System.out.println("Seller ID: " + dni);
                System.out.println("Name: " + name);
                System.out.println("Last Name: " + lastName);
                System.out.println("Address: " + address);
                System.out.println("Date Birth: " + dateBirth);
                System.out.println("Salary: " + salary);
                System.out.println("------------------------------------------------------");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Seller getSellerByID(int id_seller) {
        Connection connect = connectdb.getConnection();
        Seller sellerT = new Seller();
        try {
            PreparedStatement ps = connect.prepareStatement("SELECT * FROM seller WHERE id_Seller = ?");
            ps.setInt(1, id_seller);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id_Seller");
                String name = rs.getString("name");
                String lastName = rs.getString("lastName");
                String address = rs.getString("address");
                String dateBirth = rs.getString("dateBirth");
                float salary = rs.getFloat("salary");

                sellerT.setId(id);
                sellerT.setName(name);
                sellerT.setLastName(lastName);
                sellerT.setAddress(address);
                sellerT.setDateBirth(dateBirth);
                sellerT.setSalary(salary);

                System.out.println("Seller ID: " + id);
                System.out.println("Name: " + name);
                System.out.println("Last Name: " + lastName);
                System.out.println("Address: " + address);
                System.out.println("Date of Birth: " + dateBirth);
                System.out.println("Salary: " + salary);
                System.out.println("------------------------------------------------------");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return sellerT;
    }
}