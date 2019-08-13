package com.tavisca.workshop.galaxy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MgttgTest {

    @Test
    public void ConversionOfRomanToInteger()
    {
      RomanToIntegerParse conR_T=new RomanToIntegerParse();
      assertEquals(1,conR_T.convert('I'));
    }
    @Test
    public void CanSplitWordAndRoman()
    {
        SplitWordAndRoman conS_W_R= new  SplitWordAndRoman();
        assertArrayEquals(new String[]{"glob","I"},conS_W_R.parse("glob is I"));
    }
    @Test
    public void CanSplitWordsMissingItemsAndCredits(){
        SplitWordMissingItemsAndCredits conS_W_I_C= new SplitWordMissingItemsAndCredits();
        assertArrayEquals(new String[]{"2","Silver","34",},conS_W_I_C.parse("glob glob Silver is 34 Credits"));
    }
    @Test
    public void ConversionOfWordToRoman()
    {
        WordToRomanParse conW_R= new WordToRomanParse();
        conW_R.parse1("glob is I");
        conW_R.parse1("prok is V");
        conW_R.parse1("pish is X");
        conW_R.parse1("tegj is L");

       assertEquals("I",conW_R.MappedValue("glob"));
    }
    @Test
    public void RomanToIntegerSumCalculator(){
        RomanToIntegerValueCalculator romanToIntegerSumCalculator=new  RomanToIntegerValueCalculator();
        assertEquals(1007,romanToIntegerSumCalculator.parse("IIMV"));
    }
    @Test
    public void CalculatingMissingItemValue(){
        MissingItemValueCalculator MissingItemValue=new MissingItemValueCalculator();
        //SplitWordMissingItemsAndCredits conS_W_I_C= new SplitWordMissingItemsAndCredits();
        //conS_W_I_C.parse("glob glob Silver is 34 Credits");
        assertEquals(17,MissingItemValue.parse("glob glob Silver is 34 Credits"));
    }
   /* @Test
    public void ForHowmuchAndHowManyStatement(){

            ForHowmuchAndHowManyStatement vaueOfwordsInINteger= new ForHowmuchAndHowManyStatement();
        WordToRomanParse conW_R= new WordToRomanParse();

        conW_R.parse1("glob is I");
        conW_R.parse1("prok is V");
        conW_R.parse1("pish is X");
        conW_R.parse1("tegj is L");

     assertArrayEquals(new String[]{"pish","tegj","glob","glob","57"},vaueOfwordsInINteger.value("how much is pish tegj glob glob ?"));
    }*/
}