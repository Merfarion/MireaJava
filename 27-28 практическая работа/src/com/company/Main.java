package com.company;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    private static final HttpClient httpClient = HttpClient.newHttpClient();
    private static final Gson gson = new Gson();

    public static void main(String[] args) throws IOException, InterruptedException, InvocationTargetException, IllegalAccessException {
        List<Task> tasks = new ArrayList<>();
        Type collectionType = new TypeToken<Collection<Task>>() {
        }.getType();
        HttpRequest request = HttpRequest.newBuilder()
                .GET()
                .uri(URI.create("http://gitlessons2020.rtuitlab.ru:3000/reflectionTasks"))
                .build();
        HttpResponse<String> response = null;
        response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
        tasks = gson.fromJson(response.body(), collectionType);
        Worker worker = new Worker();
        Class<? extends Worker> aClass = worker.getClass();
        List<Method> declaredMethods = Arrays.stream(aClass.getDeclaredMethods())
                .filter(m -> Arrays.stream(m.getAnnotations()).anyMatch((a -> a instanceof MyAnnotation)))
                .collect(Collectors.toList());
        for (int j = 0; j < tasks.size(); j++) {
            for (int i = 0; i < declaredMethods.size(); i++) {
                MyAnnotation myAnnotation = declaredMethods.get(i).getAnnotation(MyAnnotation.class);
                if (myAnnotation.someField().equals(tasks.get(j).getType())) {
                    declaredMethods.get(i).invoke(worker, tasks.get(i).getData());
                }
                //System.out.println(myAnnotation.someField());
                //System.out.println(tasks.get(i).getType());
                // declaredMethods.get(i).invoke(worker,tasks.get(i).getData());
                //System.out.println(tasks.get(i).getData().toString());
                //System.out.println(i + " " + myAnnotation.someField() + " for " + declaredMethods.get(i).getName());
            }
        }
//        Scanner scanner = new Scanner(System.in);
//        int operation = scanner.nextInt();
//        declaredMethods.get(operation).invoke(worker,tasks.get(operation).getData());
    }
}
