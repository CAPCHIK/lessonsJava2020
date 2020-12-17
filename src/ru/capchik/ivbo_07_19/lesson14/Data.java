package ru.capchik.ivbo_07_19.lesson14;
import java.util.ArrayList;

public class Data {
    private ArrayList<Integer> numbers = new ArrayList<>();
    private ArrayList<String> words = new ArrayList<>();

    private String delimeter;

    public ArrayList<Integer> getNumbers() {
        return numbers;
    }

    public void setNumbers(ArrayList<Integer> numbers) {
        this.numbers = numbers;
    }

    public ArrayList<String> getWords() {
        return words;
    }

    public void setWords(ArrayList<String> words) {
        this.words = words;
    }

    public String getDelimeter() {
        return delimeter;
    }

    public void setDelimeter(String delimeter) {
        this.delimeter = delimeter;
    }

    @Override
    public String toString() {
        return "Data{" +
                "numbers=" + numbers +
                ", words=" + words +
                ", delimeter='" + delimeter + '\'' +
                '}';
    }
}
