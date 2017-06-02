package com.kintai.input;

import com.kintai.Behind;
import com.kintai.WorkTime.*;
import com.kintai.Ymd.*;
import org.junit.Test;

import static org.junit.Assert.*;

public class DivideTest {
    @Test
    public void 正しく年月日を分割できる場合(){
        String[] str = {"20170529","0900","1800"};
        Year year = new Year(2017);
        Month month = new Month(5);
        Day day = new Day(29);
        YM ym = new YM(year,month);
        YMD ymd = new YMD(ym,day);
        Behind behind = new Behind(str);
        Divide divide = new Divide(behind);
        assert ymd.getDay().getDay().equals(divide.getYmd().getDay().getDay());
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
        Divide divide = new Divide(behind);
        assert worktime.getEndHour().equals(divide.getWorktime().getEndHour());
    }

}