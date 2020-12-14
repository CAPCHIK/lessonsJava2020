package ru.capchik.ivbo_07_19.lesson15;

public class Documentation {
    /**
     * Method for adding two
     * @param argument number for adding
     * @return new number
     */
    public int doSomething(int argument) {
        return  argument + 3;
    }
    // Main method
    public static void main(String[] args) {
        new Documentation().doSomething(54);
    }
}
