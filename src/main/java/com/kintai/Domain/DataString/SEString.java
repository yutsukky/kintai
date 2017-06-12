package com.kintai.Domain.DataString;

public class SEString {
    private TimeString start;
    private TimeString end;

    public SEString(String start,String end){
        this.start = new TimeString(start);
        this.end = new TimeString(end);
    }

    public TimeString getStartString() {
        return start;
    }

    public TimeString getEndString() {
        return end;
    }
}
