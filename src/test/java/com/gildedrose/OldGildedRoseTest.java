package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OldGildedRoseTest {
    @Test
    void backstageQualityIncrease2WhenSellInIsLessThan10() {
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", 9, 0) };
        OldGildedRose app = new OldGildedRose(items);
        app.updateQuality();
        assertEquals(2, app.items[0].quality);
    }

    @Test
    void backstageQualityIncrease3WhenSellInIsLessThan5() {
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", 4, 0) };
        OldGildedRose app = new OldGildedRose(items);
        app.updateQuality();
        assertEquals(3, app.items[0].quality);
    }

    @Test
    void backstageQualityShouldBe0WhenSellInIsLessThan0() {
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", -1, 50) };
        OldGildedRose app = new OldGildedRose(items);
        app.updateQuality();
        assertEquals(0, app.items[0].quality);
    }

    @Test
    void sulfuraShouldNotHaveQualityDecreased() {
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", -1, 50),
                new Item("Sulfuras, Hand of Ragnaros", -1, 50)};
        OldGildedRose app = new OldGildedRose(items);
        app.updateQuality();
        assertEquals(0, app.items[0].quality);
        assertEquals(50, app.items[1].quality);
    }

    @Test
    void agedBrieIncreaseQualityWhenSellInLessThan0() {
        Item[] items = new Item[] { new Item("Aged Brie", 2, 0)};
        OldGildedRose app = new OldGildedRose(items);
        app.updateQuality();
        assertEquals(1, app.items[0].quality);
    }
}