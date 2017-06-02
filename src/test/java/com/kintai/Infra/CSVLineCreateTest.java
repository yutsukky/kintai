package com.kintai.Infra;

import com.kintai.Domain.WorkInfo;
import com.kintai.Infra.CSVLine.CSVLineCreate;
import com.kintai.Infra.PickOut;
import org.junit.Test;

import java.util.Arrays;

public class CSVLineCreateTest {
    @Test
    public void CSVLineを生成できるか() throws Exception {
        String[] str = {"input","20170529","0900","1800"};
        PickOut pickOut = new PickOut(str);
        WorkInfo workInfo = new WorkInfo(pickOut.getBehind());
        CSVLineCreate csvLineCreate = new CSVLineCreate(workInfo);
        Arrays.stream(csvLineCreate.getCsvLineArray()).forEach(System.out::println);
    }

}