package com.kintai.Domain.WorkTime;


public class WorkTime {
    private StartTime start;
    private EndTime end;

    public WorkTime(StartTime start,EndTime end){
        //終業時間の方が始業時間より早いときは朝まで仕事したとみなす
        this.start = start;
        this.end = end;
    }

    public StartTime getStart() {
        return start;
    }

    public EndTime getEnd() {
        return end;
    }

    public Integer getStartHour(){
        return start.getHourValue();
    }

    public Integer getStartMinute(){
        return start.getMinuteValue();
    }

    public Integer getEndHour(){
        return end.getHourValue();
    }

    public Integer getEndMinute(){
        return end.getMinuteValue();
    }
}
