package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        System.out.println("Выберите решение: 1) с регулярными выражениями; 2)без регулярных выражений;");
        switch (h) {
            case 1: {
                System.out.print("Количество правил: ");
                int k = 0;
                try {
                    k = Integer.parseInt(scanner.nextLine());
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                }
                String path;
                String zamena;
                Map<String, String> rule = new HashMap<>();
                for (int i = 0; i < k; i++) {
                    Pattern pattern = Pattern.compile("(?<path>\\w+) (?<zamena>\\w+)");
                    Matcher matcher = pattern.matcher(scanner.nextLine());
                    if (matcher.find()) {
                        path = matcher.group("path");
                        zamena = matcher.group("zamena");
                        rule.put(path, zamena);
                    }
                }

                String text = scanner.next();
                List<Map.Entry<String, String>> ruleConvert = new ArrayList<>(rule.entrySet());
                StringBuilder regex = new StringBuilder();
                for (int i = 0; i < ruleConvert.size(); i++) {
                    regex.append(ruleConvert.get(i).getKey());
                    if (i < ruleConvert.size() - 1) {
                        regex.append("|");
                    }
                }
                Pattern onePattern = Pattern.compile(regex.toString());
                Matcher oneMatcher = onePattern.matcher(text);
                String result = oneMatcher.replaceAll(index -> rule.get(index.group()));
                System.out.println("result: " + result);
            }
            break;


            case 2: {
                System.out.print("Количество правил: ");
                int k = 0;
                try {
                    k = Integer.parseInt(scanner.nextLine());
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                }

                Map<String, String> rule = new HashMap<>();
                for (int i = 0; i < k; i++) {

                    rule.put(scanner.next(), scanner.next());
                }
                String text = scanner.next();
                String rezult = text;
                for (int i = 0; i < text.length(); i++) {
                    for (int j = 0; j < rule.size(); j++) {
                        String t = (String) rule.keySet().toArray()[j];
                        String r = (String) rule.values().toArray()[j];
                        if (i + t.length() < rezult.length() && rezult.substring(i, i + t.length()).equals(t)) {
                            rezult = rezult.replace(t, r + " ");
                            i += r.length();
                            break;
                        }
                    }
                }
                rezult = rezult.replace(" ", "");
                System.out.println(rezult);
            }
            break;
        }
    }
}