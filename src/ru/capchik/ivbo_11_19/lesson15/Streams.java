package ru.capchik.ivbo_11_19.lesson15;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Streams {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();
        array.add(4);
        array.add(7);
        array.add(43);
        array.add(3);
        array.add(98);
        array.add(107);
        array.add(3);
        array.add(5);
        array.add(87);

        List<Integer> collected = array.stream()
                .filter(v -> v % 2 != 0)
                .distinct()
                .skip(2)
                .limit(4)
                .map(v -> v * v)
                .dropWhile(v -> v != 25)
                .collect(Collectors.toList());
        System.out.println(array);
        System.out.println(collected);
        long count = array.stream()
                .filter(v -> v % 2 != 0)
                .distinct()
                .count();
        System.out.println(count);
//        selfWritten();
    }

    private static void selfWritten() {
        ArrayList<Integer> array = new ArrayList<>();
        array.add(4);
        array.add(3);
        array.add(7);
        array.add(43);
        array.add(98);
        array.add(107);
        ArrayList<Integer> newList1 = filter(array, v -> v % 2 == 0);
        ArrayList<Integer> newList2 = filter(array, v -> v % 2 != 0);
        System.out.println(array);
        System.out.println(newList1);
        System.out.println(newList2);

        ArrayList<String> rows = new ArrayList<>();
        rows.add("Hello");
        rows.add("world");
        rows.add("and");
        rows.add("another");
        rows.add("one");
        ArrayList<String> filteredRows = filter(rows, r -> r.length() > 3);
        System.out.println(rows);
        System.out.println(filteredRows);
    }

    private static <T> ArrayList<T> filter(ArrayList<T> array, ValueSelector<T> selector) {
        ArrayList<T> newList = new ArrayList<>();
        for(T value : array) {
            if (selector.isNeed(value)) {
                newList.add(value);
            }
        }
        return newList;
    }
}
