package com.kintai.input;

import com.kintai.CSVLine;
import com.kintai.WorkTime.WorkTime;
import com.kintai.Ymd.YMD;

public class CSVLineCreate {
    private CSVLine csvLine;

    public CSVLineCreate(Divide divide){
        YMD ymd = divide.getYmd();
        WorkTime worktime = divide.getWorktime();
        csvLine = new CSVLine(ymd,worktime);
    }

    public CSVLine getCsvLine() {
        return csvLine;
    }
}
