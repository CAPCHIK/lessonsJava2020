package ru.capchik.ivbo_11_19.lesson7;

public enum ActionEnum {
    ACTION_ONE("Action 1"),
    ACTION_TWO("Action TWO"),
    ACTION_THREE("Action Another");
    private final String text;

    ActionEnum(String text) {
        this.text = text;
    }
    public String getText() {
        return text;
    }
}
