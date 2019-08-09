package com.zsoft.service;

import com.zsoft.entity.*;

public class WeightPriceCalculation implements PriceCalculation {
    /**
     * Calculate the price of the given weight
     *
     * @param cartLine
     * @return the price of the given weight
     */
    @Override
    public double applyPriceCalculation(CartLine cartLine) {

        WeightUnit weightUnitProduct = cartLine.getProductListing().getWeightUnit();
        Quantity weight = cartLine.getQuantity();
        double price = cartLine.getProductListing().getPrice();

        // create weightConverted witch is the weight after conversion if necessary
        double weightConverted = UnitConvert.convert(weight, weightUnitProduct);

        return price * weightConverted;
    }

    @Override
    public Type getType() {
        return Type.WEIGHT;
    }
}
