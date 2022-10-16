package com.ahmad.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Locale;

public class CollectionDemo {
    public static void show() {
        Collection<String> collection = new ArrayList<>();
        Collection<String> other = new ArrayList<>();
//        collection.add("a");
//        collection.add("b");
//        collection.add("C");
        String[] stringArray = collection.toArray(new String[0]);

        Collections.addAll(collection, "a", "b", "c");
        other.addAll(collection);
        collection.remove("a");
//        for (var items: collection) {
//            System.out.println(items);
//        }
        //System.out.println(collection.isEmpty());
        // collection.clear();
        System.out.println(collection);
        System.out.println(collection == other);
        System.out.println(other.equals(collection));
    }
}
