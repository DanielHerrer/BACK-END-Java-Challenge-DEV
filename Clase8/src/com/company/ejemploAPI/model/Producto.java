package com.company.ejemploAPI.model;

public class Producto {
    private int idProducto;
    private String codigoProducto;
    private float precioUnit;
    private int cantidad, stockMin;

    public Producto(int idProducto, String codigoProducto, float precioUnit, int cantidad, int stockMin) {
        this.idProducto = idProducto;
        this.codigoProducto = codigoProducto;
        this.precioUnit = precioUnit;
        this.cantidad = cantidad;
        this.stockMin = stockMin;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(String codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public float getPrecioUnit() {
        return precioUnit;
    }

    public void setPrecioUnit(float precioUnit) {
        this.precioUnit = precioUnit;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getStockMin() {
        return stockMin;
    }

    public void setStockMin(int stockMin) {
        this.stockMin = stockMin;
    }
}
