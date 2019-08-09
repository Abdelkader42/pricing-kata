package com.zsoft.entity;

import java.util.Objects;

public class ProductListing {

    private Product product;
    private Type type;
    private WeightUnit weightUnit;
    private double price;

    public ProductListing() {
    }

    public ProductListing(Product product, Type type, WeightUnit weightUnit, double price) {
        this.product = product;
        this.type = type;
        this.weightUnit = weightUnit;
        this.price = price;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public WeightUnit getWeightUnit() {
        return weightUnit;
    }

    public void setWeightUnit(WeightUnit weightUnit) {
        this.weightUnit = weightUnit;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductListing that = (ProductListing) o;
        return  Objects.equals(product, that.product) &&
                type == that.type &&
                weightUnit == that.weightUnit;
    }

    @Override
    public int hashCode() {
        return Objects.hash(product, type);
    }
}
