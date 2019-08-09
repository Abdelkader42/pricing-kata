package com.zsoft.pricecalculation;

import com.zsoft.product.Product;

public class ThirdFree implements CalculatePriceSameUnit {

    public double applyPriceCalculation(Product product, int quantity) {

        int freeQuantity = quantity/3; // freeQuantity c'est la quantité des produits gratuits

        double finalPrice = (product.getPrice()*quantity - product.getPrice()*freeQuantity )/quantity;

        return finalPrice;
    }
}
