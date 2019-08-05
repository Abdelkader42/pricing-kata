package com.zsoft.pricecalculation;

import com.zsoft.product.Product;

public class PoundOunce implements CalculatePriceDifferentUnit {

    public double applyPriceCalculation(Product product, String unit) {

        double finalPrice;

        switch (unit){
            case "Ounce":
                finalPrice = product.getPrice()/16;
                break;
            case "Pound":
                finalPrice = product.getPrice();
                break;
                default:
                    finalPrice = product.getPrice();
                    break;
        }
        return finalPrice;
    }
}
