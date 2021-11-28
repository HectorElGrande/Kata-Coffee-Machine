package com.getwith;

import com.getwith.drinks.Drink;
import com.getwith.utils.ErrorMessage;
import com.getwith.utils.Message;

public class MakeDrinkCommand implements Command {

  private CommandParser command;
  private Input input;
  private Output output;

  public MakeDrinkCommand(Input input, Output output) {
    this.input = input;
    this.output = output;
    this.command = new CommandParser(this.input);
  }

  @Override
  public void execute() {

    try {
      Drink drink = this.command.getDrink();
      float money = this.command.getMoney();
      String moneyString = String.format("%f", money);
      String message = Message.ORDER + drink.getDrinkType();

      if (drink.paidController(money)) throw new ParserException(ErrorMessage.INCORRECT_PAID, drink.getDrinkType(), moneyString);
      message += drink.extraOptions();
      output.run(message);
    }catch (ParserException parserException) {
      output.run(parserException.getMessage());
    }

  }

}
