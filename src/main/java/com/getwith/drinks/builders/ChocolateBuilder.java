package com.getwith.drinks.builders;

import com.getwith.drinks.Chocolate;
import com.getwith.drinks.Coffee;

public class ChocolateBuilder extends DrinkBuilder {

    public ChocolateBuilder() {}

    @Override
    public Chocolate build() {
        return new Chocolate(super.sugar, super.extraHot);
    }

}
