package com.kintai.Domain;

import com.kintai.Domain.HM.*;
import com.kintai.Domain.Ymd.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class StartYMDHM {
    private LocalDateTime localDateTime;

    public StartYMDHM(LocalDate localDate, LocalTime localTime){
        this.localDateTime = localDate.atTime(localTime);
    }

    public YMD getYmd() {
        return new YMD(localDateTime.toLocalDate());
    }

    public HM getHm(){
        return new HM(localDateTime.toLocalTime());
    }
}
