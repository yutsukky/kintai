package com.kintai.Domain.ManagedTime;

import com.kintai.Domain.WorkInfo;

public class BManagedTimeCalculator {
    public ManagedTime calculate(WorkInfo workInfo){
        ActualTime actualTime = new BActualCalculator().calculate(workInfo);
        OverTime overTime = new BOverCalclator().calculate(workInfo);
        return new ManagedTime(actualTime,overTime);
    }
}
