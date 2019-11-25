package com.danny.calculator;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculateTest {
  @Test
  public void testUserCanAddTwoNumbers() {
    assertEquals(Calculate.add(2, 4), 6);
  }
}
