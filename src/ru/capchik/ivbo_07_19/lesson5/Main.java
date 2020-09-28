package ru.capchik.ivbo_07_19.lesson5;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<BaseClass> bc = new ArrayList<>();
        bc.add(new AnotherClass());
        bc.add(new BaseClass());
        bc.add(new BaseClass());
        bc.add(new BaseClass());
        System.out.println((int)6.7);
        for (int i = 0; i < bc.size(); i++) {
            BaseClass baseClass = bc.get(i);
            if (baseClass instanceof AnotherClass) {
                AnotherClass ac = (AnotherClass) baseClass;
                System.out.println(ac.anotherMethod());
            }
            System.out.println(baseClass.baseMethod());
        }

        MyContainer container = new MyContainer();
        container.hire(new BaseClass());
    }
}
