package com.tavisca.workshop.galaxy;

import java.util.HashMap;

public class WordToRomanParse {
    public void parse1(String X) {
        String[] split= X.split(" ");
        wordAndRoman(split);
    }


    private static HashMap<String, String> change
            =new HashMap<>();
        private void wordAndRoman(String[] split) {
            change.put(split[0],split[2]);
        }
        public String MappedValue(String word){
            return change.get(word);
        }

}
