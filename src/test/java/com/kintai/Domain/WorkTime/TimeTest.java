package com.kintai.Domain.WorkTime;

import com.kintai.Domain.WorkTime.Hour;
import com.kintai.Domain.WorkTime.Minute;
import com.kintai.Domain.WorkTime.Time;
import org.junit.Test;

public class TimeTest {
    @Test
    public void getTotalで時間と分を合算したものを吐くか() throws Exception {
        Integer test = 1030;
        Hour hour = new Hour(10);
        Minute minute = new Minute(30);
        Time time = new Time(hour,minute);
        assert test.equals(time.getTotal());
    }

}