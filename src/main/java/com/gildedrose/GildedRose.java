package com.gildedrose;

import java.util.ArrayList;
import java.util.List;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public List<Item> updateQuality() {
        List<Item> updatedItems = new ArrayList<>();

        for (Item item : items) {
            Item itemToBeUpdated = item.createItem(item);
            Item updatedItem = itemToBeUpdated.updateItem();
            updatedItems.add(updatedItem);
        }

        return updatedItems;
    }
}