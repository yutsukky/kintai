package com.kintai.Domain;

import com.kintai.Domain.HM.*;
import com.kintai.Domain.Ymd.*;

import java.time.LocalDateTime;

public class StartYMDHM {
    private LocalDateTime localDateTime;

    public StartYMDHM(LocalDateTime localDateTime){
        this.localDateTime = localDateTime;
    }

    public LocalDateTime getLocalDateTime(){
        return localDateTime;
    }

    public YMD getYmd() {
        return new YMD(localDateTime.toLocalDate());
    }

    public HM getHm(){
        return new HM(localDateTime.toLocalTime());
    }
}
