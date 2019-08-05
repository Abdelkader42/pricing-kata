package com.zsoft.pricecalculation;

import com.zsoft.product.Product;

public class SixteenOnce implements CalculatePrice {
    public double applyPriceCalculation(Product product) {
        double finalPrice = product.getPrice()/16;
        return finalPrice;
    }
}
