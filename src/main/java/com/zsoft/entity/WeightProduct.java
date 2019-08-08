package com.zsoft.entity;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        WeightProduct that = (WeightProduct) o;

        return weightUnit == that.weightUnit;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), weightUnit);
    }

    @Override
    public String toString() {
        return "WeightProduct{" +
                "weightUnit=" + weightUnit + "name = " + getName() +
                "Price = " + getPrice() +
                '}';
    }
}
