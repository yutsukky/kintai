package com.kintai.input;

import com.kintai.CSVLine;

public class CSVLineWrite {
    public void run(CSVLine csvLine){
        String[] arr = csvLine.getArray();
        String str = String.join(",",arr);
        new CSVWrite().execute(str);
    }
}
