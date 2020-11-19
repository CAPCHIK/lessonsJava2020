package ru.capchik.ivbo_11_19.lesson12;

import ru.capchik.ivbo_07_19.lesson11.Item;

import java.util.List;

public interface ItemsStore {
    List<Item> getAll();
    Item get(int id);
    Item addItem(Item item);
    Item editItem(int id, Item item);
    void deleteItem(int id);
}
