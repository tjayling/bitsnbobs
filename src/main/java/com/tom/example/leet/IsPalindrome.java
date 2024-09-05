package com.tom.example.leet;

public class IsPalindrome {
  public boolean isPalindrome(int x) {
    char[] s = Integer.toString(x).toCharArray();
    int left = 0, right = s.length - 1;
    while (left < right) {
      if (s[left++] != s[right--]) {
        return false;
      }
    }
    return true;
  }
}
