package com.company;

public class Main {


    public static void main(String[] args) throws InterruptedException {
        Worker worker = new Worker();
        while (true) {
            worker.getTasks();
            worker.saveTask();
            worker.setToFile();
            Thread.sleep((int) Math.random() * 1000 + 1000);
        }
    }
}
