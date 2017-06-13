package com.kintai.Domain.ManagedTime;


import com.kintai.Domain.HM.HM;

public class ActualTime {
    private HM hm;

    public ActualTime(HM hm){
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

    public boolean isOver(){
        Integer HOUR_LIMIT = 8;
        Integer MINUTE_LIMIT = 0;
        if(hm.getHourValue() < HOUR_LIMIT){
            return false;
        }
        if(hm.getHourValue().equals(HOUR_LIMIT) && (hm.getMinuteValue().equals(MINUTE_LIMIT))){
            return false;
        }
        return true;
    }
}
