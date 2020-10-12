package ru.capchik.ivbo_07_19.lesson6;

public enum SampleEnum {
    ACTION_ONE(123),
    ACTION_TWO(65),
    ACTION_ANOTHER(76);

    private final int field;

    SampleEnum(int field) {
        this.field = field;
    }

    public int getField() {
        return field;
    }
}
