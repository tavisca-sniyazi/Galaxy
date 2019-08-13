package com.tavisca.workshop.galaxy;

public class RomanToIntegerValueCalculator {
    RomanToIntegerParse obj=new RomanToIntegerParse();

    public int parse(String X) {
        char[] strOfRoman=X.toCharArray();
        int sum=0;
        for (int i=0;i<strOfRoman.length;i++){
            int strRomanToInteger= obj.convert(strOfRoman[i]);
            sum+=strRomanToInteger;
        }
     return sum;
    }
}
