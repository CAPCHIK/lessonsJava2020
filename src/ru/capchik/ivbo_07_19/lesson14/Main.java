package ru.capchik.ivbo_07_19.lesson14;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    static String address = "http://gitlessons2020.rtuitlab.ru:3000/reflectionTasks";
    static HttpClient httpClient = HttpClient.newHttpClient();
    static Gson gson = new Gson();

    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        TaskHandler taskHandler = new TaskHandler();
        Class<? extends TaskHandler> thClass = taskHandler.getClass();
        List<Task> taskList = getAllTasks();
        List<Method> methodList = Arrays.stream(thClass.getDeclaredMethods())
                .filter(m -> Arrays.stream(m.getAnnotations())
                .anyMatch(a -> a instanceof ActionAnnotation))
                .collect(Collectors.toList());
        for (Task task:
             taskList) {
            for (Method method:
                 methodList) {
                ActionAnnotation annotation = method.getAnnotation(ActionAnnotation.class);
                if (annotation.type().equals(task.getType()))
                    method.invoke(taskHandler, task.getData());
            }
        }
    }

    public static List<Task> getAllTasks() {
        List<Task> taskList = null;
        Type collectionType = new TypeToken<Collection<Task>>() {
        }.getType();
        try {
            HttpRequest request = HttpRequest.newBuilder()
                    .GET()
                    .uri(URI.create(address))
                    .build();
            HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
            taskList = gson.fromJson(response.body(), collectionType);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return taskList;

    }
}
