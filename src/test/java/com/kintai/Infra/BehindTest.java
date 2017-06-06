package com.kintai.Infra;

import org.junit.Test;

public class BehindTest {
    public final String[] args = {"20170529", "0900", "1800"};

    @Test
    public void getFirstで先頭をとってこれるか() throws Exception {
        String test = "20170529";
        Behind behind = new Behind(args);
        assert test.equals(behind.getFirst());
    }

    @Test
    public void getSecondで二番目をとってこれるか() throws Exception {
        String test = "0900";
        Behind behind = new Behind(args);
        assert test.equals(behind.getSecond());
    }

    @Test
    public void getThirdで三番目をとってこれるか() throws Exception {
        String test = "1800";
        Behind behind = new Behind(args);
        assert test.equals(behind.getThird());
    }

}