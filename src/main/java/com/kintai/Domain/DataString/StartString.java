package com.kintai.Domain.DataString;

public class StartString {
    private YMDString ymdString;
    private HMString hmString;

    public StartString(String ymd,String hm){
        ymdString = new YMDString(ymd);
        hmString = new HMString(hm);
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
