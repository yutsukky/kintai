package com.kintai.WorkTime;

import org.junit.Test;

import static org.junit.Assert.*;

public class WorkTimeTransformTest {
    private final String start = "0855";
    private final String end = "1805";
    private final String hoge = "08333";
    private final String fuga = "18";

    @Test(expected = RuntimeException.class)
    public void 桁数が5桁の時間の入力を弾くか() throws Exception {
        new WorkTimeTransform().run(hoge,end);
    }

    @Test(expected = RuntimeException.class)
    public void 桁数が2桁の時間の入力を弾くか() throws Exception {
        new WorkTimeTransform().run(start,fuga);
    }

    @Test(expected = RuntimeException.class)
    public void 桁数が2桁と5桁の時間の入力を弾くか() throws Exception {
        new WorkTimeTransform().run(hoge,fuga);
    }

    @Test
    public void 正常な場合も一応() throws Exception {
        new WorkTimeTransform().run(start,end);
    }

}