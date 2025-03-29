package edu.vanzuriak;

/*
    @author  olexander
    @project testing-lab_3_4
    @class   Main
    @version 1.0.0
    @since 3/29/25 - 16 - 22
*/
public class Main {
    public static void main(String[] args) {
        int number = 1994;
        System.out.println(IntegerToRomanConverter.convertToRoman(number));
        String roman = "VIII";
        System.out.println(RomanToIntegerConverter.convertToInteger(roman));
    }
}
