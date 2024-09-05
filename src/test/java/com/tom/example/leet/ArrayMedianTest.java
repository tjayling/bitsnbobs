package com.tom.example.leet;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ArrayMedianTest {
  private final ArrayMedian arrayMedian = new ArrayMedian();

  @Test
  void test1() {
    int[] nums1 = new int[]{1, 3};
    int[] nums2 = new int[]{2};
    double expected = 2.0;
    double actual = arrayMedian.findMedianSortedArrays(nums1, nums2);

    assertEquals(expected, actual);
  }

  @Test
  void test2() {
    int[] nums1 = new int[]{1, 2};
    int[] nums2 = new int[]{3, 4};
    double expected = 2.5;
    double actual = arrayMedian.findMedianSortedArrays(nums1, nums2);

    assertEquals(expected, actual);
  }
}