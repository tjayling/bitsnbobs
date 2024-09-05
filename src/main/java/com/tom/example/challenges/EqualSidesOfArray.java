package com.tom.example.challenges;

import java.util.Arrays;

public class EqualSidesOfArray {
  public static int findEvenIndex(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      if (sum(left(arr, i)) == sum(right(arr, i))) {
        return i;
      }
    }
    return  -1;
  }

  private static int sum(int[] arr) {
    return Arrays.stream(arr).reduce(Integer::sum).orElse(0);
  }

  private static int[] left(int[] arr, int i) {
    return i == 0 ? new int[]{} : Arrays.copyOfRange(arr, 0, i);
  }

  private static int[] right(int[] arr, int i) {
    return i == arr.length ? new int[]{} : Arrays.copyOfRange(arr, i + 1, arr.length);
  }
}