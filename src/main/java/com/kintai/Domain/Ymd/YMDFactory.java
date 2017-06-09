package com.kintai.Domain.Ymd;

import com.kintai.Domain.YMDString;

public class YMDFactory {
    public YMD run(YMDString ymdString){
        String value = ymdString.getValue();
        String tmp_year = value.substring(0,4);
        String tmp_month = value.substring(4,6);
        String tmp_day = value.substring(6,8);
        Year year = new Year(Integer.parseInt(tmp_year));
        Month month = new Month(Integer.parseInt(tmp_month));
        DayOfMonth day = new DayOfMonth(Integer.parseInt(tmp_day));
        return new YMD(new YM(year,month),day);
    }
}
