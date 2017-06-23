package com.kintai.Domain.DataString;

public class YMDString {
    private final String value;

    public YMDString(String value){
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public Integer getLength(){
        return value.length();
    }
}
