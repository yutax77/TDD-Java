package com.yutax77;

import static org.testng.Assert.*;
import org.testng.annotations.Test;

public class DollarTest {
  @Test
  public void testMultiplication() {
	  Money five = Money.dollar(5);
	  assertEquals(five.times(2), Money.dollar(10));
	  assertEquals(five.times(3), Money.dollar(15));
  }
  
  @Test
  public void testFrancMultiplication() {
	  Money five = Money.franc(5);
	  assertEquals(five.times(2), Money.franc(10));
	  assertEquals(five.times(3), Money.franc(15));
  }
  
  @Test
  public void testEquality() {
	  assertTrue(Money.dollar(5).equals(Money.dollar(5)));
	  assertFalse(Money.dollar(5).equals(Money.dollar(6)));
	  assertFalse(Money.franc(5).equals(Money.dollar(5)));
  }
  
  @Test
  public void testCurrency() {
	  assertEquals(Money.dollar(1).currency(), "USD");
	  assertEquals(Money.franc(1).currency(), "CHF");
  }
  
  @Test
  public void testSimpleAddition() {
	  Money sum = Money.dollar(5).plus(Money.dollar(5));
	  assertEquals(sum, Money.dollar(10));
  }
}
