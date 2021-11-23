package com.getwith;

import java.util.Arrays;

public class MakeDrinkCommand implements Command {

  @Override
  public void execute(Input input, Output out) {
    Boolean hasStick = false;
    String drinkType = input.getParameter("drinkType");

    boolean isValid = Arrays.asList("COFFEE", "CHOCOLATE", "TEA").contains(drinkType.toUpperCase());
    if (isValid) {
      Float money = input.getParameter("money");

      switch (drinkType.toUpperCase()) {
        case "TEA":
          double price = 0.4;
          if (money < price) {
            out.run("The tea costs " + price + ".");
            return;
          }
          break;
        case "COFFEE":
          price = 0.5;
          if (money < price) {
            out.run("The coffee costs " + price + ".");
            return;
          }
          break;
        case "CHOCOLATE":
          price = 0.6;
          if (money < price) {
            out.run("The chocolate costs " + price + ".");
            return;
          }
          break;
      }

      Integer sugarsNo = input.getParameter("sugar");

      String message;
      if (sugarsNo >= 0 && sugarsNo <= 2) {
        message = "You have ordered a " + drinkType;

        Boolean isExtraHot = input.getParameter("extraHot");
        if (isExtraHot) {
          message += " extra hot";
        }

        if (sugarsNo > 0) {
          hasStick = true;
          message += " with " + sugarsNo + " sugars (stick included)";
        } else {
          message += " with " + sugarsNo + " sugar";
        }

        out.run(message);
      } else {
        out.run("The number of sugars should be between 0 and 2.");
      }

    } else {
      out.run("The drink type should be tea, coffee or chocolate.");
    }

  }
}
