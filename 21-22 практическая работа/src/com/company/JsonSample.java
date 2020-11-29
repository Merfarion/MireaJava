package com.company;

import com.google.gson.Gson;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JsonSample {
    static HttpClient httpClient = HttpClient.newHttpClient();
    static Gson gson = new Gson();
    public static void main(String[] args) throws IOException, InterruptedException {
        List<Item> items = new ArrayList<Item>();
        items.add(new Item(1, "Hi", true, "Sasha"));
        items.add(new Item(2, "Hello", false, "Ball"));
        items.add(new Item(3, "Danke", true, "Region"));
        items.add(new Item(4, "Привет", false, "Russia"));
        items.add(new Item(5, "Java", true, "Draw"));
        items.add(new Item(6, "Frog pepe", false, "Critek"));
        items.add(new Item(7, "Champion", true, "Blizzard"));
        items.add(new Item(8, "dear", false, "war"));
        File file = new File("C:/Users/gleba/IdeaProjects/MireaJava/21-22 практическая работа/src/com/company/data.json");
        int k = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите вариант, куда залить список item-ов: \n 1) В сервер; 2) В файл");
        k = scanner.nextInt();
        switch (k) {
            case 1: {
                Api api = new Api();
                for (int i = 0; i < items.size(); i++) {


                    String body = gson.toJson(items.get(i));
                    HttpRequest request = HttpRequest.newBuilder()
                            .POST(HttpRequest.BodyPublishers.ofString(body))
                            .uri(URI.create("http://localhost:3000/"))
                            .setHeader("Content-Type", "application/json")
                            .build();
                    HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
                    System.out.println(response.body());


                }
                while (true) {
                    System.out.println("Что вы хотите сделать?: \n 1) Вывести список на экран; \n 2) Вывести объект на экран по id; \n 3) Изменить данные объекта; \n 4) Удалить объект;\n 5) Добавить объект; \n 0) Закончить работу ");
                    k = scanner.nextInt();
                    if (k == 0) break;
                    switch (k) {
                        case 1: {
                            System.out.println(api.getAll());
                        }
                        break;
                        case 2: {
                            System.out.println(api.get(scanner.nextInt()));
                        }
                        break;
                        case 3: {
                            api.editItem(items.get(scanner.nextInt()));
                        }
                        break;
                        case 4: {
                            api.deleteItem(scanner.nextInt());
                        }
                        break;
                        case 5: {
                            System.out.println("Введите id");
                            int id = 0;
                            id = scanner.nextInt();
                            System.out.println("Введите имя");
                            String name = scanner.next();
                            System.out.println("Введите состояние");
                            boolean isGood = scanner.nextBoolean();
                            System.out.println("Введите инфу");
                            String description = scanner.next();
                            Item item = new Item(id, name, isGood, description);
                            api.addItem(item);
                        }
                        break;
                    }
                }
            }
            break;
            case 2: {
                Data data = new Data();
                try (FileReader reader = new FileReader(file.getAbsolutePath());
                     FileWriter writer = new FileWriter(file, false)) {
                    writer.write("[\n");
                    for (int i = 0; i < items.size(); i++) {
                        if (i != 0) {
                            writer.write(",\n");
                        }
                        writer.write(gson.toJson(items.get(i)));
                    }

                    writer.write("]");

                } catch (IOException e) {
                    e.getMessage();
                }
                while (true) {
                    System.out.println("Что вы хотите сделать?: \n 1) Вывести список на экран; \n 2) Вывести объект на экран по id; \n 3) Изменить данные объекта; \n 4) Удалить объект;\n 5) Добавить объект; \n 0) Закончить работу ");
                    k = scanner.nextInt();
                    if (k == 0) break;
                    switch (k) {
                        case 1: {

                            items = data.getAll();
                            for (int i = 0; i < items.size(); i++) {
                                System.out.println("Item{ id = " + items.get(i).getId() + ", data = " + items.get(i).getData() + ", isGood = " + items.get(i).isGood() + "}");
                            }
                        }
                        break;
                        case 2: {
                            data.get(scanner.nextInt());
                        }
                        break;
                        case 3: {
                            data.editItem(items.get(scanner.nextInt()));
                            try (FileReader reader = new FileReader(file.getAbsolutePath());
                                 FileWriter writer = new FileWriter(file, false)) {
                                writer.write("[\n");
                                for (int i = 0; i < items.size(); i++) {
                                    if (i != 0) {
                                        writer.write(",\n");
                                    }
                                    writer.write(gson.toJson(items.get(i)));
                                }

                                writer.write("]");

                            } catch (IOException e) {
                                e.getMessage();
                            }
                        }
                        break;
                        case 4: {
                            data.deleteItem(scanner.nextInt());
                        }
                        break;
                        case 5: {
                            System.out.println("Введите id");
                            int id = 0;
                            id = scanner.nextInt();
                            System.out.println("Введите имя");
                            String name = scanner.next();
                            System.out.println("Введите состояние");
                            boolean isGood = scanner.nextBoolean();
                            System.out.println("Введите инфу");
                            String description = scanner.next();
                            Item item = new Item(id, name, isGood, description);
                            data.addItem(item);
                        }
                        break;
                    }
                }
            }
            break;
        }
    }
}
