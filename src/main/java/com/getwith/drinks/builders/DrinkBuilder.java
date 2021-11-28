package com.getwith.drinks.builders;

import com.getwith.drinks.Drink;

public abstract class DrinkBuilder {

    private int price;
    protected int sugar;
    protected boolean extraHot;

    public DrinkBuilder() {
        this.sugar = 0;
        this.extraHot = false;
    }

    public DrinkBuilder sugar(int sugar) {
        this.sugar = sugar;
        return this;
    }

    public DrinkBuilder extraHot(boolean extraHot) {
        this.extraHot = extraHot;
        return this;
    }

    public abstract Drink build();

}
