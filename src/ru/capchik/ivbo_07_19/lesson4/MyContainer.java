package ru.capchik.ivbo_07_19.lesson4;

import java.util.ArrayList;

public class MyContainer {
    private ArrayList<BaseClass> list;

    public MyContainer() {
        list = new ArrayList<>();
    }
    public void hire(BaseClass baseClass) {
        list.add(baseClass);
    }
}
