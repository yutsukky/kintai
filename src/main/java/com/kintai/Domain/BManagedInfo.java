package com.kintai.Domain;

import com.kintai.Domain.ManagedTime.BManagedTime;
import com.kintai.Domain.WorkTime.WorkTime;
import com.kintai.Domain.WorkTime.WorkTimeTransform;
import com.kintai.Domain.Ymd.YMDFactoryForTotal;
import com.kintai.Domain.Ymd.YMDForTotal;
import com.kintai.Infra.Behind;

public class BManagedInfo {
    private YMDForTotal ymd;
    private BManagedTime bManagedTime;

    public BManagedInfo(Behind behind){
        this.ymd = new YMDFactoryForTotal().run(behind.getFirst());
        this.bManagedTime = new BManagedTimeMaker().run(behind.getSecond(),behind.getThird());
    }

    public YMDForTotal getYmd() {
        return ymd;
    }

    public BManagedTime getbManagedTime() {
        return bManagedTime;
    }
}
