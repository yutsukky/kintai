package com.kintai.Domain.Ymd;

public class YMDFactory {
    public YMD run(String raw){
        String tmp_year = raw.substring(0,4);
        String tmp_month = raw.substring(4,6);
        String tmp_day = raw.substring(6,8);
        Year year = new Year(Integer.parseInt(tmp_year));
        Month month = new Month(Integer.parseInt(tmp_month));
        DayOfMonth day = new DayOfMonth(Integer.parseInt(tmp_day));
        return new YMD(new YM(year,month),day);
    }
}
