package ru.capchik.ivbo_07_19.lesson13;

import java.util.Iterator;
import java.util.LinkedList;

public class CustomCollection implements Iterable<Integer> {
    private int[] values = new int[]{19, -20, 3, 4, 5};
    public int get(int index) {
        return values[index];
    }
    public int size() {
        return values.length;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new CustomIterator(this);
    }
    private class CustomIterator implements Iterator<Integer> {
        private int currentIndex;
        private CustomCollection collection;
        CustomIterator(CustomCollection collection) {
            this.collection = collection;
        }
        @Override
        public boolean hasNext() {
            return currentIndex < collection.size();
        }

        @Override
        public Integer next() {
            return collection.get(currentIndex++);
        }
    }
}
