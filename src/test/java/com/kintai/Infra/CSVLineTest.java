package com.kintai.Infra;

import com.kintai.Domain.WorkTime.*;
import com.kintai.Domain.Ymd.*;
import com.kintai.Infra.CSVLine.CSVLine;
import org.junit.Test;

import java.util.Arrays;

public class CSVLineTest {
    @Test
    public void 数値のフォーマット(){
        Year year = new Year(2017);
        Month month = new Month(5);
        DayOfMonth day = new DayOfMonth(29);
        YM ym = new YM(year,month);
        YMD ymd = new YMD(ym,day);
        Hour start_hour = new Hour(9);
        Hour end_hour = new Hour(18);
        Minute minute = new Minute(0);
        Time start = new Time(start_hour,minute);
        Time end = new Time(end_hour,minute);
        StartTime st = new StartTime(start);
        EndTime et = new EndTime(end);
        WorkTime worktime = new WorkTime(st,et);

        CSVLine csvLine = new CSVLine(ymd,worktime);

        String[] test = {"20170529","0900","1800"};

        assert Arrays.equals(test,csvLine.getArray());

    }

}