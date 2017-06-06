package com.kintai.Domain.ManagedTime;

import com.kintai.Domain.WorkTime.WorkTime;

public class BCalculator {
    public BManagedTime run(WorkTime workTime){
        ActualTime actualTime = new BActualCalculator().run(workTime);
        OverTime overTime = new BOverCalclator().run(workTime);
        return new BManagedTime(actualTime,overTime);
    }
}
