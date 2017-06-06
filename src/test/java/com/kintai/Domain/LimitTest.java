package com.kintai.Domain;

import org.junit.Test;

public class LimitTest {
    @Test(expected = RuntimeException.class)
    public void 最小値が最大値を上回ると弾く() throws Exception {
        Integer min = 10;
        Integer max = 5;
        Limit limit = new Limit(min,max);
    }

    @Test
    public void 最小値と最大値の関係が正常() throws Exception {
        Integer min = 5;
        Integer max = 10;
        Limit limit = new Limit(min,max);
    }

    @Test(expected = RuntimeException.class)
    public void 最小値と最大値が同じだと弾く() throws Exception {
        Integer min = 5;
        Integer max = 5;
        Limit limit = new Limit(min,max);
    }

}