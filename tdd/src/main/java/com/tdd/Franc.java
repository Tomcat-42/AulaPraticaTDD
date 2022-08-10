package com.tdd;

public class Franc {
  private int amount;

  public Franc(int amount) {
    this.amount = amount;
  }

  public boolean equals(Object object) {
    Franc franc = (Franc) object;
    return amount == franc.amount;
  }

  public Franc times(int multiplier) {
    return new Franc(this.amount * multiplier);
  }
}
