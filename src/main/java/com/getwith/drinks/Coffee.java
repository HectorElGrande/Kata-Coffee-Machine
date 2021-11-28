package com.getwith.drinks;

import com.getwith.drinks.builders.CoffeeBuilder;
import com.getwith.drinks.builders.DrinkBuilder;

public class Coffee extends Drink {

    public static final double COFFEE_PRICE = 0.5;
    public static final String DRINK_COFFEE = "coffee";

    public Coffee(int sugar, boolean extraHot) {
        super(sugar, extraHot);
    }
    public Coffee() {}

    @Override
    public boolean paidController(float money) {
        return (money < COFFEE_PRICE);
    }

    @Override
    public DrinkBuilder builder() {
        return new CoffeeBuilder();
    }

    @Override
    public String getDrinkType() {
        return DRINK_COFFEE;
    }
}
