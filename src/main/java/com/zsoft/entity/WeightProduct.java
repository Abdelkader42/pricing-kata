package com.zsoft.entity;

public class WeightProduct extends Product {

    WeightUnit weightUnit;

    public WeightProduct() {
    }

    public WeightProduct(String name, double price, WeightUnit weightUnit) {
        super(name, price);
        this.weightUnit = weightUnit;
    }

    public WeightUnit getWeightUnit() {
        return weightUnit;
    }

    public void setWeightUnit(WeightUnit weightUnit) {
        this.weightUnit = weightUnit;
    }
}
