package com.getwith.drinks;

import com.getwith.drinks.builders.ChocolateBuilder;
import com.getwith.drinks.builders.DrinkBuilder;

public class Chocolate extends Drink {

    public static final double CHOCOLATE_PRICE = 0.6;
    public static final String DRINK_CHOCOLATE = "chocolate";

    public Chocolate(int sugar, boolean extraHot) {
        super(sugar, extraHot);
    }
    public Chocolate() {}

    @Override
    public boolean paidController(float money) {
        return (money < CHOCOLATE_PRICE);
    }

    @Override
    public DrinkBuilder builder() {
        return new ChocolateBuilder();
    }

    @Override
    public String getDrinkType() {
        return DRINK_CHOCOLATE;
    }
}
