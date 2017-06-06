package com.kintai.Repository;

import com.kintai.Domain.ManageTime.TotalManageTime;

public interface ManageTimeRepository {
    void execute(TotalManageTime totalManageTime);
}
