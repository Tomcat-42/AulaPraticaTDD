package com.tdd;

class Dollar {
  private int amount;
  private String currency;

  String currency() {
    return currency;
  }

  Dollar(int amount) {
    this.amount = amount;
    this.currency = "USD";
  }

  public boolean equals(Object object) {
    Dollar dollar = (Dollar) object;
    return amount == dollar.amount;
  }

  public Money times(int multiplier) {
    return new Dollar(this.amount * multiplier);
  }
}
