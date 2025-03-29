package edu.vanzuriak;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/*
    @author  olexander
    @project testing-lab_3_4
    @class   IntegerToRomanConverterTest
    @version 1.0.0
    @since 3/29/25 - 16 - 27
*/

class IntegerToRomanConverterTest {

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @Test
    void whenArabic_3_thenRoman_III() {
        Assertions.assertEquals("III", IntegerToRomanConverter.convertToRoman(3));
    }

    @Test
    void whenArabic_5_thenRoman_V() {
        Assertions.assertEquals("V", IntegerToRomanConverter.convertToRoman(5));
    }

    @Test
    void whenArabic_4_thenRoman_IV() {
        Assertions.assertEquals("IV", IntegerToRomanConverter.convertToRoman(4));
    }

    @Test
    void whenArabic_8_thenRoman_VIII() {
        Assertions.assertEquals("VIII", IntegerToRomanConverter.convertToRoman(8));
    }

    @Test
    void whenArabic_9_thenRoman_IX() {
        Assertions.assertEquals("IX", IntegerToRomanConverter.convertToRoman(9));
    }

    @Test
    void whenArabic_10_thenRoman_X() {
        Assertions.assertEquals("X", IntegerToRomanConverter.convertToRoman(10));
    }

    @Test
    void whenArabic_13_thenRoman_XIII() {
        Assertions.assertEquals("XIII", IntegerToRomanConverter.convertToRoman(13));
    }

    @Test
    void whenArabic_15_thenRoman_XV() {
        Assertions.assertEquals("XV", IntegerToRomanConverter.convertToRoman(15));
    }
    @Test
    void whenArabic_18_thenRoman_XVIII() {
        Assertions.assertEquals("XVIII", IntegerToRomanConverter.convertToRoman(18));
    }

    @Test
    void whenArabic_20_thenRoman_XX() {
        Assertions.assertEquals("XX", IntegerToRomanConverter.convertToRoman(20));
    }

    @Test
    void whenArabic_25_thenRoman_XXV() {
        Assertions.assertEquals("XXV", IntegerToRomanConverter.convertToRoman(25));
    }

    @Test
    void whenArabic_28_thenRoman_XXVIII() {
        Assertions.assertEquals("XXVIII", IntegerToRomanConverter.convertToRoman(28));
    }

    @Test
    void whenArabic_30_thenRoman_XXX() {
        Assertions.assertEquals("XXX", IntegerToRomanConverter.convertToRoman(30));
    }

    @Test
    void whenArabic_35_thenRoman_XXXV() {
        Assertions.assertEquals("XXXV", IntegerToRomanConverter.convertToRoman(35));
    }

    @Test
    void whenArabic_38_thenRoman_XXXVIII() {
        Assertions.assertEquals("XXXVIII", IntegerToRomanConverter.convertToRoman(38));
    }

    @Test
    void whenArabic_40_thenRoman_XL() {
        Assertions.assertEquals("XL", IntegerToRomanConverter.convertToRoman(40));
    }

    @Test
    void whenArabic_44_thenRoman_XLIV() {
        Assertions.assertEquals("XLIV", IntegerToRomanConverter.convertToRoman(44));
    }

    @Test
    void whenArabic_49_thenRoman_XLIX() {
        Assertions.assertEquals("XLIX", IntegerToRomanConverter.convertToRoman(49));
    }

    @Test
    void whenArabic_50_thenRoman_L() {
        Assertions.assertEquals("L", IntegerToRomanConverter.convertToRoman(50));
    }

    @Test
    void whenArabic_58_thenRoman_LVIII() {
        Assertions.assertEquals("LVIII", IntegerToRomanConverter.convertToRoman(58));
    }

    @Test
    void whenArabic_90_thenRoman_XC() {
        Assertions.assertEquals("XC", IntegerToRomanConverter.convertToRoman(90));
    }

    @Test
    void whenArabic_100_thenRoman_C() {
        Assertions.assertEquals("C", IntegerToRomanConverter.convertToRoman(100));
    }

    @Test
    void whenArabic_150_thenRoman_CL() {
        Assertions.assertEquals("CL", IntegerToRomanConverter.convertToRoman(150));
    }

    @Test
    void whenArabic_200_thenRoman_CC() {
        Assertions.assertEquals("CC", IntegerToRomanConverter.convertToRoman(200));
    }

    @Test
    void whenArabic_1000_thenRoman_M() {
        Assertions.assertEquals("M", IntegerToRomanConverter.convertToRoman(1000));
    }
}