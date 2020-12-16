package lesson14;

import java.util.ArrayList;

public class DoAction {
    @DoSumAnnotation
    private void doSum(ArrayList<Integer> numbers) {
        int result = numbers.stream()
                .mapToInt(a -> a)
                .sum();
        System.out.println(result);
    }

    @DoPrintAnnotation
    public static void doPrint(ArrayList<String> words, String dlm) {
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 0; i < words.size(); i++) {
            stringBuilder.append(words.get(i));
            if(i != (words.size() - 1)) {
                stringBuilder.append(dlm);
            }
        }
        System.out.println(stringBuilder);
    }
}
