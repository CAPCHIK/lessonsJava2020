package ru.capchik.ivbo_11_19.lesson14;

public interface StackInterface<T> extends Iterable<T> {
    void add(T item);
    T pop();
    int size();
}
