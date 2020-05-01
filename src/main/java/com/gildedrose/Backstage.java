package com.gildedrose;

import static com.gildedrose.ItemCondition.*;

public class Backstage extends Item {
    public Backstage(int sellIn, int quality) {
        super("Backstage passes to a TAFKAL80ETC concert", sellIn, quality);
    }

    @Override
    protected Item updateItem() {
        if(qualityLessThan50(this)) {
            this.sellIn = this.sellIn - 1;
            increaseQuality(this);
            increaseQualityIfSellInIsLessThan(10, this);
            increaseQualityIfSellInIsLessThan(5, this);

            if(this.sellIn < 0) {
                this.quality = 0;
            }
        }
        return this;
    }




}
