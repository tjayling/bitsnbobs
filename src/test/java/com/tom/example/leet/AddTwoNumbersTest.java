package com.tom.example.leet;

import static org.junit.jupiter.api.Assertions.*;

import com.tom.example.leet.AddTwoNumbers.ListNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AddTwoNumbersTest {
  private AddTwoNumbers addTwoNumbers;

  @BeforeEach
  void setup() {
    addTwoNumbers = new AddTwoNumbers();
  }

  @Test
  void t1() {
    var l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
    var l2 = new ListNode(5, new ListNode(6, new ListNode(4)));

    var expected = new ListNode(7, new ListNode(0, new ListNode(8)));
    var actual = addTwoNumbers.addTwoNumbers(l1, l2);

    while (expected != null) {
      assertEquals(expected.val, actual.val);
      expected = expected.next;
      actual = actual.next;
    }
  }

}