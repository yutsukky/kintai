package com.kintai.Domain.HM;

import com.kintai.Domain.DataString.TimeString;

public class HMFactory {
    public HM run(TimeString timeString){
        Integer TIME_LIMIT = 4;
        if(!TIME_LIMIT.equals(timeString.getLength())){
            throw new RuntimeException("時間の桁数が不正です．");
        }
        String value = timeString.getValue();
        String tmp_hour = value.substring(0, 2);
        String tmp_minute = value.substring(2, 4);
        Hour hour = new Hour(Integer.parseInt(tmp_hour));
        Minute minute = new Minute(Integer.parseInt(tmp_minute));
        return new HM(hour,minute);
    }
}
