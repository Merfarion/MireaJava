package com.company;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.IOException;
import java.lang.reflect.Type;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Collection;
import java.util.List;

public class Api implements ItemStore {
    private static final HttpClient httpClient = HttpClient.newHttpClient();
    private static final Gson gson = new Gson();

    @Override
    public List<Item> getAll() {
        Type collectionType = new TypeToken<Collection<Item>>() {
        }.getType();
        HttpRequest request = HttpRequest.newBuilder().GET().uri(URI.create("http://localhost:3000/"))
                .build();
        HttpResponse<String> response = null;
        try {
            response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        List<Item> items = gson.fromJson(response.body(), collectionType);
        return items;
    }

    @Override
    public Item get(int id) {
        HttpRequest request = HttpRequest.newBuilder().GET()
                .uri(URI.create("http://localhost:3000/"))
                .build();
        HttpResponse<String> response = null;
        try {
            response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return gson.fromJson(response.body(), Item.class);
    }

    @Override
    public Item addItem(Item item) throws IOException, InterruptedException {
        String body = gson.toJson(item);
        HttpRequest request = HttpRequest.newBuilder()
                .POST(HttpRequest.BodyPublishers.ofString(body))
                .uri(URI.create("http://localhost:3000/"))
                .setHeader("Content-Type", "application/json")
                .build();
        HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());
        return gson.fromJson(response.body(), Item.class);
    }

    @Override
    public Item editItem(Item item) {
        HttpRequest request = HttpRequest.newBuilder()
                .PUT(HttpRequest.BodyPublishers.ofString(gson.toJson(item)))
                .uri(URI.create("http://localhost:3000/" + "/" + item.getId()))
                .build();
        try {
            HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return get(item.getId());
    }

    @Override
    public void deleteItem(int id) {
        HttpRequest request = HttpRequest.newBuilder()
                .DELETE()
                .uri(URI.create("http://localhost:3000/" + "/" + id))
                .build();
        try {
            HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
            System.out.println(response.body());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
