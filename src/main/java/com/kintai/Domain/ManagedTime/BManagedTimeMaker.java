package com.kintai.Domain.ManagedTime;

import com.kintai.Domain.WorkTime.WorkTime;
import com.kintai.Domain.WorkTime.WorkTimeFactory;

public class BManagedTimeMaker {
    public BManagedTime run(String raw1,String raw2){
        WorkTime workTime = new WorkTimeFactory().run(raw1,raw2);
        return new BCalculator().run(workTime);
    }
}
