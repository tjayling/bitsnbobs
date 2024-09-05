package com.tom.example.leet;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class AddTwoNumbers {
  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    return addTwoNumbers(l1, l2, 0);
  }

  private ListNode addTwoNumbers(ListNode l1, ListNode l2, int carry) {
    int c = 0;

    int r = l1.val + l2.val + carry;

    if (r > 9) {
      c = 1;
      r %= 10;
    }

    if (l1.next != null && l2.next != null) {
      return new ListNode(r, addTwoNumbers(l1.next, l2.next, c));
    } else if (l1.next == null && l2.next != null) {
      return new ListNode(r, addTwoNumbers(new ListNode(0), l2.next, c));
    } else if (l1.next != null) {
      return new ListNode(r, addTwoNumbers(l1.next, new ListNode(0), c));
    } else if (c > 0) {
      return new ListNode(r, addTwoNumbers(new ListNode(0), new ListNode(0), c));
    } else {
      return new ListNode(r);
    }
  }

  public static class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
      this.val = val;
    }

    ListNode(int val, ListNode next) {
      this.val = val;
      this.next = next;
    }
  }
}