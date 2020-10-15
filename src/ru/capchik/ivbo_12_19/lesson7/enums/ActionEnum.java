package ru.capchik.ivbo_12_19.lesson7.enums;

public enum ActionEnum {
    ACTION_ONE("Stored Action1"),
    ACTION_TWO("Stored Action two"),
    ACTION_THREE("Stored Action ===");

    private String text;

    ActionEnum(String text) {
        this.text = text;
    }
    public String getText() {
        return text;
    }
}
