package org.example.calculator;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    @Test
    void addTwoNumbersReturnSum() {
        int result = Calculator.add(1, 2);
        assertThat(result).isEqualTo(3);
    }

    @Test
    void addThreeNumbersReturnsSum() {
        int result = Calculator.add(1, 2, 3);
        assertThat(result).isEqualTo(6);
    }

    @Test
    void addMultipleNumbersReturnsSum() {
        int result = Calculator.add(1, 2, 3, 4);
        assertThat(result).isEqualTo(10);
    }

    @Test
    void noParamsReturnsZero() {
        int result = Calculator.add();
        assertThat(result).isEqualTo(0);
    }

    @Test
    void divideTwoNumbersReturnsFloat() {
        float result = Calculator.div(6, 3);
        assertThat(result).isEqualTo(2.0f);
    }

    @Test
    void divideTwoNumbersReturnsFloatWithRemainder() {
        float result = Calculator.div(5, 2);
        assertThat(result).isEqualTo(2.5f);
    }

    @Test
    void divideByZeroThrowsException() {
        assertThrows(ArithmeticException.class, () -> {
            Calculator.div(1, 0);
        });
    }
}