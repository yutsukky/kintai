package com.kintai.Domain;

import com.kintai.Domain.DataString.HMString;
import com.kintai.Domain.DataString.TimeString;
import com.kintai.Domain.DataString.YMDString;
import com.kintai.Infra.Behind;

public class BehindToDomain {
    private YMDString ymdString;
    private HMString hmString;

    public BehindToDomain(Behind behind){
        ymdString = new YMDString(behind.getFirst());
        TimeString startString = new TimeString(behind.getSecond());
        TimeString endString = new TimeString(behind.getThird());
        hmString = new HMString(startString,endString);
    }

    public YMDString getYmdString() {
        return ymdString;
    }

    public HMString getSeString() {
        return hmString;
    }

    public TimeString getStartString(){
        return hmString.getStartString();
    }

    public TimeString getEndString(){
        return hmString.getEndString();
    }
}
