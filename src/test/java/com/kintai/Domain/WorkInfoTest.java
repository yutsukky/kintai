package com.kintai.Domain;

import com.kintai.Infra.Behind;
import com.kintai.Domain.HM.*;
import com.kintai.Domain.Ymd.*;
import org.junit.Test;

public class WorkInfoTest {
    @Test
    public void 正しく年月日を分割できる場合(){
        String[] str = {"20170529","0900","1800"};
        Year year = new Year(2017);
        Month month = new Month(5);
        DayOfMonth day = new DayOfMonth(29);
        YM ym = new YM(year,month);
        YMD ymd = new YMD(ym,day);
        Behind behind = new Behind(str);
        WorkInfo workInfo = new WorkInfo(behind);
        assert ymd.getDayValue().equals(workInfo.getYmd().getDayValue());
        assert ymd.getMonthValue().equals(workInfo.getYmd().getMonthValue());
        assert ymd.getYearValue().equals(workInfo.getYmd().getYearValue());
    }
    @Test
    public void 正しく勤務時間を分割できる場合(){
        String[] str = {"20170529","0900","1800"};
        Hour start_hour = new Hour(9);
        Hour end_hour = new Hour(18);
        Minute minute = new Minute(0);
        Time start = new Time(start_hour,minute);
        Time end = new Time(end_hour,minute);
        StartTime st = new StartTime(start);
        EndTime et = new EndTime(end);
        WorkTime worktime = new WorkTime(st,et);
        Behind behind = new Behind(str);
        WorkInfo workInfo = new WorkInfo(behind);
        assert worktime.getStartHour().equals(workInfo.getWorktime().getStartHour());
        assert worktime.getEndHour().equals(workInfo.getWorktime().getEndHour());
        assert worktime.getStartMinute().equals(workInfo.getWorktime().getStartMinute());
        assert worktime.getEndMinute().equals(workInfo.getWorktime().getEndMinute());
    }

}