package com.kintai.Domain;

import com.kintai.Domain.DataString.SEString;
import com.kintai.Domain.DataString.TimeString;
import com.kintai.Domain.DataString.YMDString;
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

    public TimeString getStartString(){
        return seString.getStartString();
    }

    public TimeString getEndString(){
        return seString.getEndString();
    }
}
