/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.carballeira.katas.romannumerals.test;

import com.carballeira.katas.romannumerals.RomanNumerals;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author admin
 */
public class TestRomanNumerals{
    
    public TestRomanNumerals() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void test1esI() {
        RomanNumerals rm = new RomanNumerals();
        String result=rm.getRoman(1);
        assertEquals("I", result);
    }
    
    @Test
    public void test2esII() {
        RomanNumerals rm = new RomanNumerals();
        String result=rm.getRoman(2);
        assertEquals("II", result);
    }
    
    @Test
    public void test3esIII() {
        RomanNumerals rm = new RomanNumerals();
        String result=rm.getRoman(3);
        assertEquals("III", result);
    }
    
    @Test
    public void test5esV() {
        RomanNumerals rm = new RomanNumerals();
        String result=rm.getRoman(5);
        assertEquals("V", result);
    }
}
