package com.ahmad.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListDemo {
    public static void show() {
        List<String> list = new ArrayList<>();
//        list.add("a");
//        list.add("b");
//        list.add("c");

        Collections.addAll(list, "a", "b", "c");
//        list.remove(0);
        list.add(0, "a++");
        var index = list.indexOf("c");
        System.out.println(list);
        System.out.println(index);
    }
}
