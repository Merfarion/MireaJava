package com.company;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        File folder = new File("C:/Users/gleba/IdeaProjects/MireaJava/");
        File result = new File("C:/Users/gleba/IdeaProjects/MireaJava/17-18 практическая работа/src/com/company/result.md");

        recursive recursive = new recursive();
        recursive.fetchChild(folder);
    }
    }


