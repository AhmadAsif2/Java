package com.ahmad;

public class Main {
    public static void main(String[] args) {
        var list = new GenericList<String>();

        list.add("Ahmad");
        list.add("Hamza");
        list.add("C++");
        list.add("Java");

//        for (var item: list) {
//            System.out.println(item);
//        }

        var items = list.iterator();
        // Alternative way of iterating
        while (items.hasNext()) {
            var item = items.next();
            System.out.println(item);
        }
    }
}
