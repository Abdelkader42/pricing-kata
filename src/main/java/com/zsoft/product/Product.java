package com.zsoft.entity;

public class Product {
    private String name;
    private int quantity;
    private double price;
    private boolean isDiscount;

    public Product() {
        }

    public Product(String name, int quantity, double price, boolean isDiscount) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.isDiscount = isDiscount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isDiscount() {
        return isDiscount;
    }

    public void setDiscount(boolean discount) {
        isDiscount = discount;
    }
}
