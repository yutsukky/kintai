package com.kintai.Repository;

import com.kintai.Domain.ManagedTime.TotalManageTime;

public interface ManageTimeRepository {
    void execute(TotalManageTime totalManageTime);
}
