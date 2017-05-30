package com.kintai.input;

import com.kintai.Record;

public class RecordWrite {
    public void run(Record record){
        String[] arr = record.getRecord();
        String str = String.join(",",arr);
        new CSVWrite().execute(str);
    }
}
