package com.ahmad;

import com.ahmad.collections.*;

import java.util.ArrayList;
import java.util.Collections;
import  java.util.List;
public class Main {
    public static void main(String[] args) {
        CollectionDemo.show();
        System.out.println("List Demo");
        ListDemo.show();
        System.out.println("Comparable interface");
        List<Customer> list = new ArrayList<>();
        list.add(new Customer("b", "e3"));
        list.add(new Customer("a", "e2"));
        list.add(new Customer("c", "e1"));

        //Sorting on the based of name
        //Collections.sort(list);

        // sorting on the based of email
        Collections.sort(list, new EmailComparator());
        System.out.println(list);

        System.out.println("Queue Demo ===============");
        QueueDemo.show();

        System.out.println("Set Demo ====================");
        SetDemo.show();

        System.out.println("Map Demo ==================");
        MapDemo.show();
    }
}
