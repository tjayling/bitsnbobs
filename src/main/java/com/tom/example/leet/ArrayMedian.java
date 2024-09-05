package com.tom.example.leet;

public class ArrayMedian {
  public double findMedianSortedArrays(int[] nums1, int[] nums2) {
    var merged = merge(nums1, nums2);
    return median(merged);
  }

  private int[] merge(int[] a, int[] b) {
    if (a.length == 0) {
      return b;
    } else if (b.length == 0) {
      return a;
    }

    int t = a.length + b.length, p1 = 0, p2 = 0;
    int[] r = new int[t];

    for (int i = 0; i < t; i++) {
      if (p1 >= a.length) {
        System.arraycopy(b, p2, r, i, b.length - p2);
        return r;
      }
      if (p2 >= b.length) {
        System.arraycopy(a, p1, r, i, a.length - p1);
        return r;
      }

      if (a[p1] < b[p2]) {
        r[i] = a[p1++];
      } else if (a[p1] > b[p2]) {
        r[i] = b[p2++];
      } else if (a[p1] == b[p2]) {
        r[i++] = a[p1++];
        r[i] = b[p2++];
      }
    }
    return r;
  }

  private double median(int[] nums) {
    if (isOdd(nums.length)) {
      return nums[Math.floorDiv(nums.length, 2)];
    }
    int m = nums.length / 2;
    return (double) (nums[m - 1] + nums[m]) / 2;
  }

  private boolean isOdd(int n) {
    return n % 2 == 1;
  }
}