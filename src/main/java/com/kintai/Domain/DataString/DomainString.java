package com.kintai.Domain.DataString;

public class DomainString {
    private final YMDHMString startString;
    private final YMDHMString endString;

    public DomainString(String key,String[] array){
        startString = new YMDHMString(key,array[0]);
        endString = new YMDHMString(array[1],array[2]);
    }

    public YMDHMString getStartString() {
        return startString;
    }

    public YMDHMString getEndString() {
        return endString;
    }
}
