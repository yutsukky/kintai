package com.kintai.Domain;

import com.kintai.Domain.HM.HM;
import com.kintai.Domain.Ymd.YMD;

import java.time.LocalDate;
import java.time.LocalDateTime;

import static java.time.temporal.ChronoUnit.*;

public class EndYMDHM {
    private final LocalDateTime localDateTime;

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

    public EndYMDHM limited(StartYMDHM startYMDHM){
        LocalDateTime startLocalDateTime = startYMDHM.getLocalDateTime();
        LocalDate startLocalDate = startLocalDateTime.toLocalDate();
        LocalDate endLocalDate = localDateTime.toLocalDate();
        if(endLocalDate.isAfter(startLocalDate)){
            LocalDateTime tmp = localDateTime.minusMinutes(localDateTime.getMinute()+1);
            return new EndYMDHM(tmp.minusHours(localDateTime.getHour()));
        }
        return new EndYMDHM(localDateTime);
    }

    public Long untilHour(StartYMDHM startYMDHM){
        return localDateTime.until(startYMDHM.getLocalDateTime(),HOURS);
    }

    public Long untilMinute(StartYMDHM startYMDHM){
        return localDateTime.until(startYMDHM.getLocalDateTime(),MINUTES);
    }

    public YMD getYmd() {
        return new YMD(localDateTime.toLocalDate());
    }

    public HM getHm(){
        return new HM(localDateTime.toLocalTime());
    }
}
