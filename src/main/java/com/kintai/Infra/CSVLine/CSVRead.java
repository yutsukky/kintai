package com.kintai.Infra.CSVLine;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class CSVRead {
    public HashMap execute(){
        String filename = "csv/kintai.csv";
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            return new CSVHashCreate().execute(br);
        } catch(IOException e){
            throw new RuntimeException("勤怠情報ファイルをオープンできませんでした",e);
        }
    }
}
