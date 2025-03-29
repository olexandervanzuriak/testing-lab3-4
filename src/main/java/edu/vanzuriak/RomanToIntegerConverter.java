package edu.vanzuriak;

/*
    @author  olexander
    @project testing-lab_3_4
    @class   RomanToIntegerConverter
    @version 1.0.0
    @since 3/29/25 - 16 - 25
*/

public class RomanToIntegerConverter {
    public static int convertToInteger(String roman) {
        int result = 0;
        int i = 0;
        while (i < roman.length()) {
            for (IntegerToRomanConverter.RomanNumeral numeral : IntegerToRomanConverter.RomanNumeral.values()) {
                if (roman.startsWith(numeral.name(), i)) {
                    result += numeral.getValue();
                    i += numeral.name().length();
                    break;
                }
            }
        }
        return result;
    }
}
