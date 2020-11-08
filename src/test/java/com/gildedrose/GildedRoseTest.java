package com.gildedrose;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

class GildedRoseTest {

    @Test
    void backstageQualityIncrease2WhenSellInIsLessThan10() {
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", 9, 0) };

        GildedRose app = new GildedRose(items);
        List<Item> itemList = app.updateQuality();
        assertEquals(2, itemList.get(0).quality);
    }


    @Test
    void backstageQualityIncrease3WhenSellInIsLessThan5() {
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", 4, 0) };
        GildedRose app = new GildedRose(items);
        List<Item> itemList = app.updateQuality();
        assertEquals(3, itemList.get(0).quality);
    }

    @Test
    void backstageQualityShouldBe0WhenSellInIsLessThan0() {
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", -1, 50) };
        GildedRose app = new GildedRose(items);
        List<Item> itemList = app.updateQuality();
        assertEquals(0, itemList.get(0).quality);
    }

    @Test
    void sulfuraShouldNotHaveQualityDecreased() {
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", -1, 50),
                new Item("Sulfuras, Hand of Ragnaros", -1, 50)};
        GildedRose app = new GildedRose(items);
        List<Item> itemList = app.updateQuality();
        assertEquals(0, itemList.get(0).quality);
        assertEquals(50, itemList.get(1).quality);
    }

    @Test
    void agedBrieIncreaseQualityWhenSellInLessThan0() {
        Item[] items = new Item[] { new Item("Aged Brie", 2, 0)};
        GildedRose app = new GildedRose(items);
        List<Item> itemList = app.updateQuality();
        assertEquals(1, itemList.get(0).quality);
    }
}
