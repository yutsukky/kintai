package com.kintai.Infra;

public class KintaiMain {
    public static void main(String[] args){
        try {
            System.out.println(args[0]);
            PickOut pickout = new PickOut(args);
            new ArgumentHead().correct(pickout.getHead(), pickout.getBehind());
        }
        catch(RuntimeException e){
            throw new RuntimeException("いずれかの入力に不正がありました",e);
        }
    }
}
