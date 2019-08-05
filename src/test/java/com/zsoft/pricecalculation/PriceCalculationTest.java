package com.zsoft.pricecalculation;

import com.zsoft.product.Product;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PriceCalculationTest {

    @Test
    public void third_free_test(){

        Product phone = new Product("phone",5,12.0);
        Product phone1 = new Product("phone",6,12.0);
        CalculatePrice thirdFree = new ThirdFree();

        double finalPrice = thirdFree.applyPriceCalculation(phone);
        double finalPrice1 = thirdFree.applyPriceCalculation(phone1);

        Assertions.assertEquals(finalPrice,9.6d,0.01);
        Assertions.assertEquals(finalPrice*5,finalPrice1*6);
    }
    @Test
    public void three_for_dollar_test(){

        Product pen = new Product("pen",5,0.5);
        Product pen1 = new Product("pen",6,0.5);
        CalculatePrice threeForDollar = new ThreeForDollar();

        double finalPrice = threeForDollar.applyPriceCalculation(pen);
        double finalPrice1 = threeForDollar.applyPriceCalculation(pen1);

        Assertions.assertEquals(finalPrice,0.4d,0.01);
        Assertions.assertEquals(finalPrice*5,finalPrice1*6,0.01);

    }

    @Test
    public void sixteen_once_test(){

        Product corn = new Product("corn",5,1.99);
        CalculatePrice sixteen_once = new SixteenOnce();

        double finalPrice = sixteen_once.applyPriceCalculation(corn);

        Assertions.assertEquals(0.124,finalPrice,0.001);


    }
}
