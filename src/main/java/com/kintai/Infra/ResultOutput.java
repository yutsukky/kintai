package com.kintai.Infra;

import com.kintai.Domain.ManagedTime.TotalManageTime;
import com.kintai.Domain.ManagedTime.TotalTime;
import com.kintai.Repository.TotalManagedTimeRepository;

public class ResultOutput implements TotalManagedTimeRepository {
    public void execute(TotalManageTime totalManageTime) {
        TotalTime actual = totalManageTime.getActual();
        TotalTime over = totalManageTime.getOver();
        System.out.println("勤務時間:" + actual.getHour() + "時間" + actual.getMinute() + "分");
        System.out.println("残業時間:" + over.getHour() + "時間" + over.getMinute() + "分");
    }
}
