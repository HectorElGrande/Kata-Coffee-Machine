package com.getwith.drinks.builders;

import com.getwith.drinks.Coffee;

public class CoffeeBuilder extends DrinkBuilder {

    public CoffeeBuilder() {}

    @Override
    public Coffee build() {
        return new Coffee(super.sugar, super.extraHot);
    }

}
