package com.kintai.Domain.HM;

import org.junit.Test;

import java.time.LocalTime;

import static org.junit.Assert.*;

public class HMTest {
    @Test
    public void minus() throws Exception {
        HM start = new HM(LocalTime.of(8,30));
        HM end = new HM(LocalTime.of(12,29));
        HM diff = end.minus(start);
        System.out.println("diff:" + diff.getHourValue() + "," + diff.getMinuteValue());
    }

}