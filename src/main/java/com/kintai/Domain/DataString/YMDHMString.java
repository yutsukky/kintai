package com.kintai.Domain.DataString;

public class YMDHMString {
    private final YMDString ymdString;
    private final HMString hmString;

    public YMDHMString(String ymdString,String hmString){
        this.ymdString = new YMDString(ymdString);
        this.hmString = new HMString(hmString);
    }

    public YMDString getYmdString(){
        return ymdString;
    }

    public HMString getHmString(){
        return hmString;
    }

    public String getYMDStringValue(){
        return ymdString.getValue();
    }

    public Integer getYMDStringLength(){
        return ymdString.getLength();
    }

    public String getHMStringValue(){
        return hmString.getValue();
    }

    public Integer getHMStringLength(){
        return hmString.getLength();
    }
}
