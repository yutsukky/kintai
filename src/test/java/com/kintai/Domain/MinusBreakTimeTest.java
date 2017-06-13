package com.kintai.Domain;

import com.kintai.Domain.BreakTime.BreakTime;
import com.kintai.Domain.HM.*;
import org.junit.Test;

import static org.junit.Assert.*;

public class MinusBreakTimeTest {
    @Test
    public void subtraction() throws Exception {
        HM start = new HM(new Hour(8),new Minute(55));
        HM end = new HM(new Hour(12),new Minute(30));
        HM diff = new TimeCalculator(start,end).getHM();

        new MinusBreakTime().subtraction(start,end,diff,new BreakTime(12,0,13,0));
    }

}