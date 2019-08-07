package com.zsoft.service;

import com.zsoft.entity.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UnitConvertTest {

    @Test
    public void toPound_test(){

        double weight = UnitConvert.toPound(new Weight(32,WeightUnit.OUNCE));

        Assertions.assertEquals(2,weight,Double.MIN_VALUE);
    }

    @Test
    public void toOunce_test(){

        double weight = UnitConvert.toOunce(new Weight(10,WeightUnit.OUNCE));

        Assertions.assertEquals(160,weight,Double.MIN_VALUE);
    }

    @Test
    public void convert_test(){

        WeightProduct weightProduct1 = new WeightProduct("corn",10,WeightUnit.OUNCE);

        Weight weight = new Weight(12,WeightUnit.OUNCE);
        Weight weight1 = new Weight(2,WeightUnit.POUND);

       double weightConverted = UnitConvert.convert(weight,weightProduct1.getWeightUnit());
       double weightConverted1 = UnitConvert.convert(weight1,weightProduct1.getWeightUnit());

        Assertions.assertEquals(12,weightConverted,Double.MIN_VALUE);
        Assertions.assertEquals(32,weightConverted1,Double.MIN_VALUE);

    }
}
