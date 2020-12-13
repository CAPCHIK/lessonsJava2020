package ru.capchik.ivbo_07_19.practice2728;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException, InvocationTargetException, IllegalAccessException {
        Gson gson = new Gson();
        Worker worker = new Worker();
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .GET()
                .uri(URI.create("http://gitlessons2020.rtuitlab.ru:3000/reflectionTasks"))
                .build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        JsonArray array = gson.fromJson(response.body(), JsonArray.class);
        List<Method> methods = Arrays.stream(Worker.class.getMethods())
                .filter(m -> Arrays.stream(m.getAnnotations()).anyMatch(a -> a instanceof Operation))
                .collect(Collectors.toList());

        for (JsonElement i : array) {
            for (Method j : methods) {
                if (i.getAsJsonObject().get("type").getAsString().equals(j.getName())) {
                    if (j.getName().equals("sum"))
                        j.invoke(worker, i.getAsJsonObject().get("data").getAsJsonObject().get("numbers"));

                    if (j.getName().equals("print")) {
                        worker.setDelimeter(i.getAsJsonObject().get("data").getAsJsonObject().get("delimeter").getAsString());
                        j.invoke(worker, i.getAsJsonObject().get("data").getAsJsonObject().get("words"));
                    }
                }
            }
        }
    }



}

