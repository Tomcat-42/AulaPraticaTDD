package com.tdd;

import com.tdd.Money;

public class Franc extends Money {
  private int amount;

  public Franc(int amount, String currency) {
    this.amount = amount;
    this.currency = currency;
  }

  String currency() {
    return currency;
  }

  public boolean equals(Object object) {
    Franc franc = (Franc) object;
    return amount == franc.amount;
  }

  public Money times(int multiplier) {
    return Money.franc(amount * multiplier);
  }
}
