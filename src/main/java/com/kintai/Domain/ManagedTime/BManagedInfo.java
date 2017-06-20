package com.kintai.Domain.ManagedTime;

import com.kintai.Domain.DataString.DomainString;
import com.kintai.Domain.DataString.YMDHMString;
import com.kintai.Domain.EndYMDHM;
import com.kintai.Domain.ManagedEndYMDHMFactory;
import com.kintai.Domain.ManagedStartYMDHMFactory;
import com.kintai.Domain.StartYMDHM;
import com.kintai.Domain.Ymd.YMD;
import com.kintai.Domain.Ymd.YMDFactory;

public class BManagedInfo {
    private final YMD ymd;
    private final ManagedTime managedTime;

    public BManagedInfo(DomainString domainString){
        YMDHMString ymdhmString = domainString.getStartString();
        ymd = new YMDFactory().run(ymdhmString.getYmdString());
        StartYMDHM startYMDHM = new ManagedStartYMDHMFactory().run(domainString.getStartString());
        EndYMDHM endYMDHM = new ManagedEndYMDHMFactory().run(domainString.getEndString());
        managedTime = new BManagedTimeCalculator().calculate(startYMDHM,endYMDHM);
    }

    public ManagedTime getManagedTime() {
        return managedTime;
    }
}
