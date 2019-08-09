package com.zsoft.service;

import com.zsoft.entity.ProductListing;
import com.zsoft.entity.Quantity;
import com.zsoft.entity.WeightUnit;

public class WeightPriceCalculation implements PriceCalculation {
    /**
     * Calculate the price of the given weight
     * @param weightProduct Product witch measured by weight
     * @param weight weight given by the client
     * @return the price of the given weight
     * */
    public double applyPriceCalculation(ProductListing weightProduct, Quantity weight) {

        WeightUnit weightUnitProduct = weightProduct.getWeightUnit();

        // create weightConverted witch is the weight after conversion if necessary
        double  weightConverted = UnitConvert.convert(weight,weightUnitProduct);

        return  weightProduct.getPrice() * weightConverted;
    }
}
