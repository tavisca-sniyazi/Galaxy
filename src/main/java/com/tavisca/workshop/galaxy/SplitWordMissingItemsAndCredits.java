package com.tavisca.workshop.galaxy;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SplitWordMissingItemsAndCredits {
    //WordToRomanParse obj=new WordToRomanParse();
    //String WordKaRoman;
    public String[] str1;
    public  String[] strL_S;
    public String[] strR_S;

    public String[] parse(String X) {
         str1 = X.split(" is ");
         strL_S = str1[0].split(" ");
         strR_S = str1[1].split(" ");

        // int NumberOfWords = str1.length-1;
      //  String newStringL_S= Arrays.toString(strL_S);
        //obj.parse1(newStringL_S);
         //for (int i=0;i<strL_S.length-2;i++) {
           //  WordKaRoman = obj.MappedValue(strL_S[i]);
         //}

             return new String[]{(strL_S.length-1)+"",strL_S[strL_S.length-1],strR_S[0]};
    }



}



