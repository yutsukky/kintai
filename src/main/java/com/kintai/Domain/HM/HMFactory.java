package com.kintai.Domain.HM;

import com.kintai.Domain.DataString.HMString;

import java.time.LocalTime;

public class HMFactory {
    public HM run(HMString hmString){
        String value = hmString.getValue();
        String hour = value.substring(0, 2);
        String minute = value.substring(2, 4);
        LocalTime localTime = LocalTime.of(Integer.parseInt(hour),Integer.parseInt(minute));
        return new HM(localTime);
    }
}
