package ru.capchik.ivbo_07_19.lesson13;

import java.util.Iterator;

public class Generics {
    public static void main(String[] args) {
        MyType<Item> inst = new MyType<>(new SimpleItem(123));
        CustomCollection collection = new CustomCollection();
        for (int i =0; i < collection.size(); i++) {
            System.out.println(collection.get(i));
        }
        System.out.println("foreach");
        for (Integer value : collection) {
            System.out.println(value);
        }
        Iterator<Integer> iterator1 = collection.iterator();
        System.out.println("iterator 1");
        for (int i = 0; i < 2; i++) {
            if (iterator1.hasNext()) {
                System.out.println(iterator1.next());
            }
        }
        System.out.println("iterator 2");
        Iterator<Integer> iterator2 = collection.iterator();
        for (int i = 0; i < 1; i++) {
            if (iterator2.hasNext()) {
                System.out.println(iterator2.next());
            }
        }
        System.out.println("iterator 1");
        while (iterator1.hasNext()) {
            System.out.println(iterator1.next());
        }
    }
}
