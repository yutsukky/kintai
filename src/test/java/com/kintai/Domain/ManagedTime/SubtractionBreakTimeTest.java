package com.kintai.Domain.ManagedTime;

import com.kintai.Domain.HM.*;
import org.junit.Test;
import org.omg.PortableInterceptor.LOCATION_FORWARD;

import java.time.LocalDateTime;
import java.time.LocalTime;

import static org.junit.Assert.*;

public class SubtractionBreakTimeTest {
    @Test
    public void run() throws Exception {
        HM start = new HM(LocalTime.of(9,0));
        HM end = new HM(LocalTime.of(21,30));
        HM result = new SubtractionBreakTime().run(start,end);
        System.out.println("hour:" + result.getHourValue());
        System.out.println("minute:" + result.getMinuteValue());
    }

}