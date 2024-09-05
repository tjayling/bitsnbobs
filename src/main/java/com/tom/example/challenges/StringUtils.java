package com.tom.example.challenges;

public class StringUtils {
  private StringUtils() {}

  public static String reverse(String s) {
    var sb = new StringBuilder();
    for (char c : s.toCharArray()) {
      sb.insert(0, c);
    }
    return sb.toString();
  }
}
