package com.getwith;

import com.getwith.drinks.Chocolate;
import com.getwith.drinks.Coffee;
import com.getwith.drinks.Drink;
import com.getwith.drinks.Tea;
import com.getwith.drinks.builders.DrinkBuilder;

public enum DrinkType {

    COFFEE(new Coffee()),
    CHOCOLATE(new Chocolate()),
    TEA(new Tea()),
    NULL;

    Drink drink;

    DrinkType(Drink drink) {
        this.drink = drink;
    }

    DrinkType(){}

    public DrinkBuilder create() {
        assert !this.isNull();
        return this.drink.builder();
    }

    public boolean isNull() {
        return this == DrinkType.NULL;
    }

    public static DrinkType get(String drink) {
        for (DrinkType drinkType : DrinkType.values()) {
            if (drinkType.getName().equals(drink)) {
                return drinkType;
            }
        }
        return DrinkType.NULL;
    }

    public String getName() {
        return this.name().toLowerCase();
    }

}
