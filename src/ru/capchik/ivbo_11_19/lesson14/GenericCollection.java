package ru.capchik.ivbo_11_19.lesson14;

public class GenericCollection<T extends Item> {
    private T field;

    public GenericCollection(T field) {
        this.field = field;
    }

    public T getField() {
        return field;
    }

    public int getTotalPrice() {
        return 45 * field.getPrice();
    }

    public void setField(T field) {
        this.field = field;
    }
}
