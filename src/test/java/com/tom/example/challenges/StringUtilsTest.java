package com.tom.example.challenges;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class StringUtilsTest {
  @ParameterizedTest
  @CsvSource(textBlock = """
      Reverse, esreveR
      Bum, muB
      Smelly, yllemS
      I sure hope this test passes, sessap tset siht epoh erus I
      ibasaW, Wasabi
      """)
  void reverse(String input, String expected) {
    var actual = StringUtils.reverse(input);
    assertEquals(expected, actual);
  }
}