package com.kintai.Infra.CSVLine;

import com.kintai.Domain.EndYMDHM;
import com.kintai.Domain.StartYMDHM;
import com.kintai.Domain.Ymd.YMD;
import com.kintai.Domain.WorkInfo;

public class CSVLineCreate {
    private final CSVLine csvLine;

    public CSVLineCreate(WorkInfo workInfo) {
        StartYMDHM startYMDHM = workInfo.getStartYMDHM();
        EndYMDHM endYMDHM = workInfo.getEndYMDHM();
        csvLine = new CSVLine(startYMDHM, endYMDHM);
    }

    public String[] getCsvLineArray() {
        return csvLine.getArray();
    }
}