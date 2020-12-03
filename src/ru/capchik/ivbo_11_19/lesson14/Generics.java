package ru.capchik.ivbo_11_19.lesson14;

import java.util.ArrayList;

public class Generics {
    public static void main(String[] args) {
        GenericCollection<Item> collection1 = new GenericCollection<>(new SimpleItem());
        System.out.println(collection1.getField().getPrice());
        collection1.setField(new HardItem());
        System.out.println(collection1.getField().getPrice());
        System.out.println(collection1.getTotalPrice());
        GenericCollection<SimpleItem> collection2 = new GenericCollection<>(new SimpleItem());
        collection2.getField().func();
        // foreach();
    }

    private static void foreach() {
        MyCollection collection = new MyCollection();
        System.out.println("for loop");
        for (int i = 0; i < collection.getSize(); i++) {
            System.out.println(collection.get(i));
        }
        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(44);
        list.add(-90);
        System.out.println("foreach over arraylist");
        for (Integer value : list) {
            System.out.println(value);
        }
        System.out.println("foreach over custom collection");
        for (Integer value: collection) {
            System.out.println(value);
        }
    }
}
