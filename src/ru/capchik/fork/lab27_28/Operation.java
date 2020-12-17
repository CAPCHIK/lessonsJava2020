package ru.capchik.fork.lab27_28;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface Operation {
    String name();
}
