package com.zsoft.pricecalculation;

import com.zsoft.product.Product;

public class ThirdFree implements CalculatePrice {

    public double applyPriceCalculation(Product product) {

        int quantity = product.getQuantity();
        int qt = quantity/3;

        double finalPrice = (product.getPrice()*quantity - product.getPrice()*qt)/quantity;

        return finalPrice;
    }
}
