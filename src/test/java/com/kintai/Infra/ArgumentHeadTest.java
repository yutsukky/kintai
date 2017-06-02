package com.kintai.Infra;

import com.kintai.Infra.Behind;
import com.kintai.Infra.Head;
import com.kintai.Infra.ArgumentHead;
import org.junit.Test;

public class ArgumentHeadTest {

    @Test
    public void inputの場合() throws Exception {
        Head head = new Head("input");
        String[] str = {"20170529","0900","1830"};
        Behind behind = new Behind(str);
        ArgumentHead ah = new ArgumentHead();
        ah.correct(head,behind);
    }

    @Test
    public void totalの場合() throws Exception {
        Head head = new Head("total");
        String[] str = {};
        Behind behind = new Behind(str);
        ArgumentHead ah = new ArgumentHead();
        ah.correct(head,behind);
    }

    @Test(expected = RuntimeException.class)
    public void それ以外の場合() throws Exception {
        Head head = new Head("hoge");
        String[] str = {"aaaaa","bbbbb"};
        Behind behind = new Behind(str);
        ArgumentHead ah = new ArgumentHead();
        ah.correct(head,behind);
    }

}