package com.kintai.Infra.CSVLine;

import com.kintai.Domain.EndYMDHM;
import com.kintai.Domain.HM.HM;
import com.kintai.Domain.StartYMDHM;
import com.kintai.Domain.Ymd.YMD;

public class CSVLine {
    private String[] array;

    public CSVLine(StartYMDHM startYMDHM, EndYMDHM endYMDHM){
        YMD startYmd = startYMDHM.getYmd();
        YMD endYmd = endYMDHM.getYmd();
        HM startHm = startYMDHM.getHm();
        HM endHm = endYMDHM.getHm();
        String first = startYmd.getYMDString();
        String second = startHm.getHMString();
        String third = endYmd.getYMDString();
        String fourth = endHm.getHMString();
        this.array = new String[]{first,second,third,fourth};
    }

    public String[] getArray() {
        return array;
    }

}
