package com.tom.example.leet;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PlusOneTest {
  private PlusOne plusOne;

  @BeforeEach
  void setup() {
    plusOne = new PlusOne();
  }

  @Test
  void test1() {
    var input = new int[] {9, 9, 9};
    var expected = new int[] {1, 0, 0, 0};
    var actual = plusOne.plusOne(input);

    assertArrayEquals(expected, actual);
  }

  @Test
  void test2() {
    var input = new int[] {9, 9, 8};
    var expected = new int[] {9, 9, 9};
    var actual = plusOne.plusOne(input);

    assertArrayEquals(expected, actual);
  }
}