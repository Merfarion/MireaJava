package com.company;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.*;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Data implements ItemStore {
    private final File file = new File("C:/Users/gleba/IdeaProjects/MireaJava/21-22 практическая работа/src/com/company/data.json");
    Scanner scanner = new Scanner(System.in);
    Gson gson = new Gson();

    public Data() throws IOException {
        file.createNewFile();
    }

    @Override
    public List<Item> getAll() {
        List<Item> items = new ArrayList<>();
        Type type = new TypeToken<List<Item>>() {
        }.getType();
        try (FileReader reader = new FileReader(file)) {
            items = gson.fromJson(reader, type);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return items;
    }

    @Override
    public Item get(int id) {
        List<Item> items = getAll();
        for (int i = 0; i < items.size(); i++) {
            if (id == (items.get(i).getId())) {
                System.out.println(items.get(i));
                System.out.println(items.get(i).getId());
            }
        }
        return null;
    }

    @Override
    public Item addItem(Item item) {
        List<Item> items = getAll();
        items.add(item);
        run(items);
        return item;
    }

    @Override
    public Item editItem(Item item) {
        System.out.println("Что хотите изменить?: \n 1)Id;\n 2) Data;\n 3)isGood;\n 4)description");
        int k = scanner.nextInt();
        switch (k) {
            case 1: {
                item.setId(scanner.nextInt());

            }
            break;
            case 2: {
                item.setData(scanner.nextLine());
            }
            break;
            case 3: {
                item.setGood(scanner.nextBoolean());
            }
            break;
            case 4: {
                item.setDescription(scanner.nextLine());
            }
            break;
        }
        return null;
    }

    @Override
    public void deleteItem(int id) {
        List<Item> items = getAll();
        for (int i = 0; i < items.size(); i++) {
            items.remove(i);
        }
        run(items);
    }

    public void run(List<Item> items) {
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
}