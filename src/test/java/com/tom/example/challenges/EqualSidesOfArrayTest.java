package com.tom.example.challenges;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class EqualSidesOfArrayTest {

  @Test
  public void test1() {
    assertEquals(3, EqualSidesOfArray.findEvenIndex(new int[] {1, 2, 3, 4, 3, 2, 1}));
  }

  @Test
  public void test2() {
    assertEquals(1, EqualSidesOfArray.findEvenIndex(new int[] {1, 100, 50, -51, 1, 1}));
  }

  @Test
  public void test3() {
    assertEquals(-1, EqualSidesOfArray.findEvenIndex(new int[] {1, 2, 3, 4, 5, 6}));
  }

  @Test
  public void test4() {
    assertEquals(3, EqualSidesOfArray.findEvenIndex(new int[] {20, 10, 30, 10, 10, 15, 35}));
  }

  @Test
  public void test5() {
    assertEquals(-1, EqualSidesOfArray.findEvenIndex(new int[] {-8505, -5130, 1926, -9026}));
  }

  @Test
  public void test6() {
    assertEquals(1, EqualSidesOfArray.findEvenIndex(new int[] {2824, 1774, -1490, -9084, -9696, 23094}));
  }

  @Test
  public void test7() {
    assertEquals(6, EqualSidesOfArray.findEvenIndex(new int[] {4, 5, 6, 7, 8, 9, 10, 9, 8, 7, 6, 5, 4}));
  }
}