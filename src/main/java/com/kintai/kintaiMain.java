package com.kintai;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;

public class kintaiMain {
    public static void main(String[] args){
        if (args[0].equals("input")) {
            try(FileWriter fw = new FileWriter("../../../csv/kintai.csv", true);
                PrintWriter pw = new PrintWriter(new BufferedWriter(fw))) {
                pw.print(args[1]);
                pw.print(",");
                pw.print(args[2]);
                pw.print(",");
                pw.print(args[3]);
                pw.println();
                System.out.println("勤怠入力が完了しました。");
            }
            catch(IOException e){
                e.printStackTrace();
            }
        }
        else if(args[0].equals("total")) {
            HashMap<Integer, Integer[]> hash = new HashMap<>();
            try (BufferedReader br = new BufferedReader(new FileReader("../../../csv/kintai.csv"))) {
                String tmp;
                while ((tmp = br.readLine()) != null) {
                    String array[] = tmp.split(",");
                    Integer time[] = {Integer.parseInt(array[1]), Integer.parseInt(array[2])};
                    hash.put(Integer.parseInt(array[0]), time);
                }

                ArrayList<Integer> kinmu = new ArrayList<>();
                ArrayList<Integer> zangyo = new ArrayList<>();

                hash.forEach((key, value) -> {
                    if (value[1] <= 1800) {
                        if (value[1] <= 1200) {
                            kinmu.add(value[1] - 900);
                        } else if (value[1] <= 1300) {
                            kinmu.add(300);
                        } else {
                            kinmu.add(value[1] - 1000);
                        }
                    } else {
                        kinmu.add(800);
                        if (value[1] <= 1900) {

                        } else if (value[1] <= 2100) {
                            zangyo.add(value[1] - 1900);
                        } else if (value[1] <= 2200) {
                            zangyo.add(200);
                        } else if (value[1] <= 2400) {
                            zangyo.add(value[1] - 2000);
                        } else {
                            zangyo.add(400);
                        }
                    }
                });
                System.out.println("勤務時間");
                int kinmu_total = 0;
                for (int i = 0; i < kinmu.size(); i++) {
                    kinmu_total += kinmu.get(i);
                }
                System.out.println(kinmu_total / 100 + "時間" + kinmu_total % 100 + "分");
                System.out.println("残業時間");
                int zangyo_total = 0;
                for (int j = 0; j < zangyo.size(); j++) {
                    zangyo_total += zangyo.get(j);
                }
                System.out.println(zangyo_total / 100 + "時間" + zangyo_total % 100 + "分");
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
