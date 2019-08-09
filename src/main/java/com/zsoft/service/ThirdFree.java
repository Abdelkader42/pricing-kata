package com.zsoft.service;

import com.zsoft.entity.CartLine;
import com.zsoft.entity.ProductListing;
import com.zsoft.entity.Quantity;
import com.zsoft.entity.Type;

import javax.swing.*;

public class ThirdFree implements PriceCalculation {

    @Override
    public double applyPriceCalculation(CartLine cartLine) {
        // create freeQuantity, freeQuantity is the number of groups of 3 items
        Quantity quantity = cartLine.getQuantity();
        ProductListing productListing = cartLine.getProductListing();
        if (productListing.getType() != this.getType()) {
            throw new IllegalArgumentException("Third free discount can't be applied to product listing of type : " + productListing.getType());
        }
        int freeQuantity = (int) quantity.getValue() / 3;
        // finalPrice is the total price after discount
        return productListing.getPrice() * quantity.getValue() - productListing.getPrice() * freeQuantity;
    }

    @Override
    public Type getType() {
        return Type.UNIT;
    }
}
