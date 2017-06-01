package com.kintai.Ymd;

import org.junit.Test;

import static org.junit.Assert.*;

public class YMDFactoryTest {
    @Test
    public void YMDを分解できるか() throws Exception {
        String str = "20170528";
        Integer dom = 28;
        Integer month = 5;
        Integer year = 2017;
        YMD test = new YMDFactory().run(str);
        assert dom.equals(test.getDayValue());
        assert month.equals(test.getMonthValue());
        assert year.equals(test.getYearValue());
    }

}