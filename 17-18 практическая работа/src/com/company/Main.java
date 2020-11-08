package com.company;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.SplittableRandom;

public class Main {
    public static void main(String[] args){
        File folder = new File("C:/Users/gleba/IdeaProjects/MireaJava/");
        File result = new File("C:/Users/gleba/IdeaProjects/MireaJava/17-18 практическая работа/src/com/company/result.md");
        for (File file:folder.listFiles()
             ) {
            if (folder.isDirectory()){
                file = file.getAbsoluteFile();
            }
            System.out.println(file.getName());
        }
        File[]children = folder.listFiles();
        for (File file : children) {
            System.out.println(file.getAbsolutePath());
        }
        System.out.println("\n-----------------------");
        System.out.println("String[] list():\n");

        String[] paths = folder.list();
        for (String path : paths) {

            System.out.println(path);
        }
        recursive recursive = new recursive();
        recursive.fetchChild(folder);
//        if (folder.isDirectory()){
//
//            }
        }
//        Path path = Paths.get(".");
//
//        String basePath = "";
//        String mainFile = basePath + "/Main.java";
//        String newFile = basePath + "/Copy.txt";
//        File file = new File(mainFile);
//        if (file.isDirectory()) {
//            String[] list = file.list();
//
//            for (String s : list) {
//                System.out.println(Paths.get(basePath, s).toAbsolutePath());
//            }
//        }
//        Scanner sc = new Scanner(System.in);
//        String mainFilePath = file.getAbsolutePath();
//        try {
//            try (
//                    BufferedReader reader = new BufferedReader(new FileReader(mainFilePath));
//                    PrintWriter writer = new PrintWriter(newFile)) {
//                String line = reader.readLine();
//                while (line != null) {
//                    System.out.println(line);
//                    writer.write(line);
//                    writer.write('\n');
//                    sc.nextLine();
//                    line = reader.readLine();
//                }
//            }
//        } catch (FileNotFoundException e) {
//            System.out.println("Incorrect file path");
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        System.out.println(path);
    }


