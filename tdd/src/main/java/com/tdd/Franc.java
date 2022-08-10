package com.tdd;
import com.tdd.Money;

public class Franc extends Money {
  private int amount;

  public Franc(int amount) {
    this.amount = amount;
  }

  public boolean equals(Object object) {
    Franc franc = (Franc) object;
    return amount == franc.amount;
  }

  public Money times(int multiplier) {
    return new Franc(this.amount * multiplier);
  }
}
