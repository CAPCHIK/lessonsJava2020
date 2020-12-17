package ru.capchik.ivbo_07_19.lesson14;
public class TaskHandler {

    @ActionAnnotation(type = "sum")
    public void argsSum(Data data) {
        int sum = 0;
        for (int arg :
                data.getNumbers()) {
            sum += arg;
        }
        System.out.println("Sum equals " + sum);
    }

    @ActionAnnotation(type = "print")
    public void printByDelimeter(Data data) {
        StringBuilder result = new StringBuilder();
        for (String word :
                data.getWords()) {
            result.append(word);
            if (!(data.getWords().size() - 1 == data.getWords().indexOf(word))) {
                result.append(data.getDelimeter());
            }
        }
        System.out.println(result);
    }
}
