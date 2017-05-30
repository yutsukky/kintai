package com.kintai.WorkTime;


public class WorkTime {
    private StartTime start;
    private EndTime end;

    public WorkTime(StartTime start,EndTime end){
        if(start.getStartTotal() >= end.getEndTotal()){
            throw new RuntimeException("始業時間と終業時間の大小関係が不適切です．");
        }
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
