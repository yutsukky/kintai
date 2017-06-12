package com.kintai.Domain.DataString;

import java.util.HashMap;

public class DomainString {
    private StartString startString;
    private EndString endString;

    public DomainString(String key,String[] array){
        startString = new StartString(key,array[0]);
        endString = new EndString(array[1],array[2]);
    }

    public StartString getStartString() {
        return startString;
    }

    public EndString getEndString() {
        return endString;
    }
}
