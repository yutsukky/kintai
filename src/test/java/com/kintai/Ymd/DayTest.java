package com.kintai.Ymd;

import org.junit.Test;

import static org.junit.Assert.*;

public class DayTest {
    private final Integer 下境界 = 0;
    private final Integer 下限 = 1;
    private final Integer 上限 = 31;
    private final Integer 上境界 = 32;

    @Test(expected = RuntimeException.class)
    public void 下境界() throws Exception {
        DayOfMonth day = new DayOfMonth(下境界);
    }

    @Test
    public void 下限() throws Exception {
        DayOfMonth day = new DayOfMonth(下限);
        assert 下限.equals(day.getValue());
    }

    @Test
    public void 上限() throws Exception {
        DayOfMonth day = new DayOfMonth(上限);
        assert 上限.equals(day.getValue());
    }

    @Test(expected = RuntimeException.class)
    public void 上境界() throws Exception {
        DayOfMonth day = new DayOfMonth(上境界);
    }

}