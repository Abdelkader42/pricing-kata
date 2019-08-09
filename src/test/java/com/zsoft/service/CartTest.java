package com.zsoft.service;

import com.zsoft.entity.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CartTest {

    @Test
    public void add_product_test(){

        Cart cart = new Cart();
        Quantity quantity = new Quantity(12, WeightUnit.NONE);
        Product product = new Product("pen");
        ProductListing productListing = new ProductListing(product, Type.UNIT, WeightUnit.NONE, 10);
        CartLine cartLine = new CartLine(productListing, quantity);

        cart.addCartLine(cartLine);

        Assertions.assertTrue(cart.getCartList().size() == 1);
    }
}
