package com.kintai.Ymd;

public class YMDFactory {
    public YMD run(String raw){
        try{
            String tmp_year = raw.substring(0,4);
            String tmp_month = raw.substring(4,6);
            String tmp_day = raw.substring(6,8);

            //System.out.println(tmp_year + tmp_month + tmp_day);

            Year year = new Year(Integer.parseInt(tmp_year));
            Month month = new Month(Integer.parseInt(tmp_month));
            Day day = new Day(Integer.parseInt(tmp_day));
            YM ym = new YM(year,month);
            return new YMD(ym,day);
        }
        catch(NumberFormatException e){
            throw new RuntimeException("年月日箇所の入力に文字列が含まれています．",e);
        }
    }
}
