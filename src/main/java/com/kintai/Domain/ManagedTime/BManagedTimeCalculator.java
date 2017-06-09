package com.kintai.Domain.ManagedTime;

import com.kintai.Domain.WorkInfo;

public class BManagedTimeCalculator {
    public BManagedTime calculate(WorkInfo workInfo){
        ActualTime actualTime = new BActualCalculator().calculate(workInfo);
        OverTime overTime = new BOverCalclator().calculate(workInfo);
        return new BManagedTime(actualTime,overTime);
    }
}
