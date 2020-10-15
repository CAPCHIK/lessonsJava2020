package ru.capchik.ivbo_12_19.lesson7.enums;

public class Main {
    public static void main(String[] args) {
        doSmth(ActionEnum.ACTION_THREE);
    }

    private static void doSmth(ActionEnum action){
        System.out.println(action.getText());
        switch (action) {
            case ACTION_ONE:
                System.out.println("Action1");
                break;
            case ACTION_TWO:
                System.out.println("Action two");
                break;
            case ACTION_THREE:
                System.out.println("Action ===");
                break;
        }
    }
}
