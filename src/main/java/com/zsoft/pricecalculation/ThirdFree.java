package com.zsoft.discount;

import com.zsoft.product.Product;

public class ThirdFree implements Discount {

    public double applyDiscount(Product product) {

        double finalPrice = product.getPrice();
        int quantity = product.getQuantity();

        if (product.isDiscount() == true){
            int qt = quantity/3;

            finalPrice = (product.getPrice()*quantity - product.getPrice()*qt)/quantity;
        }
        return finalPrice;
    }
}
