package com.tom.example.challenges;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CamelToeTest {
    @Test
    public void testSomeUnderscoreLowerStart() {
      String input = "the_Stealth_Warrior";
      System.out.println("input: "+input);      
      assertEquals("theStealthWarrior", CamelToe.toCamelCase(input));
    }

    @Test
    public void testSomeDashLowerStart() {
      String input = "the-Stealth-Warrior";
      System.out.println("input: "+input);      
      assertEquals("theStealthWarrior", CamelToe.toCamelCase(input));
    }

    @Test
    public void testSomeDashLowerStartBum() {
      String input = "the-stealth-warrior";
      System.out.println("input: "+input);
      assertEquals("theStealthWarrior", CamelToe.toCamelCase(input));
    }
}