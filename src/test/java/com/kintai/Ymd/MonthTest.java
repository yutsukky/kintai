package com.kintai.Ymd;

import org.junit.Test;

import static org.junit.Assert.*;

public class MonthTest {
    private final Integer 下境界 = 0;
    private final Integer 下限 = 1;
    private final Integer 上限 = 12;
    private final Integer 上境界 = 13;

    @Test(expected = RuntimeException.class)
    public void 下境界() throws Exception {
        Month month = new Month(下境界);
    }

    @Test
    public void 下限() throws Exception {
        Month month = new Month(下限);
        assert 下限.equals(month.getValue());
    }

    @Test
    public void 上限() throws Exception {
        Month month = new Month(上限);
        assert 上限.equals(month.getValue());
    }

    @Test(expected = RuntimeException.class)
    public void 上境界() throws Exception {
        Month month = new Month(上境界);
    }

}