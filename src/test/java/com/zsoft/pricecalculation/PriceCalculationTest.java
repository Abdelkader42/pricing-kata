package com.zsoft.pricecalculation;

import com.zsoft.product.Product;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PriceCalculationTest {

    @Test
    public void third_free_test(){

        Product phone = new Product("phone",12.0);
        Product phone1 = new Product("phone",12.0);
        CalculatePriceSameUnit thirdFree = new ThirdFree();

        double finalPrice = thirdFree.applyPriceCalculation(phone,5);
        double finalPrice1 = thirdFree.applyPriceCalculation(phone1,6);

        Assertions.assertEquals(finalPrice,9.6d,0.01);
        Assertions.assertEquals(finalPrice*5,finalPrice1*6);
    }
    @Test
    public void three_for_dollar_test(){

        Product pen = new Product("pen",0.5);
        Product pen1 = new Product("pen",0.5);
        CalculatePriceSameUnit threeForDollar = new ThreeForDollar();

        double finalPrice = threeForDollar.applyPriceCalculation(pen,5);
        double finalPrice1 = threeForDollar.applyPriceCalculation(pen1,6);

        Assertions.assertEquals(finalPrice,0.4d,0.01);
        Assertions.assertEquals(finalPrice*5,finalPrice1*6,0.01);

    }

    @Test
    public void pound_ounce_test(){

        Product corn = new Product("corn",32);
        PoundOunce poundOunce = new PoundOunce();

        double finalPrice = poundOunce.applyPriceCalculation(corn,"Ounce");

        Assertions.assertEquals(2, finalPrice);


    }
}
