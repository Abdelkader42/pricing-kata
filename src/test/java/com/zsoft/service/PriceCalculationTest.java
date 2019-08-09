package com.zsoft.service;

import com.zsoft.entity.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PriceCalculationTest {

    @Test
    public void third_free_test(){

        ItemProduct phone = new ItemProduct("phone",12.0);

        DiscountCalculationItem thirdFree = new ThirdFree();

        double finalPrice = thirdFree.applyPriceCalculation(phone,new Quantity(5));
        double finalPrice1 = thirdFree.applyPriceCalculation(phone,new Quantity(6));

        Assertions.assertEquals(48,finalPrice,Double.MIN_VALUE);
        Assertions.assertEquals(finalPrice1,finalPrice,Double.MIN_VALUE);

    }
    @Test
    public void three_for_dollar_test(){

        ItemProduct pen = new ItemProduct("pen",0.5);

        DiscountCalculationItem threeForDollar = new ThreeForDollar();

        double finalPrice = threeForDollar.applyPriceCalculation(pen,new Quantity(5));
        double finalPrice1 = threeForDollar.applyPriceCalculation(pen,new Quantity(6));

        Assertions.assertEquals(2,finalPrice,Double.MIN_VALUE);
        Assertions.assertEquals(finalPrice1,finalPrice,Double.MIN_VALUE);

    }

    @Test
    public void weight_price_calculation_test(){

        WeightProduct corn = new WeightProduct("corn",10, WeightUnit.POUND);

        Weight weight = new Weight(32,WeightUnit.OUNCE);

        WeightPriceCalculation weightPriceCalculation = new WeightPriceCalculation();

        double finalPrice = weightPriceCalculation.applyPriceCalculation(corn,weight);

        Assertions.assertEquals(20, finalPrice);


    }
}
