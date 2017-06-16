package com.kintai.Domain.ManagedTime;

import com.kintai.Domain.HM.HM;
import org.junit.Test;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class ActualTimeListTest {
    @Test
    public void getTotalTime() throws Exception {
        List<ActualTime> actualTimeList = new ArrayList<>();
        actualTimeList.add(new ActualTime(new HM(LocalTime.of(9,0))));
        actualTimeList.add(new ActualTime(new HM(LocalTime.of(9,40))));
        actualTimeList.add(new ActualTime(new HM(LocalTime.of(8,40))));
        ActualTimeList test = new ActualTimeList(actualTimeList);
        System.out.println("result " + test.getTotalTime().getHour() + ":" + test.getTotalTime().getMinute());
    }

}