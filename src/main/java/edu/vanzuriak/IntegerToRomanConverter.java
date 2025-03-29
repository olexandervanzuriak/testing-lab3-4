package edu.vanzuriak;

/*
    @author  olexander
    @project testing-lab_3_4
    @class   IntegerToRomanConverter
    @version 1.0.0
    @since 3/29/25 - 16 - 22
*/

public class IntegerToRomanConverter {
    public enum RomanNumeral {
        M(1000), CM(900), D(500), CD(400), C(100),
        XC(90), L(50), XL(40), X(10), IX(9), V(5), IV(4), I(1);

        private final int value;

        RomanNumeral(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }

    public static String convertToRoman(int number) {
        if (number <= 0 || number > 3999) {
            throw new IllegalArgumentException("Number must be between 1 and 3999");
        }

        StringBuilder roman = new StringBuilder();
        for (RomanNumeral numeral : RomanNumeral.values()) {
            while (number >= numeral.getValue()) {
                roman.append(numeral.name());
                number -= numeral.getValue();
            }
        }
        return roman.toString();
    }
}
