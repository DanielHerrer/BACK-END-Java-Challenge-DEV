package com.company.challenge.controllers;
import com.company.challenge.model.*;
import com.company.challenge.config.*;

import java.sql.*;
import java.util.ArrayList;

public class ProductDB {
    private ConnectDB connectdb;

    public ProductDB(){
        connectdb = ConnectDB.getInstance();
    }

    public void insertProduct(Product product) {
        Connection connect = connectdb.getConnection();
        try {
            PreparedStatement st = connect.prepareStatement("INSERT INTO Product(id_barcode,name,priceUnit,quantity,stockMin) values(?,?,?,?,?);");
            st.setInt(1, product.getBarcode());
            st.setString(2, product.getName());
            st.setFloat(3, product.getPriceUnit());
            st.setInt(4, product.getQuantity());
            st.setInt(5, product.getStockMin());
            st.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void selectProduct() {
        Connection connect = connectdb.getConnection();
        try {
            Statement st = connect.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM Product");
            while (rs.next()) {
                int id_barCode = rs.getInt("id_BarCode");
                String name = rs.getString("name");
                String priceUnity = rs.getString("priceUnity");
                String quantity = rs.getString("quantity");
                String stockMin = rs.getString("stockMin");

                System.out.println("------------------------------------------------------");
                System.out.println("Product BarCode: " + id_barCode);
                System.out.println("Name: " + name);
                System.out.println("Price Unity: " + priceUnity);
                System.out.println("Quantity: " + quantity);
                System.out.println("Stock Min: " + stockMin);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<Product> getAllProducts() {
        Connection connect = connectdb.getConnection();
        ArrayList<Product> listProducts = new ArrayList<>();
        try {
            Statement st = connect.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM Product");
            while (rs.next()) {
                int id_barCode = rs.getInt("id_BarCode");
                String name = rs.getString("name");
                float priceUnity = rs.getFloat("priceUnity");
                int quantity = rs.getInt("quantity");
                int stockMin = rs.getInt("stockMin");

                Product productBuy = new Product(id_barCode, name, priceUnity, quantity, stockMin);
                listProducts.add(productBuy);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listProducts;
    }

}