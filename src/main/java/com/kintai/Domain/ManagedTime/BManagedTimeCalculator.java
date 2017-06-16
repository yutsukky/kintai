package com.kintai.Domain.ManagedTime;

import com.kintai.Domain.EndYMDHM;
import com.kintai.Domain.StartYMDHM;

public class BManagedTimeCalculator {
    public ManagedTime calculate(StartYMDHM startYMDHM,EndYMDHM endYMDHM){
        ActualTime actualTime = new BActualCalculator().calculate(startYMDHM,endYMDHM.limited(startYMDHM));
        OverTime overTime = new BOverCalclator().calculate(actualTime);
        return new ManagedTime(actualTime,overTime);
    }
}
