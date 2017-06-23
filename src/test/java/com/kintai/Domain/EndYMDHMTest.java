package com.kintai.Domain;

import org.junit.Test;

import java.time.LocalDateTime;

import static org.junit.Assert.*;

public class EndYMDHMTest {
    @Test
    public void limited() throws Exception {
        StartYMDHM startYMDHM = new StartYMDHM(LocalDateTime.of(2017,6,16,9,0));
        EndYMDHM endYMDHM = new EndYMDHM(LocalDateTime.of(2017,6,17,1,30));
        EndYMDHM limited = endYMDHM.limited(startYMDHM);
        LocalDateTime localDateTime = limited.getLocalDateTime();
        System.out.println(localDateTime.getYear()+","
                +localDateTime.getMonth()+","
                +localDateTime.getDayOfMonth()+","
                +localDateTime.getHour()+","
                +localDateTime.getMinute());
    }

}