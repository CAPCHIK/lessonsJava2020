package ru.capchik.ivbo_07_19.lesson14.Reflection;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

@MyAnnotation(someField = "Hello, annotation")
public class ReflectionExample {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, InvocationTargetException {
        Scanner scanner = new Scanner(System.in);
        Worker worker = new Worker();
        Class<? extends Worker> aClass = worker.getClass();
        System.out.println("Enter command:");
        List<Method> declaredMethods = Arrays.stream(aClass.getDeclaredMethods())
                .filter(m -> Arrays.stream(m.getAnnotations()).anyMatch(a -> a instanceof ConsoleOperation))
                .sorted(Comparator.comparingInt(m -> m.getAnnotation(ConsoleOperation.class).key()))
                .collect(Collectors.toList());
        for(Method declaredMethod : declaredMethods) {
            ConsoleOperation operation = declaredMethod.getAnnotation(ConsoleOperation.class);
            System.out.println(operation.key() + " for " + operation.title());
        }
        int operation = scanner.nextInt();
        declaredMethods.get(operation).invoke(worker);

        // workWithClassAnnotation
        // workWithFields();
    }


    public static void workWithClassAnnotation() {
        Class<ReflectionExample> thisClass = ReflectionExample.class;
        Annotation[] annotations = thisClass.getAnnotations();
        for(Annotation annotation : annotations) {
            System.out.println(annotation.getClass().getName());
            if(annotation instanceof MyAnnotation) {
                MyAnnotation myAnnotation = (MyAnnotation) annotation;
                System.out.println(myAnnotation.someField());
            }
        }
    }

    public static void workWithFields() throws IllegalAccessException, NoSuchFieldException {
        Item item = new Item(23,"Hello world", 43.0);
        System.out.println(item);
        Class<Item> itemClass = Item.class;
        Class<? extends Item> aClass = item.getClass();
        Method[] declaredMethods = itemClass.getDeclaredMethods();
        System.out.println("\nMethods");
        for(Method method : declaredMethods) {
            System.out.println(method.getName());
        }
        System.out.println("\nFields");
        Field[] declaredFields = itemClass.getDeclaredFields();
        for(Field field : declaredFields)
        {
            System.out.println(field.getName());
            System.out.println(Modifier.toString(field.getModifiers()));
        }

        Field idField = itemClass.getDeclaredField("id");
        idField.setAccessible(true);
        System.out.println(idField.getInt(item));
        idField.set(item, 3435);
        System.out.println(idField.getInt(item));
        System.out.println(item);
    }
}
