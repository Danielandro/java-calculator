package com.danny.calculator;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculateTest {
  @Test
  public void testAddReturnsCorrectAnswer() {
    assertEquals(6, Calculate.add(2, 4));
  }

  @Test
  public void testSubtractReturnsCorrectAnswer() {
    assertEquals(4, Calculate.subtract(10, 6));
  }

  @Test
  public void testMultiplyReturnsCorrectAnswer() {
    assertEquals(15, Calculate.multiply(5, 3));
  }
}
