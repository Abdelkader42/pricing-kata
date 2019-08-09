package com.zsoft.service;

import com.zsoft.entity.CartLine;
import com.zsoft.entity.ProductListing;
import com.zsoft.entity.Quantity;
import com.zsoft.entity.Type;

public class ThreeForDollar implements PriceCalculation {

    /**
     Apply discount of three for one Euro
     @param cartLine
     @return total price in Euro after applying discount of three for one Euro
     */
    public double applyPriceCalculation(CartLine cartLine) {

        Quantity quantity = cartLine.getQuantity();
        ProductListing productListing = cartLine.getProductListing();
        if (productListing.getType() != this.getType()) {
            throw new IllegalArgumentException("Third free discount can't be applied to product listing of type : " + productListing.getType());
        }

        int qt = (int)quantity.getValue() / 3;

        // modQuantity is the items that are not discounted
        double modQuantity = quantity.getValue() % 3;

        // finalPrice is the total price after discount
        return qt + productListing.getPrice() * modQuantity;
    }

    @Override
    public Type getType() {
        return Type.UNIT;
    }
}
