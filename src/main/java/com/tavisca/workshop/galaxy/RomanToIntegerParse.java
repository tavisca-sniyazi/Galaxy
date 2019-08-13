package com.tavisca.workshop.galaxy;

import java.util.HashMap;

public class RomanToIntegerParse {


    private static HashMap<Character, Integer> change
            =new HashMap<>(){{
        put('I',1);
        put('V',5);
        put('X',10);
        put('L',50);
        put('C',100);
        put('D',500);
        put('M',1000);
    }};

    public int convert(char roman) {
 return  (change.get(roman));
    }
}
