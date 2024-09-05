package com.tom.example.challenges;

public class BinarySearch {
  public static int recursive(int target, int[] arr) {
    if (arr.length == 0) {
      return -1;
    }
    return recursive(0, arr.length, target, arr);
  }

  private static int recursive(int left, int right, int target, int[] arr) {
    int midpoint = left + (right - left) / 2;

    if (arr[midpoint] == target) {
      return midpoint;
    } else if (right - left == 1) {
      return -1;
    } else if (arr[midpoint] < target) {
      return (recursive(midpoint, right, target, arr));
    } else if (arr[midpoint] > target) {
      return (recursive(left, midpoint, target, arr));
    } else {
      return -1;
    }
  }
}
