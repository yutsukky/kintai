package com.kintai.input;

import com.kintai.Behind;
import com.kintai.WorkTime.WorkTime;
import com.kintai.WorkTime.WorkTimeTransform;
import com.kintai.Ymd.YMD;
import com.kintai.Ymd.YMDTransform;

public class Divide {
    private YMD ymd;
    private WorkTime worktime;

    public Divide(Behind behind){
        try {
            this.ymd = new YMDTransform().run(behind.getFirst());
            this.worktime = new WorkTimeTransform().run(behind.getSecond(),behind.getThird());
        }
        catch(ArrayIndexOutOfBoundsException e){
            throw new RuntimeException("第二引数以降が不正です．",e);
        }
    }

    public YMD getYmd() {
        return ymd;
    }

    public WorkTime getWorktime() {
        return worktime;
    }
}
