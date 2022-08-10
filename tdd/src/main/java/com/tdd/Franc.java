package com.tdd;

import com.tdd.Money;

public class Franc extends Money {
  private int amount;
  private String currency;

  String currency() {
    return currency;
  }

  public Franc(int amount) {
    this.amount = amount;
    this.currency = "CHF";
  }

  public boolean equals(Object object) {
    Franc franc = (Franc) object;
    return amount == franc.amount;
  }

  public Money times(int multiplier) {
    return new Franc(this.amount * multiplier);
  }
}
