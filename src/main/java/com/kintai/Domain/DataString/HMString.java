package com.kintai.Domain.DataString;

public class HMString {
    private TimeString startString;
    private TimeString endString;

    public HMString(TimeString startString, TimeString endString){
        this.startString = startString;
        this.endString = endString;
    }

    public TimeString getStartString() {
        return startString;
    }

    public TimeString getEndString() {
        return endString;
    }
}
