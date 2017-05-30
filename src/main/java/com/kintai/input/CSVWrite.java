package com.kintai.input;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CSVWrite {
    public void execute(String str){
        //String filename = "../../../csv/kintai.csv";
        String filename = "csv/kintai.csv";
        try(FileWriter fw = new FileWriter(filename, true);
            PrintWriter pw = new PrintWriter(new BufferedWriter(fw))){
            pw.println(str);
            System.out.println("勤怠入力が完了しました。");
        }
        catch(IOException e){
            System.out.println("出力用ファイルがオープンできませんでした．");
            e.printStackTrace();
        }
    }
}
