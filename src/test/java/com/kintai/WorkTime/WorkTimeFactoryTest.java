package com.kintai.WorkTime;

import org.junit.Test;

import static org.junit.Assert.*;

public class WorkTimeFactoryTest {
    private final String start = "0855";
    private final String end = "1805";
    private final String hoge = "12hoge";

    private final Integer start_hour = 8;
    private final Integer start_minute = 55;
    private final Integer end_hour = 18;
    private final Integer end_minute = 5;
    @Test
    public void 文字列を始業終業時間に変換できるか() throws Exception {
        WorkTime workTime = new WorkTimeFactory().run(start,end);
        assert start_hour.equals(workTime.getStartHour());
        assert start_minute.equals(workTime.getStartMinute());
        assert end_hour.equals(workTime.getEndHour());
        assert end_minute.equals(workTime.getEndMinute());
    }

    @Test(expected = RuntimeException.class)
    public void 数字以外の文字が入力に混ざっているときに弾くか() throws Exception {
        WorkTime workTime = new WorkTimeFactory().run(start,hoge);
    }


}