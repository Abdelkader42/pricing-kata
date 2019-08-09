package com.zsoft.service;

import com.zsoft.entity.Weight;
import com.zsoft.entity.WeightProduct;

public interface PriceCalculationWeight {

    double applyPriceCalculation(WeightProduct weightProduct, Weight weight);
}
