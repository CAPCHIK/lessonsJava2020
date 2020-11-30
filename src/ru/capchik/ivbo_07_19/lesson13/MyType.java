package ru.capchik.ivbo_07_19.lesson13;

public class MyType<T extends Item> {
    private T field;

    public MyType(T field) {
        this.field = field;
    }

    public T getField() {
        System.out.println(field.getPrice());
        return field;
    }

    public void setField(T field) {
        this.field = field;
    }
}
