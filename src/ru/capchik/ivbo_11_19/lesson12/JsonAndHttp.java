package ru.capchik.ivbo_11_19.lesson12;

import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class JsonAndHttp {
    private static HttpClient httpClient = HttpClient.newHttpClient();
    private static Gson gson = new Gson();

    public static void main(String[] args) throws IOException, InterruptedException {
        postRequest(new Item(0, "Hello from java", true, "Descr from java"));
    }

    private static void postRequest(Item item) throws IOException, InterruptedException {
        String itemJson = gson.toJson(item);
        item.setId(0);
        HttpRequest request = HttpRequest.newBuilder()
                .POST(HttpRequest.BodyPublishers.ofString(itemJson))
                .uri(URI.create("http://80.87.199.76:3000/objects"))
                .setHeader("Content-Type", "application/json")
                .build();

        HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());
        System.out.println(response.statusCode());
    }

    private static void getRequest() throws IOException, InterruptedException {
        HttpRequest request = HttpRequest.newBuilder()
                .GET()
                .uri(URI.create("http://80.87.199.76:3000/objects"))
                .build();

        HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());
    }

    private static void jsonExample() {
        Item item = new Item(0, "some data", true, "some log description");

        System.out.println(gson.toJson(item));

        Item fromJson = gson.fromJson("{\"id\":-656,\"data\":\"some data\",\"isGood\":false,\"description\":\"some long description\"}", Item.class);

        System.out.println(fromJson.getId());
        System.out.println(fromJson.getData());
        System.out.println(fromJson.isGood());
        System.out.println(fromJson.getDescription());

    }
}
