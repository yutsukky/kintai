package com.kintai.Infra;

import com.kintai.Infra.CSVLine.CSVRead;

import java.util.HashMap;

public class TotalReader {
    public void run(){
        HashMap csvHash = new CSVRead().execute();
        BehindList behindList = new BehindList(csvHash);
    }
}
