package com.tom.example.challenges;

class CamelToe {

  public static String toCamelCase(String s) {
    while (s.contains("-")) {
      s = shitOnIt(s, '-');
    }
    while (s.contains("_")) {
      s = shitOnIt(s, '_');
    }
    return s;
  }

  private static String shitOnIt(String s, char c) {
    int i = s.indexOf(c);
    char badChar = s.charAt(i + 1);
    return s.replace(c + String.valueOf(badChar), String.valueOf(Character.toUpperCase(badChar)));
  }
}