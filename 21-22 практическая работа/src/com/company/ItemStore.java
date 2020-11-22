package com.company;

import java.io.IOException;
import java.util.List;

public interface ItemStore {
    List<Item> getAll();

    Item get(int id);

    Item addItem(Item item) throws IOException, InterruptedException;

    Item editItem(Item item);

    void deleteItem(int id);
}
