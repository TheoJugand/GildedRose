public class AgedBrie extends ItemCreate {
    public AgedBrie( int sellIn, int quality) {
        super("Aged Brie", sellIn, quality);
    }

    public static void  doUpdateQuality(int quality, int sellIn){

        if (quality < 50) {
            quality++;
        }
        sellIn--;
        if (sellIn < 0 && quality < 50) {
                quality++;
            }
        }

    }

