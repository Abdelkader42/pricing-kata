package com.zsoft.service;

import com.zsoft.entity.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UnitConvertTest {

    @Test
    public void toPound_test(){

        double weight = UnitConvert.toPound(new Quantity(32,WeightUnit.OUNCE));

        Assertions.assertEquals(2,weight,Double.MIN_VALUE);
    }

    @Test
    public void toOunce_test(){

        double weight = UnitConvert.toOunce(new Quantity(10,WeightUnit.OUNCE));

        Assertions.assertEquals(160,weight,Double.MIN_VALUE);
    }

    @Test
    public void convert_test(){

        ProductListing weightProduct1 = new ProductListing(new Product("corn"),Type.WEIGHT,WeightUnit.OUNCE,10);

        Quantity weight = new Quantity(12,WeightUnit.OUNCE);
        Quantity weight1 = new Quantity(2,WeightUnit.POUND);

       double weightConverted = UnitConvert.convert(weight,weightProduct1.getWeightUnit());
       double weightConverted1 = UnitConvert.convert(weight1,weightProduct1.getWeightUnit());

        Assertions.assertEquals(12,weightConverted,Double.MIN_VALUE);
        Assertions.assertEquals(32,weightConverted1,Double.MIN_VALUE);

    }
}
