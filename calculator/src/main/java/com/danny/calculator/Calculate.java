package com.danny.calculator;

public final class Calculate {
  public static int add(int num1, int num2) {
    return num1 + num2;
  }

  public static int subtract(int num1, int num2) {
    return num1 - num2;
  }

  public static int multiply(int num1, int num2) {
    return num1 * num2;
  }

  public static float divide(int num1, int num2) {
    if (num2 == 0) {
      throw new IllegalArgumentException("Cannot divide by zero");
    }
    return num1 / num2;
  }
}
