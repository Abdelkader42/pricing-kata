package com.zsoft.service;

import com.zsoft.entity.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CartLineTest {

    @Test
    public void add_quantity_test(){
        CartLine cartLine = new CartLine(new ProductListing(new Product("pen"), Type.UNIT,WeightUnit.NONE,10),new Quantity(5,WeightUnit.NONE));

        cartLine.addQuantity(new Quantity(5,WeightUnit.NONE));

        Assertions.assertTrue(cartLine.getQuantity().getValue() == 10);
    }

    @Test
    public void calculate_subtotal_test(){

        CartLine cartLine = new CartLine(new ProductListing(new Product("corn"), Type.WEIGHT,WeightUnit.POUND,10),new Quantity(32,WeightUnit.OUNCE));
        CartLine cartLine_1 = new CartLine(new ProductListing(new Product("potatos"), Type.WEIGHT,WeightUnit.OUNCE,10),new Quantity(32,WeightUnit.POUND));

        double subTotal = cartLine.calculateSubTotal();
        double subTotal_1 = cartLine_1.calculateSubTotal();

        Assertions.assertEquals(20d,subTotal,Double.MIN_VALUE);
        Assertions.assertEquals(5120d,subTotal_1,Double.MIN_VALUE);
    }
}
