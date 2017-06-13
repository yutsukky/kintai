package com.kintai.Domain.ManagedTime;

import com.kintai.Domain.HM.*;
import org.junit.Test;

import static org.junit.Assert.*;

public class SubtractionBreakTimeTest {
    @Test
    public void run() throws Exception {
        HM start = new HM(new Hour(9),new Minute(0));
        HM end = new HM(new Hour(21),new Minute(30));
        HM result = new SubtractionBreakTime().run(start,end);
        System.out.println("hour:" + result.getHourValue());
        System.out.println("minute:" + result.getMinuteValue());
    }

}