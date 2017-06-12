package com.kintai.Domain.ManagedTime;

import com.kintai.Domain.DataString.DomainString;
import com.kintai.Domain.Ymd.YMDFactoryForTotal;
import com.kintai.Domain.Ymd.YMDForTotal;

public class BManagedInfo {
    private YMDForTotal ymdForTotal;
    private ManagedTime managedTime;

    public BManagedInfo(DomainString domainString){
        ymdForTotal = new YMDFactoryForTotal().run(domainString.getStartString());
        managedTime = new BManagedTimeCalculator().calculate(domainString);
    }
}
