package com.kintai.Domain.ManagedTime;

import com.kintai.Domain.DataString.DomainString;
import com.kintai.Domain.DataString.YMDHMString;
import com.kintai.Domain.Ymd.YMD;
import com.kintai.Domain.Ymd.YMDFactory;

public class BManagedInfo {
    private YMD ymd;
    private ManagedTime managedTime;

    public BManagedInfo(DomainString domainString){
        YMDHMString ymdhmString = domainString.getStartString();
        ymd = new YMDFactory().run(ymdhmString.getYmdString());
        managedTime = new BManagedTimeCalculator().calculate(domainString);
    }
}
