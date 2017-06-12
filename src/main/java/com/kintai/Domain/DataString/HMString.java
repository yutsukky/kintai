package com.kintai.Domain.DataString;

public class HMString {
    private String value;

    public HMString(String value){
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public Integer getLength(){
        return value.length();
    }
}
