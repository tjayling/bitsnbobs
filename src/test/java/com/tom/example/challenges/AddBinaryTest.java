package com.tom.example.challenges;


import static org.junit.jupiter.api.Assertions.assertEquals;

import com.tom.example.leet.AddBinaryBetter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AddBinaryTest {
  private AddBinaryBetter addBinary;

  @BeforeEach
  void setup() {
    addBinary = new AddBinaryBetter();
  }

  @Test
  void t1() {
    var expected = "1100";
    var actual = addBinary.addBinary("1010", "10");

    assertEquals(expected, actual);
  }

  @Test
  void t2() {
    var expected = "11110";
    var actual = addBinary.addBinary("1111", "1111");

    assertEquals(expected, actual);
  }

  @Test
  void t3() {
    var expected = "100";
    var actual = addBinary.addBinary("11", "1");

    assertEquals(expected, actual);
  }
}