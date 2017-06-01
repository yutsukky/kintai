package com.kintai.Limitter;

import org.junit.Test;

import static org.junit.Assert.*;

public class LimitterTest {
    @Test(expected = RuntimeException.class)
    public void 下限値以下の入力で弾く() throws Exception {
        Integer value = 1;
        Integer min = 5;
        Integer max = 10;
        new Limitter().run(value,new Limit(min,max));
    }

    @Test(expected = RuntimeException.class)
    public void 上限値以上の入力で弾く() throws Exception {
        Integer value = 11;
        Integer min = 5;
        Integer max = 10;
        new Limitter().run(value,new Limit(min,max));
    }

    @Test
    public void 範囲内ならセーフ() throws Exception {
        Integer value = 7;
        Integer min = 5;
        Integer max = 10;
        new Limitter().run(value,new Limit(min,max));
    }
}