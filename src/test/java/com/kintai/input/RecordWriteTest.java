package com.kintai.input;

import com.kintai.Behind;
import com.kintai.Record;
import com.kintai.WorkTime.*;
import com.kintai.Ymd.*;
import org.junit.Test;

import static org.junit.Assert.*;

public class RecordWriteTest {
    @Test
    public void CSVにちゃんと文字列渡そうとしてるか() throws Exception {
        String[] str = {"input","20170529","0900","1800"};
        PickOut pickOut = new PickOut(str);
        Divide divide = new Divide(pickOut.getBehind());
        RecordCreate recordCreate = new RecordCreate(divide);
        Record record = recordCreate.getRecord();
        new RecordWrite().run(record);
    }

}