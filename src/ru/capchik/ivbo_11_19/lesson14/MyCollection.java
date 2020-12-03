package ru.capchik.ivbo_11_19.lesson14;

import java.util.Iterator;

public class MyCollection implements Iterable<Integer> {
    private int[] array = new int[]{ 1, 2, 3, 4, 7, 4, 3, 2 };
    public int getSize() {
        return array.length;
    }
    public int get(int index) {
        return array[index];
    }

    @Override
    public Iterator<Integer> iterator() {
        return new MyCollectionIterator(this);
    }
    private class MyCollectionIterator implements Iterator<Integer> {

        private int currentIndex = 0;
        private final MyCollection collection;

        public MyCollectionIterator(MyCollection collection) {
            this.collection = collection;
        }

        @Override
        public boolean hasNext() {
            return currentIndex < collection.getSize();
        }

        @Override
        public Integer next() {
            return collection.get(currentIndex++);
        }
    }
}
