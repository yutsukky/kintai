package com.kintai.Domain;

import com.kintai.Domain.HM.HM;
import com.kintai.Domain.Ymd.YMD;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class EndYMDHM {
    private LocalDateTime localDateTime;

    public EndYMDHM(LocalDate localDate, LocalTime localTime){
        this.localDateTime = localDate.atTime(localTime);
    }

    public YMD getYmd() {
        return new YMD(localDateTime.toLocalDate());
    }

    public HM getHm(){
        return new HM(localDateTime.toLocalTime());
    }
}
