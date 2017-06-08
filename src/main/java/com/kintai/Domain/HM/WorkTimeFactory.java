package com.kintai.Domain.HM;

public class WorkTimeFactory {
    public WorkTime run(String raw1,String raw2){
        String tmp_start_hour = raw1.substring(0, 2);
        String tmp_start_minute = raw1.substring(2, 4);
        String tmp_end_hour = raw2.substring(0, 2);
        String tmp_end_minute = raw2.substring(2, 4);
        Hour start_hour = new Hour(Integer.parseInt(tmp_start_hour));
        Hour end_hour = new Hour(Integer.parseInt(tmp_end_hour));
        Minute start_minute = new Minute(Integer.parseInt(tmp_start_minute));
        Minute end_minute = new Minute(Integer.parseInt(tmp_end_minute));
        StartTime starttime = new StartTime(new Time(start_hour,start_minute));
        EndTime endtime = new EndTime(new Time(end_hour,end_minute));
        return new WorkTime(starttime,endtime);
    }
}
