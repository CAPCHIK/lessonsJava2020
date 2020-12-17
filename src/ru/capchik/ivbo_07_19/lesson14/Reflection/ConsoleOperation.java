package ru.capchik.ivbo_07_19.lesson14.Reflection;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface ConsoleOperation {
    String title();
    int key();
}
