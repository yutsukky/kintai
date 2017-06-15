package com.kintai.Domain;

import com.kintai.Domain.HM.HM;
import com.kintai.Domain.Ymd.YMD;

import java.time.LocalDateTime;

public class EndYMDHM {
    private LocalDateTime localDateTime;

    public EndYMDHM(LocalDateTime localDateTime){
        this.localDateTime = localDateTime;
    }

    public LocalDateTime getLocalDateTime(){
        return localDateTime;
    }

    public boolean isBefore(StartYMDHM startYMDHM){
        return localDateTime.isBefore(startYMDHM.getLocalDateTime());
    }

    public EndYMDHM plusADay(){
        return new EndYMDHM(localDateTime.plusDays(1));
    }

    public YMD getYmd() {
        return new YMD(localDateTime.toLocalDate());
    }

    public HM getHm(){
        return new HM(localDateTime.toLocalTime());
    }
}
