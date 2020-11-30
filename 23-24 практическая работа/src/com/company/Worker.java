package com.company;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Worker {
    private static final Gson gson = new Gson();
    private static final HttpClient httpclient = HttpClient.newHttpClient();
    private static final String pathTasks = "http://gitlessons2020.rtuitlab.ru:3000/tasks";
    private static final String pathReports = "http://gitlessons2020.rtuitlab.ru:3000/reports";
    private static final String pathFile = "C:/Users/gleba/IdeaProjects/MireaJava/23-24 практическая работа/src/com/company/db.json";
    private static final File file = new File(pathFile);
    private List<Tasks> tasks = new ArrayList<>();
    private List<Tasks> readyTask;

    public void getTasks() {
        Type collectionType = new TypeToken<Collection<Tasks>>() {
        }.getType();
        HttpRequest request = HttpRequest.newBuilder().GET().uri(URI.create(pathTasks))
                .build();
        HttpResponse<String> response = null;
        try {
            response = httpclient.send(request, HttpResponse.BodyHandlers.ofString());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        tasks = gson.fromJson(response.body(), collectionType);
    }

    public void setToFile() {
        try (FileReader reader = new FileReader(file.getAbsolutePath());
             FileWriter writer = new FileWriter(file, false)) {
            writer.write("[");
            for (int i = 0; i < tasks.size(); i++) {

                if (i != 0)
                    writer.write(",\n");
                writer.write(gson.toJson(tasks.get(i)));

            }
            writer.write("]");
        } catch (IOException e) {
            e.getMessage();
        }
    }

    public void saveTask() {
        if (readyTask == null) {
            readyTask = new ArrayList<>();
            for (int i = 0; i < tasks.size(); i++) {
                readyTask.add(tasks.get(i));
                getReport(new Reports(0, tasks.get(i).getId(), "Karvasarniy", result(tasks.get(i))));

            }
        } else {
            for (int i = 0; i < tasks.size(); i++) {
                int k = 0;
                for (int j = 0; j < readyTask.size(); j++) {
                    if (readyTask.get(j).getId() != tasks.get(i).getId()) {
                        k++;
                    }
                }
                if (k == readyTask.size()) {
                    getReport(new Reports(0, tasks.get(i).getId(), "Karvasarniy", result(tasks.get(i))));
                    readyTask.add(tasks.get(i));
                }
            }
        }
    }

    private double result(Tasks tasks) {
        String example = tasks.getExpression();
        double a, b;
        String operations;
        example = example.replace(" ", "");
        String[] examples = example.split("(?<=\\d)(?=\\D)|(?<=\\D)(?=\\D)|(?<=\\d\\D)(?=\\d)");
        a = Double.parseDouble(examples[0]);
        b = Double.parseDouble(examples[2]);
        operations = examples[1];
        switch (operations) {
            case "+":
                return a + b;
            case "*":
                return a * b;
            case "-":
                return a - b;
            case "/":
                return a / b;
        }
        return 0;
    }

    private void getReport(Reports report) {
        HttpRequest request = HttpRequest.newBuilder()
                .POST(HttpRequest.BodyPublishers.ofString(gson.toJson(report)))
                .uri(URI.create("http://gitlessons2020.rtuitlab.ru:3000/reports"))
                .setHeader("Content-Type", "application/json")
                .build();
        try {
            httpclient.send(request, HttpResponse.BodyHandlers.ofString());
            System.out.println("Отправлено");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void delete(int start, int end) {
        for (int id = start; id <= end; id++) {
            HttpRequest request = HttpRequest.newBuilder()
                    .DELETE()
                    .uri(URI.create(pathReports + "/" + id))
                    .build();
            try {
                httpclient.send(request, HttpResponse.BodyHandlers.ofString());
            } catch (IOException e) {
                e.printStackTrace();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
