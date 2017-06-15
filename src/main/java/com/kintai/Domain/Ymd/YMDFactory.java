package com.kintai.Domain.Ymd;

import com.kintai.Domain.DataString.YMDString;

import java.time.LocalDate;

public class YMDFactory {
    public YMD run(YMDString ymdString){
        String value = ymdString.getValue();
        String year = value.substring(0,4);
        String month = value.substring(4,6);
        String dayOfMonth = value.substring(6,8);
        LocalDate localDate = LocalDate.of(Integer.parseInt(year),Integer.parseInt(month),Integer.parseInt(dayOfMonth));
        return new YMD(localDate);
    }
}
