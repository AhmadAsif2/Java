package com.ahmad.collections;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void show() {
        var c1 = new Customer("a", "e1");
        var c2 = new Customer("b", "e2");

        Map<String, Customer> map = new HashMap<>();
        map.put(c1.getEmail(), c1);
        map.put(c2.getEmail(), c2);

        //var customer = map.get("e1");
        // var unknown = new Customer("Unknown", " ");
        // var customer = map.getOrDefault("e10", unknown);
       // var exists = map.containsKey("e1");
        //var replace = map.replace("e1", new Customer("a++", "e1"));
        //System.out.println(map);

        // Iterating over a map
//        for (var customer: map.entrySet()) {
//            System.out.println(customer);
//        }

        for (var customer: map.values()) {
            System.out.println(customer);
        }
    }
}
