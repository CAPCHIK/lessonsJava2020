package ru.capchik.fork.lab27_28;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Worker worker = new Worker();
        Class<Worker> workerExt = Worker.class;

        List<Method> methodList = Arrays.stream(workerExt.getDeclaredMethods())
                .filter(a -> Arrays.stream(a.getAnnotations()).anyMatch(b -> b instanceof Operation))
                .collect(Collectors.toList());

        List<RefTask> tasks = worker.getTasks();
        Operation op;

        for (RefTask task : tasks) {
            for (Method method : methodList) {
                op = method.getAnnotation(Operation.class);
                if (task.getType().equals(op.name())) {
                    try {
                        method.invoke(worker, task.getData());
                    } catch (IllegalAccessException | InvocationTargetException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
