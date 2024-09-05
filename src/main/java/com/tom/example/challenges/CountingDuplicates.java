package com.tom.example.challenges;

public class CountingDuplicates {
  public static int duplicateCount(String text) {
    char previous = '.';
    int result = 1;
    int currentBest = 0;
    for (char c : text.toLowerCase().toCharArray()) {
      if (c == previous) {
        result++;
      } else {
        currentBest = result;
        result = 1;
      }
      previous = c;
    }
    return currentBest;
  }
}