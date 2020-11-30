package com.company;

public class Reports {
    private int id;
    private int taskId;
    private String worker;
    private double result;

    public Reports(int id, int taskId, String worker, double result) {
        this.id = id;
        this.taskId = taskId;
        this.worker = worker;
        result = (Math.round(result * Math.pow(10, 2)) / Math.pow(10, 2));
        this.result = result;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTaskId() {
        return taskId;
    }

    public void setTaskId(int taskId) {
        this.taskId = taskId;
    }

    public String getWorker() {
        return worker;
    }

    public void setWorker(String worker) {
        this.worker = worker;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", taskId=" + taskId +
                ", worker='" + worker + '\'' +
                ", result=" + result +
                '}';
    }
}
