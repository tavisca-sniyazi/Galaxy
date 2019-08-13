package com.tavisca.workshop.galaxy;

import java.util.HashMap;

public class SplitWordAndRoman {

    public String[] parse(String X) {

    String[] split= X.split(" ");
    return new String[]{split[0],split[2]};
    }

}
