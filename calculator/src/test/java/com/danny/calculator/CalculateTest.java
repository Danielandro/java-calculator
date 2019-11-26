package com.danny.calculator;

import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

import org.junit.Rule;

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

  @Test
  public void testDivideReturnsCorrectAnswer() {
    assertEquals(5, Calculate.divide(10, 2), 0.0001);
  }

  @Rule
  public ExpectedException exception = ExpectedException.none();

  @Test
  public void testDivideByZeroThrowsException() throws IllegalArgumentException {
    exception.expect(IllegalArgumentException.class);
    exception.expectMessage("Cannot divide by zero");
    Calculate.divide(5, 0);
  }
}
