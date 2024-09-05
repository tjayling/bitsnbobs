package com.tom.example.leet;

public class MaxArea {
  public int maxArea(int[] height) {
    int result = 0, left = 0, right = height.length - 1;
    while (left != right) {
      int l = height[left], r = height[right];
      int v = Math.min(l, r) * (right - left);
      if (v > result) {
        result = v;
      }
      if (l < r) {
        left++;
      } else {
        right--;
      }
    }
    return result;
  }
}
