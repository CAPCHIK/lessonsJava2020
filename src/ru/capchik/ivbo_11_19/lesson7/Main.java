package ru.capchik.ivbo_11_19.lesson7;

import ru.capchik.ivbo_07_19.lesson5.swing.ActionConstants;

public class Main {
    public static void main(String[] args) {
//        ActionEnum enumValue = new ActionEnum();
        doSmth(ActionEnum.ACTION_ONE);
    }

    public static void doSmth(ActionEnum action) {
        System.out.println(action.getText());
        switch (action) {
            case ACTION_ONE:
                System.out.println("Action 1");
                break;
            case ACTION_TWO:
                System.out.println("Action TWO");
                break;
            case ACTION_THREE:
                System.out.println("Action Another");
                break;
            default:
                System.out.println("Strange action");
                break;
        }
    }
}
