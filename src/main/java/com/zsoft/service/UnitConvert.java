package com.zsoft.service;

import com.zsoft.entity.Weight;
import com.zsoft.entity.WeightUnit;


public class  UnitConvert {

    public static double convert(Weight inputWeight, WeightUnit productWeightUnit){

        if(inputWeight.getWeightUnit() == WeightUnit.OUNCE && productWeightUnit == WeightUnit.POUND){
            return toPound(inputWeight);
        }
        else if (inputWeight.getWeightUnit() == WeightUnit.POUND && productWeightUnit == WeightUnit.OUNCE){
            return toOunce(inputWeight);
        }
        return inputWeight.getValue();
    }

    public static double toPound(Weight weight){
        return weight.getValue() / 16;
    }

    public static double toOunce(Weight weight){
        return weight.getValue() * 16;
    }
}
