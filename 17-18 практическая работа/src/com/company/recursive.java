package com.company;

import java.io.*;
import java.util.Scanner;

public class recursive {
    private File result;
    public recursive() {
        this.result = new File("C:/Users/gleba/IdeaProjects/MireaJava/17-18 практическая работа/src/com/company/result.md");
        result.delete();
    }
    public void fetchChild(File file) {
        Scanner sc = new Scanner(System.in);
        if (file.isDirectory()) {
            File[] children = file.listFiles();

            for (File child : children) {
                // Рекурсивный (Recursive)
                this.fetchChild(child);
            }
        }
        if(file.isFile()){
            if(file.getAbsolutePath().endsWith(".java")) {
                String path = file.getAbsolutePath();
                System.out.println(file.getAbsolutePath());
                //System.out.println(path);
                try (BufferedReader br = new BufferedReader(new FileReader(path));
                     FileWriter writer = new FileWriter(result,true);
                PrintWriter bw = new PrintWriter(writer)) {
                    String text = br.readLine();
                    bw.write("```java"+"\n");
                        while (text!= null) {
                System.out.println(text);
                bw.write(text);
                bw.write( "\n");
               text = br.readLine();
            }
                        bw.write("```"+"\n\n\n");
                }
                catch (IOException ex) {
                    System.out.println(ex.getMessage());
                }
            }
}}}
