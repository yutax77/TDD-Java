package com.yutax77;

import static org.testng.AssertJUnit.assertEquals;
import org.testng.annotations.Test;

public class DollarTest {
  @Test
  public void testMultiplication() {
	  Dollar five = new Dollar(5);
	  five.times(2);
	  assertEquals(10, five.amount);
  }
}
