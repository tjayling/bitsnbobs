package com.tom.example.challenges;

public class Squares {
  public static int solve(int a, int b) {
    int result = 0;
    for (int i = a; i <= b; i++) {
      if (Math.sqrt(i) % 1 == 0) {
        result++;
      }
    }
    return result;
  }

  public static int solveFaster(int a, int b) {
    int result = 0;
    int count = 0;
    var square = 0;
    while (square <= b) {
      square = count * count;
      count++;
      if (square >= a && square <= b) {
        result++;
      }
    }
    return result;
  }
}

