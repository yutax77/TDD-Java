package com.yutax77;

import static org.testng.Assert.*;
import org.testng.annotations.Test;

public class DollarTest {
  @Test
  public void testMultiplication() {
	  Dollar five = new Dollar(5);
	  Dollar product = five.times(2);
	  assertEquals(product.amount, 10);
	  product = five.times(3);
	  assertEquals(product.amount, 15);
  }
  
  @Test
  public void testEquality() {
	  assertTrue(new Dollar(5).equals(new Dollar(5)));
  }
}
