package com.zsoft.entity;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class Cart {

    ConcurrentMap<CartLine,Double> cartList = new ConcurrentHashMap<>();


    public void addCartLine(CartLine cartLine){

        if ( ! cartList.containsKey(cartLine)){
            cartList.put(cartLine,cartLine.calculateSubTotal());
        }
    }

    public ConcurrentMap<CartLine, Double> getCartList() {
        return cartList;
    }

    public void setCartList(ConcurrentMap<CartLine, Double> cartList) {
        this.cartList = cartList;
    }
}
