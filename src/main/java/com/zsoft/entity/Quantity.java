package com.zsoft.entity;


public class Quantity {

    private double value;
    private WeightUnit weightUnit;

    public Quantity() {
    }

    public Quantity(double value, WeightUnit weightUnit) {
        this.value = value;
        this.weightUnit = weightUnit;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public WeightUnit getWeightUnit() {
        return weightUnit;
    }

    public void setWeightUnit(WeightUnit weightUnit) {
        this.weightUnit = weightUnit;
    }
}
