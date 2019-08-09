package com.zsoft.service;

import com.zsoft.entity.Quantity;
import com.zsoft.entity.WeightUnit;


public class UnitConvert {

    /**
     * Apply the conversion of the weight according to the WeightUnit
     * if the weight unit of both product price and the client input are same
     * it doesn't make the conversion.
     *
     * @param inputWeight       the weight entered by the client
     * @param productWeightUnit the weight unit of the product price
     * @return the converted weight
     */
    public static double convert(Quantity inputWeight, WeightUnit productWeightUnit) {

        if (inputWeight.getWeightUnit() == WeightUnit.OUNCE && productWeightUnit == WeightUnit.POUND) {
            return toPound(inputWeight);
        } else if (inputWeight.getWeightUnit() == WeightUnit.POUND && productWeightUnit == WeightUnit.OUNCE) {
            return toOunce(inputWeight);
        }
        return inputWeight.getValue();
    }

    /**
     * Convert Ounce to Pound
     *
     * @param weight weight in Ounce
     * @return weight in Pound
     */
    public static double toPound(Quantity weight) {
        return weight.getValue() / 16;
    }

    /**
     * Convert Pound to ounce
     *
     * @param weight weight in Pound
     * @return weight in Ounce
     */
    public static double toOunce(Quantity weight) {
        return weight.getValue() * 16;
    }
}
