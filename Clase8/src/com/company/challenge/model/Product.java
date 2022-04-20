package com.company.challenge.model;

public class Product {
    private int barcode;
    private String name;
    private float priceUnit;
    private int quantity;
    private int stockMin;

    public Product() {
    }

    public Product(int barcode, String name, float priceUnit, int quantity, int stockMin) {
        this.barcode = barcode;
        this.name = name;
        this.priceUnit = priceUnit;
        this.quantity = quantity;
        this.stockMin = stockMin;
    }

    public void setBarcode(int barcode) {
        this.barcode = barcode;
    }

    public int getBarcode() {
        return barcode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPriceUnit() {
        return priceUnit;
    }

    public void setPriceUnit(float priceUnit) {
        this.priceUnit = priceUnit;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getStockMin() {
        return stockMin;
    }

    public void setStockMin(int stockMin) {
        this.stockMin = stockMin;
    }

    @Override
    public String toString() {
        return "\nProduct{" +
                "barcode= " + barcode +
                ", name= " + name + '\'' +
                ", priceUnit= " + priceUnit +
                '}';
    }
}