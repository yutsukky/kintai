package com.kintai.Domain.DataString;

import com.kintai.Infra.Behind;

public class BehindToDomain {
    private YMDString ymdString;
    private SEString seString;

    public BehindToDomain(Behind behind){
        ymdString = new YMDString(behind.getFirst());
        seString = new SEString(behind.getSecond(),behind.getThird());
    }

    public YMDString getYmdString() {
        return ymdString;
    }

    public SEString getSeString() {
        return seString;
    }

    public HMString getStartString(){
        return seString.getStartString();
    }

    public HMString getEndString(){
        return seString.getEndString();
    }
}
