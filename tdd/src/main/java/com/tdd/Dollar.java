package com.tdd;

class Dollar {
  private int amount;

  Dollar(int amount) {
    this.amount = amount;
  }

  public boolean equals(Object object) {
    Dollar dollar = (Dollar) object;
    return amount == dollar.amount;
  }

  public Money times(int multiplier) {
    return new Dollar(this.amount * multiplier);
  }
}
