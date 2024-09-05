package com.tom.example.leet;

public class AddBinaryBetter {
  public String addBinary(String a, String b) {
    int x = a.length() - 1;
    int y = b.length() - 1;
    int c = 0;

    StringBuilder r = new StringBuilder();

    while (x > 0 || y > 0) {
      var b1 = a.charAt(x--) == '1' ? 1 : 0;
      var b2 = b.charAt(y--) == '1' ? 1 : 0;

      int v = b1 + b2 + c;
      if (v == 1) {
        r.insert(0, '1');
        c = 0;
      } else if (v == 2) {
        r.insert(0, '0');
        c = 1;
      } else if (v == 3) {
        r.insert(0, '1');
        c = 1;
      }
    }
    return r.toString();
  }
}
