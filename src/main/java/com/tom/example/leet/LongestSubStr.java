package com.tom.example.leet;

import java.util.HashSet;
import java.util.Set;

public class LongestSubStr {
  public int lengthOfLongestSubstring(String s) {
    int r = 0;
    for (int i = 0; i < s.length(); i++) {
      Set<Character> set = new HashSet<>();
      int j = i;
      while(j < s.length() && set.add(s.charAt(j++))) {
        r = Math.max(r, set.size());
      }
    }
    return r;
  }
}
