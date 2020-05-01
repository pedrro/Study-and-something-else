package com.gildedrose;

import static com.gildedrose.ItemCondition.*;

public class Brie extends Item {
    public Brie(int sellIn, int quality) {
        super("Aged Brie", sellIn, quality);
    }

    @Override
    protected Item updateItem() {
        if (qualityLessThan50(this)) {
            increaseQuality(this);
        }

        sellIn = sellIn - 1;

        increaseQualityIfSellInIsLessThan(0, this);
        return this;
    }
}
