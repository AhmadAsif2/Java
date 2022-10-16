package com.ahmad.collections;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueDemo {
    public static void show() {
        Queue<String> queue = new ArrayDeque<>();

        queue.add("ahmad");
        queue.add("Hamza");
        queue.add("C++");
        //queue.remove(); // Removes peek element
        //System.out.println(queue.peek());
        //System.out.println(queue.poll()); // returns null if queue is totally empty
        System.out.println(queue.element());
    }
}
