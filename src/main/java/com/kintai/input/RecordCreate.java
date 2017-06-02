package com.kintai.input;

import com.kintai.Record;
import com.kintai.WorkTime.WorkTime;
import com.kintai.Ymd.YMD;

public class RecordCreate {
    private Record record;

    public RecordCreate(Divide divide){
        YMD ymd = divide.getYmd();
        WorkTime worktime = divide.getWorktime();
        record = new Record(ymd,worktime);
    }

    public Record getRecord() {
        return record;
    }
}
