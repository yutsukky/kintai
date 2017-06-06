package com.kintai.Infra;

import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.*;

public class BehindListTest {
    @Test
    public void getBehindList() throws Exception {
        String str1 = "20170606";
        String[] arr1 = {"0900","1800"};

        HashMap<String,String[]> hash = new HashMap<>();

        hash.put(str1,arr1);

        BehindList bh = new BehindList(hash);
    }

}