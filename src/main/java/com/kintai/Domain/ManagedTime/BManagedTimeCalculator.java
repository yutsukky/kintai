package com.kintai.Domain.ManagedTime;

import com.kintai.Domain.DataString.DomainString;
import com.kintai.Domain.DataString.EndString;
import com.kintai.Domain.DataString.StartString;
import com.kintai.Domain.DataString.YMDHMString;
import com.kintai.Domain.HM.*;

public class BManagedTimeCalculator {
    public ManagedTime calculate(DomainString domainString){
        YMDHMString startString = domainString.getStartString();
        HM startHm = new HMFactory().run(startString.getHmString());
        YMDHMString endString = domainString.getEndString();
        HM endHm = new HMFactory().run(endString.getHmString());
        ActualTime actualTime = new BActualCalculator().calculate(startHm,endHm);
        OverTime overTime = new BOverCalclator().calculate(actualTime);
        return new ManagedTime(actualTime,overTime);
    }
}
