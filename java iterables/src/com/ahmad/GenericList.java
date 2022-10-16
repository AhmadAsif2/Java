package com.ahmad;

import java.util.Iterator;

public class GenericList<T> implements Iterable<T> {
    // Making array of generic elements
    private T[] items = (T[]) new Object[10];
    private int count;

    // Adding elements to the list
    public void add(T item) {
        items[count++] = item;
    }

    // getting index of list
    public T get(int index) {
        return items[index];
    }

    @Override
    public Iterator<T> iterator() {
        return new ListIterator(this);
    }

    private class ListIterator implements Iterator<T> {
        private GenericList<T> list;
        private int index;

        public ListIterator(GenericList<T> list) {
            this.list = list;
        }

        @Override
        public boolean hasNext() {
            return (index < list.count);
        }

        @Override
        public T next() {
            return list.items[index++];
        }
    }
}
