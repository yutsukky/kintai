package com.kintai.Domain.HM;

import org.junit.Test;

public class HourTest {
    final Integer 下境界 = -1;
    final Integer 下限 = 0;
    final Integer 上限 = 23;
    final Integer 上境界 = 24;

    @Test(expected = RuntimeException.class)
    public void 下の境界値を与えるテスト() throws Exception {
        Hour hour = new Hour(下境界);
    }

    @Test
    public void 下限値() throws Exception {
        Hour hour = new Hour(下限);
        assert 下限.equals(hour.getValue());
    }

    @Test
    public void 上限値() throws Exception {
        Hour hour = new Hour(上限);
        assert 上限.equals(hour.getValue());
    }

    @Test(expected = RuntimeException.class)
    public void 上の境界値を与えるテスト() throws Exception {
        Hour hour = new Hour(上境界);
    }

}