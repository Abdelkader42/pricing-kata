package com.zsoft.entity;

import java.util.Objects;

public class Weight{

    private double value;
    private WeightUnit weightUnit;

    public Weight() {
    }

    public Weight(double value, WeightUnit weightUnit) {
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
