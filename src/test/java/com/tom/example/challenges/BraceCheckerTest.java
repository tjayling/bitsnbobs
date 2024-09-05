package com.tom.example.challenges;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

public class BraceCheckerTest {

  private final BraceChecker checker = new BraceChecker();

	@ParameterizedTest
  @CsvSource(textBlock = """
      {}, true
      [(]), false
      {), false
      )(}{][, false
      ())({}}{()][][, false
      (((({{, false
      }}]]))}]), false
      """)
	public void testValid(String s, boolean b) {
    assertEquals(checker.isValid(s), b);
	}

}