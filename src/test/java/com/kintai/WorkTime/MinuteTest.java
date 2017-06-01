package com.kintai.WorkTime;

import org.junit.Test;

import static org.junit.Assert.*;

public class MinuteTest {
    final Integer 下境界 = -1;
    final Integer 下限 = 0;
    final Integer 上限 = 59;
    final Integer 上境界 = 60;

    @Test(expected = RuntimeException.class)
    public void 小さい側の境界値を与える() throws Exception {
        Minute minute = new Minute(下境界);
    }

    @Test
    public void 下限値() throws Exception {
        Minute minute = new Minute(下限);
        assert 下限.equals(minute.getValue());
    }

    @Test
    public void 上限値() throws Exception {
        Minute minute = new Minute(上限);
        assert 上限.equals(minute.getValue());
    }

    @Test(expected = RuntimeException.class)
    public void 大きい側の境界値を与える() throws Exception {
        Minute minute = new Minute(上境界);
    }
}