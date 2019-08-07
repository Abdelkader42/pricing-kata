package com.zsoft.service;

import com.zsoft.entity.Weight;
import com.zsoft.entity.WeightProduct;
import com.zsoft.entity.WeightUnit;

public class WeightPriceCalculation {

    public double applyPriceCalculation(WeightProduct weightProduct, Weight weight) {

        WeightUnit weightUnitProduct = weightProduct.getWeightUnit();

        double  weightConverted = UnitConvert.convert(weight,weightUnitProduct);

        double finalPrice = weightProduct.getPrice() * weightConverted;


        return finalPrice;
    }
}
