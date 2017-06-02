package com.kintai;

import com.kintai.WorkTime.WorkTime;
import com.kintai.Ymd.YMD;

public class Record {
    private String[] record;

    public Record(YMD ymd,WorkTime worktime){
        String year = String.format("%04d",ymd.getYearValue());
        String month = String.format("%02d",ymd.getMonthValue());
        String day = String.format("%02d",ymd.getDayValue());
        String start_hour = String.format("%02d",worktime.getStartHour());
        String start_minute = String.format("%02d",worktime.getStartMinute());
        String end_hour = String.format("%02d",worktime.getEndHour());
        String end_minute = String.format("%02d",worktime.getEndMinute());
        String first = year + month + day;
        String second = start_hour + start_minute;
        String third = end_hour + end_minute;
        this.record = new String[]{first,second,third};
    }

    public String[] getRecord() {
        return record;
    }

}
