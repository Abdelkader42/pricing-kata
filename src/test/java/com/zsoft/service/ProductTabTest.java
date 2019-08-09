package com.zsoft.service;

import com.zsoft.entity.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class ProductTabTest {

    @Test
        public void addProduct(){

        ProductTab productTab = new ProductTab();
        ItemProduct product = new ItemProduct("pen",10.0);

        productTab.addProduct(product, 3d);

        Assertions.assertTrue(productTab.getProductTable().size() == 1);
   }

    @Test
    public void add_weight_product(){

        ProductTab productTab = new ProductTab();
        Product product = new WeightProduct("Potatos",12,WeightUnit.OUNCE);

        productTab.addProduct(product, 3d);

        Assertions.assertTrue(productTab.getProductTable().size() == 1);
    }

   @Test
    public void get_value_test(){

       ProductTab productTab = new ProductTab();
       ItemProduct product = new ItemProduct("pen",10.0);
       productTab.addProduct(product, 3d);

       double quantity = productTab.getValue(product);

       Assertions.assertTrue(quantity == 3d);
   }

   @Test
    public void add_quantity_test(){

       ProductTab productTab = new ProductTab();
       ItemProduct product = new ItemProduct("pen",10.0);
       ItemProduct product_1 = new ItemProduct("pen",10.0);
       productTab.addProduct(product, 3d);

       productTab.addQuantity(product_1, 5d);
       double quantity = productTab.getValue(product);

       Assertions.assertTrue(quantity == 8d);
   }

}