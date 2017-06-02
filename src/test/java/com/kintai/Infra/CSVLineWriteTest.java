package com.kintai.Infra;

import com.kintai.Domain.WorkInfo;
import com.kintai.Infra.CSVLine.CSVLineWrite;
import org.junit.Test;

public class CSVLineWriteTest {
    @Test
    public void CSVWriteにworkInfo渡してるか() throws Exception {
        String[] str = {"input","20170529","0900","1800"};
        PickOut pickOut = new PickOut(str);
        WorkInfo workInfo = new WorkInfo(pickOut.getBehind());
        new CSVLineWrite().execute(workInfo);
    }

}