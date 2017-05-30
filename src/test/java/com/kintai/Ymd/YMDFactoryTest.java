package com.kintai.Ymd;

import org.junit.Test;

import static org.junit.Assert.*;

public class YMDFactoryTest {
    @Test
    public void YMDに分解できるか() throws Exception {
        String str = "20170528";
        Integer hoge = 28;
        YMD test = new YMDFactory().run(str);
        assert hoge.equals(test.getDay().getDay());
    }

}