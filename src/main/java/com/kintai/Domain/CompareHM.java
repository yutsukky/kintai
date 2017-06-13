package com.kintai.Domain;

import com.kintai.Domain.HM.HM;

public class CompareHM {
    public boolean isBigger(HM first,HM second){
        if(first.getHourValue() > second.getHourValue()){
            return true;
        }
        if((first.getHourValue().equals(second.getHourValue())) && (first.getMinuteValue() > second.getMinuteValue())){
            return true;
        }
        return false;
    }
}
