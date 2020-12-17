package ru.capchik.ivbo_07_19.lesson14;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsApi {
    public static void main(String[] args) {
        ArrayList<Integer> values = new ArrayList<>();
        values.add(34);
        values.add(4345);
        values.add(3123);
        values.add(3);
        values.add(5);
        values.add(12);
        values.add(135);
        values.add(11);
        values.add(9);

        Stream<Integer> stream = values.stream()
                .filter(a -> a % 2 != 0)
                .skip(2)
                .filter(a -> a > 6)
                .map(StreamsApi::operation)
                .limit(3);
        System.out.println("Stream created");
        if("user" == "admin") {
            stream = stream.filter(a -> a < 100000);
        }
        List<Integer> result = stream
                .collect(Collectors.toList());
        System.out.println(result);
    }

    private static int operation(int value) {
        System.out.println("Invoke on " + value);
        return value * value;
    }
    private static int calcCount(ArrayList<Integer> values) {
        int count = 0;
        for(Integer val : values)
        {
            if (val % 2 == 0)
            {
                count++;
            }
        }
        return count;
    }

}
