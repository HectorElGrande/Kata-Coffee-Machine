package com.getwith.drinks;

import com.getwith.drinks.builders.DrinkBuilder;
import com.getwith.drinks.builders.TeaBuilder;

public class Tea extends Drink {

    public static final double TEA_PRICE = 0.4;
    public static final String DRINK_TEA = "tea";

    public Tea(int sugar, boolean extraHot) {
        super(sugar, extraHot);
    }
    public Tea() {}

    @Override
    public boolean paidController(float money) {
        return (money < TEA_PRICE);
    }

    @Override
    public DrinkBuilder builder() {
        return new TeaBuilder();
    }

    @Override
    public String getDrinkType() {
        return DRINK_TEA;
    }
}
