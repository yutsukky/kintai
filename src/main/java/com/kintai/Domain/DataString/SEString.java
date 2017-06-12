package com.kintai.Domain.DataString;

public class SEString {
    private HMString start;
    private HMString end;

    public SEString(String start,String end){
        this.start = new HMString(start);
        this.end = new HMString(end);
    }

    public HMString getStartString() {
        return start;
    }

    public HMString getEndString() {
        return end;
    }
}
