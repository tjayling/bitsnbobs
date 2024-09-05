package com.tom.example.leet;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LongestSubStrTest {
  private final LongestSubStr longestSubStr = new LongestSubStr();

  @Test
  void test1() {
    var input = "pwwkew";
    var expected = 3;
    var actual = longestSubStr.lengthOfLongestSubstring(input);

    assertEquals(expected, actual);
  }

  @Test
  void test2() {
    var input = "abcabcbb";
    var expected = 3;
    var actual = longestSubStr.lengthOfLongestSubstring(input);

    assertEquals(expected, actual);
  }

  @Test
  void test3() {
    var input = "w";
    var expected = 1;
    var actual = longestSubStr.lengthOfLongestSubstring(input);

    assertEquals(expected, actual);
  }

  @Test
  void test4() {
    var input = " ";
    var expected = 1;
    var actual = longestSubStr.lengthOfLongestSubstring(input);

    assertEquals(expected, actual);
  }

  @Test
  void test5() {
    var input = "au";
    var expected = 2;
    var actual = longestSubStr.lengthOfLongestSubstring(input);

    assertEquals(expected, actual);
  }
}