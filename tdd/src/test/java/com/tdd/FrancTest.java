package com.tdd;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import org.junit.Test;

import com.tdd.Franc;

public class FrancTest {
  @Test
  public void testMultiplication() {
    Franc five = new Franc(5);
    assertTrue(new Franc(10).equals(five.times(2)));
    assertTrue(new Franc(15).equals(five.times(3)));
  }

  @Test
  public void testEquality() {
    assertTrue(new Franc(5).equals(new Franc(5)));
    assertFalse(new Franc(5).equals(new Franc(6)));
  }

  @Test
  public void testCurrency() {
    assertEquals("CHF", new Franc(1).currency());
  }
}
