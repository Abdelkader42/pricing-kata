package com.zsoft.service;


import com.zsoft.entity.CartLine;
import com.zsoft.entity.Type;

public interface PriceCalculation {
    /**
     Calculate price after discount
     @param cartLine  Quantity
     @return price in Euro
     */
    double applyPriceCalculation(CartLine cartLine);

    Type getType();
}