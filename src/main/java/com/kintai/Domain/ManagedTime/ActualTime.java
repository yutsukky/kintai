package com.kintai.Domain.ManagedTime;


import com.kintai.Domain.HM.HM;

public class ActualTime {
    private HM hm;

    public ActualTime(HM hm){
        this.hm = hm;
    }

    public HM getTime() {
        return hm;
    }
}
