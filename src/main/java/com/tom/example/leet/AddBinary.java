package com.tom.example.leet;

public class AddBinary {
  public String addBinary(String a, String b) {
    var l = Math.max(a.length(), b.length());
    var bitA = makeBit(a, l);
    var bitB = makeBit(b, l);

    return unwrapBit(addBinary(bitA, bitB, new Bit('0')));
  }

  private Bit addBinary(Bit a, Bit b, Bit carry) {
    char v = '0';
    if (a.isOn() && b.isOn()) {
      v = carry.val;
      carry = new Bit('1');
    } else if (a.isOn() || b.isOn()) {
      if (carry.isOn()) {
        carry = new Bit('1');
      } else if (carry.isOff()) {
        v = '1';
        carry = new Bit('0');
      }
    } else {
      v = carry.val;
      carry = new Bit('0');
    }
    if (a.hasPrev() && b.hasPrev()) {
      return new Bit(v, addBinary(a.prev, b.prev, carry));
    } else if (carry.isOn()) {
      return new Bit(v, carry);
    } else {
      return new Bit(v);
    }
  }

  private Bit makeBit(String s, int l) {
    return makeBit(s, l, 0);
  }

  private Bit makeBit(String s, int l, int d) {
    char val = d >= s.length() ? '0' : s.charAt(s.length() - d - 1);

    if (d < l - 1) {
      return new Bit(val, makeBit(s, l, d + 1));
    } else {
      return new Bit(val);
    }
  }

  private String unwrapBit(Bit b) {
    if (b.hasPrev()) {
      return unwrapBit(b.prev) + b.val;
    }
    return String.valueOf(b.val);
  }

  private static class Bit {
    char val;
    Bit prev;

    public Bit(char val) {
      this.val = val;
    }

    public Bit(char val, Bit prev) {
      this.val = val;
      this.prev = prev;
    }

    public boolean isOn() {
      return val == '1';
    }

    public boolean isOff() {
      return val == '0';
    }

    public boolean hasPrev() {
      return (prev != null);
    }
  }
}
