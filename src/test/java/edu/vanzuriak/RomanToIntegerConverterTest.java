package edu.vanzuriak;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/*
    @author  olexander
    @project testing-lab_3_4
    @class   RomanToIntegerConverterTest
    @version 1.0.0
    @since 3/29/25 - 16 - 52
*/

class RomanToIntegerConverterTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void whenRoman_III_thenArabic_3() {
        Assertions.assertEquals(3, RomanToIntegerConverter.convertToInteger("III"));
    }

    @Test
    void whenRoman_V_thenArabic_5() {
        Assertions.assertEquals(5, RomanToIntegerConverter.convertToInteger("V"));
    }

    @Test
    void whenRoman_IV_thenArabic_4() {
        Assertions.assertEquals(4, RomanToIntegerConverter.convertToInteger("IV"));
    }

    @Test
    void whenRoman_VIII_thenArabic_8() {
        Assertions.assertEquals(8, RomanToIntegerConverter.convertToInteger("VIII"));
    }

    @Test
    void whenRoman_IX_thenArabic_9() {
        Assertions.assertEquals(9, RomanToIntegerConverter.convertToInteger("IX"));
    }

    @Test
    void whenRoman_X_thenArabic_10() {
        Assertions.assertEquals(10, RomanToIntegerConverter.convertToInteger("X"));
    }

    @Test
    void whenRoman_XIII_thenArabic_13() {
        Assertions.assertEquals(13, RomanToIntegerConverter.convertToInteger("XIII"));
    }

    @Test
    void whenRoman_XV_thenArabic_15() {
        Assertions.assertEquals(15, RomanToIntegerConverter.convertToInteger("XV"));
    }

    @Test
    void whenRoman_XVIII_thenArabic_18() {
        Assertions.assertEquals(18, RomanToIntegerConverter.convertToInteger("XVIII"));
    }

    @Test
    void whenRoman_XX_thenArabic_20() {
        Assertions.assertEquals(20, RomanToIntegerConverter.convertToInteger("XX"));
    }

    @Test
    void whenRoman_XXV_thenArabic_25() {
        Assertions.assertEquals(25, RomanToIntegerConverter.convertToInteger("XXV"));
    }

    @Test
    void whenRoman_XXVIII_thenArabic_28() {
        Assertions.assertEquals(28, RomanToIntegerConverter.convertToInteger("XXVIII"));
    }

    @Test
    void whenRoman_XXX_thenArabic_30() {
        Assertions.assertEquals(30, RomanToIntegerConverter.convertToInteger("XXX"));
    }

    @Test
    void whenRoman_XXXV_thenArabic_35() {
        Assertions.assertEquals(35, RomanToIntegerConverter.convertToInteger("XXXV"));
    }

    @Test
    void whenRoman_XXXVIII_thenArabic_38() {
        Assertions.assertEquals(38, RomanToIntegerConverter.convertToInteger("XXXVIII"));
    }

    @Test
    void whenRoman_XL_thenArabic_40() {
        Assertions.assertEquals(40, RomanToIntegerConverter.convertToInteger("XL"));
    }

    @Test
    void whenRoman_XLIV_thenArabic_44() {
        Assertions.assertEquals(44, RomanToIntegerConverter.convertToInteger("XLIV"));
    }

    @Test
    void whenRoman_XLIX_thenArabic_49() {
        Assertions.assertEquals(49, RomanToIntegerConverter.convertToInteger("XLIX"));
    }

    @Test
    void whenRoman_L_thenArabic_50() {
        Assertions.assertEquals(50, RomanToIntegerConverter.convertToInteger("L"));
    }

    @Test
    void whenRoman_LVIII_thenArabic_58() {
        Assertions.assertEquals(58, RomanToIntegerConverter.convertToInteger("LVIII"));
    }

    @Test
    void whenRoman_XC_thenArabic_90() {
        Assertions.assertEquals(90, RomanToIntegerConverter.convertToInteger("XC"));
    }

    @Test
    void whenRoman_C_thenArabic_100() {
        Assertions.assertEquals(100, RomanToIntegerConverter.convertToInteger("C"));
    }

    @Test
    void whenRoman_CL_thenArabic_150() {
        Assertions.assertEquals(150, RomanToIntegerConverter.convertToInteger("CL"));
    }

    @Test
    void whenRoman_CC_thenArabic_200() {
        Assertions.assertEquals(200, RomanToIntegerConverter.convertToInteger("CC"));
    }

    @Test
    void whenRoman_M_thenArabic_1000() {
        Assertions.assertEquals(1000, RomanToIntegerConverter.convertToInteger("M"));
    }
}