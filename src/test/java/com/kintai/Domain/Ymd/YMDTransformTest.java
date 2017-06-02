package com.kintai.Domain.Ymd;

import com.kintai.Domain.Ymd.YMDTransform;
import org.junit.Test;

public class YMDTransformTest {
    @Test(expected = RuntimeException.class)
    public void 年月日の桁数が不正なとき弾くか() throws Exception {
        String test = "2017005008";
        new YMDTransform().run(test);
    }

    @Test
    public void 年月日の桁数が8桁のとき() throws Exception {
        String test = "20170508";
        new YMDTransform().run(test);
    }
}