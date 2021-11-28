package com.getwith;

import com.getwith.drinks.Drink;
import com.getwith.utils.ErrorMessage;

public class CommandParser {

    public static final String DRINK_TYPE = "drinkType";
    public static final String MONEY = "money";
    public static final String NO_SUGARS = "sugar";
    public static final String EXTRA_HOT = "extraHot";

    private Input input;

    public CommandParser(Input input) {
        this.input = input;
    }

    private DrinkType getDrinkType() {
        DrinkType drinkType = DrinkType.get(this.input.getParameter(DRINK_TYPE));
        if (drinkType.isNull()) {
            throw new ParserException(ErrorMessage.DRINK_NAME_NOT_FOUND);
        }
        return drinkType;
    }

    public float getMoney() {
        float money = Float.parseFloat(this.input.getParameter(MONEY));
        if (Float.isNaN(money)) {
            throw new ParserException(ErrorMessage.INCORRECT_PAID, MONEY, MONEY);
        }
        return money;
    }

    private int getSugars() {
        return this.input.getParameter(NO_SUGARS);
    }

    private boolean isExtraHot() {
        return this.input.getParameter(EXTRA_HOT);
    }

    public Drink getDrink() {
        DrinkType drinkType = this.getDrinkType();
        int sugars = this.getSugars();
        boolean extraHot = this.isExtraHot();
        return drinkType.create().sugar(sugars).extraHot(extraHot).build();
    }

}
