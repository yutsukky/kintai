package com.kintai.input;

import com.kintai.Behind;
import com.kintai.Head;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class ArgumentHeadTest {

    @Test
    public void inputの場合() throws Exception {
        Head head = new Head("input");
        String[] str = {"20171717","20171717"};
        Behind behind = new Behind(str);
        ArgumentHead ah = new ArgumentHead();
        ah.correct(head,behind);
    }

    @Test
    public void totalの場合() throws Exception {
        Head head = new Head("total");
        String[] str = {"20171717","20171717"};
        Behind behind = new Behind(str);
        ArgumentHead ah = new ArgumentHead();
        ah.correct(head,behind);
    }

    @Test(expected = RuntimeException.class)
    public void それ以外の場合() throws Exception {
        Head head = new Head("hogehoge");
        String[] str = {"20171717","20171717"};
        Behind behind = new Behind(str);
        ArgumentHead ah = new ArgumentHead();
        ah.correct(head,behind);
    }

}