package com.tom.example.leet;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class IsPalindromeTest {
  private final IsPalindrome isPalindrome = new IsPalindrome();

  @Test
  void test1() {
    var expected = true;
    var actual = isPalindrome.isPalindrome(121);
    assertEquals(expected, actual);
  }

  @Test
  void test2() {
    var expected = false;
    var actual = isPalindrome.isPalindrome(-121);
    assertEquals(expected, actual);
  }

  @Test
  void test3() {
    var expected = true;
    var actual = isPalindrome.isPalindrome(-0);
    assertEquals(expected, actual);
  }

  @Test
  void test4() {
    var expected = true;
    var actual = isPalindrome.isPalindrome(0);
    assertEquals(expected, actual);
  }

  @Test
  void test5() {
    var expected = true;
    var actual = isPalindrome.isPalindrome(12321);
    assertEquals(expected, actual);
  }

  @Test
  void test6() {
    var expected = false;
    var actual = isPalindrome.isPalindrome(12322);
    assertEquals(expected, actual);
  }
}