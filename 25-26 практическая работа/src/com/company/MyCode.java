package com.company;

public class MyCode {
    public static void main(String[] args) {
        HashList hashList = new HashList();
        hashList.add("key1", 1);
        hashList.add("key1", 3);
        hashList.add("key2", -2);
        hashList.add("key3", 3.4);
        hashList.add("key4", "Hleb");
        hashList.add("key1", 90);
        hashList.add("key1", 1);
        hashList.add("key1", -655);
        hashList.add("key5", 12);
        hashList.add("key6", 56);
        hashList.add("key7", true);
        hashList.add("key8", -3.14);
        hashList.getALl();
        System.out.println(hashList.get("key4"));
        hashList.remove("key7");
        hashList.getALl();
        System.out.println(hashList.hashCode());
    }
}
