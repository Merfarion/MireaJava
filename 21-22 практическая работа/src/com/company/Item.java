package com.company;

public class Item {
    private int id;
    private String data;
    private boolean flag;
    private int someNumber;

    public Item(int id, String data, boolean flag, int someNumber) {
        this.id = id;
        this.data = data;
        this.flag = flag;
        this.someNumber = someNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public int getSomeNumber() {
        return someNumber;
    }

    public void setSomeNumber(int someNumber) {
        this.someNumber = someNumber;
    }

    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", data='" + data + '\'' +
                ", flag=" + flag +
                ", someNumber=" + someNumber +
                '}';
    }
}
