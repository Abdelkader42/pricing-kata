package com.zsoft.entity;

import java.util.Objects;

public class Weight{

    private double value;
    private WeightUnit weightUnit;

    public Weight() {
    }

    public Weight(int value, WeightUnit weightUnit) {
        this.value = value;
        this.weightUnit = weightUnit;
    }

    public double getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
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
        Weight weight = (Weight) o;
        return Double.compare(weight.value, value) == 0 &&
                weightUnit == weight.weightUnit;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, weightUnit);
    }

    @Override
    public String toString() {
        return "Weight{" +
                "value=" + value +
                ", weightUnit=" + weightUnit +
                '}';
    }
}
