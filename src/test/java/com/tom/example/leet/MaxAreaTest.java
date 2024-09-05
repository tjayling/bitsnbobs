package com.tom.example.leet;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.nio.file.Files;
import java.nio.file.Paths;
import org.junit.jupiter.api.Test;

class MaxAreaTest {
  private final MaxArea maxArea = new MaxArea();

  @Test
  void test1() {
    int[] input = new int[] {1, 8, 6, 2, 5, 4, 8, 3, 7};
    var expected = 49;
    var actual = maxArea.maxArea(input);

    assertEquals(expected, actual);
  }

  @Test
  void test2() {
    int[] input = readFile("src/test/resources/leet/max-area-1.txt");

    var expected = 49;
    var actual = maxArea.maxArea(input);

    assertEquals(expected, actual);
  }

  @Test
  void test3() {
    int[] input = readFile("src/test/resources/leet/max-area-2.txt");
    System.out.println(input.length);

    var expected = 49;
    var actual = maxArea.maxArea(input);

    assertEquals(expected, actual);
  }

  private int[] readFile(String path) {
    try {
      byte[] b = Files.readAllBytes(Paths.get(path));
      int[] r = new int[b.length];
      for (int i = 0; i < b.length; i++) {
        r[i] = b[i];
      }
      return r;
    } catch(Exception e) {
      throw new RuntimeException(e);
    }
  }
}