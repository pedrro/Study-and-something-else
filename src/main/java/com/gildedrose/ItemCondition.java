package com.gildedrose;

public class ItemCondition {
    public static boolean isQualityItem(Item item) {
        return item.quality > 0;
    }

    public static void decreaseQuality(Item item) {
        item.quality = item.quality - 1;
    }

    public static boolean qualityLessThan50(Item item) {
        return item.quality <= 50;
    }
    public static void increaseQuality(Item item) {
        item.quality += 1;
    }

    public static void increaseQualityIfSellInIsLessThan(int day, Item item) {
        if (item.sellIn <= day) {
            if (qualityLessThan50(item)) {
                increaseQuality(item);
            }
        }
    }

}
