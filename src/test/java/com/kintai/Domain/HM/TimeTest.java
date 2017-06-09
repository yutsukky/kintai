package com.kintai.Domain.HM;

import org.junit.Test;

public class TimeTest {
    @Test
    public void getTotalで時間と分を合算したものを吐くか() throws Exception {
        Integer test = 1030;
        Hour hour = new Hour(10);
        Minute minute = new Minute(30);
        HM hm = new HM(hour,minute);
        assert test.equals(hm.getTotal());
    }

}