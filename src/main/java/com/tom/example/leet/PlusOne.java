package com.tom.example.leet;

public class PlusOne {
  public int[] plusOne(int[] digits) {
    return recursive(digits, digits.length - 1, 1);
  }

  private int[] recursive(int[] digits, int index, int carry) {
    if (carry == 0) {
      return digits;
    }

    if (digits[index] == 9) {
      if (index == 0) {
        digits[0] = 0;
        var r = new int[digits.length + 1];
        r[0] = 1;
        System.arraycopy(digits, 0, r, 1, digits.length);
        return r;
      } else {
        digits[index] = 0;
        return recursive(digits, index - 1, 1);
      }
    }

    digits[index] += carry;
    return digits;
  }
}
