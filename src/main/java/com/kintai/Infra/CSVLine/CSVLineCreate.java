package com.kintai.Infra.CSVLine;

import com.kintai.Domain.HM.WorkTime;
import com.kintai.Domain.Ymd.YMD;
import com.kintai.Domain.WorkInfo;

public class CSVLineCreate {
    private CSVLine csvLine;

    public CSVLineCreate(WorkInfo workInfo) {
        YMD ymd = workInfo.getYmd();
        WorkTime worktime = workInfo.getWorktime();
        csvLine = new CSVLine(ymd, worktime);
    }

    public String[] getCsvLineArray() {
        return csvLine.getArray();
    }
}