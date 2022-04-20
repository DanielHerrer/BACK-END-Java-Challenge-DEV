package com.company.challenge.model;
import java.util.ArrayList;
import java.sql.Date;

public class Bill {
    private int idBill;
    private Date buyDate;

    private Customer customer;
    private Seller seller;
    private ArrayList<Product> listToBuy;

    public Bill() {
    }

    public Bill(int idBill, Date buyDate, Customer customer, Seller seller, ArrayList<Product> listToBuy) {
        this.idBill = idBill;
        this.buyDate = buyDate;
        this.customer = customer;
        this.seller = seller;
        this.listToBuy = listToBuy;
    }

    public int getIdBill() {
        return idBill;
    }

    public Date getBuyDate() {
        return buyDate;
    }

    public void setBuyDate(Date buyDate) {
        this.buyDate = buyDate;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Seller getSeller() {
        return seller;
    }

    public void setSeller(Seller seller) {
        this.seller = seller;
    }

    public ArrayList<Product> getListToBuy() {
        return listToBuy;
    }

    public void setListToBuy(ArrayList<Product> listToBuy) {
        this.listToBuy = listToBuy;
    }
}

//numero de factura, fecha de compra, cliente que compra, vendedor que factura, detalle de los productos vendidos