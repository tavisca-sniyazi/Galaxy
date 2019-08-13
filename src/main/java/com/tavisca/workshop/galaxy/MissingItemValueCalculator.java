package com.tavisca.workshop.galaxy;

public class MissingItemValueCalculator {
    SplitWordMissingItemsAndCredits obj = new SplitWordMissingItemsAndCredits();
    WordToRomanParse obj1 = new WordToRomanParse();
    RomanToIntegerValueCalculator obj2=new RomanToIntegerValueCalculator();

    public int parse(String s) {
        obj.parse(s);
        String[] A = obj.strL_S;
        obj1.parse1("glob is I");
        String RomanString = "";
        for (int i = 0; i < A.length - 1; i++) {

            RomanString += obj1.MappedValue(A[i]);

        }
        int SumValueCalculated=obj2.parse(RomanString);
        int missingDigitValue=Integer.parseInt(obj.strR_S[0])/SumValueCalculated;
        return missingDigitValue;
    }
}
