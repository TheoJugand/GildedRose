public class UpdateDependingOfType {
    //private ItemType updatedItem;

    public UpdateDependingOfType(ItemType item) {
        int sellIn = item.sellIn;
        int quality = item.quality;

        switch(item.type) {
            case STANDARD:
                if(sellIn > 0){
                    sellIn--;
                    if(quality > 0) quality--;
                }else if (quality > 0) quality -= 2;
                break;
            case CONJURED:
                if(sellIn > 0){
                    sellIn--;
                    if(quality > 0) quality -= 2;
                }else if (quality > 0) quality -= 4;
                break;
            case LEGENDARY:
                break;
            case CHEESE:
                if(sellIn > 0){
                    sellIn--;
                    if(quality < 50) quality++;
                }else if (quality < 50) quality += 2;
                break;
            case TICKET:
                if(sellIn > 10){
                    sellIn--;
                    if(quality < 50) quality++;
                }else if (sellIn <= 10 && sellIn > 5){
                    sellIn--;
                    if(quality < 50) quality += 2;
                    quality += 2;
                }else if (sellIn <= 5 && sellIn > 0) {
                    sellIn--;
                    if (quality < 50) quality += 3;
                }else{
                    quality = 0;
                }
                break;
            default:
                break;
        }

        item.setSellIn(sellIn);
        item.setQuality(quality);

    }

}
