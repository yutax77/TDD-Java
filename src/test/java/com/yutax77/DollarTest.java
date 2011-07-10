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
	  Franc five = new Franc(5);
	  assertEquals(five.times(2), new Franc(10));
	  assertEquals(five.times(3), new Franc(15));
  }
  
  @Test
  public void testEquality() {
	  assertTrue(Money.dollar(5).equals(Money.dollar(5)));
	  assertFalse(Money.dollar(5).equals(Money.dollar(6)));
	  assertTrue(new Franc(5).equals(new Franc(5)));
	  assertFalse(new Franc(5).equals(new Franc(6)));
	  assertFalse(new Franc(5).equals(Money.dollar(5)));
  }
}
