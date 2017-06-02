package com.kintai.Domain.WorkTime;

import com.kintai.Domain.WorkTime.Hour;
import com.kintai.Domain.WorkTime.Minute;
import com.kintai.Domain.WorkTime.StartTime;
import com.kintai.Domain.WorkTime.Time;
import org.junit.Test;

public class StartTimeTest {
    @Test(expected = RuntimeException.class)
    public void 始業時間が遅れたらクビ() throws Exception {
        Hour hour = new Hour(10);
        Minute minute = new Minute(30);
        StartTime startTime = new StartTime(new Time(hour,minute));
    }

    @Test
    public void 始業時間に間に合わせた() throws Exception {
        Hour hour = new Hour(8);
        Minute minute = new Minute(50);
        StartTime startTime = new StartTime(new Time(hour,minute));
    }

}