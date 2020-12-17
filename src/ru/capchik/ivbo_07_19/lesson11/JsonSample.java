package ru.capchik.ivbo_07_19.lesson11;

import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class JsonSample {
    static HttpClient httpClient = HttpClient.newHttpClient();
    static Gson gson = new Gson();
    public static void main(String[] args) throws IOException, InterruptedException {
        Item item = new Item(1, "asd", false, "SOME LONG TEXT");
        System.out.println(gson.toJson(item));

        Item fromJson = gson.fromJson("{\"name\":\"Name item\",\"price\":-43545,\"id\":34,\"description\":\"SOME LONG TEXT\"}", Item.class);
        System.out.println(fromJson);
        fromJson.setId(545);
       // addItem(new Item(0, "asdd3d21", true, "DESCR FROM JAVA"));

//        HttpRequest request = HttpRequest.newBuilder()
//                .GET()
//                .uri(URI.create("http://80.87.199.76:3000/objects"))
//                .build();
//
//        HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
//        System.out.println(response.body());


    }
    private static void addItem(Item item) throws IOException, InterruptedException {
        String body = gson.toJson(item);
        HttpRequest request = HttpRequest.newBuilder()
                .POST(HttpRequest.BodyPublishers.ofString(body))
                .uri(URI.create("http://80.87.199.76:3000/objects"))
                .setHeader("Content-Type", "application/json")
                .build();
        HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());
    }

}
