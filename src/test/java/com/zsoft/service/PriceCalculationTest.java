package com.zsoft.service;

import com.zsoft.entity.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PriceCalculationTest {

    @Test
    public void third_free_test(){

        Product phone = new Product("phone",12.0);
        Product phone1 = new Product("phone",12.0);
        DiscountPriceCalculation thirdFree = new ThirdFree();

        double finalPrice = thirdFree.applyPriceCalculation(phone,5);
        double finalPrice1 = thirdFree.applyPriceCalculation(phone1,6);

        Assertions.assertEquals(finalPrice,9.6d,0.01);
        Assertions.assertEquals(finalPrice*5,finalPrice1*6);
    }
    @Test
    public void three_for_dollar_test(){

        Product pen = new Product("pen",0.5);
        Product pen1 = new Product("pen",0.5);
        DiscountPriceCalculation threeForDollar = new ThreeForDollar();

        double finalPrice = threeForDollar.applyPriceCalculation(pen,5);
        double finalPrice1 = threeForDollar.applyPriceCalculation(pen1,6);

        Assertions.assertEquals(finalPrice,0.4d,0.01);
        Assertions.assertEquals(finalPrice*5,finalPrice1*6,0.01);

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
