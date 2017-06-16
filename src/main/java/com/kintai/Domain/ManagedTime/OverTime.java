package com.kintai.Domain.ManagedTime;

import com.kintai.Domain.HM.HM;

public class OverTime {
    private HM hm;

    public OverTime(HM hm){
        this.hm = hm;
    }

    public HM getHm() {
        return hm;
    }

    public Integer getHourValue(){
        return hm.getHourValue();
    }

    public Integer getMinuteValue(){
        return hm.getMinuteValue();
    }
}
