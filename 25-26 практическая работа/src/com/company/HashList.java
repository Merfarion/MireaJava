package com.company;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.Random;

public class HashList<K, V> implements HashMapInterface<K, V> {
    private final ArrayList<ArrayList<Items<K, V>>> list;
    private final int listSize = 4;
    Random random = new Random();

    public HashList() {
        list = new ArrayList<>(listSize);
        for (int i = 0; i < listSize; i++) {
            list.add(new ArrayList<Items<K, V>>());
        }
    }

    public void getALl() {
        for (int i = 0; i < 4; i++) {
            for (Items items : list.get(i)
            ) {
                System.out.println(items.toString());
            }
            System.out.println();
        }

    }

    @Override
    public void add(K key, V value) {
        boolean b = false;
        int index = key.hashCode() % list.size();
        for (int i = 0; i < list.get(index).size(); i++) {
            if (key == list.get(index).get(i).getKey()) {
                list.get(index).get(i).setValue(value);
                b = true;
            }
        }
        if (b == false) {
            list.get(index).add(new Items<>(key, value));
        }
    }

    @Override
    public V get(K key) {
        int index = key.hashCode() % list.size();
        for (int i = 0; i < list.get(index).size(); i++) {
            if (key == list.get(index).get(i).getKey()) {
                return list.get(index).get(i).getValue();
            }
        }
        return null;
    }

    @Override
    public V remove(K key) {
        int index = key.hashCode() % list.size();
        for (int i = 0; i < list.get(index).size(); i++) {
            if (key == list.get(index).get(i).getKey()) {
                list.get(index).remove(list.get(index).get(i));
            }
        }
        return null;
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HashList<?, ?> hashList = (HashList<?, ?>) o;
        return list.equals(hashList.list);
    }

    @Override
    public int hashCode() {
        return Objects.hash(list);
    }
}
