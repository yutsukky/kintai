package com.kintai.Domain.ManagedTime;

import com.kintai.Domain.DataString.DomainString;
import com.kintai.Domain.DataString.EndString;
import com.kintai.Domain.DataString.StartString;
import com.kintai.Domain.HM.HM;
import com.kintai.Domain.HM.HMFactory;
import com.kintai.Domain.WorkInfo;

public class BManagedTimeCalculator {
    public ManagedTime calculate(DomainString domainString){
        StartString startString = domainString.getStartString();
        HM startHm = new HMFactory().run(startString.getHmString());
        EndString endString = domainString.getEndString();
        HM endHm = new HMFactory().run(endString.getHmString());
        ActualTime actualTime = new BActualCalculator().calculate(startHm,endHm);
        OverTime overTime = new BOverCalclator().calculate(startHm,endHm,actualTime);
        return new ManagedTime(actualTime,overTime);
    }
}
