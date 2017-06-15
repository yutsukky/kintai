package com.kintai.Domain;

import java.time.LocalDate;

public class DateChecker {
    public void run(LocalDate localDate){
        Integer OLD = 6;
        LocalDate today = LocalDate.now();
        LocalDate oldest = today.minusMonths(OLD);
        if(localDate.isAfter(today)){
            throw new RuntimeException("入力値が未来です．");
        }
        if(localDate.isBefore(oldest)){
            throw new RuntimeException(OLD + "ヶ月以上前の勤怠入力は無効です．");
        }
    }
}
