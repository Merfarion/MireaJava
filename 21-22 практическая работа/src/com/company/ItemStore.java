package com.company;

import java.util.List;

public interface ItemStore {
    List<Item> getAll();

    Item get(int id);

    Item addItem(Item item);

    Item editItem(Item item);

    void deleteItem(Item item);
}
