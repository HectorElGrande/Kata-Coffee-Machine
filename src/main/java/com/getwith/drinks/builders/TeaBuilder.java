package com.getwith.drinks.builders;

import com.getwith.drinks.Coffee;
import com.getwith.drinks.Tea;

public class TeaBuilder extends DrinkBuilder {

    public TeaBuilder() {}

    @Override
    public Tea build() {
        return new Tea(super.sugar, super.extraHot);
    }

}
