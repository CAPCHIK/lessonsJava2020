package ru.capchik.ivbo_07_19.lesson14;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        Handler handler = new Handler(new Worker());
        try {
            handler.getTasks();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        handler.doTasks();

    }
}
