package com.tom.example.challenges;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class SquaresTest {

  @ParameterizedTest
  @CsvSource(textBlock = """
      3, 9, 2
      17, 24, 0
      1, 1000000000, 31622
      """)
  void solve(int a, int b, int expected) {
    var actual = Squares.solveFaster(a, b);
    assertEquals(expected, actual);
  }
}