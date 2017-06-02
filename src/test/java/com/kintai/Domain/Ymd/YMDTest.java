package com.kintai.Domain.Ymd;

import com.kintai.Domain.Ymd.*;
import org.junit.Test;

import java.time.LocalDate;

public class YMDTest {
    @Test(expected = RuntimeException.class)
    public void 未来の日付で入力すると弾く() throws Exception {
        LocalDate today = LocalDate.now();
        LocalDate tommorow = today.plusDays(1);
        Year year = new Year(tommorow.getYear());
        Month month = new Month(tommorow.getMonthValue());
        DayOfMonth day = new DayOfMonth(tommorow.getDayOfMonth());
        YM ym = new YM(year,month);
        YMD ymd = new YMD(ym,day);
    }

    @Test(expected = RuntimeException.class)
    public void 現在から6ヶ月以上前の日付を弾く() throws Exception {
        LocalDate today = LocalDate.now();
        LocalDate old = today.minusMonths(6).minusDays(1);
        Year year = new Year(old.getYear());
        Month month = new Month(old.getMonthValue());
        DayOfMonth day = new DayOfMonth(old.getDayOfMonth());
        YM ym = new YM(year,month);
        YMD ymd = new YMD(ym,day);
    }

    @Test
    public void 今日の日付はセーフ() throws Exception {
        LocalDate today = LocalDate.now();
        Year year = new Year(today.getYear());
        Month month = new Month(today.getMonthValue());
        DayOfMonth day = new DayOfMonth(today.getDayOfMonth());
        YM ym = new YM(year,month);
        YMD ymd = new YMD(ym,day);
    }



}