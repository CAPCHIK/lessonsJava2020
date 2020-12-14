package ru.capchik.ivbo_07_19.lesson14;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Handler {
    String url = "http://gitlessons2020.rtuitlab.ru:3000/reflectionTasks";
    HttpClient client = HttpClient.newHttpClient();
    Gson gson = new Gson();
    List<JsonObject> tasks = new ArrayList<>();
    Worker worker = new Worker();

    public Handler(Worker worker) {
        this.worker = worker;
    }

    public void getTasks() throws IOException, InterruptedException {
        HttpRequest request = HttpRequest.newBuilder()
                .GET()
                .uri(URI.create(url))
                .build();
        HttpResponse<String> response = client.send(request,HttpResponse.BodyHandlers.ofString());
        JsonArray tempTasks = gson.fromJson(response.body(),JsonArray.class);
        for (JsonElement je:tempTasks)
            tasks.add(je.getAsJsonObject());
    }

    public void doTasks(){
        List<Method> workerMethods = Arrays.stream(Worker.class.getMethods())
                .filter(m-> Arrays.stream(m.getAnnotations()).anyMatch(a->a instanceof Task))
                .collect(Collectors.toList());

        for (JsonObject task:tasks) {
            for (Method m:workerMethods) {
                if(task.get("type").getAsString().equals(m.getName())){
                    switch (m.getName()){
                        case "sum":
                            JsonArray args = task.get("data").getAsJsonObject().get("numbers").getAsJsonArray();
                            int[] arguments = new int[args.size()];
                            for (int i = 0; i < args.size(); i++) {
                                arguments[i] = args.get(i).getAsInt();
                            }
                            try {
                                m.invoke(worker,arguments);
                            } catch (IllegalAccessException | InvocationTargetException e) {
                                e.printStackTrace();
                            }
                            break;
                        case "print":
                            JsonObject data = task.get("data").getAsJsonObject();
                            char delimeter = data.get("delimeter").getAsCharacter();
                            JsonArray arg = data.getAsJsonArray("words");
                            String[] argument = new String[arg.size()];
                            for (int i = 0; i < arg.size(); i++) {
                                argument[i] = arg.get(i).getAsString();
                            }
                            try {
                                m.invoke(worker,argument,delimeter);
                            } catch (IllegalAccessException | InvocationTargetException e) {
                                e.printStackTrace();
                            }
                            break;
                    }
                }
            }
        }

    }
}
