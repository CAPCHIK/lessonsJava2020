package ru.capchik.fork.lab27_28;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;

public class Worker {
    private final static String path = "http://gitlessons2020.rtuitlab.ru:3000/reflectionTasks";
    private static final HttpClient client = HttpClient.newHttpClient();
    private static final Gson gson = new Gson();

    @Operation(name = "sum")
    public void sum(Data data) {
        int s = 0;
        for (int i : data.getNumbers()) s += i;
        System.out.println("Sum is: " + s);
    }

    @Operation(name = "print")
    public void print(Data data) {
        System.out.println("Some words: ");
        for (String w : data.getWords()) {
            if (data.getWords().indexOf(w) != data.getWords().size() - 1)
                System.out.print(w + " " + data.getDelimeter() + " ");
            else
                System.out.print(w);
        }
    }

    public List<RefTask> getTasks() {
        List<RefTask> tasks;
        tasks = null;
        HttpRequest request = HttpRequest.newBuilder().GET().uri(URI.create(path)).build();
        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            tasks = gson.fromJson(response.body(), new TypeToken<List<RefTask>>() {
            }.getType());
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
        return tasks;
    }
}
