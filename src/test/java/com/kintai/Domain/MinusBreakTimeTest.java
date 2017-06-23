package com.kintai.Domain;

import com.kintai.Domain.BreakTime.BreakTime;
import com.kintai.Domain.HM.*;
import org.junit.Test;

import java.time.LocalTime;

import static org.junit.Assert.*;

public class MinusBreakTimeTest {
    @Test
    public void subtraction() throws Exception {
        HM start = new HM(LocalTime.of(8,30));
        HM end = new HM(LocalTime.of(12,59));
        HM diff = end.minus(start);

        HM result = new MinusBreakTime().subtraction(start,end,diff,new BreakTime(12,0,13,0));

        System.out.println("result:" + result.getHourValue() + "," + result.getMinuteValue());
    }

}