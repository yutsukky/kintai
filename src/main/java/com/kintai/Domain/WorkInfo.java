package com.kintai.Domain;

import com.kintai.Infra.Behind;
import com.kintai.Domain.WorkTime.WorkTime;
import com.kintai.Domain.WorkTime.WorkTimeTransform;
import com.kintai.Domain.Ymd.YMD;
import com.kintai.Domain.Ymd.YMDTransform;

public class WorkInfo {
    private YMD ymd;
    private WorkTime worktime;

    public WorkInfo(Behind behind){
        this.ymd = new YMDTransform().run(behind.getFirst());
        this.worktime = new WorkTimeTransform().run(behind.getSecond(),behind.getThird());
    }

    public YMD getYmd() {
        return ymd;
    }

    public WorkTime getWorktime() {
        return worktime;
    }
}
