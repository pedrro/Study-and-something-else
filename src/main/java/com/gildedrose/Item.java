package com.gildedrose;

import static com.gildedrose.ItemCondition.decreaseQuality;
import static com.gildedrose.ItemCondition.isQualityItem;

public class Item {

    public String name;

    public int sellIn;

    public int quality;

    public Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

   @Override
   public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }

    public Item createItem(Item i) {
        switch (i.name) {
            case "Aged Brie":
                return new Brie(i.sellIn, i.quality);
            case "Backstage passes to a TAFKAL80ETC concert":
                return new Backstage(i.sellIn, i.quality);
            case "Sulfuras, Hand of Ragnaros":
                return new Sulfuras(i.sellIn, i.quality);
            default:
                return new Item(i.name, i.sellIn, i.quality);
        }
    }

   protected Item updateItem() {
       this.sellIn = this.sellIn - 1;

       if (isQualityItem(this)) {
           decreaseQuality(this);
       }


       if (this.sellIn < 0) {
           if(isQualityItem(this)) {
               decreaseQuality(this);
           }
       }

       return this;
   }

}
