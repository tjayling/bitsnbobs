package com.tom.example.challenges;

import java.util.ArrayDeque;
import java.util.Map;

public class BraceChecker {

  public boolean isValid(String braces) {
    ArrayDeque<Character> queue = new ArrayDeque<>();

    Map<Character, Character> pairs = Map.of(
        '[', ']',
        '{', '}',
        '(', ')'
    );

    for (char c : braces.toCharArray()) {
      if (pairs.containsKey(c)) {
        queue.push(c);
      } else if(queue.isEmpty()) {
        return false;
      } else if (pairs.get(queue.peek()) == c) {
        queue.pop();
      } else {
        return false;
      }
    }
    return queue.isEmpty();
  }
}