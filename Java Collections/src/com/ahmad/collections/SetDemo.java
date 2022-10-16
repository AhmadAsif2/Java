package com.ahmad.collections;

import java.util.*;

public class SetDemo {
    public static void show() {
//        Set<String> set = new HashSet<>();
//        set.add("Sky");
//        set.add("is");
//        set.add("blue");
//        set.add("blue");
//
//        System.out.println(set);

//        Collection<String> collection = new HashSet<>();
//        Collections.addAll(collection, "a", "b", "c", "c");
//        System.out.println(collection);

        Set<String> set1 = new HashSet<>(Arrays.asList("a", "b", "c"));
        Set<String> set2 = new HashSet<>(Arrays.asList("b", "c", "d"));

        // Union
//        set1.addAll(set2);
//        System.out.println(set1);

        // Intersection
//        set1.retainAll(set2);
//        System.out.println(set1);

        set1.removeAll(set2);
        System.out.println(set1);

    }
}
