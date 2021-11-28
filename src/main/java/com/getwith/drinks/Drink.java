package com.getwith.drinks;

import com.getwith.utils.ErrorMessage;
import com.getwith.ParserException;
import com.getwith.drinks.builders.DrinkBuilder;
import com.getwith.utils.Message;

public abstract class Drink {

    protected int sugars;
    protected boolean extraHot;

    protected Drink(int sugars, boolean extraHot) {
        this.sugars = sugars;
        this.extraHot = extraHot;
    }
    protected Drink() {}

    public abstract DrinkBuilder builder();

    public abstract String getDrinkType();

    public abstract boolean paidController(float money);

    public String extraOptions() {
        String message = "";
        if (this.sugars >= 0 && this.sugars <= 2) {
            if (extraHot) {
                message += Message.EXTRA_HOT;
            }
            if (this.sugars > 0) {
                return  message +  "with" + this.sugars + " sugars (stick included)";
            } else {
                return  message + Message.NO_SUGAR;
            }
        } else {
            throw new ParserException(ErrorMessage.INCORRECT_AMOUNT_SUGARS);
        }
    }
}
