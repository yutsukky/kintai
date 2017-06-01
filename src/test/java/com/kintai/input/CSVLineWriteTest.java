package com.kintai.input;

import com.kintai.Behind;
import com.kintai.CSVLine;
import com.kintai.WorkTime.*;
import com.kintai.Ymd.*;
import org.junit.Test;

import static org.junit.Assert.*;

public class CSVLineWriteTest {
    @Test
    public void CSVLineWriteに文字列渡してるか() throws Exception {
        String[] str = {"input","20170529","0900","1800"};
        PickOut pickOut = new PickOut(str);
        Divide divide = new Divide(pickOut.getBehind());
        CSVLineCreate csvLineCreate = new CSVLineCreate(divide);
        CSVLine csvLine = csvLineCreate.getCsvLine();
        new CSVLineWrite().run(csvLine);
    }

}