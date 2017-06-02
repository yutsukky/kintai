package com.kintai.Infra.CSVLine;

import com.kintai.Domain.WorkTime.WorkTime;
import com.kintai.Domain.Ymd.YMD;

public class CSVLine {
    private String[] array;

    public CSVLine(YMD ymd,WorkTime worktime){
        String first = String.format("%04d%02d%02d",ymd.getYearValue(),ymd.getMonthValue(),ymd.getDayValue());
        String second = String.format("%02d%02d",worktime.getStartHour(),worktime.getStartMinute());
        String third = String.format("%02d%02d",worktime.getEndHour(),worktime.getEndMinute());
        this.array = new String[]{first,second,third};
    }

    public String[] getArray() {
        return array;
    }

}
