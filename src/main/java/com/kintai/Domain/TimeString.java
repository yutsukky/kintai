package com.kintai.Domain;

public class TimeString {
    private String value;

    public TimeString(String value){
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public Integer getLength(){
        return value.length();
    }
}
