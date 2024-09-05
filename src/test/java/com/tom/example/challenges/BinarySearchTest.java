package com.tom.example.challenges;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class BinarySearchTest {
  private static Stream<Arguments> args() {
    return Stream.of(
        Arguments.of(-1, 3,  new int[]{1}),
        Arguments.of(0,  1,  new int[]{1}),
        Arguments.of(-1, 3, new int[]{}),

        Arguments.of(0,  1,  new int[]{1, 3, 5}),
        Arguments.of(1,  3,  new int[]{1, 3, 5}),
        Arguments.of(2,  5,  new int[]{1, 3, 5}),
        Arguments.of(-1, 0,  new int[]{1, 3, 5}),
        Arguments.of(-1, 2,  new int[]{1, 3, 5}),
        Arguments.of(-1, 4,  new int[]{1, 3, 5}),
        Arguments.of(-1, 6,  new int[]{1, 3, 5}),

        Arguments.of(0,  1,  new int[]{1, 3, 5, 7}),
        Arguments.of(1,  3,  new int[]{1, 3, 5, 7}),
        Arguments.of(2,  5,  new int[]{1, 3, 5, 7}),
        Arguments.of(3,  7,  new int[]{1, 3, 5, 7}),
        Arguments.of(-1, 0,  new int[]{1, 3, 5, 7}),
        Arguments.of(-1, 2,  new int[]{1, 3, 5, 7}),
        Arguments.of(-1, 4,  new int[]{1, 3, 5, 7}),
        Arguments.of(-1, 6,  new int[]{1, 3, 5, 7}),
        Arguments.of(-1, 8,  new int[]{1, 3, 5, 7}),

        Arguments.of(1, 2,  new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20}),
        Arguments.of(-1, 21,  new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20})
    );
  }

  @ParameterizedTest
  @MethodSource("args")
  void test(int expected, int target, int[] arr) {
    var start = System.nanoTime();
    assertEquals(expected, BinarySearch.recursive(target, arr));
    var end = System.nanoTime();

    System.out.printf("arr: %s\n target: %s\n took %s nanoseconds.%n", Arrays.toString(arr), target, end - start);

  }
}