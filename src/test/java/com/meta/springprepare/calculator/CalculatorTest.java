package com.meta.springprepare.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
  @Test
  @DisplayName("더하기 테스트")
  void test1() {
    // Given / When / Then 패턴으로 작성해야 좋다.
    // Given
    double num1 = 8.0;
    String op = "+";
    double num2 = 2.0;
    Calculator calculator = new Calculator();

    // When
    Double result = calculator.operate(num1, op, num2);
    System.out.println("result = " + result);

    //Then
    Assertions.assertEquals(10, result);
  }
  @Test
  @DisplayName("나누기 테스트")
  void test2() {
    // Given / When / Then 패턴으로 작성해야 좋다.
    // Given
    double num1 = 8.0;
    String op = "/";
    double num2 = 2.0;
    Calculator calculator = new Calculator();

    // When
    Double result = calculator.operate(num1, op, num2);
    System.out.println("result = " + result);

    //Then
    Assertions.assertEquals(4, result);
  }
}