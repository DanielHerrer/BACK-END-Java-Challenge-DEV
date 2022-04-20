package com.company.challenge.controllers;
import com.company.challenge.config.ConnectDB;
import com.company.challenge.model.Customer;
import com.company.challenge.model.*;

import java.sql.*;

public class BillDB {
    private ConnectDB connectdb;

    public BillDB(){
        connectdb = ConnectDB.getInstance();
    }

    public void insertBill(Bill bill) {
        int idBill = 0;
        Connection connect = connectdb.getConnection();
        try {
            PreparedStatement ps = connect.prepareStatement(
                    "INSERT INTO Bill(id_Bill,dateBuy,Customer_idCustomer,Seller_idSeller) values(?,NOW(),?,?);", //NOW() me devuelve la fecha del dia de hoy
                        PreparedStatement.RETURN_GENERATED_KEYS); //RETURN devuelve id generado por la query
            ps.setInt(1, bill.getIdBill());
            ps.setInt(2, bill.getCustomer().getId());
            ps.setInt(3, bill.getSeller().getId());
            ps.executeQuery();  // executeQuery es para ejecutar querys que devuelven datos
            ResultSet rs = ps.getGeneratedKeys();

            if(rs != null && rs.next()) {
                idBill = rs.getInt(1); //Columna 1 = Primary Key
            }

            //El value es equivalente a un dato Product de la lista tomada en bill.getList
            for(Product value: bill.getListToBuy()){
                PreparedStatement ps1 = connect.prepareStatement("INSERT INTO bills_x_products(id_Bill,id_BarCode) values (?,?);");
                ps1.setInt(1,idBill);
                ps1.setInt(2,value.getBarcode());
                ps1.execute(); // execute Es para ejecutar querys que no devuelven nada
                ps1.close();
            }
            rs.close();
            ps.close();

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