package ru.capchik.ivbo_07_19.lesson11;

import java.util.List;

public interface ItemsStore {
    List<Item> getAll();
    Item get(int id);
    Item addItem(Item item);
    Item editItem(Item item);
    void deleteItem(Item item);
}
